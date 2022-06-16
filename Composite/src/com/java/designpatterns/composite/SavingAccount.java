package com.java.designpatterns.composite;

public class SavingAccount implements Account{

    private String bankName;
    private double balance;

    public SavingAccount(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    @Override
    public void showAccountDetails() {
        System.out.println(bankName + " - " + balance);
    }
}
