package com.example;
import java.util.ArrayList;

public class InvestmentAccount implements Account {
    private double balance;
    private String owner;
    ArrayList<String> beneficiaries = new ArrayList<String>();

    public InvestmentAccount(double bal, String own, ArrayList<String> ben) {
        bal = balance;
        own = owner;
        ben = beneficiaries;
    }

    public double deposit(int amt) {
        this.balance += amt; 
        return this.balance;
    }

    public double withdraw(int amt) {
        this.balance -= amt;
        return this.balance;
    }

}   