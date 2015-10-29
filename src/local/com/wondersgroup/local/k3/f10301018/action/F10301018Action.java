package com.wondersgroup.local.k3.f10301018.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301018.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301018.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301018.vs.F10301018VS;

public class F10301018Action extends BaseAjaxAction{

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

	private F10301018VS f10301018vs;

	public F10301018VS getf10301018vs() {
		return f10301018vs;
	}

	public void setf10301018vs(F10301018VS f10301018vs) {
		this.f10301018vs = f10301018vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		// TODO Auto-generated method stub
		return getStateCheckVO();
	}
	
	@Override
	protected String operate() {
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		aaz318 = (aaz318 == null || "" == aaz318) ? "0" : aaz318;
		
		List<QueryApprovalVo> resultVO = this.getf10301018vs().queryData(aaz318);
		
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
		approvalVo = this.getf10301018vs().operateApproval(approvalVo);
		String jsonData = prefix + VOUtils.getJsonData(approvalVo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
}

