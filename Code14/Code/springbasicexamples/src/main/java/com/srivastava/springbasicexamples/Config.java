package com.srivastava.springbasicexamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="mybean")
	public IB getBObject() {
		B obj = new B();
		obj.x=100;
		obj.y = 200;
		obj.z="Hello" + (obj.x + obj.y);
		return obj;
	}
}
