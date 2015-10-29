package com.wondersgroup.local.k2.f10203002.action;


import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203002.vo.SuspectedVO;
import com.wondersgroup.local.k2.f10203002.vs.F10203002VS;
import com.wondersgroup.wssip.application.SessionConstants;

public class SusDocuDetailOperateAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";


	private F10203002VS f10203002VS;
	private SuspectedVO suspectedVO;


	public F10203002VS getF10203002VS() {
		return f10203002VS;
	}

	public void setF10203002VS(F10203002VS f10203002vs) {
		f10203002VS = f10203002vs;
	}
	
	
	public SuspectedVO getSuspectedVO() {
		return suspectedVO;
	}

	public void setSuspectedVO(SuspectedVO suspectedVO) {
		this.suspectedVO = suspectedVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getSuspectedVO();
	}

	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		suspectedVO = (SuspectedVO) VOUtils.getBeanFromJsonData(submitData, SuspectedVO.class);
		suspectedVO.setOrgname((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
		suspectedVO.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
		suspectedVO.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
		suspectedVO = this.getF10203002VS().susDocuDetailOperate(suspectedVO);
		
		String jsonData = prefix + VOUtils.getJsonData(suspectedVO) + suffex;
		return jsonData;
	}
	public String suspectedDocumentDetailOperateSingle(){
		
		SuspectedVO suspectedVO = new SuspectedVO();
		
		suspectedVO.setBaz021(this.getServletRequest().getParameter("baz021"));
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		suspectedVO.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
		suspectedVO.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
		suspectedVO.setBaz021(groupName+"："+suspectedVO.getBaz021());//给编辑内容头上加登录人的组织结构名称
		suspectedVO.setBaz031(this.getServletRequest().getParameter("baz031"));
		suspectedVO.setBaz033(this.getServletRequest().getParameter("baz033"));
		suspectedVO.setBaz041(Double.valueOf(this.getServletRequest().getParameter("baz041")));
		suspectedVO.setIds(this.getServletRequest().getParameter("id"));
		
		suspectedVO = this.getF10203002VS().susDocuDetailOperate(suspectedVO);
		
		String jsonData = prefix + VOUtils.getJsonData(suspectedVO) + suffex;
			
		createJSonData(jsonData);
		return AJAX;
		
	}

}
