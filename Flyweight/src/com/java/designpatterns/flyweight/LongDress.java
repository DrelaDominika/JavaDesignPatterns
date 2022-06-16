package com.java.designpatterns.flyweight;

public class LongDress implements Dress {
    private final String MATERIAL; //Intrinsic property
    private String colour; //Extrinsic property

    public LongDress() {
        MATERIAL = "cashmere";
    }

    @Override
    public void assignColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void startProduction() {
        System.out.println(colour + " coloured long dress made of: " + MATERIAL);
    }
}
