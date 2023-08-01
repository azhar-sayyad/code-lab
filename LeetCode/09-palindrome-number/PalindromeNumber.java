public class PalindromeNumber {

    // 1️⃣ String Method
    public boolean stringMethod(int x) {

        if (x < 0) return false;

        String str = String.valueOf(x);

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    // 2️⃣ Full Reverse Method
    public boolean fullRevMethod(int x) {

        if (x < 0) return false;

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }

        return original == reverse;
    }

    // 3️⃣ Half Reverse Method (Optimal)
    public boolean halfRevMethod(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int rev = 0;

        while (x > rev) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x / 10;
        }

        return x == rev || x == rev / 10;
    }

    // ✅ Main method inside class
    public static void main(String[] args) {

        PalindromeNumber palindrome = new PalindromeNumber();

        System.out.println(palindrome.stringMethod(121));     // true
        System.out.println(palindrome.fullRevMethod(121));    // true
        System.out.println(palindrome.halfRevMethod(121));    // true

        System.out.println(palindrome.halfRevMethod(-121));   // false
        System.out.println(palindrome.halfRevMethod(10));     // false
    }
}