import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number");
        int num = sc.nextInt();
        int tables;

        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=num; j++){
                tables = i * j ;
                System.out.print(tables+"\t");
            }
            System.out.println();
        }
    }


}