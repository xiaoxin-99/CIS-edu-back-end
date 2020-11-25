package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Adjustment;

import java.util.List;

/**
 * 审核者服务
 * @author lx
 */
public interface AuditorService {

    /**
     * 系部批准调课
     * @param id 调课编号
     */
    void departmentApproved(String id);

    /**
     * 系部拒绝调课
     * @param id 调课编号
     */
    void departmentReject(String id);

    /**
     * 院批准调课
     * @param id 调课编号
     */
    void collegeApproved(String id);

    /**
     * 院拒绝调课
     * @param id 调课编号
     */
    void collegeReject(String id);

    /**
     * 系部待审核列表
     * @return 返回列表
     */
    List<Adjustment> departmentList();

    /**
     * 院待审核列表
     * @return 返回列表
     */
    List<Adjustment> collegeList();

}
