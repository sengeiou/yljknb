package com.wondersgroup.local.common.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.MedInstitutionVO;
import com.wondersgroup.local.common.vs.CommonVS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.StringTools;

public class QueryMedInstitutionAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private CommonVS commonVS;

	private MedInstitutionVO medInstitutionVO = new MedInstitutionVO();

	public CommonVS getCommonVS() {
		return commonVS;
	}

	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
	}

	public MedInstitutionVO getMedInstitutionVO() {
		return medInstitutionVO;
	}

	public void setMedInstitutionVO(MedInstitutionVO medInstitutionVO) {
		this.medInstitutionVO = medInstitutionVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getMedInstitutionVO();
	}

	@Override
	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getCommonVS().queryMedInstitutionObjWithPage(page,
				medInstitutionVO);

		String result = VOUtils.getJsonData(resultVO);

		return result;
	}

	public String queryHospital() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));
		String organcode = (String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_ORGANCODE);// 获取当前登录人的医院ids
		if (!StringTools.hasText(medInstitutionVO.getAkb020())) {
			medInstitutionVO.setAkb020(organcode);
		} else {
			boolean flag = false;
			String[] org = organcode.split(",");
			String akb020 = medInstitutionVO.getAkb020();
			for (int i = 0; i < 16 - medInstitutionVO.getAkb020().length(); i++) {
				akb020 = akb020 + " ";
			}
			akb020 = "'" + akb020 + "'";
			for (int i = 0; i < org.length; i++) {
				if (akb020.equals(org[i])) {
					flag = true;
				}
			}
			if (flag) {
				medInstitutionVO.setAkb020(akb020);
			} else {
				medInstitutionVO.setAkb020("'000000'");
			}
		}
		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		String result = null;

		resultVO = this.getCommonVS().queryHospitalWithPage(page,
				medInstitutionVO);

		result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}
	public String queryHospitalDBZ() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));
		String organcode = (String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_ORGANCODE);// 获取当前登录人的医院ids
		if (!StringTools.hasText(medInstitutionVO.getAkb020())) {
			medInstitutionVO.setAkb020(organcode);
		} else {
			boolean flag = false;
			String[] org = organcode.split(",");
			String akb020 = medInstitutionVO.getAkb020();
			for (int i = 0; i < 16 - medInstitutionVO.getAkb020().length(); i++) {
				akb020 = akb020 + " ";
			}
			akb020 = "'" + akb020 + "'";
			for (int i = 0; i < org.length; i++) {
				if (akb020.equals(org[i])) {
					flag = true;
				}
			}
			if (flag) {
				medInstitutionVO.setAkb020(akb020);
			} else {
				medInstitutionVO.setAkb020("'000000'");
			}
		}
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		resultVO = this.getCommonVS().queryHospitalDBZWithPage(page,
				medInstitutionVO);
		
		result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
		
	}
	public String queryHospitalALL() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		String result = null;

		resultVO = this.getCommonVS().queryHospitalWithPage(page,
				medInstitutionVO);

		result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}

	public String queryZSD() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		String result = null;
		String organcode = (String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_ORGANCODE);// 获取当前登录人的医院ids
		medInstitutionVO.setAkb020(organcode);
		resultVO = this.getCommonVS().queryZSDWithPage(page, medInstitutionVO);

		result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}

	public String queryZSDALL() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		String result = null;
		resultVO = this.getCommonVS().queryZSDWithPage(page, medInstitutionVO);

		result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}

}
