package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentScoreVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentTimetableVo;

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
    List<StudentTimetableVo> studentTimetable(String studentId, String semester);

    /**
     * 获取学生成绩列表
     * @param studentId 学生编号
     * @param semester 学期
     * @return 成绩表
     */
    List<StudentScoreVo> studentScore(String studentId, String semester);
}
