import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("*");

        if (n > 1) {
            for (int i = 1; i <= n-1; i++) {
                if (i == n-1) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                    for (int j = 1; j <= i-1; j++) {
                        System.out.print("  ");
                    }
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }

}