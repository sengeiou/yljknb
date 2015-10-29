package com.wondersgroup.bc.k2.f10204003.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;
import com.wondersgroup.local.k2.f10204003.vo.Kc62VO;

public interface F10204003BS {

	/**
	 * 分页查询违规单据统计表
	 * 
	 * @param page
	 * @param queryDto
	 * @return
	 */

	Page queryKc63WithPage(Page page, Kc63DTO kc63Dto);

	/**
	 * 根据医院查询汇总统计数据信息
	 * 
	 * @param akb020
	 * @return
	 */
	List<GatherVO> queryWithHospital(String akb020);
	
	/**
	 * 查询违规明细
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKc62sWithPage(Page page, Kc62VO queryDto);

}
