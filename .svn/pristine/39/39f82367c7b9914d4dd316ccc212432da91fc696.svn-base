package com.wondersgroup.local.report.yiyuan.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.yiyuan.vo.YiYuanVO;

public interface YiYuanVS {
	/**
	 * 查询医院的基础信息
	 * @param yiyuanVO
	 * @return
	 */
	YiYuanVO getYiyuaninfo(YiYuanVO yiyuanVO);
	/**
	 * 获取费用构成项目的饼图数据
	 * @return
	 */
	String getFeeItemsConstituentDataYiyuan(YiYuanVO yiyuanVO);

	/**
	 * 获取资金来源构成 图表数据
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
	 * 分页查询疑点信息
	 * */
    Map<String,Object> queryYdxxWithYydm(Page page,YiYuanVO yiyuanVO);
	/**
	 * 分页查询历史违规
	 * */
    Map<String,Object> queryLswgWithYydm(Page page,YiYuanVO yiyuanVO);
    
    /***
     * 当年接诊按月分布
     * */
	String getCurrentYearMonthlyDistributionDataYiyuan(YiYuanVO yiyuanVO);
    /***
     * 医院下的科室和医护人员数量
     * */
	String getYsslDataYiyuan(YiYuanVO yiyuanVO);
    /***
     * 医院下的科室和就诊数量
     * */
	String getJzslDataYiyuan(YiYuanVO yiyuanVO);

}
