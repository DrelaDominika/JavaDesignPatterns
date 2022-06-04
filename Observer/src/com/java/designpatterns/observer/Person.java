package com.java.designpatterns.observer;

public class Person implements WeatherListener{
    @Override
    public void update(String weather) {
        System.out.println("I enjoy " + weather);
    }
}
