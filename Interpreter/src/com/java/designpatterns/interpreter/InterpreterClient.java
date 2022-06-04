package com.java.designpatterns.interpreter;

public class InterpreterClient {
    private InterpreterEngine interpreterEngine;

    public InterpreterClient(InterpreterEngine interpreterEngine) {
        this.interpreterEngine = interpreterEngine;
    }

    public int interpret(String inputData) {

        Expression expression = null;

        if (inputData.contains("Add")) {
            expression = new Addition(inputData);
        } else {
            expression = new Subtraction(inputData);
        }

        int result = expression.interpret(interpreterEngine);
        System.out.println(inputData);

        return result;
    }
}
