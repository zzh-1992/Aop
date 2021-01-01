package com.grapefruit.springboot.service;

import com.grapefruit.springboot.dao.StuDao;
import com.grapefruit.springboot.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Service
public class StuServiceImpl implements StuService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    //StuDao stuDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    /*@Override
    public Stu queryById(String id) {
        String sql = "select * from stu where id = #{id}";
        //jdbcTemplate.query(sql, new ResultSetExtractor<Stu>(),id);
        return null;
    }*/

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<Stu> queryAll() {
        String sql = "select * from stu";
        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Stu>(Stu.class));
    }

    /**
     * 新增数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    @Override
    public Stu insert(Stu stu) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    @Override
    public Stu update(Stu stu) {
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
