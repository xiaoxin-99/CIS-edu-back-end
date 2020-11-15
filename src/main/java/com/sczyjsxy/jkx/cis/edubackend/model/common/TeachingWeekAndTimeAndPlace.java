package com.sczyjsxy.jkx.cis.edubackend.model.common;

import lombok.Data;

/**
 * 周次+星次+节次+地点
 * @author lx
 */
@Data
public class TeachingWeekAndTimeAndPlace {

    /**
     * 周数
     */
    private Integer weekNum;

    /**
     * 时间地点
     */
    private TeachingTimeAndPlace timeAndPlace;
}
