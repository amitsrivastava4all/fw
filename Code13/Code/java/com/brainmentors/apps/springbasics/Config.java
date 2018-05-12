package com.brainmentors.apps.springbasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

 
@Configuration
@ComponentScan("com.brainmentors")
public class Config {
	// <bean id="course" class = "com.brainmentors.Course"/>
	 @Bean(name="ram")
	    public Course getCourse() {
		 System.out.println("Get Course Call....");
		 
		 //Course course = new Course ();
	        return new Course("Java");
	    }
	 
	 
//	 @Bean(name="student")
//	 public Student getStudent(){
//		 return new Student();
//	 }
	 
	
}
