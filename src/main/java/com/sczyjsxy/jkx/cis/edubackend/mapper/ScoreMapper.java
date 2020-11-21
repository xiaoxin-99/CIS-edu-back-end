package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreDetailVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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
     * @param status 状态
     * @return 成绩
     */
    Score getScoreByStudentIdAndActivitiesId(String studentId, String activitiesId, Integer status);

    /**
     * 根据教师编号 查询 班级评分详情
     * @param teacherId 教师编号
     * @return 班级评分详情
     */
    List<ClassScoreDetailVo> getClassScoreDetail(String teacherId);

    /**
     * 通过教学活动编号 查询是否可以修改成绩
     * @param id 教学活动编号
     * @return 0为可以修改，1为不可以修改
     */
    int getScoreStatus(int id);

    /**
     * 根据教学班编号 查询 学生
     * @param id 教学班编号
     * @return 学生编号列表
     */
    List<String> getStudent(String id);

    /**
     * 根据学生 查询 分数
     * @param students 学生编号列表
     * @return 班级成绩
     */
    List<ClassScoreVo> getScoreByStudent(List<String> students);

    /**
     * 修改学生成绩
     * @param score 学生修改后的成绩
     * @return 返回修改条数
     */
    Integer modifyScore(Score score);

    /**
     * 确定成绩，确定之后便不可修改
     * @param id 教学活动编号
     * @return 确定的条数
     */
    Integer confirmScore(String id);

}
