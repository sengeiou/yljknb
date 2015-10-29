package com.wondersgroup.bc.k2.f10202003.bs;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10202003.vo.Kc62VO;

public interface F10202003BS {

	/**
	 * 
	 * 分页查询kc63  
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKc63WithPage(Page page, Kc63DTO queryDto);
	/**
	 * 
	 * 分页查询kc62  
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKc62sWithPage(Page page, Kc62VO queryDto);


}
