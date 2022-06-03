package com.java.designpatterns.strategy;

public class Item {
    private String itemName;
    private int price;

    public Item(String itemName, int cost) {
        this.itemName = itemName;
        this.price = cost;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }
}
