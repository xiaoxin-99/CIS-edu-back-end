package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Attendance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 考勤
 * @author lx
 */
@Mapper
@Repository
public interface AttendanceMapper {

    /**
     * 根据 学号 查询 学生考勤列表
     * @param studentId 学号
     * @return 考勤列表
     */
    List<Attendance> getAttendanceByStudentId(String studentId);
}
