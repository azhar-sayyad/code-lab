import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();

        System.out.println("enter secont number");
        int b = sc.nextInt();

        sc.nextLine();
        System.out.println("enter operation");
        char operation = sc.nextLine().charAt(0);

        int result = 0;
        switch (operation){

            case '+':
              result = a + b;
              break;
            case '-':
              result = a - b;
              break; 
            case '*':
              result = a * b;
              break; 
             case '/':
              result = a / b;
              break;  
            default:
               System.out.println("invalid ");    
        }


        System.out.println("result is "+ result);
    }

}