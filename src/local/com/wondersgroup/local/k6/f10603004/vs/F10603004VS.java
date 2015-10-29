package com.wondersgroup.local.k6.f10603004.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603004.vo.MediDrugVO;
import com.wondersgroup.local.k6.f10603004.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10603004.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10603004.vo.VisitInfoVO;

public interface F10603004VS {

	/**
	 * 机构药品（图表）
	 * **/
	public String queryStrip(MediDrugVO returnVO);
	
	/**
	 * 查询医疗机构甲类
	 * **/
	public Map<String , Object> queryMediDrugDiseaseWithPage(Page page , MediDrugVO returnVO);
	
	/**
	 * 查询医疗机构乙类
	 * **/
	public Map<String , Object> queryMediDrugMedicalWithPage(Page page , MediDrugVO returnVO);
	
	/**
	 * 查询医疗机构丙类
	 * **/
	public Map<String , Object> queryMediDrugIdentifyWithPage(Page page , MediDrugVO returnVO);
	
	/**
	 * 查询医疗机构就诊信息
	 * **/
	public Map<String, Object> queryMediDrugVisitWithPage(Page page,VisitInfoVO returnVO);
	
	/**
	 * 查询医疗机构的处方信息
	 * **/
	public Map<String, Object> queryMediDrugPresWithPage(Page page,PresInfoVO returnVO);
	
	/**
	 * 医疗机构违规信息
	 * **/
	public Map<String, Object> queryMediDrugViolaWithPage(Page page,ViolRecdVO returnVO);
}
