package com.brainmentors.apps.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorAutoWireDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Config.DEMO......");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Course course = (Course)context.getBean("ram");
		course.print();
		//Student student = context.getBean(Student.class);
		//System.out.println("Course Name is "+student.course.getName());
		
		
		

	}

}
