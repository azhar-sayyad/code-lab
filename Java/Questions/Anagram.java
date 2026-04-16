import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st string");
        String a = sc.nextLine();
        System.out.println("enter 2nd string");
        String b = sc.nextLine();

        // String a ="aabb";
        // String b ="abab";
        
        boolean isAnagram = false;
        boolean visited[] = new boolean[b.length()];

        if(a.length() == b.length()){
            for(int i=0; i<a.length(); i++){
                char c = a.charAt(i);
                isAnagram = false;
                for(int j=0; j<b.length(); j++){
                    if(b.charAt(j) == c && !visited[j]){
                        isAnagram = true;
                        visited[j] = true;
                        break;
                    }
                }
                if(!isAnagram) break;
            }
        }
        if(isAnagram)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }
}