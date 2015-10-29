package com.wondersgroup.local.k4.f10402006.action;

import java.util.Map;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402006.vo.RuleTargetVO;
import com.wondersgroup.local.k4.f10402006.vs.F10402006VS;

public class QueryRuleTargetAction extends BaseAjaxAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private F10402006VS f10402006VS;
	private RuleTargetVO ruleTargetVO = new RuleTargetVO();

	public void setF10402006VS(F10402006VS f10402006VS) {
		this.f10402006VS = f10402006VS;
	}

	public F10402006VS getF10402006VS() {
		return f10402006VS;
	}

	public void setRuleTargetVO(RuleTargetVO ruleTargetVO) {
		this.ruleTargetVO = ruleTargetVO;
	}

	public RuleTargetVO getRuleTargetVO() {
		return ruleTargetVO;
	}

	protected String operate() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		String gzdm = this.getServletRequest().getParameter("gzdm");

		ruleTargetVO.setGzdm(gzdm);
		
		String zbmc = this.getServletRequest().getParameter("zbmc");

		ruleTargetVO.setZbmc(zbmc);

		String zt = this.getServletRequest().getParameter("zt");

		ruleTargetVO.setZt(zt);

		String mc = this.getServletRequest().getParameter("mc");

		ruleTargetVO.setMc(mc);

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10402006VS().queryRuleTarget(page, ruleTargetVO);

		String result = VOUtils.getJsonData(resultVO);
		return result;
	}

}
