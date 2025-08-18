package com.java8features;

interface Add{
	int add(int i,int j);
}

interface Subtract{
	int sub(int a,int b);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
		//Anonymous class
		Add addToNumbers=new Add() {
			public int add(int i,int j) {
				return i+j;
			}
		};
		
		System.out.println(addToNumbers.add(3, 2));
		
		//Lambda Expression
		
		Subtract subtract=(int a,int b)-> a-b;
		System.out.println(subtract.sub(6, 4));
	}

}
