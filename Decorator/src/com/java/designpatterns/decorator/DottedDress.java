package com.java.designpatterns.decorator;

public class DottedDress extends Decorator {
    public DottedDress(Dress dress) {
        super(dress);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Dotted dress");
    }
}
