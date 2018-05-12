package com.brainmentors.apps.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	Course course;
	@Autowired
	Student(Course course){
		this.course = course;
	System.out.println("Student Cons Call");
	}

}
