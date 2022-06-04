package com.java.designpatterns.memento;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Happy");
        editor.printText();
        editor.write("Happy birthday");
        editor.printText();
        editor.write("Happy birthday to you!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
    }
}
