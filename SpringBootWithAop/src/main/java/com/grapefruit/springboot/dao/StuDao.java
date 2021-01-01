package com.grapefruit.springboot.dao;

import com.grapefruit.springboot.entity.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Stu)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-17 19:37:42
 */
@Mapper
public interface StuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stu queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Stu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stu 实例对象
     * @return 对象列表
     */
    List<Stu> queryAll(Stu stu);

    /**
     * 新增数据
     *
     * @param stu 实例对象
     * @return 影响行数
     */
    int insert(Stu stu);

    /**
     * 修改数据
     *
     * @param stu 实例对象
     * @return 影响行数
     */
    int update(Stu stu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}