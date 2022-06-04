package com.java.designpatterns.chainofresponsibility;

import java.util.Arrays;

public class TwoDimension implements Chain {
    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Dimension request) {
        if (request.getCoordinate().length == 2) {
            System.out.println("Two Dimension coordinates: " + Arrays.toString(request.getCoordinate()));
        } else {
            nextInChain.process(request);
        }
    }
}
