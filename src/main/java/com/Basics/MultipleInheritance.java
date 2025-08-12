package com.Basics;

interface AA{
	abstract void display();
}

interface BB{
	abstract void run();
}
class AABB implements AA,BB{
	public void display() {
		System.out.println("A Class Interface");
	}
	public void run() {
		System.out.println("B Class Interface");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		AABB a=new AABB();
		a.display();
		a.run();

	}

}
