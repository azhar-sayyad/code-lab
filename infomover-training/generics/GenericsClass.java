package com.imt.training.java.generics;

public class GenericsClass<A> {
    public void print(A a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        GenericsClass<Integer> obj = new GenericsClass<>();
        obj.print(12);
    }

}
