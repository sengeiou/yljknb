package com.wondersgroup.local.k6.f10604001.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10604001.vo.FxVO;
import com.wondersgroup.local.k6.f10604001.vo.FyVO;
import com.wondersgroup.local.k6.f10604001.vo.FyYyTempVO;
import com.wondersgroup.local.k6.f10604001.vo.FyZVO;
import com.wondersgroup.local.k6.f10604001.vo.PmVO;

public interface F10604001VS {

	public Map<String, Object> queryFyzbWithPage(Page page, FyVO fyVO);
	
	public Map<String, Object> queryFyzbZTempWithPage(Page page,FyZVO fyZVO);

	public List<Map<String, Object>> queryPie(FyVO fyVO);
	
	public Map<String, Object> queryPmTempWithPage(Page page, PmVO pmVO);

	public String queryColumn(PmVO pmVO);
	
	public Map<String, Object> queryFxTempXbWithPage(Page page , FxVO fxVO);
	
	public Map<String, Object> queryfxTempNldWithPage(Page page , FxVO fxVO);
	
	public String queryStrip(FxVO fxVO);
	
	public Map<String, Object> queryFyYyTempWithPage(Page page , FyYyTempVO fyYyTempVO);
	
	public String queryFyYyTempStrip(FyYyTempVO fyYyTempVO);
}
