package com.wondersgroup.local.k5.f10502003.action;


import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10502003.vs.F10502003VS;

public class LoadUpdateMessageAction extends BaseAjaxAction{
		
		
	       private static final long serialVersionUID = 1L;
			private F10502003VS f10502003VS;
			private F10502003VO f10502003VO=new F10502003VO();
			
			public F10502003VS getF10502003VS() {
				return f10502003VS;
			}

			public void setF10502003VS(F10502003VS f10502003vs) {
				f10502003VS = f10502003vs;
			}

			public F10502003VO getF10502003VO() {
				return f10502003VO;
			}



			public void setF10502003VO(F10502003VO f10502003vo) {
				f10502003VO = f10502003vo;
			}
			
			@Override
			protected String operate() {

                 String aaz263 = getServletRequest().getParameter("aaz263");
				
                 f10502003VO=this.getF10502003VS().find(aaz263);
				
				return VOUtils.getJsonData(f10502003VO);
}
			
			
		
}