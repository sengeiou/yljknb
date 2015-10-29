package com.wondersgroup.local.k6.f10603006.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10603006.vo.MediFeeTendVO;
import com.wondersgroup.local.k6.f10603006.vs.F10603006VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryMediFeeTrendAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10603006VS f10603006VS;

	public F10603006VS getF10603006VS() {
		return f10603006VS;
	}

	public void setF10603006VS(F10603006VS f10603006vs) {
		f10603006VS = f10603006vs;
	}
	
	@Override
	protected String operate(){
		
		return super.operate();
	}
	
	public String loadExpenMoveAverageInfo(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		MediFeeTendVO resultVO = new MediFeeTendVO();
		
		resultVO = (MediFeeTendVO)VOUtils.getBeanFromJsonData(submitData,MediFeeTendVO.class);
		
		String jsonData = this.getF10603006VS().queryStrip(resultVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}
	
	public String loadDevelopTendInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String analid = this.getServletRequest().getParameter("analid");
		
		MediFeeTendVO mediFeeTendVO = new MediFeeTendVO();
		
		mediFeeTendVO = (MediFeeTendVO)VOUtils.getBeanFromJsonData(submitData,MediFeeTendVO.class);
		
		if(StringTools.hasText(analid)){
			mediFeeTendVO.setAnalid(analid);
		}
		
		resultVO = this.getF10603006VS().queryMediFeeTrendWithPage(page, mediFeeTendVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	
}
