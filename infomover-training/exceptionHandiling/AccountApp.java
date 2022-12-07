package com.imt.training.java.exceptionHandiling;

public class AccountApp {
    public static void main(String[] args) {
        Account account = new Account(1000);

//        if(account.withdraw(600) >= 0){
//            System.out.println("Successful");
//        }
//        else {
//            System.out.println("Fail....");
//        }
        try {
            float balance = account.withdraw(600);
            System.out.println("The current balance : "+ balance);

        }catch (InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }

    }
}
