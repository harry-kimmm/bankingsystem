package com.example;

abstract class BankingAccount implements Account{
    private String owner;
    private double balance;

    public BankingAccount(double bal){
        this.balance = bal;
    }

    public BankingAccount(String own){
        this.owner = own;
    }

    public BankingAccount(double bal, String own){
        this.balance = bal;
        this.owner = own;
    }
    
    public double deposit(double amt){
        this.balance += amt; 
        return this.balance;
    }   
    
    public abstract double withdraw(double amt);

    public void setBalance(double bal){
        this.balance = bal;
    }   

    public double getBalance(){
        return this.balance;
    }

    public void setOwner(String own){
        this.owner = own;
    }   

    public String getOwner(){
        return this.owner;
    }
}
