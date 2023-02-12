package com.example;

import java.util.ArrayList;

public class InvestmentAccount implements Account {
    private ArrayList<String> beneficiaries = new ArrayList<>();
    private double balance;
    private String owner;
    private double percentNum;

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

    public double getBalanceOnYear(double principalBal, int yearsInFuture, double percentReturn) {
        percentNum = (percentReturn / 100) + 1;
        System.out.println(percentNum);
        if (yearsInFuture == 0) {
            return principalBal;
        } else {
            System.out.println(principalBal);
            return getBalanceOnYear(principalBal * percentNum, yearsInFuture - 1, percentReturn);
        }
    }

}