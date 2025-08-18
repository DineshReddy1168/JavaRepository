package com.multithreadingdemo;
import java.util.*;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
			
	}
}

class CreateThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Hii");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
			
	}
}
//public class CreateExtends {
//
//	public static void main(String[] args) {
//		
//		MyThread t1=new MyThread();
//		CreateThread t2=new CreateThread();
//		
//		t1.start();
//		t2.start();
//		
//
//	}
//
//}
