import java.util.Scanner;

public class Factriol {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        int factriol = 1;

        for(int i = 1; i <= num; i++){

            factriol = factriol * i;
        }

        System.out.println("factriol of "+ num +" is "+ factriol);
    }

}
