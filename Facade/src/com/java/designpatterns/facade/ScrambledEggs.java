package com.java.designpatterns.facade;

public class ScrambledEggs implements Food{
    public String preparedItem;
    @Override
    public void prepareFood(String ingredientsRequired) {
        preparedItem="Scrambled eggs with ingredients: "+ ingredientsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}