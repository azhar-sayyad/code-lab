// package java.class;

public class passbyValue {
    public static class Cat{
        int legs;
    }
    public static void main(String[] args) {
        Cat a = new Cat();
        a.legs = 4;

        fun1(a);

        System.out.println(a.legs);
    }
    public static void fun1(Cat cat){
        cat.legs = 3;
    }

}