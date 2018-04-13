package com.multi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Thread thread1 = new Thread(new Counter());
        Thread thread2 = new Thread(new Counter());
        thread1.start();
        thread2.start();

    }
}
