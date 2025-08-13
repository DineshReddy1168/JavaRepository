package com.collections;

import java.util.*;

public class SearchHistory {
    public static void main(String[] args) {
        LinkedHashSet<String> history = new LinkedHashSet<>();

        // Add search terms
        history.add("Java tutorial");
        history.add("ArrayList example");
        history.add("Java tutorial"); 
        history.add("LinkedHashSet in Java");

        // Display history
        System.out.println("Search History:");
        for (String display : history) {
            System.out.println(display);
        }

        // Remove 
        history.remove("ArrayList example");

        // exists
        System.out.println("Java tutorial is exists? " + history.contains("Java tutorial"));

        // Size 
        System.out.println("History size: " + history.size());
        
        //clear
        history.clear();
        System.out.println("History cleared? " + history.isEmpty());
    }
}

