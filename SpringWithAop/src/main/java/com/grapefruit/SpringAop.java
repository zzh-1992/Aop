package com.grapefruit;

import com.grapefruit.run.Run;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringAop
 */
public class SpringAop {
    public static void main( String[] args ) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        try{
            Run bean = context.getBean(Run.class);
            bean.run();
        }catch (Exception e){
            //UndeclaredThrowableException exception = (UndeclaredThrowableException) e;
            System.out.println("????:" + e.getMessage());
        }
        Thread.sleep(3000);
        System.out.println("app exit===>");
    }
}
