package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mr zhang
 */
@Mapper
@Repository
public interface ActivitiesMapper {

    /**
     * 根据 教学活动编号 查询 课程名称
     * @param id 教学活动编号
     * @return 课程名称
     */
    String queryCourseName(String id);

    /**
     * 根据 教学活动编号 查询 教师姓名
     * @param id 教学活动编号
     * @return 教师姓名
     */
    String queryTeacherName(String id);

    /**
     * 根据教学活动编号查询排课编号
     * @param id 教学活动编号
     * @return 排课编号
     */
    List<String> queryScheduleId(String id);
}
