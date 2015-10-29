package com.wondersgroup.local.k4.f10402005.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10402005.vs.F10402005VS;


public class DeleteRuleMessageAction extends BaseAjaxAction{
	
		private static final long serialVersionUID = 1L;

		private F10402005VS f10402005VS;

		public F10402005VS getF10402005VS() {
			return f10402005VS;
		}

		public void setF10402005VS(F10402005VS f10402005vs) {
			f10402005VS = f10402005vs;
		}

		protected String operate() {
			
			String idStr=this.getServletRequest().getParameter("idStr");
			
			this.f10402005VS.deleteRuleMessage(idStr);
			
			return SUCCESS;
						
		}
	
	}



