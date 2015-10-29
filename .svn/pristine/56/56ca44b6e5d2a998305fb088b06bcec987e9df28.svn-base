package com.wondersgroup.local.k3.f10301010.action;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301010.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301010.vs.F10301010VS;

public class StateCheckAction extends BaseAjaxAction {

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

	public F10301010VS f10301010VS;

	public F10301010VS getF10301010VS() {
		return f10301010VS;
	}

	public void setF10301010VS(F10301010VS f10301010vs) {
		f10301010VS = f10301010vs;
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
		List<QueryApprovalVo> resultVO = this.getF10301010VS().queryData(
				approvalVo);
		return VOUtils.getJsonDataFromCollection(resultVO);
	}

	public String operateCaseInfo() {

		String data = this.getServletRequest().getParameter("submitData");

		StateCheckVO stateCheckVO = (StateCheckVO) VOUtils.getBeanFromJsonData(
				data, StateCheckVO.class);

		stateCheckVO = this.getF10301010VS().StateCheck(stateCheckVO);

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
		approvalVo = this.getF10301010VS().operateApproval(approvalVo);
		String jsonData = prefix + VOUtils.getJsonData(approvalVo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	
	public String endProcess(){
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		aaz318 = (aaz318 == null || "".equals(aaz318)) ? "0" : aaz318;
		Af53DTO af53dto = new Af53DTO();
		af53dto.setAaz318(Long.valueOf(aaz318));
		af53dto.setAae426("2");
		af53dto = this.getF10301010VS().endProcess(af53dto);
		String jsonData = prefix + VOUtils.getJsonData(af53dto) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}

	public String queryData() {
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		aaz318 = (aaz318 == null || "".equals(aaz318)) ? "0" : aaz318;
		QueryApprovalVo approvalVo = new QueryApprovalVo();
		approvalVo.setAaz318(Long.valueOf(aaz318));
		List<QueryApprovalVo> resultVO = this.getF10301010VS().queryData(
				approvalVo);
		String jsonData = prefix + VOUtils.getJsonDataFromCollection(resultVO)
				+ suffex;
		createJSonData(jsonData);
		return AJAX;
	}
}
