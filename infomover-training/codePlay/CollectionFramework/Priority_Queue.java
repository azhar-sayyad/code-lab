package com.imt.training.java.codePlay.CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <b>Queue Interface</b>
 * <p> * Queue interface maintains the first-in-first-out order.
 * It can be defined as an ordered list that is used to hold the elements which are about to be processed.
 * There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.</p>
 * <hr/>
 *
 * <b>PriorityQueue</b>
 * <p>
 * The PriorityQueue class implements the Queue interface.
 * It holds the elements or objects which are to be processed by their priorities.
 * PriorityQueue doesn't allow null values to be stored in the queue.</p>
 */
public class Priority_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(12);
        q.add(4);
        q.add(6);
        q.add(10);

        Iterator<Integer> it = q.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("peek "+q.peek());
        q.remove();
        System.out.println("peek "+q.peek());
        q.remove();
        System.out.println("peek "+q.peek());


    }
}
