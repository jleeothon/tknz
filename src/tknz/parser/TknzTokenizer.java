package tknz.parser;

import java.util.LinkedList;

import tknz.core.Automaton;

public class TknzTokenizer {
	
	private LinkedList<Automaton> automatons;
	
	public TknzTokenizer() {
		this.automatons = new LinkedList<>();
	}
	
	/**
	 * Adds an automaton only if there is no previous one with the same name.
	 * @param automaton
	 * @return <code>true</code> if the automaton is accepted
	 */
	public boolean offerAutomaton(Automaton automaton) {
		if (automatons.stream().anyMatch(a -> a.getName().equals(
				automaton.getName()))) {
			return false;
		}
		automatons.addLast(automaton);
		return true;
	}
	
}
