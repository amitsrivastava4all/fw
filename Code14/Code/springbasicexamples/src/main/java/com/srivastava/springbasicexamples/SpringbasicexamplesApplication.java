package com.srivastava.springbasicexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbasicexamplesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbasicexamplesApplication.class, args);
		A a = (A)context.getBean("aobject");
		a.getAnything();
		//a.callB();
	}
}
