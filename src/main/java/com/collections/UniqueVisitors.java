package com.collections;
import java.util.*;

public class UniqueVisitors {

	    public static void main(String[] args) {
	        HashSet<String> visitors = new HashSet<>();

	        // Add visitors
	        visitors.add("user1");
	        visitors.add("user2");
	        visitors.add("user3");
	        visitors.add("user2"); // duplicates not allowed

	        // Iterator
	        System.out.println("Visitors:");
	        for (String user : visitors) {
	            System.out.println("- " + user);
	        }

	        //  visitor exists
	        System.out.println("user1 visited? " + visitors.contains("user1"));

	        // Remove a visitor
	        visitors.remove("user1");	

	        // Size and clear
	        System.out.println("Total unique visitors: " + visitors.size());
	        
	        visitors.clear();
	        System.out.println("All records cleared? " + visitors.isEmpty());
	    }
}
