package com.wondersgroup.local.k4.f10402007.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class LoadRuleDxzbMessage extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
		private F10402007VS f10402007VS;
		

		private DxzbVO dxzbVO=new DxzbVO();

		public F10402007VS getF10402007VS() {
			return f10402007VS;
		}

		public void setF10402007VS(F10402007VS f10402007vs) {
			f10402007VS = f10402007vs;
		}

		public DxzbVO getDxzbVO() {
			return dxzbVO;
		}

		public void setDxzbVO(DxzbVO dxzbVO) {
			this.dxzbVO = dxzbVO;
		}




		@Override
		protected String operate() {

			String id = getServletRequest().getParameter("id");
			DxzbVO resultVO = f10402007VS.find(id);
			
			return VOUtils.getJsonData(resultVO);

		}

	}



