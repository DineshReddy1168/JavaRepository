package com.collections;
import java.lang.reflect.Array;
import java.util.*;

public class ComparatorExample {

	public static void main(String[] args) {
		
		Comparator<String>comparator=new Comparator<String>() {

			public int compare(String i,String j) {
				if(i.length()>j.length()) {
					return 1;
				}
				else {
					return -1;
				}
			}
			
		};
		
		
		
		ArrayList<String> array=new ArrayList<>();
		
		array.add("Dinesh");
		array.add("Ram");
		array.add("Anush");
		
		Collections.sort(array,comparator);
		System.out.println(array);

	}

}
