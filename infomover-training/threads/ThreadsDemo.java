package com.imt.training.java.threads;

import java.util.Random;

public class ThreadsDemo {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        VacationThread v1 = new VacationThread("Dubai");
        VacationThread v2 = new VacationThread("London");
        v1.start();
        v2.start();

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//            }
//        };
        Runnable r = () -> {
            System.out.println("In Thread "+Thread.currentThread().getName());
        };

        r.run();

        Thread t3 = new Thread(r);
        t3.start();
    }
}

class VacationThread extends Thread{
    String destination;
    Random r = new Random();
    public  VacationThread(String destination){
        this.destination = destination;
    }

    @Override
    public void run() {
        for(int i=0 ; i<10 ;i++){
            long sleepTime = r.nextInt(1000);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am going to "+ this.destination +" by "+Thread.currentThread().getName());
        }
    }
}
