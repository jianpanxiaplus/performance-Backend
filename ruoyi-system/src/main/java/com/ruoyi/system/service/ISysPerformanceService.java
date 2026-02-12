package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.SysPerformance;

import java.util.List;

/**
 * 课堂表现记录业务层
 *
 * @author hyx
 */
public interface ISysPerformanceService
{
    /**
     * 根据条件分页查询课堂表现记录
     *
     * @param performance 课堂表现记录信息
     * @return 课堂表现记录集合信息
     */
    public List<SysPerformance> selectPerformanceList(SysPerformance performance);

    /**
     * 通过课堂表现记录ID查询课堂表现记录
     *
     * @param pId 课堂表现记录ID
     * @return 课堂表现记录对象信息
     */
    public SysPerformance selectPerformanceById(Long pId);

    /**
     * 新增保存课堂表现记录信息
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    public int insertPerformance(SysPerformance performance);

    /**
     * 修改保存课堂表现记录信息
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    public int updatePerformance(SysPerformance performance);

    /**
     * 修改课堂表现记录状态
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    public int updatePerformanceStatus(SysPerformance performance);

    /**
     * 通过课堂表现记录ID删除课堂表现记录
     *
     * @param pId 课堂表现记录ID
     * @return 结果
     */
    public int deletePerformanceById(Long pId);

    /**
     * 批量删除课堂表现记录信息
     *
     * @param pIds 需要删除的课堂表现记录ID
     * @return 结果
     */
    public int deletePerformanceByIds(Long[] pIds);


}
