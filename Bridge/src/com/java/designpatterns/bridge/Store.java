package com.java.designpatterns.bridge;

public abstract class Store {
    protected WorkShop workShop1;
    protected WorkShop workShop2;

    protected Store(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}
