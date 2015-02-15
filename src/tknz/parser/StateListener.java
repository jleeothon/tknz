package tknz.parser;

import tknz.core.Automaton;
import tknz.core.State;
import tknz.grammar.TknzParser;

/**
 * Registers automatons and states so that {@link TransitionListener} can
 * register transitions with the automatons and states pre-loaded.
 * @author Johnny Lee
 *
 */
public class StateListener extends tknz.grammar.TknzBaseListener {
	
	private TknzTokenizer tokenizer;
	private State currentState;
	private Automaton currentAutomaton;
	
	public StateListener(TknzTokenizer tokenizer) {
		super();
		this.tokenizer = tokenizer;
	}
	
	@Override public void enterAutomaton(TknzParser.AutomatonContext ctx) {
		String identifier = ctx.Identifier().getText();
		this.currentAutomaton = new Automaton(identifier);
		if (!this.tokenizer.offerAutomaton(this.currentAutomaton)) {
			// TODO complain
			System.err.printf("Repeated automaton %s\n", identifier);
		}
		// TODO
		System.out.println("Added Automaton" + ctx.Identifier().getText());
	}
	
	@Override public void enterState(TknzParser.StateContext ctx) {
		this.currentState = new State(ctx.getText());
		this.currentAutomaton.offerState(this.currentState);
		// TODO turn to logging information
		System.out.println("Added state" + ctx.Identifier().getText());
	}

}
