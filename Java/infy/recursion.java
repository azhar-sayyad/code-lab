
public class recursion {
    public static int specialAdd(int num1) {
        // System.out.print(" num1: "+num1);
        if (num1 != 0)
            return (num1 + 2) + specialAdd(num1 - 1);
        else
            return 3;
    }
    // =28  7+5-1=21  6+4-1=15  5+3-1=10 4+2-1=6 3+1-1 =3
    // 28+5-1=32  21+4-1=24  15+3-1=17  10+2-1=11 6+1-1=6   =90

    public static int extraordinaryAdd(int num2) {
        // System.out.print(" num2 :"+ num2+" ");
        if (num2 != 0)
            return specialAdd(num2) + extraordinaryAdd(num2 - 1);
        else
            return 0;
    }
    public static void main(String[] args){
        System.out.println((extraordinaryAdd(5)));
    }

}