package com.basics;


class hello{
	static int c=0;
    public static void counter(){
        c++;
    }
}

public class Demo {
	public static void main(String[] args) {
		
		hello.counter();
	    System.out.println("count = " + hello.c);
	}

}
