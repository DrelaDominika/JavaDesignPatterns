package com.java.designpatterns.abstractfactory;

public class MidiDress extends Dress {
    private String size;
    private String colour;

    public MidiDress(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Midi Dress{" +
               "size='" + size + '\'' +
               ", colour='" + colour + '\'' +
               '}';
    }

    @Override
    public String getDetails() {
        return "Midi Dress dress size: " + this.size + " and colour: " + this.colour;
    }
}
