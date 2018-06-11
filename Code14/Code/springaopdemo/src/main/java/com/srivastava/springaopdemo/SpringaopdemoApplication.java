package com.srivastava.springaopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringaopdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringaopdemoApplication.class, args);
		Employee emp = context.getBean(Employee.class);
		emp.show();
		
	}
}
