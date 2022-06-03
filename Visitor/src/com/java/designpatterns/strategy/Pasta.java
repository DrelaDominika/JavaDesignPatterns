package com.java.designpatterns.strategy;

public class Pasta implements FoodItem {

    private int price;
    private String detailedDishName;
    private int numberOfDishes;

    public Pasta(int price, String detailedDishName, int numberOfDishes) {
        this.price = price;
        this.detailedDishName = detailedDishName;
        this.numberOfDishes = numberOfDishes;
    }

    public int getPrice() {
        return price;
    }

    public String getDetailedDishName() {
        return detailedDishName;
    }

    public int getNumberOfDishes() {
        return numberOfDishes;
    }

    @Override
    public int accept(OrderVisitor visitor) {
        return visitor.visit(this);
    }
}
