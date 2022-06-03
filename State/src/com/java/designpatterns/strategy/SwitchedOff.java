package com.java.designpatterns.strategy;

public class SwitchedOff implements AlarmClockState {
    @Override
    public void alarm() {
        System.out.println("Alarm clock is switched off.");
    }
}
