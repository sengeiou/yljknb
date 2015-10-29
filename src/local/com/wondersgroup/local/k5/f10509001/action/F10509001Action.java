package com.wondersgroup.local.k5.f10509001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10509001.vo.F10509001VO;
import com.wondersgroup.local.k5.f10509001.vo.Kc83VO;
import com.wondersgroup.local.k5.f10509001.vs.F10509001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.StringTools;

public class F10509001Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private F10509001VO f10509001VO = new F10509001VO();

	private F10509001VS f10509001VS;


	public F10509001VS getF10509001VS() {
		return f10509001VS;
	}

	public void setF10509001VS(F10509001VS f10509001vs) {
		f10509001VS = f10509001vs;
	}

	public F10509001VO getF10509001VO() {
		return f10509001VO;
	}

	public void setF10509001VO(F10509001VO f10509001vo) {
		f10509001VO = f10509001vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10509001VO();
	}

	/**
	 * 分页查询违规单据信息
	 * 
	 * @return
	 */
	public String queryMedDocument() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;
		String organcode = (String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_ORGANCODE);// 获取当前登录人的医院ids
		if (!StringTools.hasText(f10509001VO.getAkb020())) {
			f10509001VO.setAkb020(organcode);
		}
		resultVO = this.getF10509001VS().queryMedDocument(page, f10509001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}


	@Override
	protected String operate() {
		Kc83VO kc83vo=new Kc83VO();
		String ids=this.getServletRequest().getParameter("ids");
		String baz021=this.getServletRequest().getParameter("baz021");
		String baz031=this.getServletRequest().getParameter("baz031");
		String aka133=this.getServletRequest().getParameter("aka133");
		String fname=this.getServletRequest().getParameter("fname");
		String fpath=this.getServletRequest().getParameter("fpath");
		String filedataFileName=this.getServletRequest().getParameter("filedataFileName");
		kc83vo.setIds(ids);
		kc83vo.setIds(ids);
		kc83vo.setBaz021(baz021);
		kc83vo.setBaz031(baz031);
		kc83vo.setAka133(aka133);
		kc83vo.setRealpath(fpath);
		kc83vo.setTargetFileName(fname);
		kc83vo.setFiledataFileName(filedataFileName);
		kc83vo.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
		kc83vo.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
		kc83vo.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
		kc83vo = this.getF10509001VS().preCheckMedDocDetail(kc83vo);
		String result = prefix + VOUtils.getJsonData(kc83vo) + suffex;
		return result;
	}
}
