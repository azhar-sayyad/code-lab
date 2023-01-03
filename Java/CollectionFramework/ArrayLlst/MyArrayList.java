import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        ArrayList<String> dryfruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Guava");
        fruits.add("hello");
        fruits.add(3,"banana");

        dryfruits.add("pista");
        fruits.addAll(dryfruits);
        System.out.println(fruits);

        // fruits.set(0,"banana");
        // fruits.remove(2);
        // System.out.println(fruits.get(2));

        // fruits.clear();

        List<String> remove = new ArrayList<>();
        remove.add("Apple");
        remove.add("hello");
        fruits.removeAll(remove);

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.isEmpty());

        Object arr[] = fruits.toArray();
        for (Object e : arr) {
            System.out.println(e);
        }

        System.out.println();

        String temp[] = new String[fruits.size()];
        fruits.toArray(temp);
        for (String e : temp) {
            System.out.println(e);
        }
    }

}