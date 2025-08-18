package com.multithredingdemo.with;

public class Example1 extends Thread {
	Counter c;

    Example1(Counter c) {
        this.c = c;
    }

    public void run() {
            c.printCount();
    }
}
