package com.imt.training.java.codePlay.Abstraction;

/**
 * <p><b>Data abstraction</b> is the process of hiding certain details and showing only essential information to the user.
 * Abstraction can be achieved with either abstract classes or interfaces </p>
* <p><b>Abstract class:</b> is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)</p>.
 * <p><b>Abstract Method:</b>can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).</p>
* */

abstract class Parent{
    final String religion = "Muslim";
    static String greet = "Assalamualaikum";
    public abstract void getName();     //Abstract method
    public void getReligion(){
        System.out.println("Alhamdullah "+religion);
    }
//    Non-static fields cannot be referenced from a static context
    public static void greet(){     //Static Method
        System.out.println(greet);
    }

}
class Child extends Parent{
    @Override
    public void getName(){
        System.out.println("My name is Azhar");
    }
}

/**
 *<b>Why And When To Use Abstract Classes and Methods?</b>
 * <p>To achieve security - hide certain details and only show the important details of an object.</p>
 */
public class Abstraction {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.getName();
        obj.getReligion();
        Parent.greet();

    }
}


