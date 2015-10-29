package com.wondersgroup.local.k3.f10301011.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301011.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301011.vo.QueryRegisterVO;
import com.wondersgroup.local.k3.f10301011.vo.StateCheckVO;

public interface F10301011VS {
	
	/** 
	 * 查询结论待审批的案件
	 * @param page
	 * @param stateCheckVO
	 * @return
	 */
	public Map<String, Object> queryAuditCaseWithPage(Page page ,StateCheckVO stateCheckVO);
	
	/**
	 * 根据传入对象查询医稽核案件信息
	 * @param page
	 * @param stateCheckVO
	 * @return
	 */
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page,StateCheckVO stateCheckVO);

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
	AuditConclusionVO StateCheck(AuditConclusionVO stateCheckVO);
	
	
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

	public Map<String, Object> queryBeAuditInfo(Page page,
			AuditConclusionVO auditConclusionVO);

}
