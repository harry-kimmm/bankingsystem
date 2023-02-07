package com.example;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savacc = new SavingsAccount(100, "test", 2);
        savacc.withdraw(1);
        savacc.withdraw(1);
        savacc.withdraw(1);

    }
}
