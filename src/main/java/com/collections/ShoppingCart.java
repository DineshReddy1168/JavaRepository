package com.collections;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();

        // Add items
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Monitor");
        
        

        // Insert at index
        cart.add(1, "USB Cable");

        // item exists
        if (cart.contains("Mouse")) {
            System.out.println("Mouse is in the cart.");
        }

        // Remove by index
        cart.remove(2);

        // Sort 
        Collections.sort(cart);

        // Display cart items
        System.out.println("Shopping Cart:");
        for (String item : cart) {
            System.out.println("- " + item);
        }

        // Get item at index
        System.out.println("First item: " + cart.get(0));

        // Size and clear
        System.out.println("Total items: " + cart.size());
        
        cart.clear();
        System.out.println("Cart cleared? " + cart.isEmpty());
        
        
    }
}


