package com.wondersgroup.bc.k2.f10205001.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc65DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc83DTO;
import com.wondersgroup.framework.core.bo.Page;

public interface F10205001BS {


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
	 * 根据一组id查询kc62
	 * @param ids
	 * @return
	 */
	List<Kc65DTO> findKc65CaseID(String ids);

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

	/**
	 * 根据主键查询单病种违规单据统计表
	 * @param baz001
	 * @return
	 */
	Kc65DTO getKc65ById(String baz011);

	/**
	 * 分页查询单病种违规单据统计表
	 * 
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKc65WithPage(Page page, Kc65DTO queryDto);
	

	/**
	 * 保存kc83
	 * 
	 * @param kc83Dto
	 */
	Kc83DTO saveKc83(Kc83DTO kc83Dto);

	/**
	 * 更新单病种单据
	 * 
	 * @param kc65
	 */
	Kc65DTO updateKc65(Kc65DTO kc65Dto);

}
