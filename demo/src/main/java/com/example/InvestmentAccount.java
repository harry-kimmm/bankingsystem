package com.example;

import java.util.ArrayList;

public class InvestmentAccount implements Account {
    ArrayList<String> beneficiaries = new ArrayList<>();
    double balance;
    String owner;

    public InvestmentAccount(double bal, String own, ArrayList<String> ben) {
        this.balance = bal;
        this.owner = own;
        this.beneficiaries = ben;
    }

    public double deposit(double amt) {
        this.balance += amt;
        return this.balance;
    }

    public double withdraw(double amt) {
        this.balance -= amt;
        return this.balance;
    }

}