package com.wondersgroup.local.k6.f10603002.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603002.vo.MediClinVO;

public interface F10603002VS {

	/**
	 * 機構門診(圖表)
	 * **/
	public String queryStrip(MediClinVO returnVO);
	
	/**
	 * 機構門診 醫療類別
	 * **/
	public Map<String, Object> queryMediClinMediWithPage(Page page , MediClinVO returnVO);

	/**
	 * 機構門診 身份類別
	 * **/
	public Map<String, Object> queryMediClinIdentifyWithPage(Page page , MediClinVO returnVO);

	/**
	 * 機構門診 疾病分類
	 * **/
	public Map<String, Object> queryMediClinDiseaseWithPage(Page page , MediClinVO returnVO);
}
