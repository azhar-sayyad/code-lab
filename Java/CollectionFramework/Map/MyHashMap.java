package DSAlgo.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> num = new HashMap<>();

        num.put("one", 10);
        num.put("two", 2);
        num.put("ten", 10);
        num.put("five", 5);

        num.putIfAbsent("six",6);
        num.putIfAbsent("one",11);
        num.replace("one",1);

        System.out.println(num);
        System.out.println(num.get("two"));
        System.out.println(num.containsKey("one"));
        System.out.println(num.containsKey("eight"));
        System.out.println(num.containsValue(2));
        System.out.println(num.containsValue(22));

    }

}