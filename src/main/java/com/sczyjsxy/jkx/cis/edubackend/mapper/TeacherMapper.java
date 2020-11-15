package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
}
