package tknz.core;

import java.util.Map;
import java.util.HashMap;

public class Automaton {

    private final String name;
    private final Map<String, State> states;
    private State startState;

    /**
     * Constructs a new automaton.
     * @param name - the name of this automaton
     */
    public Automaton(String name) {
        this.name = name;
        this.states = new HashMap<>();
    }

    /**
     * @return the name of this automaton
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the first state that can be a start state. Well-formed automatons
     * should only have one such.
     * Note, this implementation is lazy.
     */
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
    public State addState(String name, boolean isStart, boolean isStop) {
        if (this.states.containsKey(name)) {
            return this.states.get(name);
        }
        State state = new State(name, isStart, isStop);
        return this.states.put(name, state);
    }
    
    /**
     * Adds a state if there does not exist one with the same name. 
     * @param state the state to add 
     * @return <code>true</code> if the state was added
     */
    public boolean offerState(State state) {
    	String name = state.getName();
    	if (this.states.containsKey(name)) {
    		return false;
    	}
    	this.states.put(name, state);
    	return true;
    }
    
    /**
     * Retrieves a state by the name.
     * @param name - name of the state
     */
    public State getState(String name) {
    	return this.states.get(name);
    }

    public void addTransition(String sourceStateName, String destStateName,
            char startChar, char endChar) throws Exception {
        State startState = this.states.get(sourceStateName);
        State endState = this.states.get(destStateName);
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

    public void addTransition(String sourceStateName, String destStateName,
            String charSet) {
        State startState = this.states.get(sourceStateName);
        State endState = this.states.get(destStateName);
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

    /**
     * @return <c>true</c> if the automaton has at least one starting state
     */
    public boolean hasStartingState() {
        boolean b = this.states.values().stream().anyMatch(x -> x.isStart());
        return b;
    }

    /**
     * @return <c>true</c> if the automaton has at least one accepting state
     */
    public boolean hasAcceptingState() {
        boolean b = this.states.values().stream().anyMatch(x -> x.isAccepting());
        return b;
    }

    /**
     * @return <c>true</c> if the automaton has at least on state which is both starting and accepting
     */
    public boolean canAcceptEmpty() {
        boolean b = this.states.values().stream().anyMatch(x -> x.isStart() && x.isAccepting());
        return b;
    }
    
    /**
     * @return the name of this automaton
     */
    @Override
    public String toString() {
    	return this.name;
    }
    
    /**
     * @return 
     */
    public String toVerboseString() {
    	StringBuilder builder = new StringBuilder();
    	builder.append(this.name);
        builder.append('\n');
    	for (State state : this.states.values()) {
    		builder.append("  ");
    		builder.append(state.getName());
    		builder.append('\n');
    		for (Transition transition : state.getTransitions()) {
    			builder.append("    ");
    			builder.append(transition.toString());
    			builder.append('\n');
    		}
    	}
    	return builder.toString();
    }

}
