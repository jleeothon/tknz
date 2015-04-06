package tknz.core;

import java.util.HashSet;
import java.util.Set;

public abstract class Transition {

    private State destination;
    protected Set<Character> symbols;

    /**
     * Creates a new transition for a certain destination state.
     */
    protected Transition(State destination) {
        this.destination = destination;
        this.symbols = new HashSet<Character>();
    }

    /**
     * @return the destination state
     */
    public State getDestination() {
        return this.destination;
    }

    /**
     * @return <c>true</c> if this transition should accept the given character
     */
    protected abstract boolean tryOffer(char c);

    /**
     * @param c - the character with which a transition is attempted
     * @return the next state to go to, or <c>null</c> if this transition does
     * not accept such character {@link tryOffer}
     */
    public final State transit(char c) {
        if (this.tryOffer(c)) {
            return this.destination;
        } else {
            return null;
        }
    }
}
