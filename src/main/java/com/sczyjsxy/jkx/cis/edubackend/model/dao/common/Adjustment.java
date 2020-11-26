package com.sczyjsxy.jkx.cis.edubackend.model.dao.common;

import java.time.LocalDateTime;

import com.sczyjsxy.jkx.cis.edubackend.common.Ser;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingWeekAndTimeAndPlace;
import lombok.Data;

/**
 * 调课实体
 * @author Mr zhang
 */
@Data
public class Adjustment implements Ser {
    /**
     * 调课编号
     */
    private Integer adjustmentId;

    /**
     * 原因
     */
    private String cause;

    /**
     * 调前周次（例如 3：代表第三周）
     * 调前星次(例如3：为星期三的意思)
     * 节次(例如 1代表 1-2，2 代表3-4)
     * 调前教室地点
     */
    private TeachingWeekAndTimeAndPlace before;

    /**
     * 调后周次（例如 3：代表第三周）
     * 调后星次(例如3：为星期三的意思)
     * 调后节次 01-02，8-10
     * 调后教室
     */
    private TeachingWeekAndTimeAndPlace after;

    /**
     * 代课老师
     */
    private String replaceTeacher;

    /**
     * 状态(0:系上待审核，1:系上审核通过，2：系上驳回，3：院上待审核，4：院上审核通过，5：院上驳回)
     */
    private Integer status;

    /**
     * 提交时间
     */
    private LocalDateTime submitTime;

    private static final long serialVersionUID = 1L;
}