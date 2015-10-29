package com.wondersgroup.local.k6.f10604001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10604001.vo.FyYyTempVO;
import com.wondersgroup.local.k6.f10604001.vs.F10604001VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryFyYyTempAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10604001VS f10604001VS;
	
	private FyYyTempVO fyYyTempVO = new FyYyTempVO();

	public F10604001VS getF10604001VS() {
		return f10604001VS;
	}

	public void setF10604001VS(F10604001VS f10604001vs) {
		f10604001VS = f10604001vs;
	}

	public FyYyTempVO getFyYyTempVO() {
		return fyYyTempVO;
	}

	public void setFyYyTempVO(FyYyTempVO fyYyTempVO) {
		this.fyYyTempVO = fyYyTempVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getFyYyTempVO();
	}

	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String jb = this.getServletRequest().getParameter("jb");
		if(StringTools.hasText(jb)){
			fyYyTempVO.setJb(jb);
		}
		
		String lx = this.getServletRequest().getParameter("lx");
		if(StringTools.hasText(lx)){
			fyYyTempVO.setLx(lx);
		}
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10604001VS().queryFyYyTempWithPage(page, fyYyTempVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String queryFyYyTempScripInfo(){
		
		String jsonData = this.getF10604001VS().queryFyYyTempStrip(fyYyTempVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}
	
}
