package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.model.entity.common.TeachingActivities;
import lombok.Data;

/**
 * 教师活动
 * @author lx
 */
@Data
public class TeacherActivities {


    private TeachingActivities activities;

    /**
     * 班级名称
     */
    private String className;
}
