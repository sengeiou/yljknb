package com.wondersgroup.local.k5.f10502003.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10502003.vs.F10502003VS;

public class DeleteKf05MessageAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 2983118890523373603L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10502003VS f10502003VS;
	
	@Override
	protected String operate() {
		F10502003VO resultVO=new F10502003VO();
		
		String aaz263=this.getServletRequest().getParameter("aaz263");
		
		resultVO.setAaz263(aaz263);
		
		resultVO=this.getF10502003VS().deleteKf05Message(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		createJSonData(result);
		
		return AJAX;
	}

	public F10502003VS getF10502003VS() {
		return f10502003VS;
	}

	public void setF10502003VS(F10502003VS f10502003vs) {
		f10502003VS = f10502003vs;
	}
}
