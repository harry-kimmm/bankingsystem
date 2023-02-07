package com.example;

public class SavingsAccount extends BankingAccount {
    int numWithdrawRemaining;

    public SavingsAccount(double balance, String owner, int remainingWithdraws) {
        super(balance, owner);
        numWithdrawRemaining = remainingWithdraws;
    }

    public double withdraw(double amt) {
        if (numWithdrawRemaining > 0) {
            this.setBalance(this.getBalance() - amt);
            numWithdrawRemaining -= 1;
            return this.getBalance();
        } else {
            System.out.println("You do not have any withdraws remaining!");
            return this.getBalance();
        }
    }
}