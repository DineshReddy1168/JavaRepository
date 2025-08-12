package com.MultiThreading;
import java.util.*;

class Mythread extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
			
	}
}

public class CreateExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		t1.start();
		t2.start();

	}

}
