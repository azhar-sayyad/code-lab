// import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class recursion2 {
    public static void main(String[] args) {
        System.out.println(retriveNum(3, 2));
    }

    public static int retriveNum(int number, int value) {
        System.out.println(number + " " + value);
        if (number < value / 2) {
            System.out.println("if block num:" + number + " val:" + value);
            return 2;
        } else if (number % 2 == 0) {
            System.out.println("else if block num:" + number + " val:" + value);
            return retriveNum(number - 1, value - 1);
        } else {
            System.out.println("else block num:" + number + " val:" + value);
            return (value - 1) * retriveNum(number - 1, value - 1);
        }
    }
}