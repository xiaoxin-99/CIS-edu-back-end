package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import lombok.Data;

/**
 * 教师
 * @author lx
 */
@Data
public class Teacher {

    /**
     * 教师编号
     */
    private String id;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 联系电话
     */
    private String phone;
}
