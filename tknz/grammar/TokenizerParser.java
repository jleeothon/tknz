// Generated from Tokenizer.g4 by ANTLR 4.5


package grammar;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TokenizerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTOMATON=1, STATE=2, WITH=3, FROM=4, TO=5, GOTO=6, START=7, STOP=8, Identifier=9, 
		IGNORE=10, StringLiteral=11, WS=12, COMMENT=13;
	public static final int
		RULE_s = 0, RULE_automaton = 1, RULE_state = 2, RULE_transition = 3, RULE_setTransition = 4, 
		RULE_rangeTransition = 5, RULE_automatonModifiers = 6, RULE_stateModifier = 7;
	public static final String[] ruleNames = {
		"s", "automaton", "state", "transition", "setTransition", "rangeTransition", 
		"automatonModifiers", "stateModifier"
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
	public String getGrammarFileName() { return "Tokenizer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TokenizerParser(TokenStream input) {
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
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AUTOMATON || _la==IGNORE) {
				{
				{
				setState(16);
				automaton();
				}
				}
				setState(21);
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
		public TerminalNode AUTOMATON() { return getToken(TokenizerParser.AUTOMATON, 0); }
		public TerminalNode Identifier() { return getToken(TokenizerParser.Identifier, 0); }
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
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterAutomaton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitAutomaton(this);
		}
	}

	public final AutomatonContext automaton() throws RecognitionException {
		AutomatonContext _localctx = new AutomatonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_automaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IGNORE) {
				{
				{
				setState(22);
				automatonModifiers();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(AUTOMATON);
			setState(29);
			match(Identifier);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATE) | (1L << START) | (1L << STOP))) != 0)) {
				{
				{
				setState(30);
				state();
				}
				}
				setState(35);
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
		public TerminalNode STATE() { return getToken(TokenizerParser.STATE, 0); }
		public TerminalNode Identifier() { return getToken(TokenizerParser.Identifier, 0); }
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
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==START || _la==STOP) {
				{
				{
				setState(36);
				stateModifier();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(STATE);
			setState(43);
			match(Identifier);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==FROM) {
				{
				{
				setState(44);
				transition();
				}
				}
				setState(49);
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
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transition);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				setTransition();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
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
		public TerminalNode WITH() { return getToken(TokenizerParser.WITH, 0); }
		public TerminalNode StringLiteral() { return getToken(TokenizerParser.StringLiteral, 0); }
		public TerminalNode GOTO() { return getToken(TokenizerParser.GOTO, 0); }
		public TerminalNode Identifier() { return getToken(TokenizerParser.Identifier, 0); }
		public SetTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterSetTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitSetTransition(this);
		}
	}

	public final SetTransitionContext setTransition() throws RecognitionException {
		SetTransitionContext _localctx = new SetTransitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(WITH);
			setState(55);
			match(StringLiteral);
			setState(56);
			match(GOTO);
			setState(57);
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
		public TerminalNode FROM() { return getToken(TokenizerParser.FROM, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TokenizerParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TokenizerParser.StringLiteral, i);
		}
		public TerminalNode TO() { return getToken(TokenizerParser.TO, 0); }
		public TerminalNode GOTO() { return getToken(TokenizerParser.GOTO, 0); }
		public TerminalNode Identifier() { return getToken(TokenizerParser.Identifier, 0); }
		public RangeTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterRangeTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitRangeTransition(this);
		}
	}

	public final RangeTransitionContext rangeTransition() throws RecognitionException {
		RangeTransitionContext _localctx = new RangeTransitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rangeTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(FROM);
			setState(60);
			match(StringLiteral);
			setState(61);
			match(TO);
			setState(62);
			match(StringLiteral);
			setState(63);
			match(GOTO);
			setState(64);
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
		public TerminalNode IGNORE() { return getToken(TokenizerParser.IGNORE, 0); }
		public AutomatonModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterAutomatonModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitAutomatonModifiers(this);
		}
	}

	public final AutomatonModifiersContext automatonModifiers() throws RecognitionException {
		AutomatonModifiersContext _localctx = new AutomatonModifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_automatonModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
		public TerminalNode START() { return getToken(TokenizerParser.START, 0); }
		public TerminalNode STOP() { return getToken(TokenizerParser.STOP, 0); }
		public StateModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).enterStateModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokenizerListener ) ((TokenizerListener)listener).exitStateModifier(this);
		}
	}

	public final StateModifierContext stateModifier() throws RecognitionException {
		StateModifierContext _localctx = new StateModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stateModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==START || _la==STOP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\3\3\3\3\7\3\"\n\3\f"+
		"\3\16\3%\13\3\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16"+
		"\4\63\13\4\3\5\3\5\5\5\67\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\t\nF\2\25"+
		"\3\2\2\2\4\33\3\2\2\2\6)\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f=\3\2\2\2\16"+
		"D\3\2\2\2\20F\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\32\5\16\b\2\31\30"+
		"\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33"+
		"\3\2\2\2\36\37\7\3\2\2\37#\7\13\2\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!"+
		"\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&(\5\20\t\2\'&\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\4\2\2-\61\7\13\2\2.\60"+
		"\5\b\5\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2"+
		"\2\63\61\3\2\2\2\64\67\5\n\6\2\65\67\5\f\7\2\66\64\3\2\2\2\66\65\3\2\2"+
		"\2\67\t\3\2\2\289\7\5\2\29:\7\r\2\2:;\7\b\2\2;<\7\13\2\2<\13\3\2\2\2="+
		">\7\6\2\2>?\7\r\2\2?@\7\7\2\2@A\7\r\2\2AB\7\b\2\2BC\7\13\2\2C\r\3\2\2"+
		"\2DE\7\f\2\2E\17\3\2\2\2FG\t\2\2\2G\21\3\2\2\2\b\25\33#)\61\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}