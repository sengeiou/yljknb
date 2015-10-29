package com.wondersgroup.local.k3.f10301020.vs;

import java.util.List;

import com.wondersgroup.local.k3.f10301020.vo.QueryApprovalVo;

public interface F10301020VS {

	List<QueryApprovalVo> queryData(QueryApprovalVo approvalVo);

	QueryApprovalVo operateApproval(QueryApprovalVo approvalVo);

	void jumpOut(String aaz318);
	
}
