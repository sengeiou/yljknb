package com.wondersgroup.bc.k2.f10203002.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10203002.vo.Kc62VO;
import com.wondersgroup.local.k2.f10203002.vo.QueryNumberVO;

public interface F10203002BS {
	/**
	 * 分页查询违规单据统计表
	 * 
	 * @param page
	 * @param kc63Dto
	 * @return
	 */
	Page queryKc63WithPage(Page page, Kc63DTO kc63Dto);
	/**
	 * 根据多个baz001分页查询违规单据明细统计表
	 * 
	 * @param page
	 * @param kc62Dto
	 * @return
	 */
	Page queryKc62sWithPage(Page page, Kc62VO queryDto);
	/**
	 * 根据一组id查询kc62
	 * @param ids
	 * @return
	 */
	List<Kc62DTO> findCaseID(String ids);
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
	 * 保存审核信息表
	 * 
	 * @param kc81Dto
	 * @return
	 */
	Kc81DTO saveKc81(Kc81DTO kc81Dto);
	
	/**
	 * 更新违规单据明细统计表
	 * 
	 * @param kc62Dto
	 * @return
	 */
	Kc62DTO updateKc62(Kc62DTO kc62Dto);
	/**
	 * 根据医院编号或医院名称查找
	 * @param akb020orakb021
	 * @param baz031 
	 * @return
	 */
	List<QueryNumberVO> getQueryNumberVO(String akb020orakb021, String baz031);
	/**
	 * 
	 * 获得扣款金额  
	 * @param baz003
	 * @return
	 */
	double getKc62ById(String baz003);
	
	/**
	 * 根据疑点明细id执行结算
	 * @param baz003
	 * @param opName 
	 * @param opId 
	 * @param je 
	 * @return
	 */
	String isClear(String baz003, String opId, String opName, double je);
	
}
