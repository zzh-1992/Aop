package com.grapefruit.springboot.service;

import com.grapefruit.springboot.entity.Stu;
import java.util.List;

/**
 * (Stu)表服务接口
 *
 * @author makejava
 * @since 2020-09-17 19:37:43
 */
public interface StuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    //Stu queryById(String id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<Stu> queryAll();

    /**
     * 新增数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    Stu insert(Stu stu);

    /**
     * 修改数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    Stu update(Stu stu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}