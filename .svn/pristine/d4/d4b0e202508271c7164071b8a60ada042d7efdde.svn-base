package com.wondersgroup.local.k5.f10504001.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10504001.vs.F10504001VS;
import com.wondersgroup.local.k5.f10504003.vo.QueryNumberVO;

public class QueryNumberAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	private F10504001VS f10504001VS;

	public F10504001VS getF10504001VS() {
		return f10504001VS;
	}

	public void setF10504001VS(F10504001VS f10504001vs) {
		f10504001VS = f10504001vs;
	}

	@Override
	protected String operate() {
		String akb020orakb021 = this.getServletRequest().getParameter(
				"akb020orakb021");
		String baz101 = this.getServletRequest().getParameter("baz101");
		List<QueryNumberVO> result = this.getF10504001VS().queryNumber(
				akb020orakb021, baz101);
		String text = prefix + VOUtils.getJsonDataFromCollection(result)
				+ suffex;
		return text;
	}

}
