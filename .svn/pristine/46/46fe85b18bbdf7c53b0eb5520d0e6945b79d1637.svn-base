package com.wondersgroup.local.k2.f10201001.action;

import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.ZnshTjDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k2.f10201001.vo.F10201001VO;
import com.wondersgroup.local.k2.f10201001.vs.F10201001VS;

@SuppressWarnings("serial")
public class F10201001QueryAction extends BaseAjaxAction {

	private F10201001VO f10201001VO = new F10201001VO();
	
	private F10201001VS f10201001VS;
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	/**
	 * 
	 * @Title: queryF10201001 
	 * @Description:     智能审核概况查看 统计查询 
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-18 下午04:28:50
	 */
	public String queryF10201001(){
		
		String baz020 = this.getServletRequest().getParameter("baz020");
		
		ZnshTjDTO dto = this.f10201001VS.queryZnshTj(baz020, false);
		
		String jsonData = prefix+VOUtils.getJsonData(dto)+suffex;
		
		this.createJSonData(jsonData);
		return AJAX;
	}
	
	public String queryF10201001WithYljg(){
		String baz020 = this.getServletRequest().getParameter("baz020");
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String ,Object> map = this.f10201001VS.queryZhshMxTjWithYljg(page, baz020, false, 0);
		
		String jsonData =VOUtils.getJsonData(map);
		
		this.createJSonData(jsonData);
		
		return AJAX;
	}
	
	public String queryF10201001WithGz(){
		String baz020 = this.getServletRequest().getParameter("baz020");
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String ,Object> map = this.f10201001VS.queryZhshMxTjWithGz(page, baz020, false, 0);
		
		String jsonData =VOUtils.getJsonData(map);
		this.createJSonData(jsonData);
		return AJAX;
	}

	public F10201001VO getF10201001VO() {
		return f10201001VO;
	}

	public void setF10201001VO(F10201001VO f10201001vo) {
		f10201001VO = f10201001vo;
	}

	public F10201001VS getF10201001VS() {
		return f10201001VS;
	}

	public void setF10201001VS(F10201001VS f10201001vs) {
		f10201001VS = f10201001vs;
	}



}
