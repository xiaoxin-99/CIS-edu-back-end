package com.sczyjsxy.jkx.cis.edubackend.common.enums;

/**
 * 调课审核状态
 * @author lx
 */
public enum AuditStatus {

    /**
     * 未审核
     */
    WAITING_Audit(0),

    /**
     * 系部通过，等待院审核
     */
    DEPARTMENT_APPROVED(1),

    /**
     * 系部未通过
     */
    DEPARTMENT_REJECT(2),

    /**
     * 院审核通过
     */
    COLLEGE_APPROVED(3),

    /**
     * 院上审核未通过
     */
    COLLEGE_REJECT(4);

    private Integer val;

    AuditStatus(int i) {
        this.val = i;
    }

    public Integer getVal() {
        return val;
    }
}
