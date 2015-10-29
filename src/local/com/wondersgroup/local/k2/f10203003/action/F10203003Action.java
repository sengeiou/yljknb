package com.wondersgroup.local.k2.f10203003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203003.vo.F10203003VO;
import com.wondersgroup.local.k2.f10203003.vs.F10203003VS;

public class F10203003Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;


	private F10203003VS f10203003VS;

	private F10203003VO f10203003VO = new F10203003VO();

	public F10203003VO getF10203003VO() {
		return f10203003VO;
	}

	public void setF10203000VO(F10203003VO f10203003vo) {
		f10203003VO = f10203003vo;
	}

	public F10203003VS getF10203003VS() {
		return f10203003VS;
	}

	public void setF10203003VS(F10203003VS f10203003vs) {
		f10203003VS = f10203003vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10203003VO();
	}

	/**
	 * 时间轴
	 * 
	 * @return
	 */
	public String getChartSZJ() {
		F10203003VO vo = new F10203003VO();
		vo.setSjz("[{\"year\":\"201403\",\"flg\":\"1\",child:[{\"month\":\"11日\",\"fj\":\"wgmx.doc\",\"txt\":\"智能审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"12日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"13日\",\"fj\":\"\",\"txt\":\"人工审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"14日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"}]}]");
		createJSonData(VOUtils.getJsonData(vo));
		return AJAX;
	}

	// 单据查询
	public String queryMedDocument() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10203003VS().queryMedDocument(page, f10203003VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}
	//明细查询
	public String queryMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String ids= this.getServletRequest().getParameter("ids");
		f10203003VO.setIds(ids);
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10203003VS().queryMedDocumentDetail(page,f10203003VO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
		
	}
	
	

}
