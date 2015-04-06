package tknz.exec;
 
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

import org.antlr.v4.runtime.*; 

import tknz.parser.Engine;

public class Main {
	public static void main(String[] args) {
		ANTLRInputStream grammar = null;
		InputStreamReader input = null;
		boolean success = false;
		
		try {
			grammar = new ANTLRInputStream(new FileInputStream(args[0]));
			input = new InputStreamReader(new FileInputStream(args[1]));
		} catch (IndexOutOfBoundsException e) {
			String[] usage = {"Usage: tknz <grammar> <input>"};
			for (String u : usage) {
				System.out.println(u);
			}
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.printf("Could not find file %s\n", e.getMessage());
			System.exit(1);
		} catch (IOException e) {
			System.err.printf("Could not find file %s\n", e.getMessage());
			System.exit(1);
		}
		
		Engine engine = new Engine(input);
		success = engine.load(grammar);
		
		if (!success) {
			System.exit(1);
		}
		
		try {
			Collection<tknz.parser.Token> tokens = engine.parse();
			for (tknz.parser.Token token : tokens) {
				System.out.println(token.toString());
			}
		} catch (EOFException e) {
			System.err.printf(e.getMessage());
		}
	}
}
