package com.wondersgroup.local.k3.f10301010.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301010.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301010.vo.QueryRegisterVO;
import com.wondersgroup.local.k3.f10301010.vo.StateCheckVO;

public interface F10301010VS {

	/** 
	 * 分页查询案件信息数据
	 * @param page
	 * @param queryRecheck
	 * @return
	 */
	Map<String, Object> queryRecheck(Page page, QueryRecheckVO queryRecheckVO);

	/**
	 * 分页查询案件内容数据
	 * @param page
	 * @param queryRegister
	 * @return
	 */
	Map<String, Object> queryRegister(Page page, QueryRegisterVO queryRegisterVO);
	
	/**
	 * 修改案件信息审案状态
	 * @param page
	 * @param StateCheck
	 * @return
	 */
	StateCheckVO StateCheck(StateCheckVO stateCheckVO);
	
	
	
	/**
	 * 查询审批信息
	 * @param approvalVo
	 * @return
	 */
	List<QueryApprovalVo> queryData(QueryApprovalVo approvalVo);
	
	
	/**
	 * 多重审批信息保存
	 * @param approvalVo
	 * @return
	 */
	QueryApprovalVo operateApproval(QueryApprovalVo approvalVo);
	
	
	/**
	 * 结束流程
	 * @param af53dto
	 * @return
	 */
	Af53DTO endProcess(Af53DTO af53dto);

}
