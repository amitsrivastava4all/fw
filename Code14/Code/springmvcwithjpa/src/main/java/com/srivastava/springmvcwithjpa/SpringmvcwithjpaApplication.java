package com.srivastava.springmvcwithjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringmvcwithjpaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringmvcwithjpaApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcwithjpaApplication.class, args);
	}
}
