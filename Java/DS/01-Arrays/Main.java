public class Main{

    public static void main(String[] args){
        Array arr = new Array();

        System.out.println("Initial size: " + arr.size()); // 0
        System.out.println("Is array empty? " + arr.isEmpty()); // true

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println("Element at index 2: " + arr.get(2)); // 30

        arr.update(2, 35);
        System.out.println("Updated element at index 2: " + arr.get(2)); // 35

        System.out.println("Index of value 40: " + arr.indexOf(40)); // 3

        arr.remove(1); // Remove element at index 1 (20)
        System.out.println("Element at index 1 after removal: " + arr.get(1)); // 35 (shifted left)

        System.out.println("Current size: " + arr.size()); // 4
        System.out.println("Is array empty? " + arr.isEmpty()); // false

        System.out.println();
        System.out.println("All elements in the array:");

        arr.print(); // 10 35 40 50
    }
}