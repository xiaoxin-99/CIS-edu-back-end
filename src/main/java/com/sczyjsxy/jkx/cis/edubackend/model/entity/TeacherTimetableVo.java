package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import lombok.Data;


/**
 * 教师活动
 * @author lx
 */
@Data
public class TeacherTimetableVo implements Ser {


    private TeachingActivities activities;

    /**
     * 班级名称
     */
    private String className;
}
