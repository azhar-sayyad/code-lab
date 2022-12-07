package com.imt.training.java.exceptionHandiling;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String massage){
        super(massage);
    }
}
