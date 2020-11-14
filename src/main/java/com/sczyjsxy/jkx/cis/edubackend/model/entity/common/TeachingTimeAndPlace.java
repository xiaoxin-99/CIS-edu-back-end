package com.sczyjsxy.jkx.cis.edubackend.model.entity.common;

import lombok.Data;

/**
 * 上课时间和地点
 *  星次+节次+地点
 * @author lx
 */
@Data
public class TeachingTimeAndPlace {

    /**
     * 星次
     */
    private Integer week;

    /**
     * 节次
     */
    private Integer section;

    /**
     * 教室地点
     */
    private String place;
}
