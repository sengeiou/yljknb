package com.wondersgroup.local.common.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.DoctorVO;
import com.wondersgroup.local.common.vs.CommonVS;

public class QueryDoctorAction  extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	
	private CommonVS commonVS;
	
	private DoctorVO doctorVO = new DoctorVO();
	
	public DoctorVO getDoctorVO() {
		return doctorVO;
	}

	public void setDoctorVO(DoctorVO doctorVO) {
		this.doctorVO = doctorVO;
	}

	public CommonVS getCommonVS() {
		return commonVS;
	}

	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getDoctorVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getCommonVS().queryDoctorObjWithPage(page, doctorVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
		
	}

}
