package com.wondersgroup.local.k4.f10402006.action;


import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;


import com.wondersgroup.local.k4.f10402006.vo.RuleTargetVO;
import com.wondersgroup.local.k4.f10402006.vs.F10402006VS;

public class AddRuleTargetAction extends BaseAjaxAction{
	

		private static final long serialVersionUID = 1L;
		private static final String prefix = "{\"success\":true,\"result\":[";

		private static final String suffex = "]}";
		
		private F10402006VS f10402006VS;

		public void setF10402006VS(F10402006VS f10402006VS) {
			this.f10402006VS = f10402006VS;
		}

		public F10402006VS getF10402006VS() {
			return f10402006VS;
		}
		
		
	protected String operate() {
		String submitData=this.getServletRequest().getParameter("submitData");
		
		RuleTargetVO resultVO=new RuleTargetVO();
		
		resultVO=(RuleTargetVO) VOUtils.getBeanFromJsonData(submitData, RuleTargetVO.class);
		
		resultVO=this.getF10402006VS().addRuleTaget(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
		
		}

	
 }


