package com.basics;

import java.util.*;

public class ProducerConsumer {
	
	LinkedList<Integer> linkedList=new LinkedList<>();
	
	public void produce() throws InterruptedException {
		
		int value = 0;
		
		while(true) {
			synchronized(this) {
				
				while(linkedList.size()>0) {
					wait();
				}
			
				System.out.println("Produced Data:"+value);
				linkedList.add(value);
				value++;
				notify();
				
				Thread.sleep(1000);
			}
		}
		
	}
	
	public void consume() throws InterruptedException {
		
		while(true) {
			synchronized(this) {
				while(linkedList.size()==0) {
					wait();
				}
				
				int value=linkedList.removeFirst();
				System.out.println("Consume Data: "+value);
				
				notify();
				Thread.sleep(1000);
			}
		}
	}

	
}
