package com.karetis.parsers.generated;// Generated from com.karetis.parsers\ConditionalString.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConditionalStringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, WHITESPACE=6, VARIABLE=7, BIGGERTHAN=8, 
		SMALLERTHAN=9, BIGGEROREQUAL=10, SMALLEROREQUAL=11, EQUAL=12, NOTEQUAL=13, 
		AND=14, OR=15, NOT=16, PLUS=17, MINUS=18, TIMES=19, DIVIDED=20, MODULO=21;
	public static final int
		RULE_condition = 0, RULE_biggerthan = 1, RULE_smallerthan = 2, RULE_biggerorequal = 3, 
		RULE_smallerorequal = 4, RULE_equal = 5, RULE_notequal = 6, RULE_and = 7, 
		RULE_or = 8, RULE_not = 9, RULE_comparable = 10, RULE_maths = 11, RULE_add = 12, 
		RULE_substract = 13, RULE_divide = 14, RULE_times = 15, RULE_modulo = 16, 
		RULE_btrue = 17, RULE_bfalse = 18, RULE_number = 19, RULE_variable = 20, 
		RULE_numberorvariable = 21;
	public static final String[] ruleNames = {
		"condition", "biggerthan", "smallerthan", "biggerorequal", "smallerorequal", 
		"equal", "notequal", "and", "or", "not", "comparable", "maths", "add", 
		"substract", "divide", "times", "modulo", "btrue", "bfalse", "number", 
		"variable", "numberorvariable"
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

	@Override
	public String getGrammarFileName() { return "ConditionalString.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConditionalStringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConditionContext extends ParserRuleContext {
		public ComparableContext comparable() {
			return getRuleContext(ComparableContext.class,0);
		}
		public BiggerthanContext biggerthan() {
			return getRuleContext(BiggerthanContext.class,0);
		}
		public SmallerthanContext smallerthan() {
			return getRuleContext(SmallerthanContext.class,0);
		}
		public BiggerorequalContext biggerorequal() {
			return getRuleContext(BiggerorequalContext.class,0);
		}
		public SmallerorequalContext smallerorequal() {
			return getRuleContext(SmallerorequalContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public NotequalContext notequal() {
			return getRuleContext(NotequalContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(45);
				comparable();
				}
				break;
			case 2:
				{
				setState(46);
				biggerthan();
				}
				break;
			case 3:
				{
				setState(47);
				smallerthan();
				}
				break;
			case 4:
				{
				setState(48);
				biggerorequal();
				}
				break;
			case 5:
				{
				setState(49);
				smallerorequal();
				}
				break;
			case 6:
				{
				setState(50);
				equal();
				}
				break;
			case 7:
				{
				setState(51);
				notequal();
				}
				break;
			case 8:
				{
				setState(52);
				and();
				}
				break;
			case 9:
				{
				setState(53);
				or();
				}
				break;
			case 10:
				{
				setState(54);
				not();
				}
				break;
			}
			setState(57);
			match(T__1);
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

	public static class BiggerthanContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode BIGGERTHAN() { return getToken(ConditionalStringParser.BIGGERTHAN, 0); }
		public BiggerthanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biggerthan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterBiggerthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitBiggerthan(this);
		}
	}

	public final BiggerthanContext biggerthan() throws RecognitionException {
		BiggerthanContext _localctx = new BiggerthanContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_biggerthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			comparable();
			setState(60);
			match(BIGGERTHAN);
			setState(61);
			comparable();
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

	public static class SmallerthanContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode SMALLERTHAN() { return getToken(ConditionalStringParser.SMALLERTHAN, 0); }
		public SmallerthanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallerthan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterSmallerthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitSmallerthan(this);
		}
	}

	public final SmallerthanContext smallerthan() throws RecognitionException {
		SmallerthanContext _localctx = new SmallerthanContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_smallerthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			comparable();
			setState(64);
			match(SMALLERTHAN);
			setState(65);
			comparable();
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

	public static class BiggerorequalContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode BIGGEROREQUAL() { return getToken(ConditionalStringParser.BIGGEROREQUAL, 0); }
		public BiggerorequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biggerorequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterBiggerorequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitBiggerorequal(this);
		}
	}

	public final BiggerorequalContext biggerorequal() throws RecognitionException {
		BiggerorequalContext _localctx = new BiggerorequalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_biggerorequal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			comparable();
			setState(68);
			match(BIGGEROREQUAL);
			setState(69);
			comparable();
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

	public static class SmallerorequalContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode SMALLEROREQUAL() { return getToken(ConditionalStringParser.SMALLEROREQUAL, 0); }
		public SmallerorequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallerorequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterSmallerorequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitSmallerorequal(this);
		}
	}

	public final SmallerorequalContext smallerorequal() throws RecognitionException {
		SmallerorequalContext _localctx = new SmallerorequalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_smallerorequal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			comparable();
			setState(72);
			match(SMALLEROREQUAL);
			setState(73);
			comparable();
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

	public static class EqualContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ConditionalStringParser.EQUAL, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			comparable();
			setState(76);
			match(EQUAL);
			setState(77);
			comparable();
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

	public static class NotequalContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(ConditionalStringParser.NOTEQUAL, 0); }
		public NotequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterNotequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitNotequal(this);
		}
	}

	public final NotequalContext notequal() throws RecognitionException {
		NotequalContext _localctx = new NotequalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_notequal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			comparable();
			setState(80);
			match(NOTEQUAL);
			setState(81);
			comparable();
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

	public static class AndContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode AND() { return getToken(ConditionalStringParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			comparable();
			setState(84);
			match(AND);
			setState(85);
			comparable();
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

	public static class OrContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode OR() { return getToken(ConditionalStringParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			comparable();
			setState(88);
			match(OR);
			setState(89);
			comparable();
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ConditionalStringParser.NOT, 0); }
		public ComparableContext comparable() {
			return getRuleContext(ComparableContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(NOT);
			setState(92);
			comparable();
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

	public static class ComparableContext extends ParserRuleContext {
		public BtrueContext btrue() {
			return getRuleContext(BtrueContext.class,0);
		}
		public BfalseContext bfalse() {
			return getRuleContext(BfalseContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MathsContext maths() {
			return getRuleContext(MathsContext.class,0);
		}
		public ComparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterComparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitComparable(this);
		}
	}

	public final ComparableContext comparable() throws RecognitionException {
		ComparableContext _localctx = new ComparableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(94);
				btrue();
				}
				break;
			case T__3:
				{
				setState(95);
				bfalse();
				}
				break;
			case NUMBER:
				{
				setState(96);
				number();
				}
				break;
			case VARIABLE:
				{
				setState(97);
				variable();
				}
				break;
			case T__0:
				{
				setState(98);
				maths();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MathsContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubstractContext substract() {
			return getRuleContext(SubstractContext.class,0);
		}
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public TimesContext times() {
			return getRuleContext(TimesContext.class,0);
		}
		public MathsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maths; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterMaths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitMaths(this);
		}
	}

	public final MathsContext maths() throws RecognitionException {
		MathsContext _localctx = new MathsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_maths);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(102);
				add();
				}
				break;
			case 2:
				{
				setState(103);
				substract();
				}
				break;
			case 3:
				{
				setState(104);
				divide();
				}
				break;
			case 4:
				{
				setState(105);
				modulo();
				}
				break;
			case 5:
				{
				setState(106);
				times();
				}
				break;
			}
			setState(109);
			match(T__1);
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

	public static class AddContext extends ParserRuleContext {
		public List<NumberorvariableContext> numberorvariable() {
			return getRuleContexts(NumberorvariableContext.class);
		}
		public NumberorvariableContext numberorvariable(int i) {
			return getRuleContext(NumberorvariableContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ConditionalStringParser.PLUS, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			numberorvariable();
			setState(112);
			match(PLUS);
			setState(113);
			numberorvariable();
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

	public static class SubstractContext extends ParserRuleContext {
		public List<NumberorvariableContext> numberorvariable() {
			return getRuleContexts(NumberorvariableContext.class);
		}
		public NumberorvariableContext numberorvariable(int i) {
			return getRuleContext(NumberorvariableContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(ConditionalStringParser.MINUS, 0); }
		public SubstractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterSubstract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitSubstract(this);
		}
	}

	public final SubstractContext substract() throws RecognitionException {
		SubstractContext _localctx = new SubstractContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_substract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			numberorvariable();
			setState(116);
			match(MINUS);
			setState(117);
			numberorvariable();
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

	public static class DivideContext extends ParserRuleContext {
		public List<NumberorvariableContext> numberorvariable() {
			return getRuleContexts(NumberorvariableContext.class);
		}
		public NumberorvariableContext numberorvariable(int i) {
			return getRuleContext(NumberorvariableContext.class,i);
		}
		public TerminalNode DIVIDED() { return getToken(ConditionalStringParser.DIVIDED, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			numberorvariable();
			setState(120);
			match(DIVIDED);
			setState(121);
			numberorvariable();
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

	public static class TimesContext extends ParserRuleContext {
		public List<NumberorvariableContext> numberorvariable() {
			return getRuleContexts(NumberorvariableContext.class);
		}
		public NumberorvariableContext numberorvariable(int i) {
			return getRuleContext(NumberorvariableContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(ConditionalStringParser.TIMES, 0); }
		public TimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitTimes(this);
		}
	}

	public final TimesContext times() throws RecognitionException {
		TimesContext _localctx = new TimesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			numberorvariable();
			setState(124);
			match(TIMES);
			setState(125);
			numberorvariable();
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

	public static class ModuloContext extends ParserRuleContext {
		public List<NumberorvariableContext> numberorvariable() {
			return getRuleContexts(NumberorvariableContext.class);
		}
		public NumberorvariableContext numberorvariable(int i) {
			return getRuleContext(NumberorvariableContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(ConditionalStringParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			numberorvariable();
			setState(128);
			match(MODULO);
			setState(129);
			numberorvariable();
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

	public static class BtrueContext extends ParserRuleContext {
		public BtrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterBtrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitBtrue(this);
		}
	}

	public final BtrueContext btrue() throws RecognitionException {
		BtrueContext _localctx = new BtrueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_btrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__2);
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

	public static class BfalseContext extends ParserRuleContext {
		public BfalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterBfalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitBfalse(this);
		}
	}

	public final BfalseContext bfalse() throws RecognitionException {
		BfalseContext _localctx = new BfalseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bfalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__3);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ConditionalStringParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(NUMBER);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ConditionalStringParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(VARIABLE);
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

	public static class NumberorvariableContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ConditionalStringParser.NUMBER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberorvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberorvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).enterNumberorvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConditionalStringListener ) ((ConditionalStringListener)listener).exitNumberorvariable(this);
		}
	}

	public final NumberorvariableContext numberorvariable() throws RecognitionException {
		NumberorvariableContext _localctx = new NumberorvariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numberorvariable);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				variable();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2:\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rn\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u0090\n\27"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u008d"+
		"\2.\3\2\2\2\4=\3\2\2\2\6A\3\2\2\2\bE\3\2\2\2\nI\3\2\2\2\fM\3\2\2\2\16"+
		"Q\3\2\2\2\20U\3\2\2\2\22Y\3\2\2\2\24]\3\2\2\2\26e\3\2\2\2\30g\3\2\2\2"+
		"\32q\3\2\2\2\34u\3\2\2\2\36y\3\2\2\2 }\3\2\2\2\"\u0081\3\2\2\2$\u0085"+
		"\3\2\2\2&\u0087\3\2\2\2(\u0089\3\2\2\2*\u008b\3\2\2\2,\u008f\3\2\2\2."+
		"9\7\3\2\2/:\5\26\f\2\60:\5\4\3\2\61:\5\6\4\2\62:\5\b\5\2\63:\5\n\6\2\64"+
		":\5\f\7\2\65:\5\16\b\2\66:\5\20\t\2\67:\5\22\n\28:\5\24\13\29/\3\2\2\2"+
		"9\60\3\2\2\29\61\3\2\2\29\62\3\2\2\29\63\3\2\2\29\64\3\2\2\29\65\3\2\2"+
		"\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;<\7\4\2\2<\3\3\2\2\2=>"+
		"\5\26\f\2>?\7\n\2\2?@\5\26\f\2@\5\3\2\2\2AB\5\26\f\2BC\7\13\2\2CD\5\26"+
		"\f\2D\7\3\2\2\2EF\5\26\f\2FG\7\f\2\2GH\5\26\f\2H\t\3\2\2\2IJ\5\26\f\2"+
		"JK\7\r\2\2KL\5\26\f\2L\13\3\2\2\2MN\5\26\f\2NO\7\16\2\2OP\5\26\f\2P\r"+
		"\3\2\2\2QR\5\26\f\2RS\7\17\2\2ST\5\26\f\2T\17\3\2\2\2UV\5\26\f\2VW\7\20"+
		"\2\2WX\5\26\f\2X\21\3\2\2\2YZ\5\26\f\2Z[\7\21\2\2[\\\5\26\f\2\\\23\3\2"+
		"\2\2]^\7\22\2\2^_\5\26\f\2_\25\3\2\2\2`f\5$\23\2af\5&\24\2bf\5(\25\2c"+
		"f\5*\26\2df\5\30\r\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2"+
		"f\27\3\2\2\2gm\7\3\2\2hn\5\32\16\2in\5\34\17\2jn\5\36\20\2kn\5\"\22\2"+
		"ln\5 \21\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2"+
		"op\7\4\2\2p\31\3\2\2\2qr\5,\27\2rs\7\23\2\2st\5,\27\2t\33\3\2\2\2uv\5"+
		",\27\2vw\7\24\2\2wx\5,\27\2x\35\3\2\2\2yz\5,\27\2z{\7\26\2\2{|\5,\27\2"+
		"|\37\3\2\2\2}~\5,\27\2~\177\7\25\2\2\177\u0080\5,\27\2\u0080!\3\2\2\2"+
		"\u0081\u0082\5,\27\2\u0082\u0083\7\27\2\2\u0083\u0084\5,\27\2\u0084#\3"+
		"\2\2\2\u0085\u0086\7\5\2\2\u0086%\3\2\2\2\u0087\u0088\7\6\2\2\u0088\'"+
		"\3\2\2\2\u0089\u008a\7\7\2\2\u008a)\3\2\2\2\u008b\u008c\7\t\2\2\u008c"+
		"+\3\2\2\2\u008d\u0090\7\7\2\2\u008e\u0090\5*\26\2\u008f\u008d\3\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090-\3\2\2\2\69em\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}