package com.wondersgroup.bc.analysisreport.report1.bs;

import java.util.List;

import com.wondersgroup.bc.analysisreport.report1.model.dto.YiYuanDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.yishi.vo.YishiGridVO;
import com.wondersgroup.local.report.yiyuan.vo.YiYuanVO;

public interface Report1BS {
	/**
	 * 分页查询医院疑点信息
	 * */
	Page queryYdxxWithYydm(Page page,YiYuanVO yiyuanVO);
	/**
	 * 分页查询医院历史违规
	 * */
	Page queryLswgWithYydm(Page page,YiYuanVO yiyuanVO);
	/**
	 * 分页查询医师费用明细
	 * */
	Page queryFymxGrid(Page page,YishiGridVO vo);
	/**
	 * 分页查询医师历史违规
	 * */
	Page queryLSWGGrid(Page page, YishiGridVO vo);
	/**
	 * 分页查询医师疑点信息
	 * */
	Page queryYdxxGrid(Page page, YishiGridVO vo);

	/**
	 * 查询医院的基本信息
	 */
	YiYuanVO getYiyuaninfo(YiYuanVO yiyuanVO);
	/**
	 * 获取费用构成项目的饼图数据
	 * 
	 * @return
	 */
	String getFeeItemsConstituentDataYiyuan(YiYuanVO yiyuanVO);

	/**
	 * 获取资金来源构成 图表数据
	 * 
	 * @return
	 */
	String getFundSourceConsituentDataYiyuan(YiYuanVO yiyuanVO);

	/**
	 * 获取其它指标hightcharts条形图数据
	 * 
	 * @return
	 */
	String getOtherIndicatorsDataYiyuan(YiYuanVO yiyuanVO);
	
	/**
	 * 获取当年接诊按月分布条形图数据
	 * 
	 * @return
	 */
	List<YiYuanDTO> getCurrentYearMonthlyDistributionDataYiyuan(YiYuanVO yiyuanVO);
	/**
	 * 医院下的科室和医护人员数量
	 * 
	 * @return
	 */
	List<YiYuanDTO> getYsslDataYiyuan(YiYuanVO yiyuanVO);
	/**
	 * 医院下的科室和就诊数量
	 * 
	 * @return
	 */
	List<YiYuanDTO> getJzslDataYiyuan(YiYuanVO yiyuanVO);
	


}
