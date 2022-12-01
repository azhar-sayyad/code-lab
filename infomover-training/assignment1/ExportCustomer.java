package com.imt.training.java.assignment1;

public class ExportCustomer extends Customer{
    @Override
    public void createInvoice() {
        System.out.println("Creating Invoice for ExportCustomer");
    }
}
