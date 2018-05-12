package com.brainmentors.apps.springbasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Consumer {
	

	// this register as an bean in a bean container
//		@Bean(name="helper")
//		public ProducerHelper getBeanObject(){
//			return new ProducerHelper();
//		}
		
		@Bean(name="prod")
		public IProducer getProducer(){
			return new Producer();
		}
	
	
}
