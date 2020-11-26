package com.sczyjsxy.jkx.cis.edubackend.model.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;

/**
 * 成绩详情
 * @author lx
 */
@Data
public class ScoreDetails implements Ser {

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
