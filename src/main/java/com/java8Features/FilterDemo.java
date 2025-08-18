package com.java8features;
import java.util.*;
public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream().filter(n -> n%2==1)
					.map(n -> n*2)
					.forEach(n->System.out.println(n));
		
		List<String> listStr=Arrays.asList("Raj","Ram","Dinesh","Raj","Karthik","Ram");
		
		listStr.stream().distinct().sorted().forEach(str->System.out.println(str));
		long count=listStr.stream().distinct().count();
		System.out.println(count);
		
//		List<String> StreamList=listStr.stream().distinct().collect(Collectors.toList());
//		System.out.println(StreamList);
		
		//toArray()
		Object[] arr=list.stream().toArray();
		
		for(Object v:arr) {
			System.out.println(v);
		}
	}

}
