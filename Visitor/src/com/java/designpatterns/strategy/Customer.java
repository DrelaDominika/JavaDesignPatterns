package com.java.designpatterns.strategy;

public class Customer {
    public static void main(String[] args) {
        FoodItem[] foodItems = new FoodItem[]{
                new Pasta(35, "Fettuccine Alfredo", 2),
                new Steak(60, "Beef Wellington", 3)
        };

        int totalPrice = calculatePrice(foodItems);
        System.out.println("Total price: " + totalPrice);
    }

    private static int calculatePrice(FoodItem[] foodItems) {
        OrderVisitor visitor = new OrderVisitorImplementation();
        int sum = 0;
        for (FoodItem foodItem : foodItems) {
            sum = sum + foodItem.accept(visitor);
        }
        return sum;
    }
}
