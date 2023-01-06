package OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Singer s = new Singer();
        SingerJunior sj =new SingerJunior();
        s.name = "azhar";
        s.eat();
        s.sing();
        sj.name = "Harshal";
        // sj.sing();
        sj.eat();

    }

}