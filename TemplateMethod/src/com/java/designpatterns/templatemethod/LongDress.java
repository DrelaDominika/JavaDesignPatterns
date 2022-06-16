package com.java.designpatterns.templatemethod;

public class LongDress extends DressTemplate {
    @Override
    public void assembleMaterials() {
        System.out.println("Joining all materials");
    }

    @Override
    public void sawTogether() {
        System.out.println("Sawing the long dress together");
    }
}
