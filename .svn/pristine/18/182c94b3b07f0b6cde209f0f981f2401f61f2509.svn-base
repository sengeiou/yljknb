package com.wondersgroup.local.report.geren.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.geren.vo.GerenGridVO;
import com.wondersgroup.local.report.geren.vo.GerenVO;

public interface GerenVS {

	/**
	 * 获取个人分析报告的个人信息
	 * 
	 * @param gerenVO
	 * @return
	 */
	GerenVO getGereninfo(GerenVO gerenVO);

	/**
	 * 获取时间轴数据
	 * 
	 * @param gerenVO
	 * @return
	 */
	String getTimeline(GerenVO gerenVO);

	/**
	 * 获取费用构成项目的饼图数据
	 * @param vo
	 * @return
	 */
	String getFeeItemsConstituentDataGeren(GerenGridVO vo);

	/**
	 * 获取资金来源构成 图表数据
	 * @param vo
	 * @return
	 */
	String getFundSourceConsituentDataGeren(GerenGridVO vo);

	/**
	 * 获取其它指标hightcharts条形图数据
	 * 
	 * @param vo
	 * @return
	 */
	String getOtherIndicatorsDataGeren(GerenGridVO vo);

	/**
	 * 分页查询就诊情况按医院汇总
	 * @param page
	 * @param vo
	 * @return
	 */
	Map<String, Object> queryJZQKGrid(Page page, GerenGridVO vo);

	/**
	 * 分页查询费用明细
	 * @param page
	 * @param vo
	 * @return
	 */
	Map<String, Object> queryFYMXGrid(Page page, GerenGridVO vo);

	/**
	 * 分页查询疑点信息
	 * @param page
	 * @param vo
	 * @return
	 */
	Map<String, Object> queryYDXXGrid(Page page, GerenGridVO vo);

	/**
	 * 分页查询历史违规信息
	 * @param page
	 * @param vo
	 * @return
	 */
	Map<String, Object> queryLSWGGrid(Page page, GerenGridVO vo);

}
