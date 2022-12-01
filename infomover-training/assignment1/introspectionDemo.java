package com.imt.training.java.assignment1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class introspectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        String className = "com.imt.training.java.assignment1.Customer";

        Class c = Class.forName(className);

        Method[] methods = c.getDeclaredMethods();

        for(Method m : methods){
            System.out.println(m.getName());
        }

        Field[] fields = c.getDeclaredFields();

        for(Field f: fields){
            System.out.println(f.getName());
        }
    }
}
