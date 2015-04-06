package tknz.core;

import java.util.LinkedList;
import java.util.List;

public class State {

    private final String name;
    private final boolean isStart;
    private final boolean isStop;
    private final List<Transition> transitions;

    /**
     * @param name - the name of this state
     * @param isStart - whether or not this state is the start state
     * @param isStop - whether or not this state is an accepting state
     */
    public State(String name, boolean isStart, boolean isStop) {
        this.name = name;
        this.isStart = isStart;
        this.isStop = isStop;
        this.transitions = new LinkedList<Transition>();
    }

    /**
     * @return whether or not this state is marked as a state
     */
    public boolean isStart() {
        return this.isStart;
    }

    /**
     * @return whether or not this state is an accepting state
     */
    public boolean isAccepting() {
        return this.isStop;
    }
    
    /**
     * @return the name of this state
     */
    public String getName() {
    	return name;
    }

    /**
      * @return <c>true</c> if the <c>obj</c> is a state with the same name,
      * <c>false</c> otherwise
      */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof State) {
            return ((State)obj).name.equals(this.name);
        }
        return false;
    }

    /**
      * @return the hash code of the <c>State</c>'s name
      */
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    /**
      * @param c the input character
      * @return the <c>State</c> to which this state should transit with the
      * given input, <c>null</c> if there are no transitions with the given
      * input
      */
    public State tryOffer(char c) {
        for (Transition transition : this.transitions) {
            State result = transition.transit(c);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public void addTransition(Transition transition) {
        this.transitions.add(transition);
    }
    
    @Override
    public String toString() {
    	return this.name;
    }

	public Iterable<Transition> getTransitions() {
		return this.transitions;
	}

}
