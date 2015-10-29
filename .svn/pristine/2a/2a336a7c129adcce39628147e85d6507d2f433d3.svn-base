package com.wondersgroup.local.k2.f10201006.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201006.vo.F10201006VO;
import com.wondersgroup.local.k2.f10201006.vs.F10201006VS;

public class F10201006Action extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10201006VS f10201006VS;
	
	private F10201006VO f10201006VO = new F10201006VO();


	public F10201006VO getF10201006VO() {
		return f10201006VO;
	}

	public void setF10201006VO(F10201006VO f10201006vo) {
		f10201006VO = f10201006vo;
	}

	
	public F10201006VS getF10201006VS() {
		return f10201006VS;
	}

	public void setF10201006VS(F10201006VS f10201006vs) {
		f10201006VS = f10201006vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10201006VO();
	}
	
	/**
	 * 时间轴
	 * 
	 * @return
	 */
	public String getChartSZJ() {
		F10201006VO vo = new F10201006VO();
		vo=this.getF10201006VS().querySZJ(f10201006VO);
		//vo.setSjz("[{\"year\":\"201403\",\"flg\":\"1\",child:[{\"month\":\"11日\",\"fj\":\"wgmx.doc\",\"txt\":\"智能审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"12日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"13日\",\"fj\":\"\",\"txt\":\"人工审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"14日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"}]}]");
		createJSonData(VOUtils.getJsonData(vo));
		return AJAX;
	}
	
public String queryMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10201006VS().queryMedDocumentDetail(page,f10201006VO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
		
	}
	

}
