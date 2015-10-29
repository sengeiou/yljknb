package com.wondersgroup.local.k6.f10603003.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603003.vo.F10603003VO;

public interface F10603003VS {

	List<Map<String, Object>> queryMediPartFee(F10603003VO vo);

	Map<String, Object> queryDisease(Page page, F10603003VO f10603003vo);

	Map<String, Object> queryMedical(Page page, F10603003VO f10603003vo);

	Map<String, Object> queryIdentify(Page page, F10603003VO f10603003vo);

}
