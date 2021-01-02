package com.grapefruit.springboot.myTimerTask;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Setter
@Getter
public class MyTimerTask extends TimerTask {

    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
    }
}

class Test {
    public static void main(String[] args) {
        TimerTask timerTask = new MyTimerTask();
        Timer timer = new Timer();
        //timer.schedule(timerTask,3000);
        //timer.scheduleAtFixedRate(timerTask,3000,1000);
        //ScheduledExecutorService service = new ScheduledExecutorService();
        timer.scheduleAtFixedRate(timerTask, new Date(2021,1,2,8,29,0),1000);

    }
}
