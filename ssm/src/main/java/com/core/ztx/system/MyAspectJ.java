package com.core.ztx.system;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class MyAspectJ {
	
//	@Pointcut("execution(** com.core.ztx.service.impl.UserServiceImpl2.insertTest(..))")
	public void doPointcut(){}
	
//	@Before("doPointcut()")
	public void doBefore1(){
		System.out.println("doBefore1....");
	}
	
//	@Before("doPointcut()")
	public void doBefore2(){
		System.out.println("doBefore2....");
	}
	
//	@After("doPointcut()")
	public void doAfter(){
		System.out.println("doAfter....");
	}
}
