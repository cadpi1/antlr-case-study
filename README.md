# Antlr Case Study

## Goal

The goal of this case study is to understand your capability of learning a new library.

## Objective

Create condition string parser and execute it using variables in form of `Map<String, Object>`. Test cases are provided, you must pass all mandatory test cases, passing optional test cases will be considered a plus. If any test cases are wrong please inform us.

## Condition Strings

Generally the condition string follows Java style condition syntax (but does not require full Java syntax complexity) such as `(data binary data)` or `(unary data)` where binary are binary operations like `&&`, `||`, `==`, `>`, `<`, and unary operations like `!`.
Data can be variables (`int_01`, `int_02`, `var_01`, `var_02`, ...) or literals (`1`, `2`, `3`, `true`, `false`, ...).

It should result in a boolean value of either true or false.

In optional test cases, you will be required to parse mathematical operations such as `+`, `-`, `/`, `*`, and `%` and supply the result to the subsequent conditions.
Conditional brackets are more strict to make Antlr grammar syntax easier.

## What is Provided?

1. Test cases to prove correctness.
2. Basic code structure with gradle wrapper.
3. `Parsers` class to supply your code, feel free to add more classes.
4. `System.out.println` will be printed out into Windows command prompt or Linux terminal, feel free to use it for any purposes.

## Resources

1. [Antlr](https://www.antlr.org/)
2. [Antlr Getting Started](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)
3. [Antlr Example Grammars](https://github.com/antlr/grammars-v4)
4. [Baeldung Example on Antlr](https://www.baeldung.com/java-antlr)
5. [Gradle Antlr Plugin](https://docs.gradle.org/current/userguide/antlr_plugin.html)
