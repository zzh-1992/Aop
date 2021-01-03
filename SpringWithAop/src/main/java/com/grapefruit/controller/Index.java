package com.grapefruit.controller;

import com.grapefruit.run.Run;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@RequestMapping("/")
@RestController
public class Index {
    @RequestMapping("/ix")
    private String index(){
        return "Index" + Run.getTimeStr();
    }

    @RequestMapping("/hp")
    private String homepage(){
        return "HomePage:" + Run.getTimeStr();
    }
}
