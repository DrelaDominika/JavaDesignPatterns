package com.java.designpatterns.interpreter;

public class Addition implements Expression {
    private String expression;

    public Addition(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.addition(expression);
    }
}
