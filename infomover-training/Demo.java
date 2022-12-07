package com.imt.training.java;
import java.util.*;

public class Demo {
    public static void main(StringDemo[] args) throws InterruptedException {
        vacationThread t1 = new vacationThread();
        t1.start();

        System.out.println("Main is about to exit....");

        Thread.sleep(7000);
        System.out.println(new Date()+" "+Thread.currentThread().getName());
    }
}
class vacationThread extends Thread{
    @Override
    public void run() {

        int count = 5;
        while(true){
            System.out.println(new Date()+ " " +Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(--count == 0)
                    break;
        }
    }
}

