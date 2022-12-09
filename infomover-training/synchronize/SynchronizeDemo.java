package com.imt.training.java.synchronize;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizeDemo {
    volatile int num = 5;
    public static void main(String[] args) {
        SynchronizeDemo d = new SynchronizeDemo();
        d.num = 15;
        //  not Atomic
        if(d.num == 15){
            d.num = 20;
        }

        AtomicInteger i = new AtomicInteger();

        int newVal = i.incrementAndGet();


    }
}
class Demo{
    private int value;
    public synchronized void setValue(int value) {
        this.value = value;
    }
    public void increment(int value){
        value = value + 1;
    }
}
