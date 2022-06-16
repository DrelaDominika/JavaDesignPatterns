package com.java.designpatterns.factory;

public class Bershka extends Dress {
    private String size;
    private String colour;

    public Bershka(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bershka{" +
               "size='" + size + '\'' +
               ", colour='" + colour + '\'' +
               '}';
    }

    @Override
    public String getConfiguration() {
        return "Bershka dress size: " + this.size + " and colour: " + this.colour;
    }
}
