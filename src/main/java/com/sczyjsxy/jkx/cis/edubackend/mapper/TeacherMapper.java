package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Teacher;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.TeachingLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mr zhang
 */
@Mapper
@Repository
public interface TeacherMapper {

    /**
     * 根据教师id 查询 教师信息
     * @param id 教师id
     * @return 教师信息
     */
    Teacher getTeacher(String id);

    /**
     * 获取所有的教学日志
     * @param teacherId 教师编号
     * @return 教学日志列表
     */
    List<TeachingLog> getAllLog(String teacherId);

    /**
     * 添加教学日志
     * @param teachingLog 教学日志
     * @param teacherId 教师编号
     * @return
     */
    Integer addTeachingLog(@Param("teachingLog") TeachingLog teachingLog,
                           @Param("teacherId") String teacherId);
}
