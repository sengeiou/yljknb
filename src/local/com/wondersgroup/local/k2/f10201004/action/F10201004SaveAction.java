package com.wondersgroup.local.k2.f10201004.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k2.f10201004.vo.F10201004CheckedVO;
import com.wondersgroup.local.k2.f10201004.vs.F10201004VS;

/**
 * 
 * @ClassName: F10201004SaveAction 
 * @Description: 审核复议功能中，所有的新增、修改操作的处理action
 * @author chenlin
 * @date 2014-7-18 上午10:32:26 
 *
 */
@SuppressWarnings("serial")
public class F10201004SaveAction extends BaseAjaxAction{
	
	private F10201004VS f10201004VS;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	
	/**
	 * 
	 * @Title: saveF10201004 
	 * @Description: 审核复议 审核操作
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-17 下午05:25:54
	 */
	public String saveF10201004(){
		
		String data = this.getServletRequest().getParameter("data");

		F10201004CheckedVO checkedVO = (F10201004CheckedVO) VOUtils.getBeanFromJsonData(data, F10201004CheckedVO.class);
		
		checkedVO = this.f10201004VS.saveF10201004(checkedVO);
		
		String jsonData = prefix + VOUtils.getJsonData(checkedVO)+suffex;

		this.createJSonData(jsonData);
		
		return AJAX;
	}



	public F10201004VS getF10201004VS() {
		return f10201004VS;
	}



	public void setF10201004VS(F10201004VS f10201004vs) {
		f10201004VS = f10201004vs;
	}

}
