package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Cat();
        // Animal b = new Dog();
        // Animal c = a;
        // Animal d = b;
        // c.makeSound();
        // d.makeSound();

        // a.makeSound();
        // b.makeSound();

        Dog d1 =new Dog();
        Cat c1 = d1;
        // Animaml a1 = d1;

        d1.makeSound();
        c1.makeSound();
        // a1.makeSound();

    }

}