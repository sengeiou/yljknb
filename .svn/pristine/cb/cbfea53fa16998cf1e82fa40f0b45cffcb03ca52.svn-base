package com.wondersgroup.local.k2.f10203001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203001.vo.F10203001VO;
import com.wondersgroup.local.k2.f10203001.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10203001.vs.F10203001VS;

public class F10203001Action extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10203001VS f10203001VS;
	
	private F10203001VO f10203001VO = new F10203001VO();
	

	
	public F10203001VO getF10203001VO() {
		return f10203001VO;
	}
	
	public void setF10203000VO(F10203001VO f10203001vo) {
		f10203001VO = f10203001vo;
	}
	
	public F10203001VS getF10203001VS() {
		return f10203001VS;
	}

	public void setF10203001VS(F10203001VS f10203001vs) {
		f10203001VS = f10203001vs;
	}

	

	@Override
	public ValueObject getValueObject() {
		return this.getF10203001VO();
	}
	
	
	
	
	/**
	 * 时间轴
	 * 
	 * @return
	 */
	public String getChartSZJ() {
		F10203001VO vo = new F10203001VO();
		vo.setSjz("[{\"year\":\"201403\",\"flg\":\"1\",child:[{\"month\":\"11日\",\"fj\":\"wgmx.doc\",\"txt\":\"智能审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"12日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"13日\",\"fj\":\"\",\"txt\":\"人工审核送核查，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"},{\"month\":\"14日\",\"fj\":\"\",\"txt\":\"医院核查反馈，详细信息：相互作用：丙戊酸钠（德巴金）的产品资料说明：丙戊酸与苯二氮卓类药物联合应用时，可增加后者的中枢抑制作用；联合用药时应对患者进行密切监测，必要时对药物进行剂量调整。\"}]}]");
		createJSonData(VOUtils.getJsonData(vo));
		return AJAX;
	}
//	明细查询
public String queryMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String ids= this.getServletRequest().getParameter("ids");
		f10203001VO.setIds(ids);
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10203001VS().queryMedDocumentDetail(page,f10203001VO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
		
	}
//单据查询
public String queryMedDocument(){
	
	int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
	int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
	
	Page page = new Page(start * limit + 1, limit, -1, limit, null);
	
	Map<String, Object> resultVO = null;
	
	resultVO = this.getF10203001VS().queryMedDocument(page,f10203001VO);
	
	String result = VOUtils.getJsonData(resultVO);
	
	createJSonData(result);
	
	return AJAX;
	
}

//批量处理
public String medDocumentDetailOperate() {
	String submitData = this.getServletRequest().getParameter("submitData");
	
	PreCheckVO preCheckVO =(PreCheckVO) VOUtils.getBeanFromJsonData(submitData, PreCheckVO.class);
	
	preCheckVO = this.getF10203001VS().preCheckMedDocDetail(preCheckVO);
	
	String result = prefix   + VOUtils.getJsonData(preCheckVO) +  suffex;
	
	createJSonData(result);
	
	return result;
}

//单条处理
public String medDocumentDetailOperateSingle() {
	PreCheckVO preCheckVO = new PreCheckVO();
	
	preCheckVO.setBaz021( this.getServletRequest().getParameter("baz021"));
	preCheckVO.setBaz031(this.getServletRequest().getParameter("baz031"));
	preCheckVO.setBaz033(this.getServletRequest().getParameter("baz033"));
	preCheckVO.setBaz041(Double.valueOf(this.getServletRequest().getParameter("baz041")));
	preCheckVO.setIds(this.getServletRequest().getParameter("id"));
	
	preCheckVO = this.getF10203001VS().preCheckMedDocDetail(preCheckVO);
	
	String jsonData = prefix + VOUtils.getJsonData(preCheckVO) + suffex;
		
	createJSonData(jsonData);
	return AJAX;
}



}
