package com.grapefruit.run;

import com.grapefruit.mark.MyException;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component("a")
public class Run {
    @MyException
    public void run(){
        System.out.println("A---->");
        int i = 1/1;
    }

    public void task1(){
        System.out.println(getTimeStr() + "任务1==========>");
    }

    public void task2(){
        System.out.println(getTimeStr() + "任务2==========>");
    }

    public static String getTimeStr(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }
}
