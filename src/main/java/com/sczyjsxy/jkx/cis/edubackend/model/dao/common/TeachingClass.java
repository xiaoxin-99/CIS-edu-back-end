package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import lombok.Data;

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
}
