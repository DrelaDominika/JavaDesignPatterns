package com.java.designpatterns.strategy;

public class OrderVisitorImplementation implements OrderVisitor {
    @Override
    public int visit(Pasta pasta) {
        int price = pasta.getPrice() * pasta.getNumberOfDishes();
        System.out.println("Pasta: " + pasta.getDetailedDishName() + ", price = " + price+ " for "+pasta.getNumberOfDishes()+ " portions.");
        return price;
    }

    @Override
    public int visit(Steak steak) {
        int price = steak.getPrice() * steak.getNumberOfDishes();
        System.out.println("Steak: " + steak.getDetailedDishName() + ", price = " + price+ " for "+steak.getNumberOfDishes()+ " portions.");
        return price;
    }
}
