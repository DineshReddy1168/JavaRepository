package com.MultiThreading;
import java.util.*;

class Thread1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println(i);
				Thread.sleep(1500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

public class ImplementsThread {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		t.start();

	}

}

