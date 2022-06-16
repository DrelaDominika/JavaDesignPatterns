package com.java.designpatterns.facade;

public class Ingredient {
    public String getPizzaIngredients(){
        return "dough, tomato sauce, mozzarella, pepperoni";
    }
    public String getScrambledEggsIngredients(){
        return "eggs, ham, mushrooms";
    }
}
