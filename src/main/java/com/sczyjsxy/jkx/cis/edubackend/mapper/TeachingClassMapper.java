package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.TeachingClass;
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
     * 根据 教学班id 查询 教学班情况
     * @param id 教学班id
     * @return 教学班情况
     */
    TeachingClass getTeachingClass(String id);
}
