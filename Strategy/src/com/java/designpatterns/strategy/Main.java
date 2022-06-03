package com.java.designpatterns.strategy;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();

        Item item1 = new Item("Razer Mamba Elite", 90);
        Item item2 = new Item("Razer BlackWidow Elite", 170);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("email@gmail.com", "password"));

        //pay by credit card
        cart.pay((PaymentMethod) new CardStrategy("Kanye West", "1234567890123456", "666", "11/26"));
    }
}
