package com.karetis.parsers.generated;// Generated from com.karetis.parsers\ConditionalString.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConditionalStringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, WHITESPACE=6, VARIABLE=7, BIGGERTHAN=8, 
		SMALLERTHAN=9, BIGGEROREQUAL=10, SMALLEROREQUAL=11, EQUAL=12, NOTEQUAL=13, 
		AND=14, OR=15, NOT=16, PLUS=17, MINUS=18, TIMES=19, DIVIDED=20, MODULO=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "NUMBER", "WHITESPACE", "VARIABLE", "BIGGERTHAN", 
		"SMALLERTHAN", "BIGGEROREQUAL", "SMALLEROREQUAL", "EQUAL", "NOTEQUAL", 
		"AND", "OR", "NOT", "PLUS", "MINUS", "TIMES", "DIVIDED", "MODULO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'true'", "'false'", null, "' '", null, "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NUMBER", "WHITESPACE", "VARIABLE", "BIGGERTHAN", 
		"SMALLERTHAN", "BIGGEROREQUAL", "SMALLEROREQUAL", "EQUAL", "NOTEQUAL", 
		"AND", "OR", "NOT", "PLUS", "MINUS", "TIMES", "DIVIDED", "MODULO"
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


	public ConditionalStringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConditionalString.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6>\n\6\r\6\16\6?\3\7\3\7\3\7\3\7"+
		"\3\b\6\bG\n\b\r\b\16\bH\3\b\3\b\3\b\6\bN\n\b\r\b\16\bO\5\bR\n\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\4\3\2\62;\3\2"+
		"c|x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2"+
		"\2\2\7\61\3\2\2\2\t\66\3\2\2\2\13=\3\2\2\2\rA\3\2\2\2\17F\3\2\2\2\21S"+
		"\3\2\2\2\23U\3\2\2\2\25W\3\2\2\2\27Z\3\2\2\2\31]\3\2\2\2\33`\3\2\2\2\35"+
		"c\3\2\2\2\37f\3\2\2\2!i\3\2\2\2#k\3\2\2\2%m\3\2\2\2\'o\3\2\2\2)q\3\2\2"+
		"\2+s\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62\7v\2\2"+
		"\62\63\7t\2\2\63\64\7w\2\2\64\65\7g\2\2\65\b\3\2\2\2\66\67\7h\2\2\678"+
		"\7c\2\289\7n\2\29:\7u\2\2:;\7g\2\2;\n\3\2\2\2<>\t\2\2\2=<\3\2\2\2>?\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@\f\3\2\2\2AB\7\"\2\2BC\3\2\2\2CD\b\7\2\2D\16"+
		"\3\2\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2J"+
		"Q\7a\2\2KR\5\13\6\2LN\t\3\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PR\3\2\2\2QK\3\2\2\2QM\3\2\2\2R\20\3\2\2\2ST\7@\2\2T\22\3\2\2\2UV\7>\2"+
		"\2V\24\3\2\2\2WX\7@\2\2XY\7?\2\2Y\26\3\2\2\2Z[\7>\2\2[\\\7?\2\2\\\30\3"+
		"\2\2\2]^\7?\2\2^_\7?\2\2_\32\3\2\2\2`a\7#\2\2ab\7?\2\2b\34\3\2\2\2cd\7"+
		"(\2\2de\7(\2\2e\36\3\2\2\2fg\7~\2\2gh\7~\2\2h \3\2\2\2ij\7#\2\2j\"\3\2"+
		"\2\2kl\7-\2\2l$\3\2\2\2mn\7/\2\2n&\3\2\2\2op\7,\2\2p(\3\2\2\2qr\7\61\2"+
		"\2r*\3\2\2\2st\7\'\2\2t,\3\2\2\2\7\2?HOQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}