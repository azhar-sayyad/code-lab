package com.imt.training.java.codePlay.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * <b>Deque Interface</b>
 * <p> Deque interface extends the Queue interface.
 * In Deque, we can remove and add the elements from both the side.
 * Deque stands for a double-ended queue which enables us to perform the operations at both the ends.</p>
 * <hr/>
 * <b>ArrayDeque</b>
 * <p>ArrayDeque class implements the Deque interface.
 * It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.</p>
 */
public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(10);
        d.addFirst(9);
        d.addFirst(8);
        d.addLast(11);
        d.addLast(12);
        d.add(15);
        System.out.println(d.peek()+" "+d.peekFirst()+" "+d.peekLast());

        Iterator<Integer> it = d.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
