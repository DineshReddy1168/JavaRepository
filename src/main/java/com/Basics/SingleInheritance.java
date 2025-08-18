package com.basics;

class A{
	public void display() {
		System.out.println("A Class");
	}
}

class B extends A{
	public void dis() {
		System.out.println("B Class");
	}
}



public class SingleInheritance {

	public static void main(String[] args) {
		B b=new B();
		b.display();
		b.dis();

	}

}
