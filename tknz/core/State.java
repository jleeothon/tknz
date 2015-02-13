package core;

import java.util.List;

public class State {
    private String name;
    private boolean isStart;
    private boolean isStop;
    private List<Transition> transitions;

    public State(String name) {
        this.name = name;
    }

    public boolean isStart() {
        return this.isStart;
    }

    public boolean isStop() {
        return this.isStop;
    }

    /**
      * @param c the input character
      * @return 
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

}
