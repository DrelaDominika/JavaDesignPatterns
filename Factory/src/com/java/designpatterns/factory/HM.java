package com.java.designpatterns.factory;

public class HM extends Dress {
    private String size;
    private String colour;

    public HM(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "HM{" +
               "size='" + size + '\'' +
               ", colour='" + colour + '\'' +
               '}';
    }

    @Override
    public String getConfiguration() {
        return "HM dress size: " + this.size + " and colour: " + this.colour;
    }
}
