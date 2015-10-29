package com.wondersgroup.local.k4.f10402005.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;

import com.wondersgroup.local.k4.f10402005.vo.AddRuleVO;
import com.wondersgroup.local.k4.f10402005.vs.F10402005VS;

public class LoadRuleMessageAction extends BaseAjaxAction{
	
		private F10402005VS f10402005VS;
		public F10402005VS getF10402005VS() {
			return f10402005VS;
		}

		public void setF10402005VS(F10402005VS f10402005vs) {
			f10402005VS = f10402005vs;
		}

		private AddRuleVO addRuleVo=new AddRuleVO();

		
		
	

		public AddRuleVO getAddRuleVo() {
			return addRuleVo;
		}

		public void setAddRuleVo(AddRuleVO addRuleVo) {
			this.addRuleVo = addRuleVo;
		}

		private static final long serialVersionUID = 1L;

		@Override
		protected String operate() {

			String id = getServletRequest().getParameter("id");
			AddRuleVO resultVO = f10402005VS.find(id);
			
			return VOUtils.getJsonData(resultVO);

		}

	}



