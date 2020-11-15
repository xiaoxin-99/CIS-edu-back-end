package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author Mr zhang
 */
@Repository
@Mapper
public interface TeachingClassMapper {

    /**
     * 根据教学班编号查询教学活动编号、课程编号
     * @param id 教学班编号
     * @param semester 学期
     * @return Map<教学活动编号， 课程编号>
     */
    Map<String, String> getActivitiesAndCourseMap(String id, String semester);
}
