import java.util.Scanner;

class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Cat extends Animal {

    private String catName;
    private int catAge;

    @Override
    void eat() {
        System.out.println("cat is eating");
    }

    public void setCatName(String name) {
        if (name.length() == 0) {
            System.out.println("cat name cant blank");
            return;
        }
        this.catName = name;
    }

    public String getCatName() {
        return catName;
    }
}

public class Test1 {

    public int search(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int bSearch(int arr[], int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any string");
        // String str = sc.nextLine();
        // System.out.println(str);

        System.out.println("enter a number");
        // int num = sc.nextInt();
        // System.out.println(num);

        char aSm = 97;
        char aCap = 65;
        System.out.println(++aSm + " " + ++aCap);

        int aSmall = 'a';
        int aCapital = 'A';

        System.out.println(++aSmall + " " + ++aCapital);

        int[] arr = new int[5];
        char[] ch = new char[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
            ch[i] = (char) (65 + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(ch[i] + " ");
        }
    }

}
