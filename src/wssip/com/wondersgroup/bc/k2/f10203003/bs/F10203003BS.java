package com.wondersgroup.bc.k2.f10203003.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10203001.vo.Kc62VO;
import com.wondersgroup.local.k2.f10203003.vo.HosDetailVO;



public interface F10203003BS {

		/**
		 * 分页查询违规单据统计表
		 * 
		 * @param page
		 * @param kc63Dto
		 * @return
		 */
		Page queryKc63WithPage(Page page, Kc63DTO kc63Dto);
		
		/**
		 * 查询医院汇总
		 * @param hosDetailVO
		 * @return
		 */
		List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO);

		/**
		 * 分页查询违规明细
		 * @param page
		 * @param queryDto
		 * @return
		 */
		Page queryKc62sWithPage(Page page, Kc62VO queryDto);
		
		

}
