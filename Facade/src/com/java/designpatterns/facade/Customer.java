package com.java.designpatterns.facade;

import java.sql.SQLOutput;

public class Customer {

    public static void main(String[] args) {
        //normal scenario with facade
	    Ingredient ingredient = new Ingredient();

	    Food pizza = new Pizza();
	    String pizzaIngredients = ingredient.getPizzaIngredients();
	    pizza.prepareFood(pizzaIngredients);
        System.out.println(pizza.deliverFood());

        Food scrambledEggs = new ScrambledEggs();
        String scrambledEggsIngredients = ingredient.getScrambledEggsIngredients();
        scrambledEggs.prepareFood(scrambledEggsIngredients);
        System.out.println(scrambledEggs.deliverFood());

        //using facade
        System.out.println("Facade down below");
        System.out.println(Waiter.deliverFood(FoodType.PIZZA));
        System.out.println(Waiter.deliverFood(FoodType.SCRAMBLEDEGGS));
    }
}
