package com.java8Features;
import java.util.*;

interface A{
	public abstract void add();
	default void show() {
		System.out.println("Hello");
	}
}

class B implements A{
	public void add() {
		System.out.println("Hii");
	}
}

public class DefaultMethods {

	public static void main(String[] args) {
		
	B b=new B();
	b.add();
	b.show();
		

	}

}
