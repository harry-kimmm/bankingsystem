package com.example;

public class SavingsAccount extends BankingAccount {
    int numWithdrawRemaining;

    public SavingsAccount(double balance, String owner, int remainingWithdraws) {
        super(balance, owner);
        this.numWithdrawRemaining = remainingWithdraws;
    }

    public double withdraw(double amt) {
        if (this.numWithdrawRemaining > 0) {
            this.setBalance(this.getBalance() - amt);
            this.numWithdrawRemaining -= 1;
            return this.getBalance();
        } else {
            System.out.println("You do not have any withdraws remaining!");
            return this.getBalance();
        }
    }
}