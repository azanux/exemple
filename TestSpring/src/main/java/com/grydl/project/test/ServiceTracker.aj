package com.grydl.project.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class ServiceTracker {
	
	@Before(value = "serviceMethod()")
	public void monitor(JoinPoint jp){
		System.out.println("Une methode de service va s'executer" +jp.toString());
	}
	
	@Pointcut("execution(* com.grydl.project.test.service..*Service.*(..))")
	public void serviceMethod(){
		
	}

}
