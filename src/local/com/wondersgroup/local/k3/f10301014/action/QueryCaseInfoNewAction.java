package com.wondersgroup.local.k3.f10301014.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301014.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301014.vs.F10301014VS;
import com.wondersgroup.wssip.util.StringTools;

//查询稽核案件信息
public class QueryCaseInfoNewAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private F10301014VS f10301014VS;
	
	private StateCheckVO stateCheckVO =  new StateCheckVO();

	public F10301014VS getF10301014VS() {
		return f10301014VS;
	}

	public void setF10301014VS(F10301014VS f10301014vs) {
		f10301014VS = f10301014vs;
	}

	public StateCheckVO getStateCheckVO() {
		return stateCheckVO;
	}

	public void setStateCheckVO(StateCheckVO stateCheckVO) {
		this.stateCheckVO = stateCheckVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getStateCheckVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301014VS().queryAuditCaseWithPage(page,stateCheckVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadAuditCaseDetailsByAaz318(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		if(StringTools.hasText(aaz318)){
			
			StateCheckVO resultVO = this.getF10301014VS().queryAuditCaseInfoById(aaz318);
			createJSonData(VOUtils.getJsonData(resultVO));
			
		}
		return AJAX;
	}
	
	

	
	
}
