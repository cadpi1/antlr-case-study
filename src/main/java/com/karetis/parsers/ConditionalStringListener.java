package com.karetis.parsers;

import com.karetis.parsers.generated.ConditionalStringBaseListener;
import com.karetis.parsers.generated.ConditionalStringParser;

import java.util.Map;
import java.util.Stack;

public class ConditionalStringListener extends ConditionalStringBaseListener {

    private Map<String, Object> variables;
    private Stack<Object> stack = new Stack<Object>();

    public ConditionalStringListener(Map<String, Object> variables) {
        this.variables = variables;
    }

    @Override
    public void exitBiggerthan(ConditionalStringParser.BiggerthanContext ctx) {
        Integer conditionTwo = (Integer) stack.pop();
        Integer conditionOne = (Integer) stack.pop();
        stack.push(conditionOne > conditionTwo);
    }

    @Override
    public void exitSmallerthan(ConditionalStringParser.SmallerthanContext ctx) {
        Integer conditionTwo = (Integer) stack.pop();
        Integer conditionOne = (Integer) stack.pop();
        stack.push(conditionOne < conditionTwo);
    }

    @Override
    public void exitBiggerorequal(ConditionalStringParser.BiggerorequalContext ctx) {
        Integer conditionTwo = (Integer) stack.pop();
        Integer conditionOne = (Integer) stack.pop();
        stack.push(conditionOne >= conditionTwo);
    }

    @Override
    public void exitSmallerorequal(ConditionalStringParser.SmallerorequalContext ctx) {
        Integer conditionTwo = (Integer) stack.pop();
        Integer conditionOne = (Integer) stack.pop();
        stack.push(conditionOne <= conditionTwo);
    }

    @Override
    public void exitEqual(ConditionalStringParser.EqualContext ctx) {
        Integer conditionOne = (Integer) stack.pop();
        Integer conditionTwo = (Integer) stack.pop();
        stack.push(conditionOne == conditionTwo);
    }

    @Override
    public void exitNotequal(ConditionalStringParser.NotequalContext ctx) {
        Integer conditionOne = (Integer) stack.pop();
        Integer conditionTwo = (Integer) stack.pop();
        stack.push(conditionOne != conditionTwo);
    }

    @Override
    public void exitAnd(ConditionalStringParser.AndContext ctx) {
        boolean conditionOne = (boolean) stack.pop();
        boolean conditionTwo = (boolean) stack.pop();
        stack.push(conditionOne && conditionTwo);
    }

    @Override
    public void exitOr(ConditionalStringParser.OrContext ctx) {
        boolean conditionOne = (boolean) stack.pop();
        boolean conditionTwo = (boolean) stack.pop();
        stack.push(conditionOne || conditionTwo);
    }

    @Override
    public void exitNot(ConditionalStringParser.NotContext ctx) {
        boolean condition = (boolean) stack.pop();
        stack.push(!condition);
    }

    @Override
    public void exitBtrue(ConditionalStringParser.BtrueContext ctx) {
        stack.push(true);
    }

    @Override
    public void exitBfalse(ConditionalStringParser.BfalseContext ctx) {
        stack.push(false);
    }

    @Override
    public void exitNumber(ConditionalStringParser.NumberContext ctx) {
        stack.push(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public void exitVariable(ConditionalStringParser.VariableContext ctx) {
        stack.push(this.variables.get(ctx.VARIABLE().getText()));
    }

    @Override
    public void exitAdd(ConditionalStringParser.AddContext ctx) {
        Integer numberTwo = (int) stack.pop();
        Integer numberOne = (int) stack.pop();
        stack.push(numberOne + numberTwo);
    }

    @Override
    public void exitSubstract(ConditionalStringParser.SubstractContext ctx) {
        Integer numberTwo = (int) stack.pop();
        Integer numberOne = (int) stack.pop();
        stack.push(numberOne - numberTwo);
    }

    @Override
    public void exitDivide(ConditionalStringParser.DivideContext ctx) {
        Integer numberTwo = (int) stack.pop();
        Integer numberOne = (int) stack.pop();
        stack.push(numberOne / numberTwo);
    }

    @Override
    public void exitModulo(ConditionalStringParser.ModuloContext ctx) {
        Integer numberTwo = (int) stack.pop();
        Integer numberOne = (int) stack.pop();
        stack.push(numberOne % numberTwo);
    }

    @Override
    public void exitTimes(ConditionalStringParser.TimesContext ctx) {
        Integer numberOne = (int) stack.pop();
        Integer numberTwo = (int) stack.pop();
        stack.push(numberTwo * numberOne);
    }

    public Boolean getResult() {
        return (Boolean) stack.pop();
    }
}
