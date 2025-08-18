package com.basics;

interface Software{
	public void print();
}

interface Hardware{
	public void dis();
}

class Both{
	public void print() {
		System.out.println("Hardware and Software Class");
	}
}

class Combo extends Both implements Software,Hardware{
	public void print() {
		System.out.println("Software Class");
	}
	public void dis() {
		System.out.println("Hardware Class");
	}	
}


public class HybridInheritance {

	public static void main(String[] args) {
		Combo c=new Combo();
		c.print();
		c.dis();
	}

}
