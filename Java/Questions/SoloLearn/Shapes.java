package SoloLearn;

import java.util.Scanner;

abstract class Shape {
    int width;

    abstract void area();
}

class Square extends Shape {

    public Square(int width) {
        super.width = width;
    }

    public void area() {
        System.out.println(width * width);
    }

}

class Circle extends Shape {

    public Circle(int width) {
        super.width = width;
    }

    public void area() {
        System.out.println(Math.PI * width * width);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Square sqr = new Square(x);

        Circle crl = new Circle(y);
        sqr.area();
        crl.area();
    }
}