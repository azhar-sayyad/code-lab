package com.imt.training.java.reflection;

import com.imt.training.java.basics.Employee;

public class Reflection {
    public static void main(String[] args) throws Throwable {
        Employee obj = new Employee();
        Class c2 = obj.getClass();

        Class c = Employee.class;
        Object o = c.newInstance();
    }
}
