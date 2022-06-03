package com.java.designpatterns.strategy;

public class CardStrategy implements PaymentMethod {

    private String name;
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CardStrategy(String name, String cardNumber, String cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with card");
    }

}
