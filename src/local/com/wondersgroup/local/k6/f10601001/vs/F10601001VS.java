package com.wondersgroup.local.k6.f10601001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10601001.vo.InsurVisitVO;
import com.wondersgroup.local.k6.f10601001.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10601001.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10601001.vo.VisitInfoVO;

public interface F10601001VS {

	/**
	 * 按条件查询显示图表
	 * **/
	public String queryStrip(InsurVisitVO returnVO);
	
	/**
	 * 查询医疗分类 grid
	 * **/
	public Map<String, Object> queryInsurVistWithPage(Page page , InsurVisitVO returnVO);
	
	/**
	 * 查询疾病 分类 grid
	 * **/
	public Map<String, Object> queryInsurDiseWithPage(Page page , InsurVisitVO returnVO);
	
	/**
	 * 弹出就诊信息查询
	 * **/
	public Map<String, Object> queryInsurVisitWithPage(Page page , VisitInfoVO returnVO);
	
	/**
	 * 处方信息
	 * @param page
	 * @param returnVO
	 * @return
	 */
	public Map<String, Object> queryInsurPresWithPage(Page page , PresInfoVO returnVO);
	
	/**
	 * 历史违规记录
	 * **/
	public Map<String, Object> queryInsurViosRecdWithPage(Page page , ViolRecdVO returnVO);
	
}
