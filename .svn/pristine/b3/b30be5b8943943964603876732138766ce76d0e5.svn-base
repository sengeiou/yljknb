package com.wondersgroup.local.k2.f10204002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204002.vo.F10204002VO;
import com.wondersgroup.local.k2.f10204002.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10204002.vs.F10204002VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;

public class F10204002DetailAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private F10204002VO f10204002VO = new F10204002VO();

	private F10204002VS f10204002VS;

	public F10204002VO getF10204002VO() {
		return f10204002VO;
	}

	public void setF10204002VO(F10204002VO f10204002vo) {
		f10204002VO = f10204002vo;
	}

	public F10204002VS getF10204002VS() {
		return f10204002VS;
	}

	public void setF10204002VS(F10204002VS f10204002vs) {
		f10204002VS = f10204002vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10204002VO();
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
		returnVO.setIds(ids);
		returnVO.setBaz021(baz021);
		returnVO.setBaz102(baz102);
		returnVO.setRealpath(fpath);
		returnVO.setTargetFileName(fname);
		returnVO.setFiledataFileName(filedataFileName);
		returnVO.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
		returnVO.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
		returnVO.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
		returnVO = this.getF10204002VS().preCheckMedDocDetail(returnVO);

		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;

		return result;
	}

	/**
	 * 单据明细主动复议--单个
	 * 
	 * @return
	 */
	public String preCheckSingle() {

		PreCheckVO returnVO = new PreCheckVO();
		returnVO.setBaz021(this.getServletRequest().getParameter("baz021"));
		returnVO.setBaz102(this.getServletRequest().getParameter("baz102"));
		returnVO.setIds(this.getServletRequest().getParameter("ids"));
		// System.out.println(returnVO.getIds());
		// System.out.println(returnVO.getBaz102());
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		returnVO.setBaz021(groupName+"："+returnVO.getBaz021());//给编辑内容加登录人的组织结构名称
		//returnVO = this.getF10204002VS().preCheckMedDocDetail(returnVO);

		String jsonData = prefix + VOUtils.getJsonData(returnVO) + suffex;

		createJSonData(jsonData);
		return AJAX;

	}

	/**
	 * 查询单据明细违规信息
	 * 
	 * @return
	 */
	public String queryMedDocumentDetailIllegal() {

		F10204002VO resultVO = new F10204002VO();

		BeanTools.copyProperties(f10204002VO, resultVO);
		resultVO = this.getF10204002VS()
				.queryMedDocumentDetailIllegal(resultVO);

		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;

		createJSonData(result);

		return AJAX;

	}

}
