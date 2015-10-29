package com.wondersgroup.local.k5.f10502003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10502003.vs.F10502003VS;

public class QueryKf05MessageAction  extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10502003VS f10502003VS;
	
	public F10502003VS getF10502003VS() {
		return f10502003VS;
	}

	public void setF10502003VS(F10502003VS f10502003vs) {
		f10502003VS = f10502003vs;
	}

	private F10502003VO resultvo=new F10502003VO();
	
	
	public F10502003VO getResultvo() {
		return resultvo;
	}

	public void setResultvo(F10502003VO resultvo) {
		this.resultvo = resultvo;
	}

	public ValueObject getValueObject() {
		return this.getResultvo();
	}

	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10502003VS().queryKf05Message(page, resultvo);
		
		String result=VOUtils.getJsonData(resultVO);
		
		return result;
	}

}
