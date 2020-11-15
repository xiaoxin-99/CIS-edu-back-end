package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherActivities;

import java.util.List;

/**
 *
 * @author lx
 */
public interface TimetableService {
    /**
     * 获取学生课表
     * @param studentId 学生编号
     * @param semester 学期
     * @return 学生课表
     */
    List<StudentActivities> studentTimetable(String studentId, String semester);

    /**
     * 获取教师课表
     * @param teacherId 教师编号
     * @param semester 学期
     * @return 教师课表
     */
    List<TeacherActivities> teacherTimetable(String teacherId, String semester);
}
