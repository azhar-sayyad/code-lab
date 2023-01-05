package OOPS.Interface;

public class Kitten implements Animal, Cat {
    public static void main(String[] args) {
        Kitten obj = new Kitten();
        obj.eat();
    }

    @Override
    public void eat() {
        System.out.println("kitten is eating");
    }
}