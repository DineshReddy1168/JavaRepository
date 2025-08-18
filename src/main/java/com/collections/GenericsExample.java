package com.collections;

public class GenericsExample {

	public static void main(String[] args) {
		
		Generics<Integer,String> generics=new Generics<Integer,String>(1, "Dinesh");
		System.out.println(generics);
	}

}
