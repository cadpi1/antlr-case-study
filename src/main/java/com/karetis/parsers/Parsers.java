package com.karetis.parsers;

import com.karetis.parsers.generated.ConditionalStringLexer;
import com.karetis.parsers.generated.ConditionalStringParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Map;

public class Parsers {

    public static Object execute(String condition, Map<String, Object> values) {
        CharStream input = new ANTLRInputStream(condition);
        ConditionalStringLexer lexer = new ConditionalStringLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ConditionalStringParser parser = new ConditionalStringParser(commonTokenStream);
        ParseTree tree = parser.condition();

        ParseTreeWalker walker = new ParseTreeWalker();
        ConditionalStringListener listener = new ConditionalStringListener(values);
        walker.walk(listener, tree);
        return listener.getResult();
    }
}
