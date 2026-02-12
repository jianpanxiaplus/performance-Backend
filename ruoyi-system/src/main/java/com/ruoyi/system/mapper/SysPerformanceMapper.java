package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.SysPerformance;

import java.util.List;

/**
 * 课堂表现记录 数据层
 *
 * @author hyx
 */
public interface SysPerformanceMapper
{
    /**
     * 根据条件分页查询课堂表现记录数据
     *
     * @param performance 课堂表现记录信息
     * @return 课堂表现记录集合信息
     */
    public List<SysPerformance> selectPerformanceList(SysPerformance performance);


    /**
     * 通过课堂表现记录表ID查询课堂表现记录
     *
     * @param pId 课堂表现记录ID
     * @return 课堂表现记录
     */
    public SysPerformance selectPerformanceById(Long pId);

    /**
     * 根据课堂表现记录ID查询课堂表现记录
     *
     * @param studentName 学生名称
     * @return 课堂表现记录列表
     */
    public List<SysPerformance> selectPerformancesByStudentName(String studentName);

    /**
     * 修改课堂表现记录信息
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    public int updatePerformance(SysPerformance performance);

    /**
     * 新增课堂表现记录信息
     *
     * @param performance 课堂表现记录信息
     * @return 结果
     */
    public int insertPerformance(SysPerformance performance);

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
