package com.wondersgroup.local.k6.f10602001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10602001.vo.DoctExpenVO;
import com.wondersgroup.local.k6.f10602001.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10602001.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10602001.vo.VisitInfoVO;

public interface F10602001VS {

	/**
	 * 
	 * 查询医师费用图标数据
	 * 
	 * **/
	public String queryStrip(DoctExpenVO returnVO);
	
	/**
	 * 查询医师医疗类别
	 * **/
	public Map<String, Object> queryDoctMediWithPage(Page page , DoctExpenVO returnVO);
	
	/**
	 * 查询医师身份类别
	 * **/
	public Map<String, Object> queryDoctStatuWithPage(Page page , DoctExpenVO returnVO);
	
	/**
	 * 查询医师疾病分类
	 * **/
	public Map<String, Object> queryDoctDiseWithPage(Page page , DoctExpenVO returnVO);
	
	/***
	 * 查询医师就诊信息
	 * **/
	public Map<String, Object> queryDoctVisitWithPage(Page page , VisitInfoVO returnVO);
	
	/***
	 * 查询医师处方信息
	 * **/
	public Map<String, Object> queryDoctPresWithPage(Page page , PresInfoVO returnVO);
	
	/***
	 * 查询医师违规信息
	 * **/
	public Map<String, Object> queryDoctViolaWithPage(Page page , ViolRecdVO returnVO);
}
