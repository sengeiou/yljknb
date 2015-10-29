package com.wondersgroup.local.k3.f10301025.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301025.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301025.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301025.vs.F10301025VS;

public class F10301025Action extends BaseAjaxAction{

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

	private F10301025VS f10301025vs;

	public F10301025VS getF10301025vs() {
		return f10301025vs;
	}

	public void setF10301025vs(F10301025VS f10301025vs) {
		this.f10301025vs = f10301025vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return getStateCheckVO();
	}
	
	@Override
	protected String operate() {
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		aaz318 = (aaz318 == null || "" == aaz318) ? "0" : aaz318;
		
		List<QueryApprovalVo> resultVO = this.getF10301025vs().queryData(aaz318);
		
		return VOUtils.getJsonDataFromCollection(resultVO);
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
		approvalVo = this.getF10301025vs().operateApproval(approvalVo);
		String jsonData = prefix + VOUtils.getJsonData(approvalVo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	public String jumpOut() {
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		this.getF10301025vs().jumpOut(aaz318);
		String result = prefix + suffex;
		
		createJSonData(result);
		
		return AJAX;
	}

	
}
