package com.wondersgroup.local.k6.f10604001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10604001.vo.FxVO;
import com.wondersgroup.local.k6.f10604001.vs.F10604001VS;

public class QueryFxTempAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10604001VS f10604001VS;
	
	private FxVO fxVO = new FxVO();

	public F10604001VS getF10604001VS() {
		return f10604001VS;
	}

	public void setF10604001VS(F10604001VS f10604001vs) {
		f10604001VS = f10604001vs;
	}

	public FxVO getFxVO() {
		return fxVO;
	}

	public void setFxVO(FxVO fxVO) {
		this.fxVO = fxVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getFxVO();
	}
	
	@Override
	protected String operate(){
		
		return null;
	}
	
	public String loadFxTempXbInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10604001VS().queryFxTempXbWithPage(page, fxVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadFxTempNldInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10604001VS().queryfxTempNldWithPage(page, fxVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String queryStripInfo(){
		
		String jsonData = this.getF10604001VS().queryStrip(fxVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}
}
