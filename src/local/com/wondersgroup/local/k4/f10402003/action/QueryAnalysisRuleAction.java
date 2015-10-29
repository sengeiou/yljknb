package com.wondersgroup.local.k4.f10402003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;
import com.wondersgroup.local.k4.f10402003.vs.F10402003VS;

public class QueryAnalysisRuleAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	private F10402003VS f10402003VS;
	
	private  AnalysisRuleVO analysisRuleVO=new AnalysisRuleVO();
	
	@Override
	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = f10402003VS.queryAnalysisRuleWithPage(page, analysisRuleVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	@Override
	public ValueObject getValueObject() {
		return getAnalysisRuleVO();
	}

	public F10402003VS getF10402003VS() {
		return f10402003VS;
	}

	public void setF10402003VS(F10402003VS f10402003vs) {
		f10402003VS = f10402003vs;
	}

	public AnalysisRuleVO getAnalysisRuleVO() {
		return analysisRuleVO;
	}

	public void setAnalysisRuleVO(AnalysisRuleVO analysisRuleVO) {
		this.analysisRuleVO = analysisRuleVO;
	}
}
