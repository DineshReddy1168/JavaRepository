package com.Basics;

class Animal{
	public void display()
	{
			System.out.println("Animal Class");
	}
}

class Dog extends Animal{
	public void dis()
	{
			System.out.println("Dog Class");
	}
}

class Cat extends Dog{
	public void run()
	{
			System.out.println("Cat Class");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.display();
		c.dis();
		c.run();

	}

}
