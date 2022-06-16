package com.java.designpatterns.decorator;

public class SilkDress extends Decorator {
    public SilkDress(Dress dress) {
        super(dress);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Silk dress");
    }
}
