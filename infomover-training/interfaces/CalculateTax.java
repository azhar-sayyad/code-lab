package com.imt.training.java.interfaces;

public interface CalculateTax {

    public default float getBaseTax(){
        return 3.2f;
    }
    public static float getDefaultTax(){
        return 4.4f;
    }
//    final int getDefaultTax = 25;
    int defaultTax = 25;
    public void calculateTax();
}
