package com.wondersgroup.local.k5.f10506001.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10506001.vo.F10506001VO;
import com.wondersgroup.local.k5.f10506001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10506001.vs.F10506001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10506001QueryAction extends BaseAjaxAction {
	private static final long serialVersionUID = 128823407405275004L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private F10506001VO f10506001VO = new F10506001VO();

	private F10506001VS f10506001VS;

	public F10506001VO getF10506001VO() {
		return f10506001VO;
	}

	public void setF10506001VO(F10506001VO f10506001vo) {
		f10506001VO = f10506001vo;
	}

	public F10506001VS getF10506001VS() {
		return f10506001VS;
	}

	public void setF10506001VS(F10506001VS f10506001vs) {
		f10506001VS = f10506001vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10506001VO();
	}

	@Override
	protected String operate() {
		return super.operate();
	}

	/**
	 * 
	 * @methodName: queryViolationsDocuments
	 * @Description:分页查询违规单据统计信息（kc63）
	 * @return String
	 * @author 张磊
	 * @date 2015-1-5 下午01:34:27
	 */
	public String queryViolationsDocuments() {
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;
		String organcode=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANCODE);//获取当前登录人的医院ids
		if (!StringTools.hasText(f10506001VO.getAkb020())) {
			f10506001VO.setAkb020(organcode);
		}
		resultVO = this.getF10506001VS().queryViolationsDocumentsCount(page,
				f10506001VO);

		createJSonData(VOUtils.getJsonData(resultVO));
		return AJAX;
	}

	/**
	 * 
	 * @methodName: queryViolationsDocumentsDetail
	 * @Description:分页查询违规单据明细统计信息(kc62)
	 * @return String
	 * @author 张磊
	 * @date 2015-1-5 下午02:05:30
	 */
	public String queryViolationsDocumentsDetail() {
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10506001VS().queryViolationsDocumentsDetail(page,
				f10506001VO);

		createJSonData(VOUtils.getJsonData(resultVO));
		return AJAX;
	}

	/**
	 * 
	 * @methodName: queryViolationsDocumentsDetailIllegal
	 * @Description:查询单据明细违规信息
	 * @return String
	 * @author 张磊
	 * @date 2015-1-5 下午02:49:55
	 */
	public String queryViolationsDocumentsDetailIllegal() {
		F10506001VO resultVO = new F10506001VO();

		BeanTools.copyProperties(f10506001VO, resultVO);

		resultVO = this.getF10506001VS().queryViolationsDocumentsDetailIllegal(
				resultVO);

		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;

		createJSonData(result);

		return AJAX;
	}

	/**
	 * 
	 * @methodName: queryCheckRecord
	 * @Description:查询单据明细审核信息
	 * @return String
	 * @author 张磊
	 * @date 2015-1-5 下午03:05:27
	 */
	public String queryCheckRecord() {
		String baz003 = this.getServletRequest().getParameter("baz003");

		List<PreCheckVO> returnVO = this.getF10506001VS()
				.queryCheckRecordByBaz003(baz003);

		String result = "{\"success\":true,\"result\":"
				+ VOUtils.getJsonDataFromCollection(returnVO) + "}";

		createJSonData(result);

		return AJAX;
	}

	/**
	 * 
	 * @methodName: queryViolationsDocumentIllegal
	 * @Description:查询违规单据违规信息
	 * @return String
	 * @author 张磊
	 * @date 2015-1-5 下午03:49:24
	 */
	public String queryViolationsDocumentIllegal() {

		F10506001VO resultVO = new F10506001VO();

		BeanTools.copyProperties(f10506001VO, resultVO);

		resultVO = this.getF10506001VS().queryViolationsDocumentIllegal(
				resultVO);

		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;

		createJSonData(result);

		return AJAX;
	}

	/**
	 * 
	 * @methodName: sendToDoctor
	 * @Description:下发医师
	 * @return String
	 * @author 张磊
	 * @date 2015-1-8 上午09:28:31
	 */
	public String sendToDoctor() {

		String submitData = this.getServletRequest().getParameter("submitData");

		F10506001VO returnVO = (F10506001VO) VOUtils.getBeanFromJsonData(
				submitData, F10506001VO.class);

		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		returnVO.setBaz021(groupName+"："+returnVO.getBaz021());//给编辑内容加登录人的组织结构名称
		returnVO = this.f10506001VS.preCheckMedDocDetail(returnVO);
		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;
		createJSonData(result);
		return AJAX;
	}

	/**
	 * 
	 * @methodName: getGzfl
	 * @Description:获取规则类别
	 * @return String
	 * @author 张磊
	 * @date 2015-1-8 上午10:21:48
	 */
	public String getGzfl() {
		String json = this.f10506001VS.getGzlbJson();
		createJSonData(json);
		return AJAX;
	}

	/**
	 * 
	 * @methodName: getGzflxx
	 * @Description:获取规则名称
	 * @return String
	 * @author 张磊
	 * @date 2015-1-8 上午10:22:20
	 */
	public String getGzflxx() {
		String json = this.f10506001VS.getGzxxJson(getServletRequest()
				.getParameter("id"));
		createJSonData(json);
		return AJAX;
	}

	/**
	 * 复议处理--单个
	 * 
	 * @return
	 */
	public String preCheckSingle() {

		F10506001VO returnVO = new F10506001VO();
		returnVO.setBaz021(this.getServletRequest().getParameter("baz021"));
		returnVO.setBaz102(this.getServletRequest().getParameter("baz102"));
		returnVO.setKc62Ids(this.getServletRequest().getParameter("ids"));
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		returnVO.setBaz021(groupName+"："+returnVO.getBaz021());//给编辑内容加登录人的组织结构名称
		returnVO = this.getF10506001VS().preCheckMedDocDetail(returnVO);

		String jsonData = prefix + VOUtils.getJsonData(returnVO) + suffex;

		createJSonData(jsonData);
		return AJAX;

	}

	public String preCheckBatch() {

		F10506001VO returnVO = new F10506001VO();

		String kc62Ids = this.getServletRequest().getParameter("ids");
		String baz021 = this.getServletRequest().getParameter("baz021");
		String baz102 = this.getServletRequest().getParameter("baz102");
		String fname = this.getServletRequest().getParameter("fname");
		String fpath = this.getServletRequest().getParameter("fpath");
		String filedataFileName = this.getServletRequest().getParameter(
				"filedataFileName");
		returnVO.setKc62Ids(kc62Ids);
		returnVO.setBaz021(baz021);
		returnVO.setBaz102(baz102);
		returnVO.setRealpath(fpath);
		returnVO.setTargetFileName(fname);
		returnVO.setFiledataFileName(filedataFileName);
		returnVO.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
		returnVO.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
		returnVO.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
		returnVO = this.getF10506001VS().preCheckMedDocDetail(returnVO);

		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;

		createJSonData(result);
		return AJAX;
	}

}
