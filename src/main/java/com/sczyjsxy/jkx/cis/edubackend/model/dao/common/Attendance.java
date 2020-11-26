package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;

import java.time.LocalDate;

/**
 * 考勤
 * @author lx
 */
@Data
public class Attendance implements Ser {

    /**
     * 课程
     */
    private String course;

    /**
     * 教师姓名
     */
    private String teacher;

    /**
     * 考勤类型
     */
    private Integer type;

    /**
     * 周次
     */
    private Integer weekNum;

    /**
     * 星次
     */
    private Integer week;

    /**
     * 节次
     */
    private Integer section;

    /**
     * 时间
     */
    private LocalDate time;

    /**
     * 备注
     */
    private String remark;


}
