package com.wondersgroup.local.k6.f10603007.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603007.vo.F10603007VO;

public interface F10603007VS {

	/**
	 * 生成并查询医疗机构分项费用趋势的分析
	 * 
	 * @param page
	 * @param invisVO
	 * @return
	 */
	Map<String, Object> queryYLJGFXTYFZQSWithPage(Page page, F10603007VO invisVO);

	/**
	 * 生成医疗机构分项费用趋势的数据
	 * 
	 * @param f10603007vo
	 * @return
	 */
	F10603007VO buildDate(F10603007VO f10603007vo);

	/**
	 * 查询医疗机构分项费用趋势的图表数据
	 * 
	 * @param f10603007vo
	 * @return
	 */
	F10603007VO queryMoveAverage(F10603007VO f10603007vo);

}
