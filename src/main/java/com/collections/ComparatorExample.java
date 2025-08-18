package com.collections;
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
		
		Comparator<Integer>comparator1=new Comparator<Integer>() {

			public int compare(Integer i,Integer j) {
				if(i>j) {
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
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(5);
		arrayList.add(7);
		arrayList.add(2);
		
		Collections.sort(array,comparator);
		Collections.sort(arrayList,comparator1);
		
		
		System.out.println(array);
		System.out.println(arrayList);

	}

}
