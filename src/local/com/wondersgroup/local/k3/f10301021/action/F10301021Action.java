package com.wondersgroup.local.k3.f10301021.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301021.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301021.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301021.vs.F10301021VS;

public class F10301021Action extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";
	private StateCheckVO stateCheckVO = new StateCheckVO();
	public F10301021VS f10301021vs;
	
	public StateCheckVO getStateCheckVO() {
		return stateCheckVO;
	}

	public void setStateCheckVO(StateCheckVO stateCheckVO) {
		this.stateCheckVO = stateCheckVO;
	}
	

	public F10301021VS getF10301021vs() {
		return f10301021vs;
	}

	public void setF10301021vs(F10301021VS f10301021vs) {
		this.f10301021vs = f10301021vs;
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
		List<QueryApprovalVo> resultVO = this.getF10301021vs().queryData(approvalVo);
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
		approvalVo = this.getF10301021vs().operateApproval(approvalVo);
		String jsonData = prefix + VOUtils.getJsonData(approvalVo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}

}
