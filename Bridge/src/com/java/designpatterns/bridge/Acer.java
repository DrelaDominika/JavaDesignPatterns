package com.java.designpatterns.bridge;

public class Acer extends Store {
    public Acer(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Acer PC is ");
        workShop1.work();
        workShop2.work();
    }
}
