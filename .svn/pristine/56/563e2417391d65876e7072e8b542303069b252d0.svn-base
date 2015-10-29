package com.wondersgroup.local.k3.f10301003.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301003.vo.AuditCaseDetailsVO;
import com.wondersgroup.local.k3.f10301003.vo.InsuredPersonInfoVO;
import com.wondersgroup.local.k3.f10301003.vo.MedicalMechanismVO;
import com.wondersgroup.local.k3.f10301003.vo.PhysicianVO;

public interface F10301003VS {
	
	/**
	 * 分页查询稽核案件详情
	 * @author 
	 * @param page
	 * @param auditCaseDetailsVO
	 * @return
	 */
	public Map<String, Object> queryAuditCaseDetailsWithPage(Page page,AuditCaseDetailsVO auditCaseDetailsVO);
	
	/**
	 *根据aaz318 查询af31 记录 
	 *@param page
	 *@param aaz318
	 *@return
	 */
	public Map<String, Object> queryBeAuditTargetInfoById(Page page , String aaz318);
	
	/**
	 *更新af53對象 
	 *@param resultVO
	 *@return
	 */
	public AuditCaseDetailsVO updateAuditCaseDetails(AuditCaseDetailsVO resultVO);
	
	/***
	 *根據主鍵查詢af53
	 *@param aaz318
	 *@return 
	 */
	public AuditCaseDetailsVO queryAuditCaseDetailsById(String aaz318);
	
	/**
	 *根据主键查询参保人员信息 
	 *@author 
	 *@param aaz010
	 *@return
	 */
	public InsuredPersonInfoVO queryInsuredPersonById(String aaz010);
	
	/**
	 *根据主键查询医护人员信息 
	 *@author 
	 *@param aaz010
	 *@return
	 */
	public PhysicianVO queryPhysicianById(String aaz010);
	
	/**
	 *根据主键查询医疗服务机构
	 *@author 
	 *@param aaz010
	 *@return
	 */
	public MedicalMechanismVO queryMedicalMechanismById(String aaz010);

}
