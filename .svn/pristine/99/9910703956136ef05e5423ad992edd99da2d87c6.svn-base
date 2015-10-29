package com.wondersgroup.local.k3.f10301008.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301008.vo.QueryDetailsVO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;

public class QueryDetailsAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301008VS f10301008VS;

	public F10301008VS getF10301008VS() {
		return f10301008VS;
	}

	public void setF10301008VS(F10301008VS f10301008vs) {
		f10301008VS = f10301008vs;
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String queryAf38ByAaz077() {
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		QueryDetailsVO queryDetailsVO = null;
		
		queryDetailsVO = this.getF10301008VS().queryDetailsByAaz077(aaz077);
		
		String resultVO = VOUtils.getJsonData(queryDetailsVO);
		
		createJSonData(resultVO);
		
		return AJAX;
	}
}
