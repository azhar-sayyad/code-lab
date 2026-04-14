public class Main {
    public static void main(String[] args) {
        MyString myStr = new MyString("Hello");
        System.out.println("Initial MyString: " + myStr);

        myStr.add(' ');
        myStr.add("World!");
        System.out.println("After adding ' World!': " + myStr);

        System.out.println("Character at index 1: " + myStr.get(1));

        myStr.update(0, 'h');
        System.out.println("After updating index 0 to 'h': " + myStr);

        int index = myStr.indexOf('o');
        System.out.println("Index of first occurrence of 'o': " + index);

        myStr.remove(5); // Remove the space
        System.out.println("After removing character at index 5: " + myStr);
    }
}