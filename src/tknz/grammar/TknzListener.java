// Generated from Tknz.g4 by ANTLR 4.5


package tknz.grammar;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TknzParser}.
 */
public interface TknzListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TknzParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(TknzParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(TknzParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link TknzParser#automaton}.
	 * @param ctx the parse tree
	 */
	void enterAutomaton(TknzParser.AutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#automaton}.
	 * @param ctx the parse tree
	 */
	void exitAutomaton(TknzParser.AutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TknzParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TknzParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TknzParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TknzParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(TknzParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(TknzParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TknzParser#setTransition}.
	 * @param ctx the parse tree
	 */
	void enterSetTransition(TknzParser.SetTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#setTransition}.
	 * @param ctx the parse tree
	 */
	void exitSetTransition(TknzParser.SetTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TknzParser#rangeTransition}.
	 * @param ctx the parse tree
	 */
	void enterRangeTransition(TknzParser.RangeTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#rangeTransition}.
	 * @param ctx the parse tree
	 */
	void exitRangeTransition(TknzParser.RangeTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TknzParser#automatonModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonModifiers(TknzParser.AutomatonModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#automatonModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonModifiers(TknzParser.AutomatonModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TknzParser#stateModifier}.
	 * @param ctx the parse tree
	 */
	void enterStateModifier(TknzParser.StateModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TknzParser#stateModifier}.
	 * @param ctx the parse tree
	 */
	void exitStateModifier(TknzParser.StateModifierContext ctx);
}