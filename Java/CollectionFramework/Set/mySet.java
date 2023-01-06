package DSAlgo.CollectionFramework.Set;

import java.util.HashSet;
// import java.util.ArrayDeque;
import java.util.Set;

public class mySet {
    public static void main(String[] args) {
        Set<Integer> x = new HashSet<>();
        x.add(22);
        x.add(42);
        x.add(18);
        x.add(11);
        x.add(16);
        System.out.println(x);

        Set<Integer> y = new HashSet<>();
        y.add(11);
        y.add(42);
        y.add(22);
        System.out.println(y);

        // **** Union Operation ****

        // x.addAll(y);
        // System.out.println(x);

        // **** Intersection Operation ****

        // x.retainAll(y);
        // System.out.println(x);

        // **** subset ****

        System.out.println(x.containsAll(y));

    }

}