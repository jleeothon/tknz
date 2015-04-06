package tknz.parser;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import tknz.core.Automaton;
import tknz.grammar.TknzLexer;
import tknz.grammar.TknzParser;

public class Engine {
	
	Tokenizer tokenizer;

	private ArrayList<Character> characters;

	private int nextCharacter;

	private InputStreamReader input;
	
	public Engine(InputStreamReader input) {
		this.tokenizer = new Tokenizer();
		if (input == null) {
			throw new NullPointerException("Input stream is null");
		}
		this.input = input;
		this.nextCharacter = 0;
		this.characters = new ArrayList<>();
	}
	
	/**
	  * Returns a character until the end of input has been reached, then it
	  * returns null.
	  */
	private Character next() {
		if (this.nextCharacter == characters.size()) {
			try {
				int c = this.input.read();
				if (c == -1) {
					return null;
				} else {
					this.characters.add((char)c);
				}
			} catch (IOException e) {
				return null;
			}
		}
		return this.characters.get(nextCharacter++);
	}

	private void rewind() {
		this.nextCharacter = 0;
	}

	private void clear() {
		Character c = this.characters.get(this.characters.size() - 1);
		this.characters.clear();
		this.characters.add(c);
		this.nextCharacter = 0;
	}
	
	/**
	 * Returns true on success.
	 */
	public boolean load(ANTLRInputStream stream) {
		if (stream == null) {
			throw new NullPointerException("Input grammar is null");
		}
		TknzLexer lexer = new TknzLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		TknzParser parser = new TknzParser(tokens);
		ParseTree tree = parser.s();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new StateListener(this.tokenizer), tree);
		walker.walk(new TransitionListener(this.tokenizer), tree);
		for (Automaton automaton : this.tokenizer.automatons) {
			System.out.println(automaton.toVerboseString());
		}
		int errorCount = this.tokenizer.errorCount();
		int warningCount = this.tokenizer.warningCount();
		System.out.printf("error count %d, warningCount %d\n", errorCount, warningCount);
		return errorCount == 0 && warningCount == 0;
	}
	
	public Collection<Token> parse() throws EOFException {
		List<Token> tokens = new LinkedList<>();
		boolean eof = false;
		while (!eof) {
			boolean success = false;
			StringBuilder text = new StringBuilder();
			for (Automaton a : this.tokenizer.automatons) {
				text.setLength(0);
				System.out.printf("Trying with %s\n", a.getName());
				AutomatonRunner runner = new AutomatonRunner(a);
				AutomatonResponse response = null;
				do {
					Character c = this.next();
					response = runner.offer(c);
					if (c == null) {
						eof = true;
					} else {
						text.append(c);
					}
					assert !(eof && response == AutomatonResponse.CONTINUE);
				} while (response == AutomatonResponse.CONTINUE);
				this.handleResponse(response, eof, tokens, text, runner);
				if (response == AutomatonResponse.ACCEPT || eof) {
					success = true;
					break;
				}
			}
			if (!success) {
				System.err.println(String.format("Could not parse \"%s\"", text));
				break;
			}
		}
		return tokens;
	}

	/**
	  * Returns true if the EOF has been reached and the last token was
	  * successfully classified.
	  */
	private void handleResponse(AutomatonResponse response, boolean eof,
			List<Token> tokens, StringBuilder text, AutomatonRunner runner)
			throws EOFException {
		assert response != null;
		assert response != AutomatonResponse.CONTINUE;
		if (response == AutomatonResponse.REJECT) {
			if (eof) {
				throw new EOFException("Reached end of file while not finished parsing.");
			} else {
				this.rewind();
			}
		} else if (response == AutomatonResponse.ACCEPT) {
			String t = eof ? text.toString() : text.substring(0, text.length() - 1);
			tokens.add(new Token(t, runner.automaton.getName()));
			this.clear();
		}
	}

}
