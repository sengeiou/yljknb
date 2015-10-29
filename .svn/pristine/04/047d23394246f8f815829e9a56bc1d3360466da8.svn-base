package com.wondersgroup.bc.k3.f10301006.bs;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af38DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af39DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditCaseDTO;
import com.wondersgroup.framework.core.bo.Page;

public interface F10301006BS {

	/*
	*查询待稽核结论登记的案件
	 *@author hry
	 *@param page
	 *@param af53Dto
	 *@return Page
	 */
	public Page queryAf53ByIdsNew(Page page , AuditCaseDTO auditCaseDTO);
	
	/**
	 * 根据传入对象查询af53分页信息
	 * @author hry
	 * @param page
	 * @param af53Dto
	 * @return Page
	 */
	Page queryAf53WithPageInfo(Page page, Af53DTO af53Dto);

	/**
	 * 更新Af53
	 * @param af53dto 
	 * @return
	 */
	public Af53DTO updateAf53(Af53DTO af53dto);
	/**
	 * 获取稽核对象
	 * @param aaz077
	 * @return
	 */
	Af31 getAf31(String aaz077);
	/**
	 * 更新稽核对象
	 * @param af31
	 * @return
	 */
	Af31 updateAf31(Af31 af31);
	/**
	 * 保存稽核结论登记
	 * @param af38dto
	 * @return
	 */
	Af38DTO saveAf38(Af38DTO af38dto);
	/**
	 * 
	 * @param aaa027
	 * @return
	 */
	Aa10DTO getAa10ByCode(String aaa027);
	/**
	 * 
	 * @return
	 */
	Af39DTO getMaxAaz006();
	/**
	 * 
	 * @param af39dto
	 * @return
	 */
	Af39DTO saveAf39(Af39DTO af39dto);
	/**
	 * 
	 * @param aab077
	 * @return
	 */
	Map<String, Object> queryAf39WithMap(Long aab077);
	
	/**
	 * 
	 * @param aaz318
	 */
	void updateAf31ByAaz318(Long aaz318);
	/**
	 * 
	 * @param aaz007
	 * @return
	 */
	Af39DTO getAf39ByAaz007(String aaz007);
	
}
