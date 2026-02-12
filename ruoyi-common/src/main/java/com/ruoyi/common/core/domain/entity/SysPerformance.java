package com.ruoyi.common.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * 课堂表现记录表 sys_performance
 *
 * @author hyx
 */
@Data
public class SysPerformance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表现ID */
    @Excel(name = "表现ID", cellType = ColumnType.NUMERIC)
    @JsonProperty("pId")
    private Long pId;

    /** 学生ID */
    @Excel(name = "学生ID")
    private Long studentId;

    /** 学生名称 */
    @Excel(name = "学生名称")
    private String studentName;

    /** 学生年级 */
    @Excel(name = "学生年级")
    private Integer studentGrade;

    /** 学生班级 */
    @Excel(name = "学生班级")
    private Integer studentClass;

    /** 评价类型 */
    @Excel(name = "评价类型")
    private String evaluationType;

    /** 评分项 */
    @Excel(name = "评分项")
    private String scoringItem;

    /** 加扣分数 */
    @Excel(name = "加扣分数")
    private Integer score;

    /** 审核状态（0未审 1通过） */
    @Excel(name = "审核状态", readConverterExp = "0=未审,1=通过")
    private String auditStatus;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

}
