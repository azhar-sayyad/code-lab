package OOPS.Overriding;

public class Overriding {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.Discription();

    }
}

///////////////
public class ClassA {
    public void Discription() {
        System.out.println("Discription of A class");
    }
}

//////////////
public class ClassB extends ClassA {
    public void Discription() {
        System.out.println("Discription of B class");
    }
}

//////////////
public class ClassC extends ClassB {
    public void discription() {
        System.out.println("Discription of C class");
    }
}
