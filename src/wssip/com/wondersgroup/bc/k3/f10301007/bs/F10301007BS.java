package com.wondersgroup.bc.k3.f10301007.bs;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.framework.core.bo.Page;

public interface F10301007BS {
	
	/**
	 *案件信息
	 *@author hanruyi
	 *@param Af53DTO
	 *@return Af53DTO
	 */
	public Page queryAf53WithPage(Page page, Af53DTO af53Dto);
	
	/**
     * 更新af53
     * @author hry
     * @param af53DTO
     * @return Af53DTO
     */
	Af53DTO updateAf53(Af53DTO af53Dto);

	/**
	 * 确认待审批
	 * @param af53dto
	 * @return
	 */
	public Af53DTO confirmToSurvey(Af53DTO af53dto);

	/**
	 * 查找AF31通过AAZ318
	 * @param aaz318
	 * @return
	 */
	public List<Af31> getAf31ById(String aaz318);

}
