package com.wondersgroup.bc.k2.f10204001.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204001.vo.Kc62VO;

public interface F10204001BS {

	/**
	 * 分页查询违规单据统计表
	 * 
	 * @param page
	 * @param queryDto
	 * @return
	 */

	Page queryKc63WithPage(Page page, Kc63DTO kc63Dto);

	/**
	 * 分页查询违规单据明细信息
	 * 
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKc62WithPage(Page page, Kc62VO queryDto);

	/**
	 * 根据主键查询违规单据统计表
	 * 
	 * @param baz001
	 * @return
	 */
	Kc63DTO getKc63ById(String baz001);

	/**
	 * 查询单据明细违规信息表
	 * 
	 * @param kc72Dto
	 * @return
	 */
	List<Kc72DTO> queryKc72(Kc72DTO kc72Dto);

	/**
	 * 保存
	 * 
	 * @param kc81Dto
	 */
	Kc81DTO saveKc81(Kc81DTO kc81Dto);

	/**
	 * 同步单据明细复议状态
	 * 
	 * @param kc62
	 */
	Kc62DTO updateKc62(Kc62DTO kc62Dto);

	/**
	 * 根据主键查询违规单据明细统计表
	 * 
	 * @param baz003
	 * @return
	 */
	Kc62DTO getKc62ById(String baz003);
	
	/**
	 * 根据一组id查询kc62
	 * @param ids
	 * @return
	 */
	List<Kc62DTO> findCaseID(String ids);

	/**
	 *  结算并返回 成功标示
	 * @param baz003
	 * @param operatorId
	 * @param operatorName
	 * @param je
	 * @return
	 */
	String isClear(String baz003, String operatorId, String operatorName,
			Double je);

}
