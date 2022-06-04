package com.java.designpatterns.interpreter;

public class Subtraction implements Expression {
    private String expression;

    public Subtraction(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.subtraction(expression);
    }
}
