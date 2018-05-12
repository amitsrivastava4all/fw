package com.brainmentors.apps.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.brainmentors")
@EnableAspectJAutoProxy
public class AOPCall {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("AOP DEMO..............................................");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPCall.class);
//		Course student = context.getBean(Course.class);
//		student.print();
//		MyDAO dao = context.getBean(MyDAO.class);
//		dao.add();
//		dao.delete();
//		context.close(); // call predestroy
//	}

}
