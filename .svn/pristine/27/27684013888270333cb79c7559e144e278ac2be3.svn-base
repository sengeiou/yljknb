package com.wondersgroup.local.k4.f10402008.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402008.vo.F10402008VO;
import com.wondersgroup.local.k4.f10402008.vo.YbgzmxVO;

public interface F10402008VS {
	
	public String getGzlbJson();
	public String getGzxxJson(String bm);
	public Map<String, Object> queryZsdWithPage(Page page, F10402008VO vo);
	public YbgzmxVO loadZsdxx(String zsdid);
	public Map<String, Object> queryLjtjWithPage(Page page, String zsdid, String xgbz);
	public Map<String, Object> queryLjsjWithPage(Page page, String sjzdb,
			String sjms, String sjzszd,String sjzdlx);
	public void saveSjnr(String sjnr, String ybgztjljbm,String ybgzbm);
	public void updateZsdmx(YbgzmxVO mxvo);
	public void startOrEnd(String id);

}
