import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loan = sc.nextInt();
        int remain;
        for (int i = 0; i < 3; i++) {
            remain = loan / 10;
            loan -= remain;
            System.out.println(remain + "\t" + loan);
        }
        System.out.println(loan);
    }

}