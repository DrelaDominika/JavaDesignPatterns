package com.java.designpatterns.memento;

import java.util.LinkedList;
import java.util.Deque;

public class Editor {
    private final TextArea textArea;
    private final Deque<TextArea.Memento> stateHistory;

    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        stateHistory.removeLast();
        textArea.restore(stateHistory.peekLast());
    }

    public void printText() {
        System.out.println(textArea.getText());
    }
}
