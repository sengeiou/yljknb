package com.wondersgroup.local.k4.f10402006.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402006.vo.RuleTargetVO;
import com.wondersgroup.local.k4.f10402006.vs.F10402006VS;

public class QueryCaseNumberTargetAction extends BaseAjaxAction {

		private static final long serialVersionUID = 1L;
		
		private F10402006VS f10402006VS;
		
		private RuleTargetVO ruleTargetVO = new RuleTargetVO();

		
		public F10402006VS getF10402006VS() {
			return f10402006VS;
		}

		public void setF10402006VS(F10402006VS f10402006vs) {
			f10402006VS = f10402006vs;
		}

		public RuleTargetVO getRuleTargetVO() {
			return ruleTargetVO;
		}

		public void setRuleTargetVO(RuleTargetVO ruleTargetVO) {
			this.ruleTargetVO = ruleTargetVO;
		}
		protected String operate() {
			
			int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
			int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
			
			
		    String zbmc = this.getServletRequest().getParameter("zbmc");
			
		     ruleTargetVO.setZbmc(zbmc);
		  
		   String zt = this.getServletRequest().getParameter("zt");
			
		     ruleTargetVO.setZt(zt);

			Page page = new Page(start * limit + 1, limit, -1, limit, null);
			
			Map<String, Object> resultVO = null;

			resultVO = this.getF10402006VS().queryCaseWithPage(page,ruleTargetVO);
			
			String result = VOUtils.getJsonData(resultVO);
			
			return result;
		}

	}



