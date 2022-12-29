package OOPS.Exceptionhandling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[6]);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Occured");
        }

        System.out.println("another code is executing");
    }

}