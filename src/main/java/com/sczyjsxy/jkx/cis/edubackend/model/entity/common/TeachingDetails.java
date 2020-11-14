package com.sczyjsxy.jkx.cis.edubackend.model.entity.common;

import lombok.Data;

/**
 * 教学详情
 * @author lx
 */
@Data
public class TeachingDetails {
    /**
     * 课程名称
     */
    private String course;

    /**
     * 时间地点
     */
    private TeachingWeekAndTimeAndPlace timeAndPlace;
}
