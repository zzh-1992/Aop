package com.grapefruit.springboot.schedule;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */

@Component
public class ScheduleTask {

    @Scheduled(fixedRate = 100)
    @Async
    public void reportCurrentTime(){
        System.out.println("now time:" + new Date() + Thread.currentThread().getName());
    }

    @Scheduled(fixedRate = 100)
    @Async
    public void reportCurrentTime2(){
        System.out.println("now time:" + new Date() + Thread.currentThread().getName());
    }
}
