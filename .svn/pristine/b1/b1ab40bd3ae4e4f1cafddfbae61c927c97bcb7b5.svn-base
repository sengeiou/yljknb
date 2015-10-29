package com.wondersgroup.local.common.action;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.SickLeverVO;
import com.wondersgroup.local.common.vs.CommonVS;

/**
 * 
 * @ClassName: QuerySickLeverAction 
 * @Description: 疾病信息
 * @author chenlin
 * @date 2014-8-4 下午02:17:28 
 *
 */
@SuppressWarnings("serial")
public class QuerySickLeverAction extends BaseAjaxAction {

	private SickLeverVO vo = new SickLeverVO();
	private CommonVS commonVS;
	@Override
	public ValueObject getValueObject() {
		
		return vo;
	}

	@Override
	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		String jsonData = VOUtils.getJsonData(this.commonVS.queryKa06WithPage(page, vo));
		
		return jsonData;
	}

	public SickLeverVO getVo() {
		return vo;
	}

	public void setVo(SickLeverVO vo) {
		this.vo = vo;
	}

	public CommonVS getCommonVS() {
		return commonVS;
	}

	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
	}

}
