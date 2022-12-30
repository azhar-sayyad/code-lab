import java.util.Scanner;

public class Timeconverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of days");
        int days = sc.nextInt();

        System.out.println("\n 1 year \n 2 week \n 3 hour \n 4 min \n 5 sec \n");
        System.out.println("enter your choice");
        int n = sc.nextInt();
        convertDay(days, n);
        // days = days*24*60*60;
        // System.out.println("total no of seconds :"+days);
    }

    static void convertDay(int days, int n) {
        switch (n) {
            case 1:
                System.out.println((float) days / 365 + " year");
                break;
            case 2:
                System.out.println((float) days / 7 + " week");
                break;
            case 3:
                System.out.println((float) days * 24 + " hour");
                break;
            case 4:
                System.out.println((float) days * 24 * 60 + " min");
                break;
            case 5:
                System.out.println((float) days * 24 * 60 * 60 + " sec");
                break;
            default:
                System.out.println("enter valid no");
                break;
        }
    }
}