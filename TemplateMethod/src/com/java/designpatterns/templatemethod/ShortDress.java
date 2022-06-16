package com.java.designpatterns.templatemethod;

public class ShortDress extends DressTemplate {
    @Override
    public void assembleMaterials() {
        System.out.println("Joining all materials and cutting to desired length");
    }

    @Override
    public void sawTogether() {
        System.out.println("Sawing the short dress together");
    }
}
