package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
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
    String getCourseName(String id);

    /**
     * 根据 教学活动编号 查询 教师姓名
     * @param id 教学活动编号
     * @return 教师姓名
     */
    String getTeacherName(String id);

    /**
     * 根据教学活动编号查询排课编号
     * @param id 教学活动编号
     * @return 排课编号
     */
    List<String> getScheduleId(String id);

    /**
     * 根据教学班编号和学期 查询 教学活动
     * @param ids 教学班编号
     * @param semester 学期
     * @return 教学活动列表
     */
    List<Activities> getActivitiesByTeachingClassId(List<String > ids, String semester);

    /**
     * 通过教师编号和学期 查找 教学活动
     * @param id 师编号
     * @param semester 学期
     * @return 教学活动列表
     */
    List<Activities> getActivitiesByTeacherId(String id, String semester);
}
