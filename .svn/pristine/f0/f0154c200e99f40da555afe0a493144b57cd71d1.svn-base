package com.wondersgroup.local.report.yishi.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.yishi.vo.YishiGridVO;
import com.wondersgroup.local.report.yishi.vo.YishiVO;

public interface YishiVS {

	/**
	 * 查询医师的基础信息
	 * 
	 * @param yishiVO
	 * @return
	 */
	YishiVO getYishiinfo(YishiVO yishiVO);

	/**
	 * 分页查询费用明细
	 * 
	 * @param page
	 * @param vo
	 * @return
	 */
	Map<String, Object> queryFymxGrid(Page page, YishiGridVO vo);

	/**
	 * 分页查询历史违规
	 * 
	 * @param page
	 * @param vo
	 * @return
	 */

	Map<String, Object> queryLSWGGrid(Page page, YishiGridVO vo);

	/**
	 * 分页查询疑点信息
	 * 
	 * @param page
	 * @param vo
	 * @return
	 */

	Map<String, Object> queryYdxxGrid(Page page, YishiGridVO vo);

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
	String getFundSourceConsituentDataYishi(YishiGridVO vo);

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
