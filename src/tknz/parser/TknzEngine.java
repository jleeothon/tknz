package tknz.parser;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import tknz.grammar.TknzLexer;
import tknz.grammar.TknzParser;

public class TknzEngine {
	
	TknzTokenizer tokenizer;
	private Character next;
	private InputStreamReader input;
	
	public TknzEngine(InputStreamReader input) {
		this.tokenizer = new TknzTokenizer();
		if (input == null) {
			throw new NullPointerException("Input stream is null");
		}
		this.input = input;
	}
	
	private char next() throws IOException {
		if (this.next == null) {
				int c = this.input.read();
				if (c == -1) {
					throw new EOFException();
				}
				return (char)c;
		} else {
			return this.next;
		}
	}
	
	public void load(ANTLRInputStream stream) {
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
	}
	
	public void parse() throws IOException {
		this.next();
	}

}
