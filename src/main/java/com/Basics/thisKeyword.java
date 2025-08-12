package com.Basics;

class thisKey{
	int id;
	String name;
	int age;
	public thisKey(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void dispaly() {
		System.out.println("ID: "+id+ " Name: "+name+ " Age: "+age);
	}
}

public class thisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKey t=new thisKey(1,"Dinesh",22);
		t.dispaly();

	}

}
