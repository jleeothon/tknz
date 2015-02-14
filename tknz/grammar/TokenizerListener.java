// Generated from Tokenizer.g4 by ANTLR 4.5


package grammar;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TokenizerParser}.
 */
public interface TokenizerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(TokenizerParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(TokenizerParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#automaton}.
	 * @param ctx the parse tree
	 */
	void enterAutomaton(TokenizerParser.AutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#automaton}.
	 * @param ctx the parse tree
	 */
	void exitAutomaton(TokenizerParser.AutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TokenizerParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TokenizerParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(TokenizerParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(TokenizerParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#setTransition}.
	 * @param ctx the parse tree
	 */
	void enterSetTransition(TokenizerParser.SetTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#setTransition}.
	 * @param ctx the parse tree
	 */
	void exitSetTransition(TokenizerParser.SetTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#rangeTransition}.
	 * @param ctx the parse tree
	 */
	void enterRangeTransition(TokenizerParser.RangeTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#rangeTransition}.
	 * @param ctx the parse tree
	 */
	void exitRangeTransition(TokenizerParser.RangeTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#automatonModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonModifiers(TokenizerParser.AutomatonModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#automatonModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonModifiers(TokenizerParser.AutomatonModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#stateModifier}.
	 * @param ctx the parse tree
	 */
	void enterStateModifier(TokenizerParser.StateModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#stateModifier}.
	 * @param ctx the parse tree
	 */
	void exitStateModifier(TokenizerParser.StateModifierContext ctx);
}