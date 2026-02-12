package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysPerformance;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.service.ISysPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 课堂表现记录
 *
 * @author hyx
 */
@RestController
@RequestMapping("/system/performance")
public class SysPerformanceController extends BaseController
{
    @Autowired
    private ISysPerformanceService performanceService;

    @PreAuthorize("@ss.hasPermi('system:performance:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysPerformance performance)
    {
        startPage();
        List<SysPerformance> list = performanceService.selectPerformanceList(performance);
        return getDataTable(list);
    }

    @Log(title = "课堂表现记录管理", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('system:performance:export')")
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysPerformance performance)
    {
        List<SysPerformance> list = performanceService.selectPerformanceList(performance);
        ExcelUtil<SysPerformance> util = new ExcelUtil<SysPerformance>(SysPerformance.class);
        util.exportExcel(response, list, "课堂表现记录数据");
    }

    /**
     * 根据课堂表现记录编号获取详细课堂表现记录
     */
    @PreAuthorize("@ss.hasPermi('system:performance:query')")
    @GetMapping(value = "/{pId}")
    public AjaxResult getInfo(@PathVariable Long pId)
    {
        return success(performanceService.selectPerformanceById(pId));
    }

    /**
     * 新增课堂表现记录
     */
    @PreAuthorize("@ss.hasPermi('system:performance:add')")
    @Log(title = "课堂表现记录管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysPerformance performance)
    {
        performance.setCreateBy(getUsername());
        return toAjax(performanceService.insertPerformance(performance));

    }

    /**
     * 修改保存课堂表现记录
     */
    @PreAuthorize("@ss.hasPermi('system:performance:edit')")
    @Log(title = "课堂表现记录管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysPerformance performance)
    {
        performance.setUpdateBy(getUsername());
        return toAjax(performanceService.updatePerformance(performance));
    }

    /**
     * 状态修改
     */
    @PreAuthorize("@ss.hasPermi('system:performance:edit')")
    @Log(title = "课堂表现记录管理", businessType = BusinessType.UPDATE)
    @PutMapping("/changeStatus")
    public AjaxResult changeStatus(@RequestBody SysPerformance performance)
    {
        performance.setUpdateBy(getUsername());
        return toAjax(performanceService.updatePerformanceStatus(performance));
    }

    /**
     * 删除课堂表现记录
     */
    @PreAuthorize("@ss.hasPermi('system:performance:remove')")
    @Log(title = "课堂表现记录管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{pIds}")
    public AjaxResult remove(@PathVariable Long[] pIds)
    {
        return toAjax(performanceService.deletePerformanceByIds(pIds));
    }

}
