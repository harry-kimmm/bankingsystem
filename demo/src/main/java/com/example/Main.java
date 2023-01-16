package com.example;

public class Main 
{
    public static void main( String[] args )
    {
        BankingAccount banking = new BankingAccount(100);
        System.out.println(banking.getBalance());
    }
}
