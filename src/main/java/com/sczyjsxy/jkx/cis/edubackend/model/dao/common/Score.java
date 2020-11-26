package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;

/**
 * 成绩
 * @author lx
 */
@Data
public class Score implements Ser {

    /**
     * 成绩编号
     */
    private String scoreId;

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
