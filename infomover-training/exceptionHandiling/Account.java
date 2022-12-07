package com.imt.training.java.exceptionHandiling;

public class Account {
    private int balance;

    Account(int balance){
        this.balance = balance;
    }

    public float withdraw(int amount) throws InsufficientBalanceException{
        if(balance >= amount){
            balance -= amount;
            return balance;
        }
        else {
            throw new InsufficientBalanceException("Failed Insufficient Balance");
        }
    }
}
