package com.wondersgroup.local.k6.f10601002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10601002.vo.F10601002VO;
import com.wondersgroup.local.k6.f10601002.vs.F10601002VS;

public class SeeDoctTrendAction extends BaseAjaxAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private F10601002VO f10601002VO=new F10601002VO();
	
	private F10601002VS f10601002VS;
	
	public void setF10601002VO(F10601002VO f10601002VO) {
		this.f10601002VO = f10601002VO;
	}

	public F10601002VO getF10601002VO() {
		return f10601002VO;
	}

	public void setF10601002VS(F10601002VS f10601002VS) {
		this.f10601002VS = f10601002VS;
	}

	public F10601002VS getF10601002VS() {
		return f10601002VS;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10601002VO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
	
	public String querySeeDoctTrend() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10601002VS().querySeeDoctTrendWithPage(page,f10601002VO);
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	public String queryMoveAverageInfo(){
		String jsonData=this.getF10601002VS().queryMoveAverage(f10601002VO);
		createJSonData(jsonData);
		return AJAX;
	}
}
