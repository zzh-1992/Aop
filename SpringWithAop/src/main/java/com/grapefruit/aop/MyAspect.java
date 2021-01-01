package com.grapefruit.aop;

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

    //使用类路径通配符的方式定义pointcut
    //@Pointcut(value = "execution(* com.grapefruit..*.*(..))")

    //使用注解标记的方式定义pointcut
    @Pointcut(value = "@annotation(com.grapefruit.mark.Other)")
    public void aop(){}

    //使用注解标记的方式定义pointcut
    @Pointcut(value = "@annotation(com.grapefruit.mark.MyException)")
    public void ex(){}

    //@Pointcut(value = "@annotation(com.grapefruit.mark.MyBefore)")
    public void annotation(){
        System.out.println("使用注解定义位置----------");
    }

    @Before("aop()")
    public void aopBefore(){
        System.out.println("前置通知开始-------");
    }

    @AfterThrowing(value = "ex()" ,throwing = "e")
    public void exception(Exception e) {
        //处理异常逻辑
        System.out.println("异常通知开始-------" + e);
        System.out.println("e:" + e.getClass());
    }

    @After("aop()")
    public void aopAfter(){
        System.out.println("后置通知开始-------");
    }

    @Around("aop()")
    public Object aopAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕 前置通知开始-------");
        Object result = joinPoint.proceed();
        System.out.println("环绕 后置通知开始-------");
        return result;
    }
}
