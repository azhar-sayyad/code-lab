package com.imt.training.java.codePlay.CollectionFramework;

import java.util.*;

/**
 * <b>Set Interface</b>
 * <p>Set Interface in Java is present in java.util package.
 * It extends the Collection interface.
 * It represents the unordered set of elements which doesn't allow us to store the duplicate items.
 * We can store at most one null value in Set.
 * Set is implemented by HashSet, LinkedHashSet, and TreeSet.</p>
 * <hr/>
 * <b>HashSet</b>
 * <p>HashSet class implements Set Interface.
 * It represents the collection that uses a hash table for storage.
 * Hashing is used to store the elements in the HashSet.
 * It contains unique items.</p>
 * <hr/>
 * <b>LinkedHashSet</b>
 *<p>LinkedHashSet class represents the LinkedList implementation of Set Interface.
 * It extends the HashSet class and implements Set interface.
 * Like HashSet, It also contains unique elements.
 * It maintains the insertion order and permits null elements.</p>
 * */
public class SetInterface {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Azhar");
        s.add("Mohsin");
        s.add("Aftab");
        s.add("Azhar");

        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        /////////////////////////////////////

        Set<String> st = new LinkedHashSet<>();

        st.add("Azhar");
        st.add("Mohsin");
        st.add("Aftab");
        st.add("Azhar");

        Iterator<String> itr = st.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
