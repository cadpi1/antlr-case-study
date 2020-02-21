# Antlr Case Study

## Goal

The goal of this case study is to understand your capability of learning a new library and use it to solve problems.

## Objective

Create condition string parser and execute it using variables in form of `Map<String, Object>`. Test cases are provided, you must pass all mandatory test cases, passing optional test cases will be considered a plus. If any test cases are wrong please inform us.

## Condition Strings

Generally the condition string follows Java style condition syntax (but does not require full Java syntax complexity) such as `(data binary data)` or `(unary data)` where binary are binary operations like `&&`, `||`, `==`, `>`, `>=`, `<`, `<=`, and unary operations like `!`.
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

## Notes

This repository creates a base to make the coding for case study take less time, and is proven to be possible without issues if done the right way.
However, if you want to do it in a different way, here are the conditions:

1. If you do not want to use Antlr, you are free to use other lexical analysis library in Java.
2. If you do not want to use Java or this repository as a base, you are free to use either C++, C#, Java, Python, or Kotlin with any lexical analysis library available to that language. However, you will have to replicate the same set of tests in that language.
3. This repository targets Java 8, if you want to upgrade Java version you are allowed to do so.
