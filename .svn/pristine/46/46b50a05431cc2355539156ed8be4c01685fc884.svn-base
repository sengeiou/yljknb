package com.wondersgroup.local.k4.f10401002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;

public class QueryDispatchManageAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10401002VS f10401002VS;
	
	private DispatchManageVO dispatchVO=new DispatchManageVO();
	
	public DispatchManageVO getDispatchVO() {
		return dispatchVO;
	}

	public void setDispatchVO(DispatchManageVO dispatchVO) {
		this.dispatchVO = dispatchVO;
	}

	public F10401002VS getF10401002VS() {
		return f10401002VS;
	}

	public void setF10401002VS(F10401002VS f10401002vs) {
		f10401002VS = f10401002vs;
	}

	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		 
		resultVO=this.f10401002VS.queryDispatchManageWithPage(page, dispatchVO);
		
		String result=VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	@Override
	public ValueObject getValueObject() {
		
		return getDispatchVO();
	}

}
