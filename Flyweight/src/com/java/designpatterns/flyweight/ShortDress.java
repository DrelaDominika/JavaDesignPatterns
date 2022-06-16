package com.java.designpatterns.flyweight;

public class ShortDress implements Dress {
    private final String MATERIAL; //Intrinsic property
    private String colour; //Extrinsic property

    public ShortDress() {
        MATERIAL = "silk";
    }

    @Override
    public void assignColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void startProduction() {
        System.out.println(colour + " coloured short dress made of: " + MATERIAL);
    }
}
