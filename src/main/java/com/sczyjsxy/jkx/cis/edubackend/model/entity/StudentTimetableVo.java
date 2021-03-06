package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import lombok.Data;


/**
 * 学生活动
 * @author lx
 */
@Data
public class StudentTimetableVo implements Ser {

    private TeachingActivities activities;

    /**
     * 教师名称
     */
    private String teacher;
}
