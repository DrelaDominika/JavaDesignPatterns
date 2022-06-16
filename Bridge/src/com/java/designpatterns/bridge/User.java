package com.java.designpatterns.bridge;

public class User {

    public static void main(String[] args) {
        Store acer = new Acer(new Produce(), new Assemble());
        acer.manufacture();
        Store lenovo = new Lenovo(new Produce(), new Assemble());
        lenovo.manufacture();
    }
}
