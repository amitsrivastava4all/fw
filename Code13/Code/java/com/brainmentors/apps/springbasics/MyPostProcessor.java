package com.brainmentors.apps.springbasics;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyPostProcessor implements BeanPostProcessor{
	
	
		@Override
		public Object postProcessBeforeInitialization(Object bean, String beanName)
				throws BeansException {
			if(bean instanceof MyDAO){
			System.out.println("I Work FOR DAO ONLY NOW Inside post process before initialization: "+beanName);
			}
			return bean;
		}
		@Override
		public Object postProcessAfterInitialization(Object bean, String beanName)
				throws BeansException {
			if(bean instanceof MyDAO){
			System.out.println("I Work FOR DAO ONLY NOW Inside post process after initialization: "+beanName);
			
			}
			return bean;
		}
	
}
