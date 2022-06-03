package com.java.designpatterns.strategy;

public class Ringing implements AlarmClockState {
    @Override
    public void alarm() {
        System.out.println("Alarm clock is ringing! Wake up!!!");
    }
}
