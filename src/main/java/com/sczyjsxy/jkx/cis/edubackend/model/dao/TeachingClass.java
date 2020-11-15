package com.sczyjsxy.jkx.cis.edubackend.model.dao;

import lombok.Data;

import java.util.List;

/**
 * @author lx
 */
@Data
public class TeachingClass {

    /**
     * 教学班编号
     */
    private String teachingClassId;

    /**
     * 教学班名称
     */
    private String teachingClassName;

    /**
     * 开班学期
     */
    private String semester;

    /**
     * 开班周期
     */
    private Integer period;

    /**
     * 教学班类型
     */
    private String type;

    /**
     * 教学活动
     */
    private List<Activities> activities;
}
