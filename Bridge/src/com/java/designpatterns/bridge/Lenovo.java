package com.java.designpatterns.bridge;

public class Lenovo extends Store {
    public Lenovo(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Lenovo PC is ");
        workShop1.work();
        workShop2.work();
    }
}
