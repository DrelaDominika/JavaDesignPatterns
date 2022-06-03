package com.java.designpatterns.strategy;

public class AlarmClockContext {

    private AlarmClockState currentState;

    public AlarmClockContext() {
        currentState = new Ringing(); //default state

    }

    public void setState(AlarmClockState state) {
        currentState = state;
    }

    public void alarm() {
        currentState.alarm();
    }
}
