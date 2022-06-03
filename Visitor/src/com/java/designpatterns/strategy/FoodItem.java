package com.java.designpatterns.strategy;

public interface FoodItem {
    public int accept(OrderVisitor visitor);
}
