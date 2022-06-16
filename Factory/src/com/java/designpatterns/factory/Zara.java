package com.java.designpatterns.factory;

public class Zara extends Dress {
    private String size;
    private String colour;

    public Zara(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Zara{" +
               "size='" + size + '\'' +
               ", colour='" + colour + '\'' +
               '}';
    }

    @Override
    public String getConfiguration() {
        return "Zara dress size: " + this.size + " and colour: " + this.colour;
    }
}
