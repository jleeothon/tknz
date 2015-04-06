// Generated from tknz\grammar\Tknz.g4 by ANTLR 4.5

package tknz.grammar;

import java.util.TreeMap;
import tknz.core.Automaton;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TknzLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTOMATON=1, STATE=2, WITH=3, FROM=4, TO=5, GOTO=6, START=7, STOP=8, Identifier=9, 
		IGNORE=10, StringLiteral=11, WS=12, COMMENT=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AUTOMATON", "STATE", "WITH", "FROM", "TO", "GOTO", "START", "STOP", "Identifier", 
		"IGNORE", "DQUOTE", "SQUOTE", "CHAR_L", "DQUOTE_STRING", "SQUOTE_STRING", 
		"StringLiteral", "WS", "COMMENT"
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


	public TknzLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tknz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\nV\n\n"+
		"\r\n\16\nW\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\7\17j\n\17\f\17\16\17m\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\7\20t\n\20\f\20\16\20w\13\20\3\20\3\20\3\21\3\21\5\21}\n\21\3\22\6\22"+
		"\u0080\n\22\r\22\16\22\u0081\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u008a"+
		"\n\23\f\23\16\23\u008d\13\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37\2!\r#\16%\17\3\2\6\7\2//"+
		"\62;C\\aac|\13\2\"#%(*-//\62;B\\^^`}\177\u0080\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\61\3\2\2\2\7\67\3\2"+
		"\2\2\t<\3\2\2\2\13A\3\2\2\2\rD\3\2\2\2\17I\3\2\2\2\21O\3\2\2\2\23U\3\2"+
		"\2\2\25Y\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37p\3"+
		"\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0085\3\2\2\2\'(\7c\2\2()\7w\2\2)*\7v\2"+
		"\2*+\7q\2\2+,\7o\2\2,-\7c\2\2-.\7v\2\2./\7q\2\2/\60\7p\2\2\60\4\3\2\2"+
		"\2\61\62\7u\2\2\62\63\7v\2\2\63\64\7c\2\2\64\65\7v\2\2\65\66\7g\2\2\66"+
		"\6\3\2\2\2\678\7y\2\289\7k\2\29:\7v\2\2:;\7j\2\2;\b\3\2\2\2<=\7h\2\2="+
		">\7t\2\2>?\7q\2\2?@\7o\2\2@\n\3\2\2\2AB\7v\2\2BC\7q\2\2C\f\3\2\2\2DE\7"+
		"i\2\2EF\7q\2\2FG\7v\2\2GH\7q\2\2H\16\3\2\2\2IJ\7u\2\2JK\7v\2\2KL\7c\2"+
		"\2LM\7t\2\2MN\7v\2\2N\20\3\2\2\2OP\7u\2\2PQ\7v\2\2QR\7q\2\2RS\7r\2\2S"+
		"\22\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\24\3\2"+
		"\2\2YZ\7k\2\2Z[\7i\2\2[\\\7p\2\2\\]\7q\2\2]^\7t\2\2^_\7g\2\2_\26\3\2\2"+
		"\2`a\7$\2\2a\30\3\2\2\2bc\7)\2\2c\32\3\2\2\2de\t\3\2\2e\34\3\2\2\2fk\5"+
		"\27\f\2gj\5\31\r\2hj\5\33\16\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\5\27\f\2o\36\3\2\2\2pu\5\31\r\2qt\5\27"+
		"\f\2rt\5\33\16\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3"+
		"\2\2\2wu\3\2\2\2xy\5\31\r\2y \3\2\2\2z}\5\37\20\2{}\5\35\17\2|z\3\2\2"+
		"\2|{\3\2\2\2}\"\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\b\22\2\2\u0084$\3\2\2\2\u0085\u0086\7\61\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\u008b\3\2\2\2\u0088\u008a\n\5\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\b\23\2\2\u008f&\3\2\2\2\13\2Wiksu|\u0081\u008b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}