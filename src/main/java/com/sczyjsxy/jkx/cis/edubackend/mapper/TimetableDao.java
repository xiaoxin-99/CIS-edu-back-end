package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherActivities;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mr zhang
 */
@Repository
@Mapper
public interface TimetableDao {

    /**
     * 查询学生课表
     * @param studentId 学生编号
     * @param semester 学期
     * @return 学生课表
     */
    List<StudentActivities> queryStudent(String studentId, String semester);

    /**
     * 查询教师课表
     * @param teacherId 教师编号
     * @param semester 学期
     * @return 教师课表
     */
    List<TeacherActivities> queryTeacher(String teacherId, String semester);
}
