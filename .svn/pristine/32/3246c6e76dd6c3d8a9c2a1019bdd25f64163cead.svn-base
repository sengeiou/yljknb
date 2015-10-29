package com.wondersgroup.bc.k2.f10204002.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204002.vo.Kc62VO;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;

public interface F10204002BS {

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
	 * 
	 * @param ids
	 * @return
	 */
	List<Kc62DTO> findCaseID(String ids);

	/**
	 * 保存附件信息ke02
	 * 
	 * @param dto
	 * @return
	 */
	Ke02DTO saveKe02(Ke02DTO ke02DTO);

	/**
	 * 根据医院查询汇总统计数据信息
	 * 
	 * @param akb020
	 * @return
	 */
	List<GatherVO> queryWithHospital(String akb020);

}
