package com.sczyjsxy.jkx.cis.edubackend.model.dao;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Student;
import lombok.Data;

/**
 * 学生成绩
 * @author lx
 */
@Data
public class StudentScoreDao {

    /**
     * 教学活动编号
     */
    private String teachingActivitiesId;

    /**
     * 教学活动
     */
    private Activities activities;

    /**
     * 学生
     */
    private Student student;

}
