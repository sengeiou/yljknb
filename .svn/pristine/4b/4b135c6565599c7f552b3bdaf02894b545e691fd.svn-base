package com.wondersgroup.local.k6.f10605001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10605001.vo.MediFeeTendVO;
import com.wondersgroup.local.k6.f10605001.vs.F10605001VS;

public class F10605001Action extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10605001VS f10605001VS;

	public F10605001VS getF10605001VS() {
		return f10605001VS;
	}

	public void setF10605001VS(F10605001VS f10605001vs) {
		f10605001VS = f10605001vs;
	}
	
	@Override
	protected String operate(){
		
		return super.operate();
	}
	
	public String loadExpenMoveAverageInfo(){
		
		/*String submitData = this.getServletRequest().getParameter("submitData");
		
		MediFeeTendVO resultVO = new MediFeeTendVO();
		
		resultVO = (MediFeeTendVO)VOUtils.getBeanFromJsonData(submitData,MediFeeTendVO.class);
		
		String jsonData = this.getF10605001VS().queryStrip(resultVO);
		
		createJSonData(jsonData);*/
		
		return AJAX;
	}
	
	public String loadDevelopTendInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		
		MediFeeTendVO mediFeeTendVO = new MediFeeTendVO();
		
		mediFeeTendVO = (MediFeeTendVO)VOUtils.getBeanFromJsonData(submitData,MediFeeTendVO.class);
		
		resultVO = this.getF10605001VS().queryMediFeeTrendWithPage(page, mediFeeTendVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	
}
