package com.java.designpatterns.facade;

public class Waiter {
    public static String deliverFood(FoodType foodType){
        Ingredient ingredient = new Ingredient();
        switch (foodType){
            case PIZZA:
                Food pizza = new Pizza();
                String pizzaIngredients = ingredient.getPizzaIngredients();
                pizza.prepareFood(pizzaIngredients);
                return pizza.deliverFood();
            case SCRAMBLEDEGGS:
                Food scrambledEggs = new ScrambledEggs();
                String scrambledEggsIngredients = ingredient.getScrambledEggsIngredients();
                scrambledEggs.prepareFood(scrambledEggsIngredients);
                return scrambledEggs.deliverFood();
        }
        return null;
    }
}
