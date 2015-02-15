package tknz.parser;

import tknz.core.Automaton;
import tknz.core.State;
import tknz.core.Transition;
import tknz.grammar.TknzParser;

public class SymbolTableListener extends tknz.grammar.TknzBaseListener {
	
	TknzTokenizer tokenizer;
	State currentState;
	Automaton currentAutomaton;
	Transition currentTransition;
	
	
	public SymbolTableListener(TknzTokenizer tokenizer) {
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
		this.currentAutomaton.addState(ctx.Identifier().getText());
		// TODO
		System.out.println("Added state" + ctx.Identifier().getText());
	}

}
