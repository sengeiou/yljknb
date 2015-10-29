package com.wondersgroup.local.k5.f10502002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502002.vs.F10502002VS;

public class UpdateKf66MessageAction extends BaseAjaxAction{
		 
		private static final long serialVersionUID = 1L;
		
		private static final String prefix = "{\"success\":true,\"result\":[";

		private static final String suffex = "]}";
		
		private F10502002VS f10502002VS;
		

		public F10502002VS getF10502002VS() {
			return f10502002VS;
		}

		public void setF10502002VS(F10502002VS f10502002vs) {
			f10502002VS = f10502002vs;
		}

		@Override
		protected String operate() {
			
			String submitData=this.getServletRequest().getParameter("submitData");
			
			F10502002VO resultVO=new F10502002VO();
			
			resultVO=(F10502002VO) VOUtils.getBeanFromJsonData(submitData, F10502002VO.class);
		
			resultVO=this.getF10502002VS().updateKf66Message(resultVO);
			
			String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
			
			return result;

	}
		
		
		public String deleteKf06Message(){
			
			F10502002VO resultVO=new F10502002VO();
			
			String aaz307=this.getServletRequest().getParameter("aaz307");
			
			resultVO.setAaz307(aaz307);
			
			resultVO=this.getF10502002VS().deleteKf06Message(resultVO);
			
			String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
			
			createJSonData(result);
			
			return AJAX;
		}
	}



