package com.collections;

public class Generics<T1,T2> {

	T1 id;
	T2 name;
	public Generics(T1 id, T2 name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Generics [id=" + id + ", name=" + name + "]";
	}
	
	
}
