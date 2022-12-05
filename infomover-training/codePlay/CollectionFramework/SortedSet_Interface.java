package com.imt.training.java.codePlay.CollectionFramework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <b>SortedSet Interface</b>
 * <p>SortedSet is the alternate of Set interface that provides a total ordering on its elements.
 * The elements of the SortedSet are arranged in the increasing (ascending) order.
 * The SortedSet provides the additional methods that inhibit the natural ordering of the elements.</p>
 * <hr/>
 * <b>TreeSet</b>
 * <p>Java TreeSet class implements the Set interface that uses a tree for storage.
 * Like HashSet, TreeSet also contains unique elements.
 * However, the access and retrieval time of TreeSet is quite fast.
 * The elements in TreeSet stored in ascending order.</p>
 *
 */
public class SortedSet_Interface {
    public static void main(String[] args) {
        SortedSet<String> ss = new TreeSet<>();

        ss.add("Amazon");
        ss.add("Google");
        ss.add("Uber");
        ss.add("Microsoft");
        ss.add("Apple");
        ss.add("Flipkart");
        ss.add("Microsoft");

        Iterator<String> it = ss.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
