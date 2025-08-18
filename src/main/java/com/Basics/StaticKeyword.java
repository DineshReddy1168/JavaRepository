package com.basics;

class Counter{
	
	static int count=0;
	public static void increment() {
		count++;
	}
}

public class StaticKeyword {
	
	public static void main(String[] args) {

		Counter.increment();
		Counter.increment();
		System.out.println(Counter.count);

	}

}
