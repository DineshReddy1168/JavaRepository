package com.concurrentcollections;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {

	    static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
	    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();


	    public static void main(String[] args) throws InterruptedException {
	    	
	    	
	    	map.put(1, "Raj");
	    	map.put(2, "Karthik");
	    	map.put(3, "Rahul");
	    	
	    	
	    	list.add("Dinesh");
	    	list.add("Rakesh");
	    	list.add("Ram");
	    	
	    	
	        Thread mapThread = new Thread(new HashMapThread());
	        Thread listThread = new Thread(new ArrayListThread());


	        mapThread.start();
	        listThread.start();


	        mapThread.join();
	        listThread.join();


	        System.out.println("ConcurrentHashMap: " + map);
	        System.out.println("CopyOnWriteArrayList: " + list);

	    }

}
