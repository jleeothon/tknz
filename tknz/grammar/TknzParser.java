// Generated from tknz\grammar\Tknz.g4 by ANTLR 4.5

package tknz.grammar;

import java.util.TreeMap;
import tknz.core.Automaton;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TknzParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTOMATON=1, STATE=2, WITH=3, FROM=4, TO=5, GOTO=6, START=7, STOP=8, Identifier=9, 
		IGNORE=10, StringLiteral=11, WS=12, COMMENT=13;
	public static final int
		RULE_s = 0, RULE_automaton = 1, RULE_state = 2, RULE_transition = 3, RULE_setTransition = 4, 
		RULE_rangeTransition = 5, RULE_automatonModifiers = 6, RULE_stateModifier = 7, 
		RULE_start = 8, RULE_stop = 9;
	public static final String[] ruleNames = {
		"s", "automaton", "state", "transition", "setTransition", "rangeTransition", 
		"automatonModifiers", "stateModifier", "start", "stop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'automaton'", "'state'", "'with'", "'from'", "'to'", "'goto'", 
		"'start'", "'stop'", null, "'ignore'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AUTOMATON", "STATE", "WITH", "FROM", "TO", "GOTO", "START", "STOP", 
		"Identifier", "IGNORE", "StringLiteral", "WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tknz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TknzParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<AutomatonContext> automaton() {
			return getRuleContexts(AutomatonContext.class);
		}
		public AutomatonContext automaton(int i) {
			return getRuleContext(AutomatonContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AUTOMATON || _la==IGNORE) {
				{
				{
				setState(20);
				automaton();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutomatonContext extends ParserRuleContext {
		public TerminalNode AUTOMATON() { return getToken(TknzParser.AUTOMATON, 0); }
		public TerminalNode Identifier() { return getToken(TknzParser.Identifier, 0); }
		public List<AutomatonModifiersContext> automatonModifiers() {
			return getRuleContexts(AutomatonModifiersContext.class);
		}
		public AutomatonModifiersContext automatonModifiers(int i) {
			return getRuleContext(AutomatonModifiersContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public AutomatonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automaton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterAutomaton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitAutomaton(this);
		}
	}

	public final AutomatonContext automaton() throws RecognitionException {
		AutomatonContext _localctx = new AutomatonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_automaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IGNORE) {
				{
				{
				setState(26);
				automatonModifiers();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(AUTOMATON);
			setState(33);
			match(Identifier);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATE) | (1L << START) | (1L << STOP))) != 0)) {
				{
				{
				setState(34);
				state();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(TknzParser.STATE, 0); }
		public TerminalNode Identifier() { return getToken(TknzParser.Identifier, 0); }
		public List<StateModifierContext> stateModifier() {
			return getRuleContexts(StateModifierContext.class);
		}
		public StateModifierContext stateModifier(int i) {
			return getRuleContext(StateModifierContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==START || _la==STOP) {
				{
				{
				setState(40);
				stateModifier();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(STATE);
			setState(47);
			match(Identifier);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==FROM) {
				{
				{
				setState(48);
				transition();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionContext extends ParserRuleContext {
		public SetTransitionContext setTransition() {
			return getRuleContext(SetTransitionContext.class,0);
		}
		public RangeTransitionContext rangeTransition() {
			return getRuleContext(RangeTransitionContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transition);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				setTransition();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				rangeTransition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTransitionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TknzParser.WITH, 0); }
		public TerminalNode StringLiteral() { return getToken(TknzParser.StringLiteral, 0); }
		public TerminalNode GOTO() { return getToken(TknzParser.GOTO, 0); }
		public TerminalNode Identifier() { return getToken(TknzParser.Identifier, 0); }
		public SetTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterSetTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitSetTransition(this);
		}
	}

	public final SetTransitionContext setTransition() throws RecognitionException {
		SetTransitionContext _localctx = new SetTransitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(WITH);
			setState(59);
			match(StringLiteral);
			setState(60);
			match(GOTO);
			setState(61);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeTransitionContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(TknzParser.FROM, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TknzParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TknzParser.StringLiteral, i);
		}
		public TerminalNode TO() { return getToken(TknzParser.TO, 0); }
		public TerminalNode GOTO() { return getToken(TknzParser.GOTO, 0); }
		public TerminalNode Identifier() { return getToken(TknzParser.Identifier, 0); }
		public RangeTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterRangeTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitRangeTransition(this);
		}
	}

	public final RangeTransitionContext rangeTransition() throws RecognitionException {
		RangeTransitionContext _localctx = new RangeTransitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rangeTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(FROM);
			setState(64);
			match(StringLiteral);
			setState(65);
			match(TO);
			setState(66);
			match(StringLiteral);
			setState(67);
			match(GOTO);
			setState(68);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutomatonModifiersContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(TknzParser.IGNORE, 0); }
		public AutomatonModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterAutomatonModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitAutomatonModifiers(this);
		}
	}

	public final AutomatonModifiersContext automatonModifiers() throws RecognitionException {
		AutomatonModifiersContext _localctx = new AutomatonModifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_automatonModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IGNORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateModifierContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public StopContext stop() {
			return getRuleContext(StopContext.class,0);
		}
		public StateModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterStateModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitStateModifier(this);
		}
	}

	public final StateModifierContext stateModifier() throws RecognitionException {
		StateModifierContext _localctx = new StateModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stateModifier);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				start();
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				stop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(TknzParser.START, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(START);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(TknzParser.STOP, 0); }
		public StopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TknzListener ) ((TknzListener)listener).exitStop(this);
		}
	}

	public final StopContext stop() throws RecognitionException {
		StopContext _localctx = new StopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3"+
		"\3\7\3&\n\3\f\3\16\3)\13\3\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\tM\n\t\3\n\3\n\3\13\3\13\3\13\2"+
		"\2\f\2\4\6\b\n\f\16\20\22\24\2\2O\2\31\3\2\2\2\4\37\3\2\2\2\6-\3\2\2\2"+
		"\b:\3\2\2\2\n<\3\2\2\2\fA\3\2\2\2\16H\3\2\2\2\20L\3\2\2\2\22N\3\2\2\2"+
		"\24P\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34\36\5\16\b\2\35\34\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\3\2\2"+
		"#\'\7\13\2\2$&\5\6\4\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3"+
		"\2\2\2)\'\3\2\2\2*,\5\20\t\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2."+
		"\60\3\2\2\2/-\3\2\2\2\60\61\7\4\2\2\61\65\7\13\2\2\62\64\5\b\5\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65"+
		"\3\2\2\28;\5\n\6\29;\5\f\7\2:8\3\2\2\2:9\3\2\2\2;\t\3\2\2\2<=\7\5\2\2"+
		"=>\7\r\2\2>?\7\b\2\2?@\7\13\2\2@\13\3\2\2\2AB\7\6\2\2BC\7\r\2\2CD\7\7"+
		"\2\2DE\7\r\2\2EF\7\b\2\2FG\7\13\2\2G\r\3\2\2\2HI\7\f\2\2I\17\3\2\2\2J"+
		"M\5\22\n\2KM\5\24\13\2LJ\3\2\2\2LK\3\2\2\2M\21\3\2\2\2NO\7\t\2\2O\23\3"+
		"\2\2\2PQ\7\n\2\2Q\25\3\2\2\2\t\31\37\'-\65:L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}