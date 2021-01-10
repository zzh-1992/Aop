package com.grapefruit.controller;

import com.grapefruit.run.A;
import com.grapefruit.run.B;
import com.grapefruit.run.Run;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@RequestMapping("/")
@RestController
public class Index {
    @Autowired
    private A a;
    @Autowired
    private B b;

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/ix")
    private String index(){
        System.out.println(context.getBean("b"));
        System.out.println(a.getB());
        System.out.println(b.getA());
        return "Index" + Run.getTimeStr();
    }

    @RequestMapping("/sayHi")
    private String sayHi(){
        return "SayHi:" + Run.getTimeStr();
    }
}

