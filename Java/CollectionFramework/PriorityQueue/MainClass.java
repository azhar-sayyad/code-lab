package DSAlgo.CollectionFramework.PriorityQueue;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {
        // PriorityQueue<String> pq = new PriorityQueue<>();
        // pq.add("Apple");
        // pq.add("Mango");
        // pq.add("Banana");
        // pq.add("Kivi");

        // System.out.println(pq);
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(72);
        pq.add(100);
        pq.add(123);
        pq.add(11);

        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

    }
}