package com.exceptions;

class UserException extends Exception{
}
public class UserDefinedException {

	public static void main(String[] args) {
		try {
			throw new UserException();
		}
		catch(UserException e) {
			System.out.println("Exception Caught");
			System.out.println(e);
		}
	}
}
