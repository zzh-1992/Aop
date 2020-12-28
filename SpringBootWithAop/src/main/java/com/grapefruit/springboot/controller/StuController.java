package com.grapefruit.springboot.controller;

import com.grapefruit.springboot.MyBefore;
import com.grapefruit.springboot.entity.Stu;
import com.grapefruit.springboot.service.StuService;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Stu)表控制层
 *
 * @author makejava
 * @since 2020-09-17 19:37:44
 */
@RestController
@RequestMapping("/stu")
public class StuController {
    /**
     * 服务对象
     */
    @Resource
    private StuService stuService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("/a")
    @MyBefore
    public List<Stu> queryAll() {
        return this.stuService.queryAll();
    }

}