package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 选班
 * @author Mr zhang
 */
@Mapper
@Repository
public interface ChooseMapper {

    /**
     * 根据学生编号查询教学班编号
     * @param studentId 学生编号
     * @return 教学班编号列表
     */
    List<String> queryTeachingClassId(String studentId);


}
