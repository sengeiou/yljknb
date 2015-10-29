package com.wondersgroup.local.k6.f10603001.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603001.vo.F10603001VO;

public interface F10603001VS {
	public List<Map<String, Object>> queryInvoice(F10603001VO f10603001vo);
	public Map<String, Object> queryCharge(Page page,F10603001VO vo);
	public String queryMedicalRank(F10603001VO vo);

}
