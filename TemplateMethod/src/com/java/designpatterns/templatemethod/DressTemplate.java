package com.java.designpatterns.templatemethod;

public abstract class DressTemplate {
    public final void produceDress() {
        collectMaterials();
        assembleMaterials();
        sawTogether();
        finalTouches();
        System.out.println("The dress is ready");
    }

    private void collectMaterials() {
        System.out.println("Dress made of silk with a slit with internal corset construction");
    }

    private void finalTouches() {
        System.out.println("Dress is almost ready");
    }

    public abstract void assembleMaterials();

    public abstract void sawTogether();
}
