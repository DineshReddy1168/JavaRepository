package com.basics;

public class ClassObjectMethods {
	public static void main(String args[]) {
	
		String s1="abc";
		String s2="abc";
		
		String s3=new String("abc");
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2));  //true
		
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3)); //true
		
		
		System.out.println(s1.toString());
		
		System.out.println(s1.hashCode());
		
		
	}

}
