package com.java.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Person feng = new Person().name("Feng").age("21").address("Grunwaldzka 21").country("Poland");
        System.out.println(feng.build());

        Person meg = new Person().name("Meg").age("225").address("unknown").country("unknown");
        System.out.println(meg.build());
    }
}
