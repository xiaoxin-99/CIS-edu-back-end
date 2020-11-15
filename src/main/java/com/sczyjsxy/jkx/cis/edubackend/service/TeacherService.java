package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherActivities;

import java.util.List;

/**
 * 教师服务
 * @author lx
 */
public interface TeacherService {

    /**
     * 获取教师课表
     * @param teacherId 教师编号
     * @param semester 学期
     * @return 教师课表
     */
    List<TeacherActivities> teacherTimetable(String teacherId, String semester);
}
