class Cat {
    String color;
    int legs;
    public void eat(){
        System.out.println(color+" cat is eating");
    }
    public void walk(){
        System.out.println(color+" cat is waliking with "+legs+" legs");
    }
    
}
public class MainClass {
    public static void main(String[] args) {
        Cat Blackcat = new Cat();
        Cat WhiteCat = new Cat();

        Blackcat.color = "black";
        WhiteCat.color = "white";
        Blackcat.legs = 4;
        WhiteCat.legs = 3;

        Blackcat.eat();
        WhiteCat.eat();
        Blackcat.walk();
        WhiteCat.walk();


    }

}