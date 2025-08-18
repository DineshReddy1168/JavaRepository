package com.multithredingdemo.with;

public class Example2 extends Thread {
	Counter c;

    Example2(Counter c) {
        this.c = c;
    }

    public void run() {
             c.printCount();
    }
}

