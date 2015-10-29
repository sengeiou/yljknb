package com.wondersgroup.local.k5.f10510001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10510001.vo.F10510001VO;

public interface F10510001VS {

	/**
	 * 分页查询违规单据统计信息
	 * 
	 * @param page
	 * @param f10205001vo
	 * @return
	 */

	Map<String, Object> queryMedDocument(Page page, F10510001VO f10510001vo);


}
