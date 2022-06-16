package com.java.designpatterns.bridge;

public class Assemble implements WorkShop {
    @Override
    public void work() {
        System.out.println("and assembled");
    }
}
