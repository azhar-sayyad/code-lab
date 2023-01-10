import java.util.*;

public class ReverseStringWord {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "Hello World ";
        int i = str.length()-1;

        String ans = "";

        While(i>0 && charAt(i) == ' ') i-- ;

        int j = i;
        While(i>0 && charAt(i) != ' ') i-- ;
        ans = ans.concat(str.substring(i+1,j+1));
        System.out.println(ans);
        
    }

}