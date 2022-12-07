package com.imt.training.java.codePlay.Inheritance;

/**
 * <p><b>Inheritance</b> in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).</p>
 * <p>Inheritance represents the IS-A relationship which is also known as a parent-child relationship.</p>
 * <b>Types of inheritance in java</b>
 * <p>On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.
 * In java programming, multiple and hybrid inheritance is supported through interface only</p>
 * <p><b>Single Inheritance</b>When a class inherits another class, it is known as a single inheritance.</p>
 * <p><b>Multilevel Inheritance</b>When there is a chain of inheritance, it is known as multilevel inheritance.</p>
 * <p><b>Hierarchical Inheritance</b>When two or more classes inherits a single class, it is known as hierarchical inheritance.</p>
 *
 */


class Parent{
    String name = "Atif Aslam";
    int age = 39;
    String religion = "Muslim";
    String goodHabit = "Saving";
    public void getName() {
        System.out.println("I am Parent");
    }

}
class Child extends Parent{
    @Override
    public void getName() {
        System.out.println("I am Child");
    }

}
/**
 * <b>Why multiple inheritance is not supported in java?</b>
 * <p>To reduce the complexity and simplify the language, multiple inheritance is not supported in java.</p>
 *
 * <p>Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
 * If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.
 * Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes.
 * So whether you have same method or different, there will be compile time error.</p>
 */
class GrandChild extends Child{
    @Override
    public void getName() {
        System.out.println("I am GrandChild");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent obj = new Child();
        Parent obj2 = new GrandChild();

        obj.getName();
        obj2.getName();
        System.out.println(obj.religion);


    }
}




