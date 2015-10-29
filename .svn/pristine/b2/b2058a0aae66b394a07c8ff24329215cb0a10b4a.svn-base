package com.wondersgroup.local.k6.f10604001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10604001.vo.FyZVO;
import com.wondersgroup.local.k6.f10604001.vs.F10604001VS;

public class QueryFyZTempAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private FyZVO fyZVO = new FyZVO();
	
	private F10604001VS f10604001VS;

	public FyZVO getFyZVO() {
		return fyZVO;
	}

	public void setFyZVO(FyZVO fyZVO) {
		this.fyZVO = fyZVO;
	}
	
	public F10604001VS getF10604001VS() {
		return f10604001VS;
	}

	public void setF10604001VS(F10604001VS f10604001vs) {
		f10604001VS = f10604001vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getFyZVO();
	}
	
	@Override
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10604001VS().queryFyzbZTempWithPage(page, fyZVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
}
