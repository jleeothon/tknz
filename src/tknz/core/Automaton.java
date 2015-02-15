package tknz.core;

import java.util.HashMap;

public class Automaton {

    private String name;
    private HashMap<String, State> states;
    private State startState;

    public Automaton(String name) {
        this.name = name;
        this.states = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

	public State getStartState() {
		if (this.startState == null) {
			this.startState = this.states.values().stream().filter(
					s -> s.isStart()).findFirst().get();
		}
		return this.startState;
	}

    /**
      * Creates a new state if it does not already exist.
      * @param name - the name of the state to put
      * @return the existing or newly made <code>State</code>
      */
    public State addState(String name) {
        if (this.states.containsKey(name)) {
            return this.states.get(name);
        }
        State state = new State(name);
        return this.states.put(name, state);
    }
    
    /**
     * Adds a state if there does not exist one with the same name. 
     * @param state the state to add 
     * @return <code>true</code> if the state was added
     */
    public boolean offerState(State state) {
    	if (this.states.containsKey(name)) {
    		return false;
    	}
    	this.states.put(state.getName(), state);
    	return true;
    }
    
    public State getState(String name) {
    	return this.states.get(name);
    }

    public void addTransition(String startStateName, String endStateName,
            char startChar, char endChar) throws Exception {
        State startState = this.states.get(startStateName);
        State endState = this.states.get(endStateName);
        if (this.repeated(startChar) || this.repeated(endChar)) {
            // TODO fall gracefully
            throw new Exception(String.format(
                "The range from %c to %c is duplicate in %s", startChar,
                endChar, this.name));
        }
        Transition transition = new RangeTransition(endState,
            startChar, endChar);
        startState.addTransition(transition);
    }

    public void addTransition(String startStateName, String endStateName,
            String charSet) {
        State startState = this.states.get(startStateName);
        State endState = this.states.get(endStateName);
        if (this.repeated(charSet)) {
            // TODO throw fall gracefully
        }
        Transition transition = new SetTransition(endState, charSet);
        startState.addTransition(transition);
    }

    private boolean repeated(char c) {
        // TODO
        return false;
    }

    private boolean repeated(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (this.repeated(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
