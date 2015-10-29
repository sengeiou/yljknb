package com.wondersgroup.local.k4.f10402001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;
import com.wondersgroup.local.k4.f10402001.vs.F10402001VS;

public final class UpdateModelManageAae100Action extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10402001VS f10402001VS;
	
	@Override
	protected String operate() {
		
		ModelManageVO model = new ModelManageVO();
		
		model.setAaz320(Long.valueOf(getServletRequest().getParameter("aaz320")));
		
		model.setAae100(getServletRequest().getParameter("aae100"));
		
		f10402001VS.updateModelManageAae100(model);
		
		return SUCCESS;
	}
	
	
	public F10402001VS getF10402001VS() {
		return f10402001VS;
	}

	public void setF10402001VS(F10402001VS f10402001vs) {
		f10402001VS = f10402001vs;
	}

}
