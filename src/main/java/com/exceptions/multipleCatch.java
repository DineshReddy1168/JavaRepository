package com.exceptions;

public class multipleCatch {

	public static void main(String[] args) {
		try {
//			int a=50/0;
//			int arr[]= new int[3];
//			arr[5]=10;
//			System.out.println(arr);
//			System.out.println(a);			
			String str=null;
			System.out.println(str.length());			
		}	
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Executed");
		}
	}

}
