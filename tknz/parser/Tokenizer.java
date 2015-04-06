package tknz.parser;

import java.util.LinkedList;
import java.util.List;

import tknz.core.Automaton;

public class Tokenizer {
	protected List<Automaton> automatons;
	private int warningCount;
	private int errorCount;

	public Tokenizer() {
		this.automatons = new LinkedList<>();
		this.warningCount = 0;
		this.errorCount = 0;
	}
	
	public int warningCount() {
		return this.warningCount;
	}
	
	public int errorCount() {
		return this.errorCount;
	}
	
	/**
	 * Adds an automaton only if there is no previous one with the same name.
	 * @param automaton
	 * @return <code>true</code> if the automaton is accepted
	 */
	// TODO change for putIfAbsent

	/**
	 * Intended to be used by listener classes.
	 * @param cl
	 * @param format
	 * @param args
	 */
	public void giveWarning(String format, Object... args) {
		System.err.printf(format, args);
		System.err.println();
		this.warningCount += 1;
	}
	
	/**
	 * Intended to be used by listener classes.
	 * @param cl
	 * @param format
	 * @param args
	 */
	public void giveError(String format, Object... args) {
		System.err.printf(format, args);
		System.err.println();
		this.errorCount += 1;
	}
}
