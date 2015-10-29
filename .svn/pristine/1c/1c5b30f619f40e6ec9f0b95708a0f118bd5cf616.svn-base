package com.wondersgroup.local.k4.f10402007.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class DeleteDxzbMessageAction  extends BaseAjaxAction{
	
		private static final long serialVersionUID = 1L;

		private F10402007VS f10402007VS;

		protected String operate() {
			
			String idStr=this.getServletRequest().getParameter("idStr");
			
			this.f10402007VS.deleteDxzbRuleMessage(idStr);
			
			return SUCCESS;
						
		}

		public void setF10402007VS(F10402007VS f10402007VS) {
			this.f10402007VS = f10402007VS;
		}

		public F10402007VS getF10402007VS() {
			return f10402007VS;
		}
	
	}



