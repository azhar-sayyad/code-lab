import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int mat1[][] = new int[rows][cols];
        int mat2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        System.out.println("enter first matrix");
        for(int i=0 ;i<=rows-1; i++){
            for(int j=0 ;j<=cols-1; j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second matrix");
        for(int i=0; i<=rows-1; i++){
            for(int j=0; j<=cols-1; j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of matrix :");
        for(int i=0; i<=rows-1; i++){
            for(int j=0; j<=cols-1; j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.println(sum[i][j]);
            }
        }
        // for( int item: sum){
        //     System.out.println(item);
        // }
    }

}