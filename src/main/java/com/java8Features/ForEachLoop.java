package com.java8features;
import java.util.*;

public class ForEachLoop {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8);
		li.forEach(i -> System.out.println(i));
	}

}
