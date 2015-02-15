package tknz.exec;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.*; 

import tknz.parser.TknzEngine;

public class Main {
	public static void main(String[] args) {
		ANTLRInputStream[] grammars = null;
		InputStreamReader input = null;
		
		try {
			input = new InputStreamReader(new FileInputStream(args[0]));
			grammars = new ANTLRInputStream[args.length - 1];
			for (int i = 1; i < args.length; i++) {
				grammars[i - 1] = new ANTLRInputStream(new FileInputStream(args[i]));
			}
		} catch (IndexOutOfBoundsException e) {
			String[] usage = {
					"Usage: tknz <input> [<grammar1.tkn>, ...]"
					};
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
		
		TknzEngine engine = new TknzEngine(input);
		for (ANTLRInputStream stream : grammars) {
			engine.load(stream);
		}
		
	}
}
