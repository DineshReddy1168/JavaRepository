package com.exceptions;
import java.io.*;

class Ram{
	public void print()throws IOException  {
		System.out.println("Details are Corrected");
	}
}
public class usageThrows {

	public static void main(String[] args) throws IOException  {
		
		Ram r=new Ram();
		r.print();
	}

}
