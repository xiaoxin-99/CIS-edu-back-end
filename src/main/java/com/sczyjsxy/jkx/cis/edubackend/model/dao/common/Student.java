package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import lombok.Data;

import java.time.LocalDate;

/**
 * 学生
 * @author lx
 */
@Data
public class Student {

    /**
     * 学号
     */
    private String studentId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 联系方式
     */
    private String phone;

}
