package com.imt.training.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,20,30,33,43,45,60,100);

        long startTime = System.currentTimeMillis();

        List<Integer> filteredVal = arr
                        .stream()
                        .parallel()
                        .filter(x -> {
                    System.out.println(x+" is the element that isprocessed in "+ Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    return x > 30;
                }).toList();


        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken as "+ (endTime- startTime) + filteredVal);

    }
}
