package tknz.parser;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import tknz.core.Automaton;
import tknz.core.State;
import tknz.core.Transition;
import tknz.grammar.TknzBaseListener;

public class BaseListener extends TknzBaseListener {
	protected Tokenizer tokenizer;
	protected State currentState;
	protected boolean currentStateStarts;
	protected boolean currentStateStops;
	protected Automaton currentAutomaton;
	protected Transition currentTransition;
	protected Logger logger;
	
	public BaseListener(Tokenizer tokenizer) {
		super();
		this.tokenizer = tokenizer;
		this.currentStateStarts = false;
		this.currentStateStops = false;
		this.logger = Logger.getLogger(this.getClass().getName());
		this.logger.setLevel(Level.ALL);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new SimpleFormatter());
		handler.setLevel(Level.ALL);
		logger.addHandler(handler);
	}
}
