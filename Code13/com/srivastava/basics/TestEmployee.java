package com.srivastava.basics;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hdfc.services.AccountService;

public class TestEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee service = (Employee)context.getBean("employee");
		//System.out.println(employee);
		/*String a = 1 +2 + 3 +"Ram"+90+90;
		System.out.println(a);*/
		service.withDraw();

	}

}
