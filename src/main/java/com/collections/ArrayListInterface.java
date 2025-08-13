package com.collections;
import java.util.*;

public class ArrayListInterface {

	public static void main(String[] args) {
		ArrayList<String> arrayList1=new ArrayList<String>();
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		
		//adding the elements to arr1
		arrayList1.add("Dinesh");
		arrayList1.add("Rahul");
		arrayList1.add("Vikas");
		
		//adding the elements to arr2
		arrayList2.add(1);
		arrayList2.add(2);
		arrayList2.add(3);
		
		System.out.println("arr1: "+arrayList1);
		System.out.println("arr2: "+arrayList2);
		
		Iterator iterator=arrayList1.iterator() ;  //Using Iterator
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(int a:arrayList2) {       // using for each loop
			System.out.println(a);
		}
		
		System.out.println(	arrayList1.get(2));  // get
		System.out.println(	arrayList1.set(1, "Ramesh"));   //set
		
		System.out.println("After Using set");

		for(String a:arrayList1) {       // using for each loop
			System.out.println(a);
		}
		
		arrayList2.remove(1);
		for(int a:arrayList2) {       // using for each loop
			System.out.println(a);
		}
	}

}
