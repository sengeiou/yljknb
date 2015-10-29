package com.wondersgroup.local.k2.f10201004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201004.vo.F10201004VO;
import com.wondersgroup.local.k2.f10201004.vs.F10201004VS;

/**
 * 
 * @ClassName: F10201004QueryAction 
 * @Description: 审核复议功能中，所有的查询操作的处理action
 * @author chenlin
 * @date 2014-7-18 上午10:33:23 
 *
 */
@SuppressWarnings("serial")
public class F10201004QueryAction extends BaseAjaxAction {

	private F10201004VS f10201004VS;
	private F10201004VO f10201004VO = new F10201004VO();
	public F10201004VS getF10201004VS() {
		return f10201004VS;
	}
	public void setF10201004VS(F10201004VS f10201004vs) {
		f10201004VS = f10201004vs;
	}
	public F10201004VO getF10201004VO() {
		return f10201004VO;
	}
	public void setF10201004VO(F10201004VO f10201004vo) {
		f10201004VO = f10201004vo;
	}
	@Override
	public ValueObject getValueObject() {
		return f10201004VO;
	}
	
	/**
	 * 
	 * @Title: queryF10201004
	 * @Description: 审核复议单据查询
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-17 下午03:59:34
	 */
	public String queryF10201004(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		
		resultVO = this.f10201004VS.queryF10201004(page, f10201004VO);
		this.createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	
	/**
	 * 
	 * @Title: queryF10201004Detail 
	 * @Description: 根据单据ID查询单据明细
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-17 下午04:43:41
	 */
	public String queryF10201004Detail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		
		resultVO = this.f10201004VS.queryF10201004Detail(page, f10201004VO);
		this.createJSonData(VOUtils.getJsonData(resultVO));
		return AJAX;
	}
	
}
