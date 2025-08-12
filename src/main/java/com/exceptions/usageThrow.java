package com.exceptions;
import java.io.*;


public class usageThrow {
	
	public static void Validate(int age) {
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		Validate(15);
		System.out.println("Executed");

	}

}
