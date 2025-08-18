package com.multithredingdemo.with;

public class WithSynchronization {

    public static void main(String[] args) {
        Counter counter = new Counter(); 
        
        Example1 example1 = new Example1(counter);
        Example2 example2 = new Example2(counter);
        
        example1.start();
        example2.start();

    }
}
