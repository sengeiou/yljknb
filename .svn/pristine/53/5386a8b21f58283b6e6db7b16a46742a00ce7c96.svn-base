package com.wondersgroup.local.k3.f10301011.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301011.vs.F10301011VS;
import com.wondersgroup.local.k3.f10301011.vo.StateCheckVO;
import com.wondersgroup.wssip.util.StringTools;

public class QueryCaseInfoAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	private StateCheckVO stateCheckVO = new StateCheckVO();

	private F10301011VS f10301011VS;
	
	public F10301011VS getF10301011VS() {
		return f10301011VS;
	}
	public void setF10301011VS(F10301011VS f10301011vs) {
		f10301011VS = f10301011vs;
	}
	public StateCheckVO getStateCheckVO() {
		return stateCheckVO;
	}
	public void setStateCheckVO(StateCheckVO stateCheckVO) {
		this.stateCheckVO = stateCheckVO;
	}
	
	
	@Override
	public ValueObject getValueObject(){
		return this.getStateCheckVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301011VS().queryAuditCaseWithPage(page, stateCheckVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadAuditCaseInfoByAbz001(){
		
		String abz001 = this.getServletRequest().getParameter("abz001");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(abz001)){
			
			stateCheckVO.setAbz001(abz001);//设置案件编号
			
			resultVO = this.getF10301011VS().queryAuditCaseWithPageInfo(page, stateCheckVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
		
	}
	


}
