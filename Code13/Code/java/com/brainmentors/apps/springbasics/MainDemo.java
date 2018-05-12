package com.brainmentors.apps.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.brainmentors")
public class MainDemo {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainDemo.class);
//		   
//		   ProducerHelper prodHelper = ctx.getBean(ProducerHelper.class);
//		  int result = prodHelper.getProducerResult();
//		  System.out.println("Result is ******* "+result);
		
		// this is another way of Doing Configuration without an XML
		//System.out.println("Loading Another Configuration......");
//		ApplicationContext ctx2 = new AnnotationConfigApplicationContext(Consumer.class);
//		ProducerHelper prodHelper = (ProducerHelper)ctx2.getBean("helper");
//		prodHelper.show();
//		IProducer p = (IProducer)ctx2.getBean("prod");
//		System.out.println("Add is "+p.add(1000, 2000));
		
	}

}
