package com.wondersgroup.local.k6.f10604001.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10604001.vo.FyVO;
import com.wondersgroup.local.k6.f10604001.vs.F10604001VS;

public class QueryFyzbAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10604001VS f10604001VS;
	
	private FyVO fyVO = new FyVO();

	public F10604001VS getF10604001VS() {
		return f10604001VS;
	}

	public void setF10604001VS(F10604001VS f10604001vs) {
		f10604001VS = f10604001vs;
	}

	public FyVO getFyVO() {
		return fyVO;
	}

	public void setFyVO(FyVO fyVO) {
		this.fyVO = fyVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getFyVO();
	}
	
	@Override
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10604001VS().queryFyzbWithPage(page, fyVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public void queryPie(){
		List<Map<String, Object>> result = this.getF10604001VS().queryPie(fyVO);
		String jsonData = VOUtils.getJsonDataFromCollection(result);
		HttpServletResponse response=ServletActionContext.getResponse();  
		response.setContentType("text/json;charset=utf-8");
		try {
			PrintWriter out = response.getWriter();
			out.println(jsonData);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
