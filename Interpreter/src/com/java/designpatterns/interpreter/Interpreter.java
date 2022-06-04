package com.java.designpatterns.interpreter;

public class Interpreter {

    public static void main(String[] args) {

        InterpreterEngine interpreterEngine = new InterpreterEngine();

        InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);

        System.out.println("Addition result = " + interpreterClient.interpret("Add 13 and 157"));
        System.out.println("Subtraction result = " + interpreterClient.interpret("Subtract 400 from 100"));
    }
}
