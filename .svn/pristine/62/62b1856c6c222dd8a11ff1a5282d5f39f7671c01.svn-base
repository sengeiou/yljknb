package com.wondersgroup.local.k6.f10602002.action;

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
import com.wondersgroup.local.k6.f10602002.vo.F10602002VO;
import com.wondersgroup.local.k6.f10602002.vs.F10602002VS;

@SuppressWarnings("serial")
public class DoctCataAction extends BaseAjaxAction{
	private F10602002VO f10602002VO=new F10602002VO();
	private F10602002VS f10602002VS;
	public F10602002VS getF10602002VS() {
		return f10602002VS;
	}
	public void setF10602002VS(F10602002VS f10602002vs) {
		f10602002VS = f10602002vs;
	}
	public void setF10602002VO(F10602002VO f10602002VO) {
		this.f10602002VO = f10602002VO;
	}
	public F10602002VO getF10602002VO() {
		return f10602002VO;
	}
	@Override
	public ValueObject getValueObject() {
		return this.getF10602002VO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	public void queryInvoice(){
		List<Map<String, Object>> result=this.getF10602002VS().queryInvoice(f10602002VO);
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
	}
	public String queryCharge(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;		
		resultVO=this.getF10602002VS().queryCharge(page,f10602002VO);
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	public String queryDoctRank(){
		String jsonData = this.getF10602002VS().queryDoctRank(f10602002VO);
		createJSonData(jsonData);
		return AJAX;
	}
}
