package com.imt.training.java.codePlay.CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

/**
 *  <b>Vector</b>
 *  <p>
 * Vector uses a dynamic array to store the data elements.
 * It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.
 * </p>
 */

public class Vector_ {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(12);
        v.add(22);
        v.add(32);
        v.add(42);

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
