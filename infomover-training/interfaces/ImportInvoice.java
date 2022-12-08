package com.imt.training.java.interfaces;

public class ImportInvoice implements CalculateTax{
    @Override
    public void calculateTax(){
        System.out.println("Calculating Tax for ImportInvoice");
    }

    @Override
    public float getBaseTax() {
        return 10.5f;
    }
}
