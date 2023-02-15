package com.example;

import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InvestmentAccount implements Account {
    private ArrayList<String> beneficiaries = new ArrayList<>();
    private double balance;
    private String owner;
    private double percentNum;

    private static final DecimalFormat df = new DecimalFormat("0.00");

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
        if (yearsInFuture == 0) {
            System.out.println(df.format(principalBal));
            return principalBal;
        } else {
            return getBalanceOnYear(principalBal * percentNum, yearsInFuture - 1, percentReturn);
        }
    }

}