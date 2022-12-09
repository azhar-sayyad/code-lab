package com.imt.training.java.interfaces;

public class InvoiceAppWithFunctionalInterface {

    // Anonymous Class
    CalculateTax calculate = new CalculateTax() {
        @Override
        public void calculateTax() {

        }
    };
//    CalculateTax calculate1 = () -> {
//
//    };
    CalculateTax calculate1 = () -> System.out.println("hello");
}
