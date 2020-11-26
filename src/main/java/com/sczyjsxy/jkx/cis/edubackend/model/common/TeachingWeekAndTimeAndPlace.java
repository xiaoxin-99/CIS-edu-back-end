package com.sczyjsxy.jkx.cis.edubackend.model.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;


/**
 * 周次+星次+节次+地点
 * @author lx
 */
@Data
public class TeachingWeekAndTimeAndPlace implements Ser {

    /**
     * 周数
     */
    private Integer weekNum;

    /**
     * 时间地点
     */
    private TeachingTimeAndPlace timeAndPlace;
}
