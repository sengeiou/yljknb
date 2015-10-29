package com.wondersgroup.local.k2.f10204001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204001.vo.F10204001VO;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10204001.vs.F10204001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;

public class F10204001DetailAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private F10204001VO f10204001VO = new F10204001VO();

	private F10204001VS f10204001VS;

	public F10204001VO getF10204001VO() {
		return f10204001VO;
	}

	public void setF10204001VO(F10204001VO f10204001vo) {
		f10204001VO = f10204001vo;
	}

	public F10204001VS getF10204001VS() {
		return f10204001VS;
	}

	public void setF10204001VS(F10204001VS f10204001vs) {
		f10204001VS = f10204001vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10204001VO();
	}

	@Override
	protected String operate() {

		String submitData = this.getServletRequest().getParameter("submitData");

		PreCheckVO returnVO = (PreCheckVO) VOUtils.getBeanFromJsonData(
				submitData, PreCheckVO.class);
		returnVO.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
		returnVO.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
		returnVO.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
		returnVO = this.getF10204001VS().preCheckMedDocDetail(returnVO);
		
		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;

		return result;
	}

	public String preCheckSingle() {

		PreCheckVO returnVO = new PreCheckVO();
		returnVO.setBaz021(this.getServletRequest().getParameter("baz021"));
		returnVO.setBaz102(this.getServletRequest().getParameter("baz102"));
		returnVO.setIds(this.getServletRequest().getParameter("ids"));
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		returnVO.setBaz021(groupName+"："+returnVO.getBaz021());//给编辑内容加登录人的组织结构名称
		returnVO = this.getF10204001VS().preCheckMedDocDetail(returnVO);

		String jsonData = prefix + VOUtils.getJsonData(returnVO) + suffex;

		createJSonData(jsonData);
		return AJAX;

	}

	public String queryMedDocumentDetailIllegal() {

		F10204001VO resultVO = new F10204001VO();

		BeanTools.copyProperties(f10204001VO, resultVO);

		resultVO = this.getF10204001VS()
				.queryMedDocumentDetailIllegal(resultVO);

		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;

		createJSonData(result);

		return AJAX;

	}

}
