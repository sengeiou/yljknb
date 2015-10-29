package com.wondersgroup.local.k5.f10502003.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10502003.vs.F10502003VS;

public class SaveKf65MessageAction extends BaseAjaxAction{
			private static final long serialVersionUID = 1L;
			private static final String prefix = "{\"success\":true,\"result\":[";

			private static final String suffex = "]}";
			
			private F10502003VS f10502003VS;


		


			protected String operate() {
			String submitData=this.getServletRequest().getParameter("submitData");
			
			F10502003VO resultVO=new F10502003VO();
			
			resultVO=(F10502003VO) VOUtils.getBeanFromJsonData(submitData, F10502003VO.class);
			
			resultVO=this.getF10502003VS().saveKf65Message(resultVO);
			
			String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
			
			return result;
			
			}





			public void setF10502003VS(F10502003VS f10502003VS) {
				this.f10502003VS = f10502003VS;
			}





			public F10502003VS getF10502003VS() {
				return f10502003VS;
			}
		}




