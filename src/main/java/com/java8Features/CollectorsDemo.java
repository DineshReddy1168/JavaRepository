package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Anush","Arun","Ram","Rajesh","Dinesh","Suresh","Sunil");
		
		Map<Character,List<String>> grouped=list.stream().collect(Collectors.groupingBy(str->str.charAt(0)));
		
		long count=list.stream().collect(Collectors.counting());
		
		String result=list.stream().collect(Collectors.joining());
		
		System.out.println(grouped);
		System.out.println(count);
		System.out.println(result);

	}

}
