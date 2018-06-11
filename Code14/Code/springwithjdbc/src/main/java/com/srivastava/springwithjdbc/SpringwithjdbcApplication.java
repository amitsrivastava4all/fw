package com.srivastava.springwithjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringwithjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringwithjdbcApplication.class, args);
		MyService myService= context.getBean(MyService.class);
		myService.addEmployee(1001, "Ram", 9999);
		myService.addEmployee(1002, "Shyam", 29999);
		
	}
}
