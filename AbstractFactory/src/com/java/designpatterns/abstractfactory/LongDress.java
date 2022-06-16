package com.java.designpatterns.abstractfactory;

public class LongDress extends Dress {
    private String size;
    private String colour;

    public LongDress(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Long Dress{" +
               "size='" + size + '\'' +
               ", colour='" + colour + '\'' +
               '}';
    }

    @Override
    public String getDetails() {
        return "Long Dress dress size: " + this.size + " and colour: " + this.colour;
    }
}
