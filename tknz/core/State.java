package tknz.core;

import java.util.LinkedList;
import java.util.List;

public class State {
    private String name;
    private boolean isStart;
    private boolean isStop;
    private List<Transition> transitions;

    public State(String name, boolean isStart, boolean isStop) {
        this.name = name;
        this.isStart = isStart;
        this.isStop = isStop;
        this.transitions = new LinkedList<Transition>();
    }

    public boolean isStart() {
        return this.isStart;
    }

    public boolean isAccepting() {
        return this.isStop;
    }
    
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
            State result = transition.offer(c);
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