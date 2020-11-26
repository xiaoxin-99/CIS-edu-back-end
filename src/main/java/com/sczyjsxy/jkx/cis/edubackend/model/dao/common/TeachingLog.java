package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * @author Mr zhang
 */
@Data
public class TeachingLog implements Ser {

    /**
     * 教学日志编号
     */
    private String teachingLogId;

    /**
     * 周数
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
     * 教室
     */
    private String room;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 教学内容
     */
    private String content;

    /**
     * 记录时间
     */
    private LocalDateTime recordTime;

    /**
     * 教师编号
     */
    private String teacherId;



}
