package com.imt.training.java.assignment1;

import java.lang.reflect.Method;

public class LocalCustomer extends Customer{

    @Override
    public void createInvoice() {
        System.out.println("Creating Invoice for LocalCustomer");
    }
}
