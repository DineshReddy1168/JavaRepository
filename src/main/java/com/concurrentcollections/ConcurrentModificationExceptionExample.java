package com.concurrentcollections;

import java.util.*;

public class ConcurrentModificationExceptionExample {

    static ArrayList<String> arrayList = new ArrayList<>();

    static class ThreadExample extends Thread {
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Child Thread Modifies");
            arrayList.add("Rahul");  
        }
    }

    public static void main(String[] args) throws InterruptedException {

        arrayList.add("Dinesh");
        arrayList.add("Rakesh");
        arrayList.add("Ram");

        ThreadExample threadExample = new ThreadExample();
        threadExample.start();

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println("Main Thread performs: " + iterator.next());
            Thread.sleep(1000);  
        }

        System.out.println("Final list: " + arrayList);
    }
}
