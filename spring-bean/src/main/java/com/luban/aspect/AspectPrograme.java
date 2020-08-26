package com.luban.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class AspectPrograme {

    @Pointcut("execution(* com.luban.dao..*.*(..))")
    public void pointCut(){

    }


    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint){
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
