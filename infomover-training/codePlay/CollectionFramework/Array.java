package com.imt.training.java.codePlay.CollectionFramework;
import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];
    public  void setArray(){
        for(int i = 0 ; i < n ; i++){
            int j = sc.nextInt();
            arr[i] = j;
        }
    }
    public void getArray(){
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int getMinVal(){
        int min = 1111 ;
        for(int i= 0 ; i<n ; i++){
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }
    public int getMaxVal(){
        int max = -1111;
        for(int i=0 ; i<n ;i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public int sumArray(){
        int sum =0;
        for(int i=0 ;i<n ; i++){
            sum += arr[i];
        }
        return  sum;
    }

    public static void main(String[] args) {
        Array obj = new Array();
        obj.setArray();
        obj.getArray();

        System.out.println("Min value : "+obj.getMinVal());
        System.out.println("max value : "+obj.getMaxVal());
        System.out.println("Array Sum : "+obj.sumArray());
    }
}
