class Inheritance {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        objA.great();
        objB.great();
        objC.great();
        
    }
}
class A{
    public void great(){
        System.out.println("Good Morning A");
    }

}
class B extends A{
    public void great(){
        System.out.println("Good Afternoon B");
    }

}
class C extends B,A{

}