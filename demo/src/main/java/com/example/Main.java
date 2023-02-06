package com.example;

public class Main 
{
    public static void main( String[] args )
    {
        CheckingAccount checkacc = new CheckingAccount(100.0, "harry");
        checkacc.deposit(50);
        System.out.println(checkacc.getBalance());
        checkacc.withdraw(21);
        System.out.println(checkacc.getBalance());

    }
}
