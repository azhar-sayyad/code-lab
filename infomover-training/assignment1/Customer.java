package com.imt.training.java.assignment1;

public abstract class Customer {

    private int id;
    private String name;
    public void printDetails(){
        System.out.println("Customer details are being printed");
    }
    public abstract void createInvoice();
}
