package com.wondersgroup.bc.analysisreport.report.bs;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.geren.vo.GerenGridVO;
import com.wondersgroup.local.report.geren.vo.GerenVO;
import com.wondersgroup.local.report.yishi.vo.YishiGridVO;
import com.wondersgroup.local.report.yishi.vo.YishiVO;

public interface ReportBS {

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
	 * 
	 * @param vo
	 * @return
	 */
	String getFeeItemsConstituentDataGeren(GerenGridVO vo);

	/**
	 * 获取资金来源构成 图表数据
	 * 
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
	 * 
	 * @param page
	 * @param vo
	 * @return
	 */
	Page queryJZQKGrid(Page page, GerenGridVO vo);

	/**
	 * 分页查询费用明细
	 * 
	 * @param page
	 * @param vo
	 * @return
	 */
	Page queryFYMXGrid(Page page, GerenGridVO vo);

	/**
	 * 分页查询疑点信息
	 * 
	 * @param page
	 * @param vo
	 * @return
	 */
	Page queryYDXXGrid(Page page, GerenGridVO vo);

	/**
	 * 分页查询历史违规信息
	 * 
	 * @param page
	 * @param vo
	 * @return
	 */
	Page queryLSWGGrid(Page page, GerenGridVO vo);

	/**
	 * 查询医师的基本信息
	 * 
	 * @param yishiVO
	 * @return
	 */
	YishiVO getYishiinfo(YishiVO yishiVO);

	/**
	 * 查询就诊次数排名图的图表数据
	 * 
	 * @param vo
	 * @return
	 */
	String getFrequencyTop10Data(YishiGridVO vo);

	/**
	 * 查询 医保内费用总额排名的图表数据
	 * 
	 * @param vo
	 * @return
	 */
	String getFeeTop10Data(YishiGridVO vo);

	/**
	 * 费用项目构成 饼图
	 * 
	 * @param vo
	 * @return
	 */
	String getFeeItemsConstituentDataYishi(YishiGridVO vo);

	/**
	 * 资金来源构成 饼图
	 * 
	 * @param vo
	 * @return
	 */
	String getFundSourceConsituentDataYishiYishi(YishiGridVO vo);

	/**
	 * 工作量统计 条形图
	 * 
	 * @param vo
	 * @return
	 */
	String getWorkloadStatisticsDataYishi(YishiGridVO vo);

	/**
	 * 费用统计 条形图
	 * 
	 * @param vo
	 * @return
	 */
	String getFeeStatisticsDataYishi(YishiGridVO vo);

	/**
	 * 获取医师的时间轴信息
	 * 
	 * @param vo
	 * @return
	 */
	YishiGridVO getyishisjz(YishiGridVO vo);

}
