package com.exceptions;

public class tryCatch {

	public static void main(String[] args) {
		try {
			int a=50/0;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Executed");
		}
	}

}
