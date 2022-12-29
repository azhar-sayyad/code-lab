package OOPS.Exceptionhandling;

public class TryCatchFinallly {
    public static void main(String[] args) {
        try{
            fun1();
            fun2();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+" Occured");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage()+" Occured");
        }
        finally{
            System.out.println("Sorry, for the Inconvenience");
        }
    }

    static void fun1() {
        int a[] = new int[2];
        System.out.println(a[5]);
    }

    static void fun2() {
        int a = 2;
        System.out.println(a / 0);
    }

}