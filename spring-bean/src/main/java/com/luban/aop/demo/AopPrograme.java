package com.luban.aop.demo;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopPrograme {

	public void programe(ProceedingJoinPoint joinPoint){
		System.out.println("增强方法前。。。");
		Object[] objects =  joinPoint.getArgs();
		try {
			joinPoint.proceed(objects);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("增强方法后。。。");
	}
}
