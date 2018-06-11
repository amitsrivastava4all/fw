package com.srivastava.springaopdemo;

import java.util.concurrent.TimeUnit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class MyAspect {
	private long startTime ;
	private long endTime;
//  @Pointcut("@target(org.springframework.stereotype.Repository)") 
	@Pointcut("execution(* *.show*(..))")
	    public void mypointcut() {};
	 
	    @Before("mypointcut()")
	    public void start(JoinPoint jp) {
	        String methodName = jp.getSignature().getName();
	        startTime = System.currentTimeMillis();
	        System.out.println("Method "+methodName+" Time Start "+startTime);
	    }
	    @After("mypointcut()")
	    public void end(JoinPoint jp) {
	        String methodName = jp.getSignature().getName();
	        endTime = System.currentTimeMillis();
	        System.out.println("Method "+methodName+" Time End "+endTime);
	        System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
	    }
	    
	    @Pointcut("within(@org.springframework.stereotype.Repository *)")
	    	    public void allRepoMethods() {};
	 
	    @Around("allRepoMethods()")
	    public Object totalTimeTaken(ProceedingJoinPoint pjp) throws Throwable {
	        long start = System.nanoTime();
	        Object retval = pjp.proceed();
	        long end = System.nanoTime();
	        String methodName = pjp.getSignature().getName();
	        System.out.println("Execution of " + methodName + " took " + 
	          TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
	        return retval;
	    }

}
