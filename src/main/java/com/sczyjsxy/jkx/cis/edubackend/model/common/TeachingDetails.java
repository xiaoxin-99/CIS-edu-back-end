package com.sczyjsxy.jkx.cis.edubackend.model.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;

/**
 * 教学详情
 * @author lx
 */
@Data
public class TeachingDetails implements Ser {
    /**
     * 课程名称
     */
    private String course;

    /**
     * 时间地点
     */
    private TeachingWeekAndTimeAndPlace timeAndPlace;
}
