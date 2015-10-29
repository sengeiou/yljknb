package com.wondersgroup.local.k5.f10507001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10507001.vo.F10507001VO;
import com.wondersgroup.local.k5.f10507001.vs.F10507001VS;



public class F10507001Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private F10507001VO f10507001VO = new F10507001VO();

	private F10507001VS f10507001VS;

	public F10507001VO getF10507001VO() {
		return f10507001VO;
	}

	public void setF10204001VO(F10507001VO f10204001vo) {
		f10507001VO = f10204001vo;
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

		resultVO = this.getF10507001VS().queryMedDocument(page, f10507001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}

	/**
	 * 分页查询违规单据明细信息
	 * 
	 * @return
	 */
	public String queryMedDocumentDetail() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10507001VS().queryMedDocumentDetail(page,
				f10507001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}

	/**
	 * 时间轴
	 * 
	 * @return
	 */
	public String getChartSZJ() {
		F10507001VO vo = new F10507001VO();
		vo.setSjz("[{\"year\":\"201403\",\"flg\":\"1\",child:[{\"month\":\"11日\",\"fj\":\"wgmx.doc\",\"txt\":\"智能审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"12日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"13日\",\"fj\":\"\",\"txt\":\"人工审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"14日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"}]}]");
		createJSonData(VOUtils.getJsonData(vo));
		return AJAX;
	}

}
