package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentActivities;

import java.util.List;

/**
 * 学生服务
 * @author lx
 */
public interface StudentService {

    /**
     * 获取学生课表
     * @param studentId 学生编号
     * @param semester 学期
     * @return 学生课表
     */
    List<StudentActivities> studentTimetable(String studentId, String semester);
}
