package com.sczyjsxy.jkx.cis.edubackend.model.dao;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import lombok.Data;

import java.util.List;

/**
 * 学生课表
 * @author lx
 */
@Data
public class StudentTimetable {

    /**
     * 教学活动
     */
    private Activities activities;

    /**
     * 星次节次地点
     */
    private List<TeachingTimeAndPlace> timeAndPlace;

}
