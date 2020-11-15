package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lx
 */
@Repository
@Mapper
public interface ScoreMapper {

    /**
     * 根据 学号 和 教学活动编号 查询 成绩
     * @param studentId 学号
     * @param activitiesId 教学活动编号
     * @return 成绩
     */
    Score getScoreByStudentIdAndActivitiesId(String studentId, String activitiesId);

}
