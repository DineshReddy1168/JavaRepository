package com.Basics;

class Bank{
	public void display()
	{
			System.out.println("Bank Class");
	}
}

class HSBC extends Bank{
	public void dis()
	{
			System.out.println("HSBC Bank Class");
	}
}

class HDFC extends Bank{
	public void run()
	{
			System.out.println("HDFC Bank Class");
	}
}

class ICICI extends Bank{
	public void display1()
	{
			System.out.println("ICICI Bank Class");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		
		ICICI i=new ICICI();
		i.display();
		i.display1();
	}

}
