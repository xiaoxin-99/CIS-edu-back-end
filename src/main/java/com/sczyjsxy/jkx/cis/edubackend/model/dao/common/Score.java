package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import lombok.Data;

/**
 * 成绩
 * @author lx
 */
@Data
public class Score {

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
