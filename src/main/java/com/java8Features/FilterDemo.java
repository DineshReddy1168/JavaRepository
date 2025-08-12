package com.java8Features;
import java.util.*;
import java.util.stream.Collectors;
public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7);
		
		li.stream().filter(n -> n%2==1)
					.map(n -> n*2)
					.collect(Collectors.toSet()).
					forEach(System.out::println);

	}

}
