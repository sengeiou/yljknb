package com.wondersgroup.local.k4.f10401002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;

public class LoadDispatchManageAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10401002VS f10401002VS;
	
	private DispatchManageVO dispatchVO=new DispatchManageVO();
	
	
	public F10401002VS getF10401002VS() {
		return f10401002VS;
	}


	public void setF10401002VS(F10401002VS f10401002vs) {
		f10401002VS = f10401002vs;
	}


	public DispatchManageVO getDispatchVO() {
		return dispatchVO;
	}


	public void setDispatchVO(DispatchManageVO dispatchVO) {
		this.dispatchVO = dispatchVO;
	}


	protected String operate() {
		String id=getServletRequest().getParameter("aaz325");
		
		DispatchManageVO resultVO=f10401002VS.findById(id);
		//System.out.println(resultVO+"fffffffffffffffffffffffffff");
		return VOUtils.getJsonData(resultVO);
	}

}
