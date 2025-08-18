package com.java8features;

import java.util.Arrays;
import java.util.List;

class Students{
	String name;
	int score;
	public Students(String name, int score) {
		this.name = name;
		this.score = score;
	}
}



public class ParallelStreamsDemo {

	public static void main(String[] args) {

		List<Students> list=Arrays.asList(
					
						new Students("Ram",77),
						new Students("Rakeshaak",85),
						new Students("Deepak",56),
						new Students("Vikas",60),
						new Students("Bharath",75)
				);
		
		
		 String str1 = "Rakeshaak";

	        int repeat[] = new int[256]; 

	        for (int i = 0; i < str1.length(); i++) {
	            repeat[str1.charAt(i)]++;
	        }

	        int first = 0;  
	        int second = 0; 

	        for (int i = 1; i < 256; i++) {
	            if (repeat[i] > first) {
	                second = first;
	                first = repeat[i];
	            } else if (repeat[i] > second && repeat[i] < first) {
	                second = repeat[i];
	            }
	        }

	        for (int i = 0; i < 256; i++) {
	            if (repeat[i] == second) {
	                System.out.println("Second highest frequency character: " + (char) i);
	                System.out.println("Frequency: " + second);
	                break; 
	            }
	        }
		
		
		//streams -> performs sequentially
		list.stream()
			.filter(str->str.score>=75)
			.limit(2)
			.forEach(str->System.out.println(str.name+" "+str.score));
		
		//parallel streams -> performs parallel
		list.parallelStream()
		.filter(str->str.score>=75)
		.limit(2)
		.forEach(str->System.out.println(str.name+" "+str.score));
	
		//to convert from stream to parallel stream 
		
		list.stream().parallel()
		.filter(str->str.score>=75)
		.limit(2)
		.forEach(str->System.out.println(str.name+" "+str.score));
		
		
		
	}

}
