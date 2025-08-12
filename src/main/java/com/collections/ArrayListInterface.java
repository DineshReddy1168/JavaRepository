package com.collections;
import java.util.*;

public class ArrayListInterface {

	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<String>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		
		//adding the elements to arr1
		arr1.add("Dinesh");
		arr1.add("Rahul");
		arr1.add("Vikas");
		
		//adding the elements to arr2
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		
		System.out.println("arr1: "+arr1);
		System.out.println("arr2: "+arr2);
		
		Iterator itr=arr1.iterator() ;  //Using Iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int a:arr2) {       // using for each loop
			System.out.println(a);
		}
		
		System.out.println(	arr1.get(2));  // get
		System.out.println(	arr1.set(1, "Ramesh"));   //set
		
		System.out.println("After Using Set");

		for(String a:arr1) {       // using for each loop
			System.out.println(a);
		}
		
		arr2.remove(1);
		for(int a:arr2) {       // using for each loop
			System.out.println(a);
		}
	}

}
