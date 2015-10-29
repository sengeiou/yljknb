package com.wondersgroup.local.k5.f10507001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10507001.vo.F10507001VO;
import com.wondersgroup.local.k5.f10507001.vs.F10507001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;

public class F10507001DetailAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private F10507001VO f10507001VO = new F10507001VO();

	private F10507001VS f10507001VS;

	public F10507001VO getF10507001VO() {
		return f10507001VO;
	}

	public void setF10507001VO(F10507001VO f10507001vo) {
		f10507001VO = f10507001vo;
	}

	public F10507001VS getF10507001VS() {
		return f10507001VS;
	}

	public void setF10507001VS(F10507001VS f10507001vs) {
		f10507001VS = f10507001vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10507001VO();
	}

	@Override
	protected String operate() {

		PreCheckVO returnVO = new PreCheckVO();
		String ids=this.getServletRequest().getParameter("ids");
		String baz021=this.getServletRequest().getParameter("baz021");
		String baz102 = this.getServletRequest().getParameter("baz102");
		String fname=this.getServletRequest().getParameter("fname");
		String fpath=this.getServletRequest().getParameter("fpath");
		String filedataFileName=this.getServletRequest().getParameter("filedataFileName");
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		baz021=(groupName+"："+baz021);//给编辑内容加登录人的组织结构名称
		returnVO.setIds(ids);
		returnVO.setBaz021(baz021);
		returnVO.setBaz102(baz102);
		returnVO.setRealpath(fpath);
		returnVO.setTargetFileName(fname);
		returnVO.setFiledataFileName(filedataFileName);
		returnVO = this.getF10507001VS().preCheckMedDocDetail(returnVO);

		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;

		return result;
	}

	public String preCheckSingle() {

		PreCheckVO returnVO = new PreCheckVO();
		returnVO.setBaz021(this.getServletRequest().getParameter("baz021"));
		returnVO.setBaz102(this.getServletRequest().getParameter("baz102"));
		returnVO.setIds(this.getServletRequest().getParameter("ids"));
		// System.out.println(returnVO.getIds());
		// System.out.println(returnVO.getBaz102());
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		returnVO.setBaz021(groupName+"："+returnVO.getBaz021());//给编辑内容加登录人的组织结构名称
		returnVO = this.getF10507001VS().preCheckMedDocDetail(returnVO);

		String jsonData = prefix + VOUtils.getJsonData(returnVO) + suffex;

		createJSonData(jsonData);
		return AJAX;

	}

	public String queryMedDocumentDetailIllegal() {

		F10507001VO resultVO = new F10507001VO();

		BeanTools.copyProperties(f10507001VO, resultVO);

		resultVO = this.getF10507001VS()
				.queryMedDocumentDetailIllegal(resultVO);

		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;

		createJSonData(result);

		return AJAX;

	}

}
