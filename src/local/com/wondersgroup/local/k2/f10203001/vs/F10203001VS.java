package com.wondersgroup.local.k2.f10203001.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10203001.vo.F10203001VO;
import com.wondersgroup.local.k2.f10203001.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10203001.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10203001.vo.HosDetailVO;



public interface F10203001VS {

	Map<String, Object> queryMedDocumentDetail(Page page,
			F10203001VO f10203000vo);

	Map<String, Object> queryMedDocument(Page page, 
			F10203001VO f10203001vo);
	
	PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO);

	MedDocumentVO queryMedDocumentDetailIllegal(MedDocumentVO resultVO);
	
	List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO);

}
