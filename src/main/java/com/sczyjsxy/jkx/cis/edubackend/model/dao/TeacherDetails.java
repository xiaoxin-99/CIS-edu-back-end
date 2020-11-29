package com.sczyjsxy.jkx.cis.edubackend.model.dao;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Teacher;
import lombok.Data;

/**
 * @author lx
 */
@Data
public class TeacherDetails {
    /**
     * 教师
     */
    private Teacher teacher;

    /**
     * 部门
     */
    private String department;

    /**
     * 专业
     */
    private String major;

}
