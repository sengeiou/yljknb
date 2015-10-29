package com.wondersgroup.bc.k5.f10504001.bs;


import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10504003.vo.QueryNumberVO;


public interface F10504001BS {
	/**
	 * 申诉处理单据分页kc63
	 * @param page
	 * @author gongwanghai
	 * @return
	 */
	Page queryComplaintHandling(Page page, Kc63DTO kc63Dto);
	
	/**
	 * 查询申诉单据描述表kc73
	 * 
	 * @param page
	 * @author gongwanghai
	 * @param kc62Dto
	 * @return
	 */
	List<Kc73DTO> queryComplaintHandlingDetail(Kc73DTO kc73Dto);
	
	
	/**
	 * 申诉处理明细分页表KC62
	 * @param page
	 * @author gongwanghai
	 * @return
	 */
	Page queryComplaintHandlingInfo(Page page, ComplaintHandlingKc62VO complaintHandlingKc62VO);
	
	/**
	 * 查询申诉单据子表描述表kc72
	 * 
	 * @param page
	 * @author gongwanghai
	 * @param kc62Dto
	 * @return
	 */
	List<Kc72DTO> queryComplaintHandlingInfoDetail(Kc72DTO kc72Dto);
	 
	/**
	 * 根据BAZ001查询KC62的详细信息
	 * @author gongwanghai 
	 * @param BAZ001
	 * @return KC62
	 */
	Kc62DTO getKc62ById(String baz001);
	
	/**
	 * 保存审核信息表
	 * 
	 * @param kc81Dto
	 * @return
	 */
	Kc81DTO saveKc81(Kc81DTO kc81Dto);
	
	/**
	 * 根据KC62主键获取明细
	 * 
	 * @param kc81Dto
	 * @return
	 */
	List<Kc62DTO> queryComplaintHandlingList(Kc62DTO kc62Dto);
	
	/**
	 * 根据KC63主键获取明细
	 * 
	 * @param kc81Dto
	 * @return
	 */
	List<Kc62DTO> queryComplaintHandlingUpdList(Kc62DTO kc62Dto);
	
	/**
	 * 根据医院编号或医院名称查找
	 * @param akb020orakb021
	 * @param baz101
	 * @return
	 */
	List<QueryNumberVO> getQueryNumberVO(String akb020orakb021,String baz101);

	/**
	 * 根据一组id查询kc62
	 * 
	 * @param ids
	 * @return
	 */
	List<Kc62DTO> findCaseID(String ids);

	/**
	 * 保存附件信息
	 * 
	 * @param dto
	 * @return
	 */
	Ke02DTO saveKe02(Ke02DTO ke02Dto);

	/**
	 * 根据id查询kc63
	 * @param baz001
	 * @return
	 */
	Kc63DTO getKc63ById(String baz001);
	/**
	 * 
	 * 根据明细id查询单据 再根据单据里的医生编号查找医生 找到为true 否则为false  
	 * @param string
	 * @return
	 */
	Boolean queryKc05(String string);

	/**
	 * 结算并返回 成功标示
	 * @param baz003
	 * @param opId
	 * @param opName
	 * @param je 
	 * @return
	 */
	String isClear(String baz003, String opId, String opName, Double je);

	List<Map<String, Object>> findKc62List(String strids) throws ParseException;

}

