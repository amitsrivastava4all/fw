package com.brainmentors.apps.springdemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		System.out.println("XML READ.....");
		IProducer producer = (IProducer)context.getBean("producerObject");
		int result = producer.add(100, 200);
		producer = null;
		System.out.println("Result is "+result);
		context = null;
		System.gc();
		for(int i = 1; i<=10;i++){
			System.out.println("I is "+i);
		}
//		producer = (IProducer)context.getBean("producerObject");
//		result = producer.add(90, 200);
//		System.out.println("Result is "+result);
		
	}

}
