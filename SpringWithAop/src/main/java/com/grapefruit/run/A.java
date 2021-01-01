package com.grapefruit.run;

import com.grapefruit.mark.MyException;
import org.springframework.stereotype.Component;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component
public class A {
    @MyException
    public void run(){
        System.out.println("A---->");
        int i = 1/0;
    }
}
