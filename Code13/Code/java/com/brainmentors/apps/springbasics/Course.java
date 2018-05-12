package com.brainmentors.apps.springbasics;

import org.springframework.stereotype.Component;

@Component(value="ram")
public class Course {
	private String name;
	Course(String name){
			this.name = name;
			System.out.println("Cons of course call");
	}
	public String getName(){
		return name;
	}
	public void print(){
		System.out.println("***************Course Print Call "+name);
	}
}
