package com.example;

public class CheckingAccount extends BankingAccount{

    public CheckingAccount(double balance, String owner) {
        super(balance, owner);
    }

    public double withdraw(double amt){
        this.setBalance(this.getBalance()-amt);
        return this.getBalance();
    }

}
