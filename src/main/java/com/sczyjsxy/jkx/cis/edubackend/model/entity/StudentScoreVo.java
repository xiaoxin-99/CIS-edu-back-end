package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.model.common.ScoreDetails;
import lombok.Data;

/**
 * 学生成绩
 * @author lx
 */
@Data
public class StudentScoreVo {

    /**
     * 教师名称
     */
    private String teacher;

    /**
     * 课程名称
     */
    private String course;

    /**
     * 成绩详情
     */
    private ScoreDetails score;

}