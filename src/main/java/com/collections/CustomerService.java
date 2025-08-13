package com.collections;
import java.util.*;

public class CustomerService {

	    public static void main(String[] args) {
	        LinkedList<String> linkedList = new LinkedList<>();

	        // Add customers
	        linkedList.add("Rajesh");
	        linkedList.add("Ram");
	        linkedList.addFirst("Kiran");
	        linkedList.addLast("Rahul");

	        // View first and last
	        System.out.println("First in line: " + linkedList.getFirst());
	        System.out.println("Last in line: " + linkedList.getLast());

	        // Remove first 
	        linkedList.removeFirst();

	        // Peek
	        System.out.println("Next to serve: " + linkedList.peek());

	        // iterator
	        System.out.println("Remaining in queue:");
	        Iterator iterator=linkedList.iterator();
	        while(iterator.hasNext()) {
	        	System.out.println(iterator.next());
	        }
	        // size
	        System.out.println("Queue size: " + linkedList.size());

	        // exists
	        System.out.println("Is Ram waiting? " + linkedList.contains("Ram"));

	        linkedList.clear();
	        System.out.println("list empty? " + linkedList.isEmpty());
	    }
	}

