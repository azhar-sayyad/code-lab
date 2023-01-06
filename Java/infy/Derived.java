package infy;

class A {
    private int fun() {
        return 0;
    }

    public int run() {
        return 3;
    }
}

class B extends A {
    private int fun() {
        return 1;
    }

    public int run() {
        return fun();
    }
}

class C extends B {
    public int fun() {
        return 2;
    }
}

public class Derived {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.run());

    }

}