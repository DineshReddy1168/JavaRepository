package com.java8Features;
import java.util.*;

interface R{
	int add(int a,int b);
}

interface T{
	String say(String mess);
}


public class LambdaExpressions {

	public static void main(String[] args) {
		
		R r= (a,b)->a+b;
		T t = (mess)->{
			String str="Hello";
			return str;
		};
		
	System.out.println(r.add(1, 2));
	System.out.println(t.say("Hel"));	
	}

}
