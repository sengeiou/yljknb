package com.wondersgroup.bc.k3.f10301014.bs;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.framework.core.bo.Page;

public interface F10301014BS {
	
	/**
	 * 分页查询af53 稽核案件详情记录
	 * 
	 * @author hanruyi
	 * @param page
	 * @param 
	 * @return
	 */
	
	Page queryAuditCaseDetailsWithPage(Page page,Af53DTO af53Dto);
	
	/**
	 * 根据af53中主键ID查询的详细信息
	 * @author hanruyi
	 * @param aaz318
	 * @return Af53DTO
	 */
	Af53DTO getAf53ById(String aaz318);
	
	/**
	 * 根据id修改案件状态
	 * @author hanruyi
	 * @param aaz318s
	 * @return null
	 */
	void updateAf53ByIds(String aaz318s);
	
	/**
     * 更新af53
     * @author hry
     * @param af53DTO
     * @return Af53DTO
     */
	Af53DTO updateAf53(Af53DTO af53DTO);
	/**
	 * 
	 * @param aaz318
	 */
	void updateAf31ByAf53(Long aaz318);
	

}
