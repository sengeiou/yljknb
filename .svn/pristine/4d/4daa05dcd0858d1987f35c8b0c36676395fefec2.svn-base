package com.wondersgroup.local.k6.f10603007.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10603007.vo.F10603007VO;
import com.wondersgroup.local.k6.f10603007.vs.F10603007VS;
import com.wondersgroup.wssip.util.StringTools;

public class MediPartFeeTrendAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private F10603007VS f10603007VS;

	public F10603007VS getF10603007VS() {
		return f10603007VS;
	}

	public void setF10603007VS(F10603007VS f10603007vs) {
		f10603007VS = f10603007vs;
	}

	@Override
	protected String operate() {
		return super.operate();
	}

	public String buildData() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		F10603007VO f10603007VO = new F10603007VO();
		
		f10603007VO = (F10603007VO) VOUtils.getBeanFromJsonData(submitData,F10603007VO.class);
		
		f10603007VO = this.getF10603007VS().buildDate(f10603007VO);
		
		createJSonData(VOUtils.getJsonData(f10603007VO));
		
		return AJAX;
	}

	public String viewTrend() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String analid = this.getServletRequest().getParameter("analid");
		
		F10603007VO f10603007VO = new F10603007VO();
		
		f10603007VO = (F10603007VO) VOUtils.getBeanFromJsonData(submitData,F10603007VO.class);
		
		if(StringTools.hasText(analid)){
			f10603007VO.setAnalid(analid);
		}

		resultVO = this.getF10603007VS().queryYLJGFXTYFZQSWithPage(page,f10603007VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;
	}

	public String queryMoveAverage() {
		
		String analid = this.getServletRequest().getParameter("submitData");
		
		F10603007VO f10603007VO = new F10603007VO();
		
		f10603007VO.setAnalid(analid);
		
		f10603007VO = this.getF10603007VS().queryMoveAverage(f10603007VO);
		
		String result="{\"xAxisCategories\":"+f10603007VO.getxAxisCategories()+",\"column\":"+
				f10603007VO.getColumn()+",\"line\":"+f10603007VO.getLine()+"}";
		
		createJSonData(result);
		
		return AJAX;
	}

}
