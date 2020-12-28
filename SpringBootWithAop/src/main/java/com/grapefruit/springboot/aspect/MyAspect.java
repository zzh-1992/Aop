package com.grapefruit.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Aspect
@Component
public class MyAspect {

    // 使用类路径通配符的方式定义pointcut
    //@Pointcut(value = "execution(* com.grapefruit.springboot.controller.*.*(..))")

    //使用注解标记的方式定义pointcut
    @Pointcut(value = "@annotation(com.grapefruit.springboot.MyBefore)")
    public void aop(){}

    //@Pointcut(value = "@annotation(com.grapefruit.springboot.MyBefore)")
    public void annotation(){
        System.out.println("使用注解定义位置----------");
    }

    @Before("aop()")
    public void aopBefore(){
        System.out.println("前置通知开始-------");
    }

    @AfterThrowing(value = "aop()" ,throwing = "e")
    public void exception(Exception e){
        System.out.println("异常通知开始-------" + e);
    }


    @After("aop()")
    public void aopAfter(){
        System.out.println("后置通知开始-------");
    }

    @Around("aop()")
    public void aopAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕 前置通知开始-------");
        joinPoint.proceed();
        System.out.println("环绕 后置通知开始-------");
    }
}
