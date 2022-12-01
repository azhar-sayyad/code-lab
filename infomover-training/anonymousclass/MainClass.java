package com.imt.training.java.anonymousclass;

public class MainClass {
    public static void main(String[] args) {

        AnonymousDemo obj1 = new AnonymousDemo() {
            @Override
            public void fun() {
                System.out.println("hello Azhar...");
            }

            @Override
            public void display() {

            }
        };

        // Java Lambda Expression

        FunctionalInterfaceDemo obj2 = ()->{
            System.out.println("hello Azhar...");
        };


    }
}
