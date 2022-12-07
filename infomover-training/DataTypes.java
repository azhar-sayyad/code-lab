package com.imt.training.java;

public class DataTypes {
    //Primitive Data Types
    char ch = 'a';
    boolean isTrue = true;
    byte b = 1;
    short s = 233;
    long lg = 3444;
    int i = 38888;
    float f = 22.433f;
    double d = 1322.4444;

    //All the following data types are wrapper classes.
    Integer newInt = 25;
//    Integer getNewInt = new Integer(25);
    Character newCh = 'a';
    String newStr = "Azhar";
    public static void main(String[] args) {

        Integer newInt = 25;
        Integer newInt2 = 25;
        System.out.println(newInt == newInt2);

        newInt = 250;
        newInt2 = 250;
        System.out.println(newInt == newInt2);

        DataTypes obj1 = new DataTypes();

    }
}
