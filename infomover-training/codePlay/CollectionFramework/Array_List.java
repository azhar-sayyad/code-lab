package com.imt.training.java.codePlay.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <b>ArrayList</b>
 * <p>The ArrayList class implements the List interface.
 * It uses a dynamic array to store the duplicate element of different data types.
 * The ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed</p>
 */
public class Array_List {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(25);
        arr.add(35);
        arr.add(23);
        arr.add(43);

        System.out.println(arr);

        arr.remove(4);
        System.out.println(arr.size());


        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
