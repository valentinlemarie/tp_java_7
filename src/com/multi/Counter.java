package com.multi;

public class Counter implements Runnable{
    @Override
    public void run() {
        int counter =0 ;
        while (counter<10){
            System.out.println(counter+" ");
            counter++;
        }
    }
}
