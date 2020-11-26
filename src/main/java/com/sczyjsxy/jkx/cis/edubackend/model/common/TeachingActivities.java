package com.sczyjsxy.jkx.cis.edubackend.model.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;

/**
 * 教学活动
 * @author lx
 */
@Data
public class TeachingActivities implements Ser {

    /**
     * 课程名称
     */
    private String course;

    /**
     * 星次+节次+ 地点
     */
    private TeachingTimeAndPlace timeAndPlace;

    /**
     * 开课计划
     */
    private String plan;

}
