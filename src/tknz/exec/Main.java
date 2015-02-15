package tknz.exec;
 
import java.io.FileInputStream;

import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*;

import tknz.grammar.TknzLexer;
import tknz.grammar.TknzParser;
import tknz.parser.AutomatonRunner;
import tknz.parser.SymbolTableListener;
import tknz.parser.TknzTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		ANTLRInputStream input;
		TknzLexer lexer;
		CommonTokenStream tokens;
		TknzParser parser;
		ParseTree tree;
		ParseTreeWalker walker;
		TknzTokenizer tokenizer;

		if (args.length >= 1) {
			input = new ANTLRInputStream(new FileInputStream(args[0]));
		} else {
			input = new ANTLRInputStream(System.in);
		}
		 
		lexer = new TknzLexer(input); 
		tokens = new CommonTokenStream(lexer); 
		parser = new TknzParser(tokens);

		tree = parser.s();
		walker = new ParseTreeWalker();
		tokenizer = new TknzTokenizer();

		walker.walk(new SymbolTableListener(tokenizer), tree);

	}
}
