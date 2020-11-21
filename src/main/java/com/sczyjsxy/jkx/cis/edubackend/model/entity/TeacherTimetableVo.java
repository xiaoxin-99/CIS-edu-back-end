package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import lombok.Data;

import java.io.Serializable;

/**
 * 教师活动
 * @author lx
 */
@Data
public class TeacherTimetableVo implements Serializable {


    private TeachingActivities activities;

    /**
     * 班级名称
     */
    private String className;
}
