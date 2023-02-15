package com.example;

public class Main {
    public static void main(String[] args) {
        InvestmentAccount invacc = new InvestmentAccount(100, "harry", null);
        invacc.getBalanceOnYear(100, 0, 10);
    }
}
