package infy;

public class tester2 {
    public static void main(String[] args) {
        int[] templist = { 1, -1, -2 };
        int[] numlist = { -2, -1, 1 };
        int length = numlist.length;
        for (int value : templist) {
            int tempvalue = value;
            if (value < 0) {
                tempvalue = length - Math.abs(value);
            }
            if (value == templist[tempvalue]) {
                if (value < 0) {

                    numlist[length - tempvalue] = value;
                } else {
                    numlist[tempvalue] = value;
                }
            } else {
                numlist[0] = value;
            }
            System.out.println(numlist[0]+" "+numlist[1]+" "+numlist[2]);
        }
    }

}