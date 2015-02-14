package core;

import java.util.HashMap;

public class Automaton {

    private String name;
    private HashMap<String, State> states;

    public Automaton(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * @param c the input character
     * @return <c>true</c> when the input is accepted,
     * <c>false</c> when it is rejected from an accepting state,
     * <c>null</c> when it is rejected from a non-accepting state.
     */
    Boolean offer(char c) {
        return false;
    }

    /**
      * Creates a new state if it does not already exist.
      * @param name - the name of the state to put
      * @return the existing or newly made <c>State</c>
      */
    public State addState(String name) {
        if (this.states.containsKey(name)) {
            return this.states.get(name);
        }
        State state = new State(name);
        return this.states.put(name, state);
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
