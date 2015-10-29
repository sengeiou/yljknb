package com.wondersgroup.local.k5.f10502002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502002.vs.F10502002VS;

public class LoadUpdateMessageAction extends BaseAjaxAction{
		
	
	       private static final long serialVersionUID = 1L;
			private F10502002VS f10502002VS;
			private F10502002VO f10502002VO=new F10502002VO();
			
	
			public F10502002VS getF10502002VS() {
				return f10502002VS;
			}

			public void setF10502002VS(F10502002VS f10502002vs) {
				f10502002VS = f10502002vs;
			}

			public F10502002VO getF10502002VO() {
				return f10502002VO;
			}

			public void setF10502002VO(F10502002VO f10502002vo) {
				f10502002VO = f10502002vo;
			}

			@Override
			protected String operate() {

				String aaz307 = getServletRequest().getParameter("aaz307");
				
				F10502002VO resultVO = f10502002VS.findUpdateMessage(aaz307);
				
				return VOUtils.getJsonData(resultVO);

			}
			
			public String loadAddkf66Message(){
				
				f10502002VO.setAaz107("128900");
				
				f10502002VO=this.getF10502002VS().loadAddMessage(f10502002VO);
				
				String result = VOUtils.getJsonData(f10502002VO);
				
				createJSonData(result);
				
				return AJAX;
			}

		}



