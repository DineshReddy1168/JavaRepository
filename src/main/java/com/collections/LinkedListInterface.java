package com.collections;
import java.util.*;

public class LinkedListInterface {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<>();
		
		//add
		
		linkedList.add("abc");
		linkedList.add("def");
		linkedList.add("ghi");
		
		//add at index
		
		linkedList.add(1,"jkl");
		
		// add at first
		linkedList.addFirst("mno");
		
		//add at last
		linkedList.addLast("pqr");
		
		//remove
		linkedList.remove(1);
		
		Iterator iterator=linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
				
		//size
		System.out.println(linkedList.size());
				
		//isEmpty
		System.out.println(linkedList.isEmpty());
		
		
		System.out.println("Descending Order");	
		Iterator descendingIterator=linkedList.descendingIterator()	;
		while(descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
		

	}

}
