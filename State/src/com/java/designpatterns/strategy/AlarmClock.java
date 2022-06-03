package com.java.designpatterns.strategy;

public class AlarmClock {

    public static void main(String[] args) {
        AlarmClockContext alarmClockContext = new AlarmClockContext();
        alarmClockContext.alarm();

        alarmClockContext.setState(new SwitchedOff());
        alarmClockContext.alarm();
    }
}
