package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Course;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.TeachingClass;
import lombok.Data;

import java.io.Serializable;

/**
 * 课程评分详情
 * @author Mr zhang
 */
@Data
public class ClassScoreDetailVo implements Serializable {

    /**
     * 教学活动编号
     */
    private int teachingActivitiesId;

    /**
     * 开课学期
     */
    private String semester;

    /**
     * 教师编号
     */
    private String teacherId;

    /**
     * 课程
     */
    private Course course;

    /**
     * 教学班
     */
    private TeachingClass teachingClass;

    /**
     * 成绩是否确定 ，1为确定 (确定了不可修改)
     */
    private int scoreStaus;


}
