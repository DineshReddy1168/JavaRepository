package com.multithredingdemo.with;

public class Counter {
	
	public synchronized void printCount() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
	
}
