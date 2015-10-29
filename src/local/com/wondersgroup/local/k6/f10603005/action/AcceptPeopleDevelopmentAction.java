package com.wondersgroup.local.k6.f10603005.action;



import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10603005.vo.AcceptPeopleVO;
import com.wondersgroup.local.k6.f10603005.vs.F10603005VS;

public class AcceptPeopleDevelopmentAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	private F10603005VS f10603005VS;
	private AcceptPeopleVO acceptPeopleVO = new AcceptPeopleVO();

	public F10603005VS getF10603005VS() {
		return f10603005VS;
	}

	public void setF10603005VS(F10603005VS f10603005vs) {
		f10603005VS = f10603005vs;
	}

	public AcceptPeopleVO getAcceptPeopleVO() {
		return acceptPeopleVO;
	}

	public void setAcceptPeopleVO(AcceptPeopleVO acceptPeopleVO) {
		this.acceptPeopleVO = acceptPeopleVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getAcceptPeopleVO();
	}


	public String viewTrend() {

		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String analid = this.getServletRequest().getParameter("analid");
		
		acceptPeopleVO = (AcceptPeopleVO)VOUtils.getBeanFromJsonData(submitData, AcceptPeopleVO.class);
		
		acceptPeopleVO.setAnalid(analid);

		resultVO = this.getF10603005VS().queryYLJGJZRCFZQSWithPage(page,acceptPeopleVO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}

	public String queryMoveAverage() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AcceptPeopleVO acceptPeopleVO = new AcceptPeopleVO();
		
		acceptPeopleVO = (AcceptPeopleVO)VOUtils.getBeanFromJsonData(submitData, AcceptPeopleVO.class);
		
		String jsonData = this.getF10603005VS().queryStrip(acceptPeopleVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}

}
