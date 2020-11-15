package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mr zhang
 */
@Mapper
@Repository
public interface ScheduleMapper {

    /**
     * 根据 排课编号 查询 上课 星次、节次、地点
     * @param ids 排课编号集合
     * @return TeachingTimeAndPlace
     */
    List<TeachingTimeAndPlace> queryTeachingTimeAndPlace(List<String> ids);

}
