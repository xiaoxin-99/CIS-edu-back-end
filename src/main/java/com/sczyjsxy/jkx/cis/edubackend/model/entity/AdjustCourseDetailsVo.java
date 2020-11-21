package com.sczyjsxy.jkx.cis.edubackend.model.entity;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingWeekAndTimeAndPlace;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 课程调整详情
 * @author lx
 */
@Data
public class AdjustCourseDetailsVo implements Serializable {

    /**
     * 调课编号
     */
    private Integer id;

    /**
     * 课程名称
     */
    private String course;

    /**
     * 调前详情
     */
    private TeachingWeekAndTimeAndPlace before;

    /**
     * 调后详情
     */
    private TeachingWeekAndTimeAndPlace after;

    /**
     * 申请时间
     */
    private LocalDate time;

    /**
     * 状态
     */
    private Integer status;
}
