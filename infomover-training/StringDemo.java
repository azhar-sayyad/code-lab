package com.imt.training.java;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Azhar";
        String str2 = "Azhar";
        System.out.println(str1 == str2);

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
