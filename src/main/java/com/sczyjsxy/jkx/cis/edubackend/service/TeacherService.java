package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreDetailVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherTimetableVo;

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
    List<TeacherTimetableVo> teacherTimetable(String teacherId, String semester);

    /**
     * 根据教师编号查询 班级详情
     * @param teacherId 教师编号
     * @return 班级详情列表
     */
    List<ClassScoreDetailVo> getClassDetail(String teacherId);

    /**
     * 根据教学班编号查询班级学生分数
     * @param teachingClassId 教学班编号
     * @return 班级学生分数列表
     */
    List<ClassScoreVo>  getClassScore(String teachingClassId);

    /**
     * 修改学生成绩
     * @param scores 成绩编号列表
     * @return 返回修改条数
     */
    Integer modifyScore(List<Score> scores);

    /**
     * 确定成绩，确定之后便不可修改
     * @param id 教学活动编号
     * @return 确定的条数
     */
    Integer confirmScore(String id);

}
