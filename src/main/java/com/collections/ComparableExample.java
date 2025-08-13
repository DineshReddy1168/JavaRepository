package com.collections;
import java.util.*;


public class ComparableExample {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(34,"Raj",116));
		list.add(new Student(35,"Dev",101));
		list.add(new Student(33,"vikas",123));
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
