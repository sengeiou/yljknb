package com.wondersgroup.local.k3.f10301020.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301020.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301020.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301020.vs.F10301020VS;

public class F10301020Action extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";
	private StateCheckVO stateCheckVO = new StateCheckVO();
	public F10301020VS f10301020vs;
	
	public StateCheckVO getStateCheckVO() {
		return stateCheckVO;
	}

	public void setStateCheckVO(StateCheckVO stateCheckVO) {
		this.stateCheckVO = stateCheckVO;
	}
	

	public F10301020VS getF10301020vs() {
		return f10301020vs;
	}

	public void setF10301020vs(F10301020VS f10301020vs) {
		this.f10301020vs = f10301020vs;
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
		List<QueryApprovalVo> resultVO = this.getF10301020vs().queryData(approvalVo);
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
		approvalVo = this.getF10301020vs().operateApproval(approvalVo);
		String jsonData = prefix + VOUtils.getJsonData(approvalVo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	public String jumpOut() {
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		this.getF10301020vs().jumpOut(aaz318);
		String result = prefix + suffex;
		
		createJSonData(result);
		
		return AJAX;
	}

}
