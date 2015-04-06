package tknz.parser;

import java.util.logging.Level;

import tknz.core.Automaton;
import tknz.core.State;
import tknz.grammar.TknzParser;

/**
 * Registers automatons and states so that {@link TransitionListener} can
 * register transitions with the automatons and states pre-loaded.
 * 
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
		boolean repeated = this.tokenizer.automatons.stream().anyMatch(a -> a.getName() == identifier);
		if (repeated) {
			this.tokenizer.giveWarning("Automaton repeated: %s",
					this.currentAutomaton.getName());
		} else {
			this.tokenizer.automatons.add(this.currentAutomaton);
		}
	}
	
	@Override
	public void exitAutomaton(TknzParser.AutomatonContext ctx) {
		if (!this.currentAutomaton.hasStartingState()) {
			this.tokenizer.giveError("Automaton %s does not have starting state", this.currentAutomaton.getName());
		}
		if (!this.currentAutomaton.hasAcceptingState()) {
			this.tokenizer.giveError("Automaton %s does not have accepting state", this.currentAutomaton.getName());
		}
		if (this.currentAutomaton.canAcceptEmpty()) {
			this.tokenizer.giveError("Automaton %s can accept empty strings", this.currentAutomaton.getName());	
		}
	}

	@Override
	public void enterState(TknzParser.StateContext ctx) {
		this.currentStateStarts = this.currentStateStops = false;
	}

	@Override
	public void exitState(TknzParser.StateContext ctx) {
		this.currentState = new State(ctx.Identifier().getText(), this.currentStateStarts, this.currentStateStops);
		if (!this.currentAutomaton.offerState(this.currentState)) {
			this.tokenizer.giveError("Repeated state '%s' in automaton %s",
					this.currentState.getName(),
					this.currentAutomaton.getName());
		}
	}
	
	@Override
	public void enterStart(TknzParser.StartContext ctx) {
		this.currentStateStarts = true;
	}

	@Override
	public void enterStop(TknzParser.StopContext ctx) {
		this.currentStateStops = true;
	}

}
