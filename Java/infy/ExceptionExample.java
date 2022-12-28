public class ExceptionExample {
    public void checkforException(int num1, int num2) {
        int intArr[] = { 1, 2, 3 };
        String str = null;
        System.out.println("Before any exception");
        try {
            str.charAt(0);
            System.out.println(num1 / num2);
            System.out.println("Enjoy no Exception");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handler");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handler");
        } catch (Exception e) {
            System.out.println("Default exception handler");
        } finally {
            System.out.println("In finally");
        }
        System.out.println("After handling exception");
    } 
    public static void main(String[] args){
        ExceptionExample exceptionExample = new ExceptionExample();
        try{
            exceptionExample.checkforException(2, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic handler in main");
        }
        System.out.println("End of main");
    }

}
