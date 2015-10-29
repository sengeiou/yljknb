package com.wondersgroup.local.k3.f10301021.vs;

import java.util.List;

import com.wondersgroup.local.k3.f10301021.vo.QueryApprovalVo;

public interface F10301021VS {

	List<QueryApprovalVo> queryData(QueryApprovalVo approvalVo);

	QueryApprovalVo operateApproval(QueryApprovalVo approvalVo);
	
}
