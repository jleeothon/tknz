package tknz.parser;

import tknz.core.Automaton;
import tknz.core.State;

public class AutomatonRunner {
	
	protected final Automaton automaton;
	private State currentState;
	
	public AutomatonRunner(Automaton automaton) {
		this.currentState = automaton.getStartState();
		this.automaton = automaton;
	}
	
    /**
     * @param c the input character, null if end-of-file was reached
     * @return <code>true</code> when the input is accepted,
     * <code>false</code> when it is rejected from an accepting state,
     * <code>null</code> when it is rejected from a non-accepting state.
     */
    AutomatonResponse offer(Character c) {
        if (c == null) {
            if (this.currentState.isAccepting()) {
                return AutomatonResponse.ACCEPT;
            } else {
                return AutomatonResponse.REJECT;
            }
        }
    	State nextState = this.currentState.tryOffer(c); 
        if (nextState == null) {
        	if (this.currentState.isAccepting()) {
        		return AutomatonResponse.ACCEPT;
        	} else {
        		return AutomatonResponse.REJECT;
        	}
        } else {
        	this.currentState = nextState;
        	return AutomatonResponse.CONTINUE;
        }
    }
}
