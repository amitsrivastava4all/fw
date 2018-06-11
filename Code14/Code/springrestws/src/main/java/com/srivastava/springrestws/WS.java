package com.srivastava.springrestws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WS {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello User";
	}
	@RequestMapping("/getCustomers")
	public List<Customer> getCustomers(){
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer(1001,"Ram",9999));
		customerList.add(new Customer(1002,"Ramesh",9999));
		customerList.add(new Customer(1003,"Shyam",9999));
		customerList.add(new Customer(1004,"Mike",9999));
		return customerList;
	}
}
