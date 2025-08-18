package com.concurrentcollections;

public class HashMapThread implements Runnable {

	public void run() {
            try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            ConcurrentCollections.map.put(4, "Vikas");
            ConcurrentCollections.map.remove(1);
        }
}
