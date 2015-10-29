package com.wondersgroup.bc.k5.f10504003.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10504003.vo.QueryNumberVO;

public interface F10504003BS {
	/**
	 * 分页查询违规单据统计表
	 * 
	 * @param page
	 * @param kc63Dto
	 * @return
	 */
	Page queryKc63WithPage(Page page, Kc63DTO kc63Dto);
	/**
	 * 根据医院编号或医院名称查找
	 * @param akb020orakb021
	 * @return
	 */
	List<QueryNumberVO> getQueryNumberVO(String akb020orakb021);
	
	/**
	 * 分页查询
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKc62WithPage(Page page, Kc62DTO queryDto);
}
