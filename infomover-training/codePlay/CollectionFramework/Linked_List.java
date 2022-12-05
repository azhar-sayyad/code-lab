package com.imt.training.java.codePlay.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * <b>LinkedList</b>
 * <p> LinkedList implements the Collection interface.
 * It uses a doubly linked list internally to store the elements.
 * It can store the duplicate elements.
 * It maintains the insertion order and is not synchronized.
 * In LinkedList, the manipulation is fast because no shifting is required.</p>
 */
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Azhar");
        li.add("Mohsin");
        li.add("Sharukh");
        li.add("Shahed");


        Iterator<String> itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
