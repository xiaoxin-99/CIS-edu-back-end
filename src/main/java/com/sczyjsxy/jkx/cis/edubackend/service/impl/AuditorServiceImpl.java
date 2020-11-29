package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.AdjustmentMapper;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Adjustment;
import com.sczyjsxy.jkx.cis.edubackend.service.AuditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 审核服务实现
 * @author lx
 */
@Service
public class AuditorServiceImpl implements AuditorService {

    @Autowired
    private AdjustmentMapper adjustmentMapper;

    @Override
    public void departmentApproved(String id) {

    }

    @Override
    public void departmentReject(String id) {

    }

    @Override
    public void collegeApproved(String id) {

    }

    @Override
    public void collegeReject(String id) {

    }

    @Override
    public List<Adjustment> departmentList() {
        return null;
    }

    @Override
    public List<Adjustment> collegeList() {
        return null;
    }

}
