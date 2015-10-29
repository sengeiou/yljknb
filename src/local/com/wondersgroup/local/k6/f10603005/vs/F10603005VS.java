package com.wondersgroup.local.k6.f10603005.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603005.vo.AcceptPeopleVO;

public interface F10603005VS {
	
	
	/**
	 * 按条件查询显示图表
	 * @param returnVO
	 * @return
	 */
	public String queryStrip(AcceptPeopleVO returnVO);
	
	/**
	 * 生成并查询医疗机构接诊人次趋势的分析
	 * @param page
	 * @param invisVO
	 * @return
	 */
	Map<String, Object> queryYLJGJZRCFZQSWithPage(Page page, AcceptPeopleVO acpeVO);
}
