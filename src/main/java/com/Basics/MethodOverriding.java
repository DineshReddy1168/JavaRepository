package com.Basics;

class Son
{
	public void print()
	{
		System.out.println("This is Son Class");
	}	
}
class Daughter extends Son
{
	public void print()
	{
		System.out.println("This is Daughter Class");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.print();

	}

}
