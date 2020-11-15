package com.sczyjsxy.jkx.cis.edubackend.model.common;

import lombok.Data;

/**
 * 成绩详情
 * @author lx
 */
@Data
public class ScoreDetails {

    /**
     * 平时成绩
     */
    private Integer performanceScore;

    /**
     * 考试成绩
     */
    private Integer examScore;

    /**
     * 状态
     */
    private Integer status;

}
