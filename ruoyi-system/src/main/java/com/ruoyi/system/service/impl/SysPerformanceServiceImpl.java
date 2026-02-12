package com.ruoyi.system.service.impl;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.core.domain.entity.SysPerformance;
import com.ruoyi.system.mapper.SysPerformanceMapper;
import com.ruoyi.system.service.ISysPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 课堂表现记录 业务层处理
 *
 * @author hyx
 */
@Service
public class SysPerformanceServiceImpl implements ISysPerformanceService
{
    @Autowired
    private SysPerformanceMapper performanceMapper;

    /**
     * 根据条件分页查询课堂表现记录数据
     *
     * @param performance 课堂表现记录信息
     * @return 课堂表现记录集合信息
     */
    @Override
    @DataScope(deptAlias = "d")
    public List<SysPerformance> selectPerformanceList(SysPerformance performance)
    {
        return performanceMapper.selectPerformanceList(performance);
    }



    /**
     * 通过课堂表现记录ID查询课堂表现记录
     *
     * @param pId 课堂表现记录ID
     * @return 课堂表现记录对象信息
     */
    @Override
    public SysPerformance selectPerformanceById(Long pId)
    {
        return performanceMapper.selectPerformanceById(pId);
    }

    /**
     * 新增保存课堂表现记录信息
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    @Override
    @Transactional
    public int insertPerformance(SysPerformance performance)
    {
        // 新增课堂表现记录信息
        return performanceMapper.insertPerformance(performance);
    }

    /**
     * 修改保存课堂表现记录信息
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updatePerformance(SysPerformance performance)
    {
        return performanceMapper.updatePerformance(performance);
    }

    /**
     * 修改课堂表现记录状态
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    @Override
    public int updatePerformanceStatus(SysPerformance performance)
    {
        return performanceMapper.updatePerformance(performance);
    }

    /**
     *
     * @param pId 需要删除的课堂表现记录ID
     * @return
     */
    @Override
    public int deletePerformanceById(Long pId) {
        return performanceMapper.deletePerformanceById(pId);
    }

    /**
     *
     * @param pIds 需要删除的课堂表现记录ID
     * @return
     */
    @Override
    public int deletePerformanceByIds(Long[] pIds) {
        return performanceMapper.deletePerformanceByIds(pIds);
    }

}
