package com.wondersgroup.local.k3.f10301011.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301011.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301011.vs.F10301011VS;

public class StateCheckAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private StateCheckVO stateCheckVO = new StateCheckVO();
	

	public StateCheckVO getStateCheckVO() {
		return stateCheckVO;
	}

	public void setStateCheckVO(StateCheckVO stateCheckVO) {
		this.stateCheckVO = stateCheckVO;
	}

	public F10301011VS f10301011VS;

	
	public F10301011VS getF10301011VS() {
		return f10301011VS;
	}

	public void setF10301011VS(F10301011VS f10301011vs) {
		f10301011VS = f10301011vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getStateCheckVO();
	}
	
	@Override
	protected String operate() {
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		aaz318 = (aaz318 == null || "".equals(aaz318)) ? "0" : aaz318;
		QueryApprovalVo approvalVo = new QueryApprovalVo();
		approvalVo.setAaz318(Long.valueOf(aaz318));
		List<QueryApprovalVo> resultVO = this.getF10301011VS().queryData(
				approvalVo);
		return VOUtils.getJsonDataFromCollection(resultVO);
	}
	
	public String operateCaseInfo(){
		
		
		String data = this.getServletRequest().getParameter("submitData");
		
		AuditConclusionVO stateCheckVO = (AuditConclusionVO) VOUtils.getBeanFromJsonData(data, AuditConclusionVO.class);
		
		stateCheckVO = this.getF10301011VS().StateCheck(stateCheckVO);
		
		String jsonData = prefix + VOUtils.getJsonData(stateCheckVO) + suffex;
			
		createJSonData(jsonData);
		
		return AJAX;
		
	}
	
	
	/**
	 * 多重审批信息保存
	 * 
	 * @return
	 */
	public String operateApproval() {
		String data = this.getServletRequest().getParameter("submitData");
		QueryApprovalVo approvalVo = (QueryApprovalVo) VOUtils
				.getBeanFromJsonData(data, QueryApprovalVo.class);
		approvalVo = this.getF10301011VS().operateApproval(approvalVo);
		String jsonData = prefix + VOUtils.getJsonData(approvalVo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
}
