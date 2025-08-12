package com.java8Features;
import java.util.*;

interface S{
	static void print() {
		System.out.println("Print");
	}
}

public class StaticMethods {

	public static void main(String[] args) {

		S.print();

	}

}
