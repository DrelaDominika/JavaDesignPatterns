package com.java.designpatterns.composite;

public class User {

    public static void main(String[] args) {
        SavingAccount mBank = new SavingAccount("mBank", 38292.90);
        SavingAccount ing = new SavingAccount("ING", 12);
        SavingAccount alior = new SavingAccount("Alior", 31321.11);

        BankAccount savingBankAccount = new BankAccount();
        savingBankAccount.addAccount(mBank);
        savingBankAccount.addAccount(ing);
        savingBankAccount.addAccount(alior);

        CurrentAccount pko = new CurrentAccount("PKO", 332321);
        CurrentAccount millenium = new CurrentAccount("Millenium", 321);

        BankAccount currentBankAccount = new BankAccount();
        currentBankAccount.addAccount(pko);
        currentBankAccount.addAccount(millenium);

        BankAccount allBankAccounts = new BankAccount();
        System.out.println("All accounts:");
        allBankAccounts.addAccount(savingBankAccount);
        allBankAccounts.addAccount(currentBankAccount);
        allBankAccounts.showAccountDetails();

        System.out.println("Current accounts:");
        allBankAccounts.removeAccount(savingBankAccount);
        allBankAccounts.showAccountDetails();
    }
}
