package com.imt.training.java.streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams{
    public static void main(String[] args) {

//        List<Integer> li = new ArrayList<>();
//        li.add(11);
//        li.add(33);
        //////// or //////////
        List<Integer> li = Arrays.asList(10, 29, 22, 34, 55, 80, 100, 120);

        //  filter out those element which are greater than 50

//        Predicate<Integer> CheckValGreater50 = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer val) {
//                if(val>50)
//                    return true;
//                return false;
//            }
//        };

        //functional Interface
//        Predicate<Integer> CheckValGreater50 = (Integer val) -> val>50;

//        Predicate<Integer> CheckValGreater50 = val -> val>50;

//        List<Integer> filteredElement = li.stream().filter(CheckValGreater50)

//        List<Integer> filteredElement = li.stream().filter(val -> val > 50).collect(Collectors.toList());

        List<Integer> filteredElement = li.stream().filter(val -> val > 50).toList();
        System.out.println(filteredElement);

        System.out.println(filterMyValue(li, (val) -> val < 50));
        //////////// or ////////////
        Predicate<Integer> filterPredicate = (value) -> value > 50;
        List<Integer> filterValue = filterMyValue(li,filterPredicate);
        System.out.println(filterValue);

        Function<Integer,String> mapFunction = x -> "Employee code : " + x;
        List<String> mapValue = mapMyValue(li,mapFunction);
        System.out.println(mapValue);

        // mapped and filtered value
        List<String> MapAndFilter =
                li.stream()
                        .filter(x-> x < 15)
                        .map(x->"Employee code : "+x)
                        .collect(Collectors.toList());
        System.out.println("-----------------------");
        System.out.println(MapAndFilter);

    }
    public static List<Integer> filterMyValue(List<Integer> val,Predicate<Integer> preadicate){
        List<Integer> filterValue = val.stream().filter(preadicate).collect(Collectors.toList());
        return filterValue;
    };

    public static List<String> mapMyValue(List<Integer> val, Function<Integer,String> function){
        List<String> mapValue = val.stream().map(function).collect(Collectors.toList());
        return mapValue;
    };
}
