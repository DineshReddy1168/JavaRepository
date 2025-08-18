package com.concurrentcollections;

public class ArrayListThread implements Runnable {
	
	public void run() {
            ConcurrentCollections.list.add("Bhaskar");
            try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
	}

}
