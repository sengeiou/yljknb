package com.wondersgroup.local.k2.f10202002.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10202002.vo.F10202002VO;

public interface F10202002VS {

	/**
	 * 获取规则类型统计的饼图数据
	 * @param f10202002vo
	 * @return
	 */
	List<Map<String,Object>> getF10202002Chart(F10202002VO f10202002vo);

	/**
	 * 根据规则分类分页查询医疗机构下的违法规则数
	 * @param page
	 * @param f10202002vo
	 * @return
	 */
	Object queryF10202002Rules(Page page, F10202002VO f10202002vo);

	/**
	 * 分页查询该医疗机构下的参保人详细信息
	 * @param page
	 * @param f10202002vo
	 * @return
	 */
	Map<String, Object> queryF10202002Detail(Page page, F10202002VO f10202002vo);
	/**
	 * 根据baz001查询Kc62信息
	 * @param resultVO
	 * @return
	 */

    List<F10202002VO> queryKc62ByBaz001(F10202002VO resultVO);

}
