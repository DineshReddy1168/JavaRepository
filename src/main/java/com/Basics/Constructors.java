package com.Basics;

class Simple{
	int id;
	String name;
	Simple(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Simple(int id){
		this.id=id;
	}
	
	public void print() {
		System.out.println("ID: "+id + "Name: "+name);
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		Simple ss=new Simple(1,"Dinesh");
		ss.print();
		
	}

}
