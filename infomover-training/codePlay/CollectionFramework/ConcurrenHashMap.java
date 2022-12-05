package com.imt.training.java.codePlay.CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;

public class ConcurrenHashMap {
    public static void main(String[] args) {

        // Thread Safe (1.0)
        Hashtable<Integer,String> ht = new Hashtable<>();

        // Thread Safe (1.3)
        HashMap<Integer, String > hm = new HashMap<>();

        // Thread Safe (1.5)
        ConcurrenHashMap chm = new ConcurrenHashMap();
    }
}
