package com.srivastava.springbasicexamples;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerfAspect {
	private long startTime ;
	private long endTime ;
	
	@Pointcut("execution(* *.show*(..))")
	public void mypointcut() {}
	
	@Before("mypointcut")
	public void start() {
		startTime = System.currentTimeMillis();
		return ;
	}
	@After("mypointcut")
	public void end() {
		endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
	}
}
