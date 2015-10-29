package com.wondersgroup.local.k5.f10507002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10507002.vo.F10507002VO;
import com.wondersgroup.local.k5.f10507002.vs.F10507002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class F10507002Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;


	private F10507002VS f10507002VS;

	private F10507002VO f10507002VO = new F10507002VO();

	public F10507002VO getF10507002VO() {
		return f10507002VO;
	}

	public void setF10203000VO(F10507002VO f10507002vo) {
		f10507002VO = f10507002vo;
	}

	public F10507002VS getF10507002VS() {
		return f10507002VS;
	}

	public void setF10507002VS(F10507002VS f10507002vs) {
		f10507002VS = f10507002vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10507002VO();
	}

	/**
	 * 时间轴
	 * 
	 * @return
	 */
	public String getChartSZJ() {
		F10507002VO vo = new F10507002VO();
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

		resultVO = this.getF10507002VS().queryMedDocument(page, f10507002VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}
	
	public String querySusDocumentDetailIllegal(){
		F10507002VO resultVO = new F10507002VO();
    	
    	BeanTools.copyProperties(f10507002VO, resultVO);
		
		resultVO = this.getF10507002VS().querySusDocumentDetailIllegal(resultVO);
		
        String result = "{\"success\":true,\"result\":["  + VOUtils.getJsonData(resultVO) + "]}";
    	
    	createJSonData(result);
		return AJAX;
	}
	
	public String querySuspectedDocumentDetail() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String ids = this.getServletRequest().getParameter("ids");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10507002VS().querySuspectedDocumentDetail(page, ids);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	

}
