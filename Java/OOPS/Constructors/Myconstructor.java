// package OOPs*;

class Cat {
    int legs, eyes;
    String color ;

    Cat() {
        System.out.println("default constructor is called");
  
    }
    Cat(String color){
        this.color = color;
        legs = 4;
        eyes = 2;
    }
    Cat(String color,int legs,int eyes){
        this.color = color;
        this.legs = legs;
        this.eyes = eyes;
    }
}

public class Myconstructor {
    Myconstructor() { // default constructor / no argument constructor
        System.out.println("Object is created");
    }

    public static void main(String[] args) {
        // Myconstructor obj = new Myconstructor();
        Cat bCat = new Cat("black");
        System.out.println(bCat.color+"cat has "+bCat.legs+" legs and "+bCat.eyes+" eyes");

        Cat wCat = new Cat("white",5,3);
        System.out.println(wCat.color+"cat has "+wCat.legs+" legs and "+wCat.eyes+" eyes");

    }

}