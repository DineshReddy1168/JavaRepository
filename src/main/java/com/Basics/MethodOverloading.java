package com.Basics;
class simple1{

public static int add(int a,int b)
{
	return a+b;
}
public static int add(int a,int b,int c)
{
	return a+b+c;
}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		simple1 s=new simple1();
		System.out.println(s.add(10,20));
		System.out.println(s.add(10,20,30));
	}

}
