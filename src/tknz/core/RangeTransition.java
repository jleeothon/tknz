package tknz.core;

public class RangeTransition extends Transition {

    private char first;
    private char last;

    public RangeTransition(State destination, char first, char last) {
        super(destination);
        this.first = first;
        this.last = last;
        for (char c = first; c <= last; c++) {
            this.symbols.add(c);
        }
    }

    @Override
    protected boolean tryOffer(char c) {
        return c >= this.first && c <= this.last;
    }

}
