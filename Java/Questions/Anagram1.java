import java.util.Scanner;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st string");
        String a = sc.nextLine();
        System.out.println("enter 2nd string");
        String b = sc.nextLine();

        // String a = "aabb**";
        // String b = "ab*b*a";

        boolean isAnagram = false;
        if (a.length() == b.length()) {

            // isAnagram = true;
            int al[] = new int[256];
            int bl[] = new int[256];

            for (int i : a.toCharArray()) {
                int index = (int) i;
                al[index]++;
            }
            for (int i : b.toCharArray()) {
                int index = (int) i;
                bl[index]++;
            }
            for (int i = 0; i < 256; i++) {
                if (al[i] != bl[i]) {
                    isAnagram = false;
                    break;
                }
                else isAnagram = true;
            }
        }
        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("not Anagram");
    }
}