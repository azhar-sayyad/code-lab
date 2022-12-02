package com.imt.training.java.blockingdatastructures;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);

        bq.put(1);
        bq.put(2);
        bq.put(3);
        bq.put(5);
        bq.put(6);

        System.out.println("Before adding 6th value");

        new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(5000);
                    System.out.println(bq.take());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

        bq.put(6);
        System.out.println("After added 7th value");
    }
}
