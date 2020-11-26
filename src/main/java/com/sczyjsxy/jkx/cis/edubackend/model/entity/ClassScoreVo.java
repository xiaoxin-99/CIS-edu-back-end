package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Student;
import lombok.Data;


/**
 * 班级成绩详情
 * @author Mr zhang
 */
@Data
public class ClassScoreVo implements Ser {

    /**
     * 评分
     */
    private Score score;

    /**
     * 学生
     */
    private Student student;

    /**
     * 成绩占比
     */
    private Integer proportion;
}
