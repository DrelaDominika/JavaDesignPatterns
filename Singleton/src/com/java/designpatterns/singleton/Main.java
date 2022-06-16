package com.java.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println(Singleton.getInstance("Singleton1"));
        Singleton singleton = Singleton.getInstance("Singleton2");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }
}
