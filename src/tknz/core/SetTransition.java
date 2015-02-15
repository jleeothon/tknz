package tknz.core;

public class SetTransition extends Transition {

    public SetTransition(State destination, String symbols) {
        super(destination);
        for (int i = 0; i < symbols.length(); i++) {
            this.symbols.add(symbols.charAt(i));
        }
    }

    @Override
    protected boolean tryOffer(char c) {
        return this.symbols.contains(c);
    }
}
