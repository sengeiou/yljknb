package com.wondersgroup.local.k4.f10402005.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

import com.wondersgroup.local.k4.f10402005.vo.AddRuleVO;
import com.wondersgroup.local.k4.f10402005.vs.F10402005VS;

public class QueryRuleMessageAction  extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10402005VS f10402005VS;
	
	private AddRuleVO addRuleVO=new AddRuleVO();
	



	public ValueObject getValueObject() {
		return this.getAddRuleVO();
	}
	
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10402005VS().queryRuleMessage(page, addRuleVO);
		
		String result=VOUtils.getJsonData(resultVO);
		
		return result;
	}

	public void setF10402005VS(F10402005VS f10402005VS) {
		this.f10402005VS = f10402005VS;
	}

	public F10402005VS getF10402005VS() {
		return f10402005VS;
	}

	public void setAddRuleVO(AddRuleVO addRuleVO) {
		this.addRuleVO = addRuleVO;
	}

	public AddRuleVO getAddRuleVO() {
		return addRuleVO;
	}
	
	

}
