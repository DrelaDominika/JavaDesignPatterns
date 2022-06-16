package com.java.designpatterns.bridge;

public class Produce implements WorkShop {
    @Override
    public void work() {
        System.out.print("produced ");
    }
}
