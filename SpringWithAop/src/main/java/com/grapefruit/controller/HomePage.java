package com.grapefruit.controller;

import com.grapefruit.run.Run;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@RequestMapping("/")
@RestController
@Setter
@Getter
public class HomePage {
    private String name;
    @RequestMapping("/hp")
    private String homepage(){
        return "HomePage:" + Run.getTimeStr() + name;
    }
}
