package DSAlgo.CollectionFramework.Deque;

import java.util.ArrayDeque;

public class ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();
        adq.addFirst(10);
        adq.addFirst(11);
        adq.addFirst(55);
        System.out.println(adq);
        adq.removeLast();
        System.out.println(adq);
    }

}