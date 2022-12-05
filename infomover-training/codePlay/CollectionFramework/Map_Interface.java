package com.imt.training.java.codePlay.CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * <b>Map Interface</b>
 * <p>A map is a data structure that supports the key-value pair for mapping the data.
 * This interface doesn’t support duplicate keys because the same key cannot have multiple mappings, however it allows duplicate values in different keys.
 * A map is useful if there is data and we wish to perform operations on the basis of the key.
 * This map interface is implemented by various classes like HashMap, TreeMap, etc.
 * Since all the subclasses implement the map, we can instantiate a map object with any of these classes.</p>
 *
 * <hr/>
 * <b>HashMap</b>
 * <p>HashMap provides the basic implementation of the Map interface of Java.
 * It stores the data in (Key, Value) pairs. To access a value in a HashMap, we must know its key.
 * HashMap uses a technique called Hashing.
 * Hashing is a technique of converting a large String to a small String that represents the same String so that the indexing and search operations are faster.
 * HashSet also uses HashMap internally.</p>
 * <hr/>
 * <b>TreeMap</b>
 */
public class Map_Interface {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Amazon");
        m.put(2,"Google");
        m.put(3,"Apple");
        m.put(4,"Adobe");

        System.out.println(m.get(4));

        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println();
        ////////////////////////////////////////////////////
        Map<Integer,String>  t = new TreeMap<>();

        t.put(1, "Twitter");
        t.put(2,"Facebook");
        t.put(3,"Instagram");
        t.put(4,"Whatsapp");

        System.out.println(t.get(4));

        for (Map.Entry<Integer, String> e : t.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
