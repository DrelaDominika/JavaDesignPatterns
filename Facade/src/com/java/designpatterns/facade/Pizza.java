package com.java.designpatterns.facade;

public class Pizza implements Food{
    public String preparedItem;
    @Override
    public void prepareFood(String ingredientsRequired) {
        preparedItem="Pizza with ingredients: "+ ingredientsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
