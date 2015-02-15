package tknz.parser;

import tknz.core.Automaton;
import tknz.core.State;
import tknz.core.Transition;

/**
 * Creates transitions assument that automatons and states have been
 * registered in the a {@link TknzTokenizer}.
 * @author Johnny
 *
 */
public class TransitionListener extends tknz.grammar.TknzBaseListener {
	
	private TknzTokenizer tokenizer;
	private State currentState;
	private Automaton currentAutomaton;
	private Transition currentTransition;
	
	public TransitionListener(TknzTokenizer tokenizer) {
		this.tokenizer = tokenizer;
	}

}
