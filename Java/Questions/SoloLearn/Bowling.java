package SoloLearn;

import java.util.*;

public class Bowling {
    // Map<String, Integer> hash = new HashMap<>();
    HashMap<String, Integer> hash;

    public static void main(String[] args) {
        Bowling player = new Bowling();
        player.addPlayer("azhar", 222);
        player.addPlayer("shubham", 123);
        player.addPlayer("mosin", 119);
        player.addPlayer("abhi", 753);
        player.getWinner();
    }

    Bowling() {
        //
        hash = new HashMap<>();

    }

    public void addPlayer(String name, int point) {

        hash.put(name, point);
    }

    public void getWinner() {
        // System.out.println(hash.values());
        // System.out.println(hash.entrySet().stream()); 
        System.out.println(hash.entrySet().stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());
    }

}