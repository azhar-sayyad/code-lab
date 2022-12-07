package com.imt.training.java.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws InterruptedException {

//        LocalDate d = LocalDate.now();
        LocalDateTime d = LocalDateTime.now(ZoneId.of("GMT"));
        System.out.println(d);

        Date date = new Date();

        Calendar c = Calendar.getInstance();


        System.out.println(date);
        System.out.println(date.getTime());

//        for(int i =0 ; i<100 ; i++){
//            Date d = new Date();
//            System.out.println(d.getTime());
//            Thread.sleep(1000);
//        }
    }
}
