package com.wondersgroup.local.k2.f10202002.action;

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
import com.wondersgroup.local.k2.f10202002.vo.F10202002VO;
import com.wondersgroup.local.k2.f10202002.vs.F10202002VS;

public class AuditResultsQueryAction  extends BaseAjaxAction{

	private static final long serialVersionUID = -4890515607138845027L;
	
	private F10202002VS f10202002VS;

	private F10202002VO f10202002VO=new F10202002VO();
	
	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";
	
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public void getF10202002Chart(){
		List<Map<String,Object>> result = this.getF10202002VS().getF10202002Chart(f10202002VO);
		double sum=0;
		for (int i = 0; i < result.size(); i++) {
			Map<String,Object> map=result.get(i);
			double y=Double.valueOf(map.get("y").toString());
			sum=sum+y;
		}
		String jsonData = VOUtils.getJsonDataFromCollection(result);
		jsonData="{\"zs\":"+sum+",\"datas\":"+jsonData+"}";
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
	
	public String queryF10202002Rules(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		String jsonData = VOUtils.getJsonData(this.getF10202002VS().queryF10202002Rules(page, f10202002VO));
		this.createJSonData(jsonData);
		return AJAX;
	}
	
	public String queryF10202002Detail(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10202002VS().queryF10202002Detail(page,f10202002VO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	 public String queryKc62ByBaz001(){
			
			List<F10202002VO> jsonData = this.getF10202002VS().queryKc62ByBaz001(f10202002VO);
			
			String data = VOUtils.getJsonDataFromCollection(jsonData);
			
			String result = prefix + data + suffex;
			
			createJSonData(result);
			
			return AJAX;
	
	 }
	public F10202002VS getF10202002VS() {
		return f10202002VS;
	}

	public void setF10202002VS(F10202002VS f10202002vs) {
		f10202002VS = f10202002vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getF10202002VO();
	}

	public F10202002VO getF10202002VO() {
		return f10202002VO;
	}

	public void setF10202002VO(F10202002VO f10202002vo) {
		f10202002VO = f10202002vo;
	}


}
