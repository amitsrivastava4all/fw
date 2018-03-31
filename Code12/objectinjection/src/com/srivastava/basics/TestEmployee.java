package com.srivastava.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee)context.getBean("employeeBeanObject");
		System.out.println("Employee Details are "+employee);
		employee.setId(9001);
		employee.getAddress().setCity("NewYork");
		System.out.println("After Change "+employee);
		//employee.getAddress().setCity("Mumbai");
	}

}
