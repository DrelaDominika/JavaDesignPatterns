package com.java.designpatterns.decorator;

public class Decorator implements Dress {
    private Dress dress;

    public Decorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void design() {
        this.dress.design();
    }
}
