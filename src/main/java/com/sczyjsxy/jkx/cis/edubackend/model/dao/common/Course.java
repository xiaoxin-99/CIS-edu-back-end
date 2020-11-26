package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;

/**
 * 课程
 * @author lx
 */
@Data
public class Course implements Ser {

    /**
     * 课程编号
     */
    private String courseId;

    /**
     * 课程名称
     */
    private String courseName;
}
