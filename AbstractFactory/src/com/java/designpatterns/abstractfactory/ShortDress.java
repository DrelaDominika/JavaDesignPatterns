package com.java.designpatterns.abstractfactory;

public class ShortDress extends Dress {
    private String size;
    private String colour;

    public ShortDress(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Short Dress{" +
               "size='" + size + '\'' +
               ", colour='" + colour + '\'' +
               '}';
    }

    @Override
    public String getDetails() {
        return "Short Dress dress size: " + this.size + " and colour: " + this.colour;
    }
}
