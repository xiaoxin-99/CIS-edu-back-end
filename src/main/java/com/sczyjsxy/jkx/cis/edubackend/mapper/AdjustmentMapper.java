package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Adjustment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mr zhang
 */
@Mapper
@Repository
public interface AdjustmentMapper {

    /**
     * 获取该教师的所有调课信息
     * @param teacherId 教师编号
     * @return 调课记录列表
     */
    List<Adjustment> getAllAdjustment(String teacherId);

    /**
     * 申请调课
     * @param adjustment 调课的详细信息
     * @param teacherId 教师编号
     * @return 是否申请成功
     */
    Integer addAdjustment(@Param("adjustment") Adjustment adjustment, @Param("teacherId") String teacherId);

    /**
     * 删除申请
     * @param adjustmentId 调课编号
     * @return 删除条数
     */
    Integer deleteAdjustment(String adjustmentId);

    /**
     * 根据状态查询列表
     * @param status 状态值
     * @return 调课列表
     */
    List<Adjustment> getListByStatus(Integer status);
}