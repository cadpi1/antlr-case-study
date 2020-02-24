package com.karetis.parsers.generated;// Generated from com.karetis.parsers\ConditionalString.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConditionalStringParser}.
 */
public interface ConditionalStringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ConditionalStringParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ConditionalStringParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#biggerthan}.
	 * @param ctx the parse tree
	 */
	void enterBiggerthan(ConditionalStringParser.BiggerthanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#biggerthan}.
	 * @param ctx the parse tree
	 */
	void exitBiggerthan(ConditionalStringParser.BiggerthanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#smallerthan}.
	 * @param ctx the parse tree
	 */
	void enterSmallerthan(ConditionalStringParser.SmallerthanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#smallerthan}.
	 * @param ctx the parse tree
	 */
	void exitSmallerthan(ConditionalStringParser.SmallerthanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#biggerorequal}.
	 * @param ctx the parse tree
	 */
	void enterBiggerorequal(ConditionalStringParser.BiggerorequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#biggerorequal}.
	 * @param ctx the parse tree
	 */
	void exitBiggerorequal(ConditionalStringParser.BiggerorequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#smallerorequal}.
	 * @param ctx the parse tree
	 */
	void enterSmallerorequal(ConditionalStringParser.SmallerorequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#smallerorequal}.
	 * @param ctx the parse tree
	 */
	void exitSmallerorequal(ConditionalStringParser.SmallerorequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(ConditionalStringParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(ConditionalStringParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#notequal}.
	 * @param ctx the parse tree
	 */
	void enterNotequal(ConditionalStringParser.NotequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#notequal}.
	 * @param ctx the parse tree
	 */
	void exitNotequal(ConditionalStringParser.NotequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ConditionalStringParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ConditionalStringParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(ConditionalStringParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(ConditionalStringParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(ConditionalStringParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(ConditionalStringParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#comparable}.
	 * @param ctx the parse tree
	 */
	void enterComparable(ConditionalStringParser.ComparableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#comparable}.
	 * @param ctx the parse tree
	 */
	void exitComparable(ConditionalStringParser.ComparableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#maths}.
	 * @param ctx the parse tree
	 */
	void enterMaths(ConditionalStringParser.MathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#maths}.
	 * @param ctx the parse tree
	 */
	void exitMaths(ConditionalStringParser.MathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ConditionalStringParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ConditionalStringParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#substract}.
	 * @param ctx the parse tree
	 */
	void enterSubstract(ConditionalStringParser.SubstractContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#substract}.
	 * @param ctx the parse tree
	 */
	void exitSubstract(ConditionalStringParser.SubstractContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(ConditionalStringParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(ConditionalStringParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#times}.
	 * @param ctx the parse tree
	 */
	void enterTimes(ConditionalStringParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#times}.
	 * @param ctx the parse tree
	 */
	void exitTimes(ConditionalStringParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(ConditionalStringParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(ConditionalStringParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#btrue}.
	 * @param ctx the parse tree
	 */
	void enterBtrue(ConditionalStringParser.BtrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#btrue}.
	 * @param ctx the parse tree
	 */
	void exitBtrue(ConditionalStringParser.BtrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#bfalse}.
	 * @param ctx the parse tree
	 */
	void enterBfalse(ConditionalStringParser.BfalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#bfalse}.
	 * @param ctx the parse tree
	 */
	void exitBfalse(ConditionalStringParser.BfalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ConditionalStringParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ConditionalStringParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ConditionalStringParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ConditionalStringParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionalStringParser#numberorvariable}.
	 * @param ctx the parse tree
	 */
	void enterNumberorvariable(ConditionalStringParser.NumberorvariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionalStringParser#numberorvariable}.
	 * @param ctx the parse tree
	 */
	void exitNumberorvariable(ConditionalStringParser.NumberorvariableContext ctx);
}