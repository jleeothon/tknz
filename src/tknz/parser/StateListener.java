package tknz.parser;

import java.util.logging.Level;

import tknz.core.Automaton;
import tknz.core.State;
import tknz.grammar.TknzParser;

/**
 * Registers automatons and states so that {@link TransitionListener} can
 * register transitions with the automatons and states pre-loaded.
 * 
 * @author Johnny Lee
 *
 */
public class StateListener extends BaseListener {

	public StateListener(Tokenizer tokenizer) {
		super(tokenizer);
	}
	
	@Override
	public void enterAutomaton(TknzParser.AutomatonContext ctx) {
		String identifier = ctx.Identifier().getText();
		this.currentAutomaton = new Automaton(identifier);
		if (this.tokenizer.automatons.add(this.currentAutomaton)) {
			this.tokenizer.giveWarning("Automaton repeated: %s",
					this.currentAutomaton.getName());
		}
		this.logger.log(Level.FINE, "Added automaton {0}", new Object[] { ctx
				.Identifier().getText() });
	}

	@Override
	public void enterState(TknzParser.StateContext ctx) {
		this.currentState = new State(ctx.Identifier().getText());
		if (!this.currentAutomaton.offerState(this.currentState)) {
			this.tokenizer.giveError("Repeated state '%s' in automaton %s",
					this.currentState.getName(),
					this.currentAutomaton.getName());
		}
		// TODO ugly string cat
		this.logger.log(Level.FINE, "Added state" + ctx.Identifier().getText());
	}

}
