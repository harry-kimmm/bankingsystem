package com.example;

public class CheckingAccount extends BankingAccount{
    public double withdraw(double amt){
        super.setBalance(super.getBalance()-amt);
        return super.getBalance();
    }
}
