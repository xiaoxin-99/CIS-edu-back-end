package com.sczyjsxy.jkx.cis.edubackend.model.dao;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import lombok.Data;

import java.util.List;

/**
 * @author lx
 */
@Data
public class Activities {

    /**
     * 教学活动编号
     */
    private String activitiesId;

    /**
     * 课程
     */
    private Course course;

    /**
     * 教师
     */
    private Teacher teacher;

    /**
     * 开课学期
     */
    private String semester;

    /**
     * 开课计划
     */
    private String plan;

    /**
     * 周学时
     */
    private String weekPeriod;

    /**
     * 学分
     */
    private Integer credit;

    /**
     * 成绩占比
     */
    private Integer proportion;

    /**
     * 备注
     */
    private String remark;

    /**
     * 星次节次地点
     */
    private List<TeachingTimeAndPlace> timeAndPlace;
}