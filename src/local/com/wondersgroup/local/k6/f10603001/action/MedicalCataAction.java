package com.wondersgroup.local.k6.f10603001.action;

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
import com.wondersgroup.local.k6.f10603001.vo.F10603001VO;
import com.wondersgroup.local.k6.f10603001.vs.F10603001VS;


public class MedicalCataAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	private F10603001VO f10603001VO= new F10603001VO();
	private F10603001VS f10603001VS;

	public void setF10603001VO(F10603001VO f10603001VO) {
		this.f10603001VO = f10603001VO;
	}

	public F10603001VO getF10603001VO() {
		return f10603001VO;
	}

	public void setF10603001VS(F10603001VS f10603001VS) {
		this.f10603001VS = f10603001VS;
	}

	public F10603001VS getF10603001VS() {
		return f10603001VS;
	}
	public ValueObject getValueObject() {
		return this.getF10603001VO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String queryInvoice(){
		List<Map<String, Object>> result=this.getF10603001VS().queryInvoice(f10603001VO);
		String jsonData=VOUtils.getJsonDataFromCollection(result);
		HttpServletResponse response=ServletActionContext.getResponse();  
		response.setContentType("text/json;charset=utf-8");
		try {
			PrintWriter out = response.getWriter();
			out.println(jsonData);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String queryCharge(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;		
		resultVO=this.getF10603001VS().queryCharge(page,f10603001VO);
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	public String queryMedicalRank(){
		String jsonData = this.getF10603001VS().queryMedicalRank(f10603001VO);
		createJSonData(jsonData);
		return AJAX;
	}

}
