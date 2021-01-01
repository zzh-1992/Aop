package com.grapefruit.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (Stu)实体类
 *
 * @author makejava
 * @since 2020-09-17 19:27:14
 */
@Table(name = "stu")
@Entity
@Setter
@Getter
public class Stu implements Serializable {
    private static final long serialVersionUID = -20780341103134091L;

    @javax.persistence.Id
    private String id;

    @Column(name = "stu_no")
    private String stuNo;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String classId;

}