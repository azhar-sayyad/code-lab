package com.imt.training.java.assignment1;

public class SalesApp {
    public static void main(String[] args) {
        Customer aCustomer = new LocalCustomer();
        aCustomer.createInvoice();

        printCustomerDetails(aCustomer);

    }
    public static void printCustomerDetails(Customer customer){
        customer.printDetails();
    }
}
