package core;

import java.util.HashSet;
import java.util.Set;

public abstract class Transition {
    private State destination;
    protected Set<Character> symbols;

    protected Transition(State destination) {
        this.destination = destination;
        this.symbols = new HashSet<Character>();
    }

    public State getDestination() {
        return this.destination;
    }

    protected abstract boolean tryOffer(char c);

    public State offer(char c) {
        if (this.tryOffer(c)) {
            return this.destination;
        } else {
            return null;
        }
    }
}
