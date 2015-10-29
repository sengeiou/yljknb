package com.wondersgroup.bc.k3.f10301004.bs;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ac01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kb01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf05;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af61DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301004.vo.Af61VO;

public interface F10301004BS {

	/**
	 * 案件关联笔录
	 * @param af53dto
	 */
	void relateRecord(Af53DTO af53dto);

	Page queryAf37WithPage(Page page, Af37DTO af37dto);
	/**
	 * 
	 * @param af61vo
	 * @return
	 */
	Af61VO queryApprovalInfo(Af61VO af61vo);
	/**
	 * 
	 * @param apa701
	 * @return
	 */
	Aa10DTO getAa10ByCode(String apa701);
	/**
	 * 
	 * @param aaz318
	 * @return
	 */
	Af53 getAf53ByAaz318(Long aaz318);
	/**
	 * 
	 * @param af61dto
	 * @return
	 */
	Af61DTO saveAf61(Af61DTO af61dto);
	/**
	 * 
	 * @param abz618
	 * @return
	 */
	Map<String, Object> queryAf61WithMap(Long abz618);
	
	Kf05 queryKc05ByAaz263(String aaz010, String aaz077);

	Ac01 queryAc01ByAaz077(String aaz010, String aaz077);

	Kb01 queryKb01ByAaz077(String aaz010, String aaz077);

	void delete(String aaz077);

	Af37DTO getAf37ByAaz381(Long aaz381);

	void relateRecordByAaz381(Af37DTO af37dto);
}
