package tknz.parser;

import tknz.core.RangeTransition;
import tknz.core.SetTransition;
import tknz.core.State;
import tknz.grammar.TknzParser;

/**
 * Creates transitions assuming that automatons and states have been registered
 * in the a {@link TknzTokenizer}.
 */
public class TransitionListener extends BaseListener {

	public TransitionListener(Tokenizer tokenizer) {
		super(tokenizer);
	}

	@Override
	public void enterAutomaton(TknzParser.AutomatonContext ctx) {
		String name = ctx.Identifier().getText();
		assert(name != null);
		this.currentAutomaton = this.tokenizer.automatons.stream().filter(
				a -> a.getName().equals(name)).findAny().get();
	}

	@Override
	public void enterState(TknzParser.StateContext ctx) {
		String name = ctx.Identifier().getText();
		assert(name != null);
		this.currentState = this.currentAutomaton.getState(name);
		assert(this.currentState != null);
	}

	@Override
	public void enterSetTransition(TknzParser.SetTransitionContext ctx) {
		State destination = this.currentAutomaton.getState(ctx.Identifier().getText());
		if (destination == null) {
			this.tokenizer.giveError("state %s of automaton %s not declared",
					this.currentState, this.currentAutomaton);
		}
		String symbols = ctx.StringLiteral().getText();
		if (symbols.length() < 3) {
			this.tokenizer.giveWarning("empty character set for transition to %s in state %s of automaton %s",
					destination != null ? destination.getName() : "(unknown)",
					this.currentState, this.currentAutomaton);
		} else {
			symbols = symbols.substring(1, symbols.length() - 1);
		}
		this.currentTransition = new SetTransition(destination, symbols);
	}
	
	@Override
	public void enterRangeTransition(TknzParser.RangeTransitionContext ctx) {
		State destination = this.currentAutomaton.getState(ctx.Identifier().getText());
		if (destination == null) {
			this.tokenizer.giveError("state %s of automaton %s not declared",
					this.currentState, this.currentAutomaton);
		}
		char first = 0;
		char last = 0;
		String firstString = ctx.StringLiteral(0).getText();
		String lastString = ctx.StringLiteral(1).getText();
		if (firstString.length() == 3) {
			first = firstString.charAt(1);
		} else {
			this.tokenizer.giveError("String literal for range transition does not have exactly 1 character: \"%s\" (%d characters)", firstString, firstString.length());
		}
		if (lastString.length() == 3) {
			last = lastString.charAt(1);
		} else {
			this.tokenizer.giveError("String literal for range transition does not have exactly 1 character: \"%s\" (%d characters)", lastString, lastString.length());
		}
		this.currentTransition = new RangeTransition(destination, first, last);
	}
	
	@Override
	public void exitTransition(TknzParser.TransitionContext ctx) {
		this.currentState.addTransition(this.currentTransition);
	}

}
