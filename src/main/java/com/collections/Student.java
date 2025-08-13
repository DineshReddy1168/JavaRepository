package com.collections;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private int departmentId;
	
	public Student(int id, String name, int departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.departmentId = departmentId;
	}
	
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", departmentId=" + departmentId + "]";
	}

	
	public int compareTo(Student that) {
		if(this.id>that.id) {
			return 1;
		}
		else
			return -1;
	}
}
