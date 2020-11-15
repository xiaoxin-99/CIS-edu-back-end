package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Mr zhang
 */
@Mapper
@Repository
public interface CourseMapper {

    /**
     * 通过课程id 查询 课程信息
     * @param id 课程id
     * @return 课程信息
     */
    Course getCourse(String id);

}
