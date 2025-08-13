package com.collections;
import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		List<String> students = Arrays.asList("Raj", "Rajesh", "Rahul", "Dinesh");

		//sort
        Collections.sort(students);  
        System.out.println("Sorted Students: " + students);
        
        //reverse order
      Collections.sort(students,Collections.reverseOrder());
      System.out.println("Reverse Order: "+students);
      
	}

}
