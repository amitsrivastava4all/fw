package com.srivastava.springbasicexamples;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A implements ApplicationContextAware, BeanNameAware {
	
	//@Autowired
	//ApplicationContext context;
	
	//lazy way
	public void getAnything() {
		System.out.println("Get Anything called...");
		((B)applicationContext.getBean("obj")).show();
		((X)applicationContext.getBean("x")).show();
		((Y)applicationContext.getBean("y")).show();
	}
	
	@Qualifier("x")
	@Autowired 
	IB ww;
	
	@Autowired
	IB obj;
	
	@Autowired
	IB mybean;
	
	public void callB() {
		System.out.println("Call B");
		obj.show();
		mybean.show();
		ww.show();
	}

	ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Loaded "+name);
		// TODO Auto-generated method stub
		
	}
	

}
