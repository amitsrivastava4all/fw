package com.brainmentors.apps.myresteg;

public class Person {
	private int age;
	private String name;
	private String address;
	public Person(int age, String name, String address){
		this.age = age;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
