package com.wondersgroup.local.k6.f10603003.action;

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
import com.wondersgroup.local.k6.f10603003.vo.F10603003VO;
import com.wondersgroup.local.k6.f10603003.vs.F10603003VS;

@SuppressWarnings("serial")
public class MediPartFeePercAction extends BaseAjaxAction{
	private F10603003VS f10603003VS;
	private F10603003VO f10603003VO=new F10603003VO();
	public F10603003VS getF10603003VS() {
		return f10603003VS;
	}
	public void setF10603003VS(F10603003VS f10603003vs) {
		f10603003VS = f10603003vs;
	}
	public void setF10603003VO(F10603003VO f10603003VO) {
		this.f10603003VO = f10603003VO;
	}
	public F10603003VO getF10603003VO() {
		return f10603003VO;
	}
	@Override
	public ValueObject getValueObject() {
		return this.getF10603003VO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	/**
	 * 按条件查询医疗服务机构分项费用占比分析
	 */
	public void queryMediPartFee(){
		List<Map<String, Object>> result=this.getF10603003VS().queryMediPartFee(f10603003VO);
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
	/**
	 * 查看按疾病分类的明细
	 */
	public String queryDisease(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;		
		resultVO=this.getF10603003VS().queryDisease(page,f10603003VO);
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	/**
	 * 查看按医疗类别分类的明细
	 */
	public String queryMedical(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;		
		resultVO=this.getF10603003VS().queryMedical(page,f10603003VO);
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	/**
	 * 查看按身份类别分类的明细
	 */
	public String queryIdentify(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;		
		resultVO=this.getF10603003VS().queryIdentify(page,f10603003VO);
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
}
