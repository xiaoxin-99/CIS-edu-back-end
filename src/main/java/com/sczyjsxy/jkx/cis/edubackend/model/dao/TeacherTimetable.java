package com.sczyjsxy.jkx.cis.edubackend.model.dao;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.TeachingClass;
import lombok.Data;

import java.util.List;

/**
 * 教师课表
 * @author Mr zhang
 */
@Data
public class TeacherTimetable {

    /**
     * 教学活动
     */
    private Activities activities;

    /**
     * 星次节次地点
     */
    private List<TeachingTimeAndPlace> timeAndPlace;

    /**
     * 教学班
     */
    private TeachingClass teachingClass;
}
