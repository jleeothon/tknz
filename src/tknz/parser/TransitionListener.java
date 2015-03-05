package tknz.parser;

import tknz.core.RangeTransition;
import tknz.core.SetTransition;
import tknz.core.State;
import tknz.grammar.TknzParser;

/**
 * Creates transitions assuming that automatons and states have been registered
 * in the a {@link TknzTokenizer}.
 * 
 * @author Johnny
 *
 */
public class TransitionListener extends BaseListener {

	public TransitionListener(Tokenizer tokenizer) {
		super(tokenizer);
	}

	@Override
	public void enterAutomaton(TknzParser.AutomatonContext ctx) {
		this.currentAutomaton = this.tokenizer.automatons.get(ctx.AUTOMATON()
				.getText());
	}

	@Override
	public void enterState(TknzParser.StateContext ctx) {
		this.currentState = this.currentAutomaton.getState(ctx.STATE()
				.getText());
	}

	@Override
	public void enterSetTransition(TknzParser.SetTransitionContext ctx) {
		State destination = this.currentAutomaton.getState(ctx.Identifier().getText());
		String symbols = ctx.StringLiteral().getText();
		this.currentTransition = new SetTransition(destination, symbols);
	}
	
	@Override
	public void enterRangeTransition(TknzParser.RangeTransitionContext ctx) {
		State destination = this.currentAutomaton.getState(ctx.Identifier().getText());
		char first = 0;
		char last = 0;
		String firstString = ctx.StringLiteral(0).getText();
		String lastString = ctx.StringLiteral(1).getText();
		if (firstString.length() == 1) {
			first = firstString.charAt(0);
		} else {
			this.tokenizer.giveError("String literal for range transition does not have exactly 1 character: %s", firstString);
		}
		if (lastString.length() != 1) {
			last = lastString.charAt(0);
		} else {
			this.tokenizer.giveError("String literal for range transition does not have exactly 1 character: %s", lastString);
		}
		this.currentTransition = new RangeTransition(destination, first, last);
	}
	
	public void exitTransition(TknzParser.TransitionContext ctx) {
		this.currentState.addTransition(this.currentTransition);
	}

}
