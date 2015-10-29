package com.wondersgroup.local.k4.f10402008.vs.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402008.vo.F10402008VO;
import com.wondersgroup.local.k4.f10402008.vo.TjljVO;
import com.wondersgroup.local.k4.f10402008.vo.Tjlj_CgVO;
import com.wondersgroup.local.k4.f10402008.vo.YbgzmxVO;
import com.wondersgroup.local.k4.f10402008.vs.F10402008VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class F10402008VSImpl implements F10402008VS{

private RuleManageBS ruleManageBS;
	
	public String getGzlbJson() {
		StringBuffer json=new StringBuffer();
		List<F10402008VO> ybgzfls=ruleManageBS.getYbgzfl();
		json.append("[");
		for (int i = 0; i < ybgzfls.size(); i++) {
			json.append("{");
			json.append("id:'"+ybgzfls.get(i).getYbgzflbm()+"',");	
			json.append("text:'"+ybgzfls.get(i).getYbgzflmc()+"'");
			json.append("}");
			if(i<ybgzfls.size()-1){
				json.append(",");
			}
		}
		json.append("]");
		return json.toString();
	}
	
	public String getGzxxJson(String bm){
		StringBuffer json=new StringBuffer();
		List<F10402008VO> ybgzfls=ruleManageBS.getYbgzflxx(bm);
		json.append("[");
		for (int i = 0; i < ybgzfls.size(); i++) {
			json.append("{");
			json.append("id:'"+ybgzfls.get(i).getYbgzflbm()+"',");	
			json.append("text:'"+ybgzfls.get(i).getYbgzflmc()+"'");
			json.append("}");
			if(i<ybgzfls.size()-1){
				json.append(",");
			}
		}
		json.append("]");
		return json.toString();
	}
	
	public Map<String, Object> queryZsdWithPage(Page page, F10402008VO VO) {
		return GridUtils.getGridData(ruleManageBS.queryZsdWithPage(page, VO));
	}
	
	public YbgzmxVO loadZsdxx(String zsdid) {
		return ruleManageBS.loadZsdxx(zsdid);
	}

	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}

	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}

	public Map<String, Object> queryLjtjWithPage(Page page, String zsdid,String xgbz) {
		String sql=null;
		if(xgbz.equals("1")){
			sql="select j.sjzdbm,j.ybgztjljbm,j.ysgz,s.sjnr from yhk.yhk_ybgztjlj j,yhk.yhk_ybtjsj s where s.ybgztjljbm=j.ybgztjljbm and ybgzbm=( select ybgzbm from yhk.yhk_ybgzmx where ybgzmx_id='"+zsdid+"')";
		}else{
			sql="select  j.ysgz, j.sjzdbm, j.ybgztjljbm,s.sjnr  from zsk.ybgz_ybgztjlj j,zsk.ybgz_ybtjsj s where gzmbbm = (select gzmbbm   from zsk.ybgz_ybgzzsd  where j.ybgztjljbm=s.ybgztjljbm and ybgzbm = (select ybgzbm  from YHK.yhk_ybgzmx where ybgzmx_id = '"+zsdid+"')) ";
		}
		List<Map<String, Object>> gzmxMap=new ArrayList<Map<String,Object>>();
		gzmxMap=ruleManageBS.queryBySql(sql);
		List<TjljVO> tjljs=new ArrayList<TjljVO>();
		for (Map<String, Object>  gzmx: gzmxMap) {
//			Map<String, Object> sjzdzdMap=ruleManageBS.queryBySql("select sjtjzd,sjzdb,sjzszd,sjzdlx from zsk.ybgz_sjzdzd where sjzdbm='"+gzmx.get("sjzdbm")+"'").get(0);
			TjljVO tjljVO=querySjzd((String) gzmx.get("sjzdbm"));
			tjljVO.setYbgztjljbm((String) gzmx.get("ybgztjljbm"));
			tjljVO.setSjnr((String) gzmx.get("sjnr"));
			tjljVO=queryYsgz(tjljVO,(String) gzmx.get("ysgz"));
			String sql1=null;
			if("5".equals(tjljVO.getSjzdlx())){
				sql1="select "+tjljVO.getSjzszd()+" as sjzszd,max("+tjljVO.getSjtjzd()+") as sjtjzd from zsk."+tjljVO.getSjzdb()+" where "+tjljVO.getSjtjzd()+"='"+tjljVO.getSjnr()+"' group by "+tjljVO.getSjzszd()+"";
			}else{
				sql1="select csbm as sjtjzd,zwms as sjzszd from  zsk."+tjljVO.getSjzdb()+" where cslb='"+tjljVO.getSjtjzd()+"' and csbm='"+tjljVO.getSjnr()+"'";
			}
			tjljVO.setSjmsnr((String) ruleManageBS.queryBySql(sql1).get(0).get("sjzszd"));
			tjljs.add(tjljVO);
		}
		page.setResult(tjljs);
		page.setTotalSize(gzmxMap.size());
		return GridUtils.getGridData(page);
	}
	
	
	private TjljVO querySjzd(String sjzdbm){
		TjljVO tjljVO=new TjljVO(); 
		Map<String, Object> sjzdzdMap=ruleManageBS.queryBySql("select sjtjzd,sjzdb,sjzszd,sjzdlx from zsk.ybgz_sjzdzd where sjzdbm='"+sjzdbm+"'").get(0);
		tjljVO.setSjzszd((String) sjzdzdMap.get("sjzszd"));
		tjljVO.setSjtjzd((String) sjzdzdMap.get("sjtjzd"));
		tjljVO.setSjzdb((String) sjzdzdMap.get("sjzdb"));
		tjljVO.setSjzdlx((String) sjzdzdMap.get("sjzdlx"));
		return tjljVO;
	}
	
	private TjljVO queryYsgz(TjljVO tjljVO,String ysgz){
		Map<String, Object> ysgzMap=ruleManageBS.queryBySql("select * from zsk.ybgz_ywcsb where cslb='YSGZ_YH' and csbm='"+ysgz+"'").get(0);
		tjljVO.setYsgz((String) ysgzMap.get("zwms"));
		return tjljVO;
	}

	public Map<String, Object> queryLjsjWithPage(Page page, String sjzdb,
			String sjtjzd,String sjzszd,String sjzdlx) {
		return GridUtils.getGridData(ruleManageBS.queryLjsjWithPage(page,sjzdb,sjtjzd,sjzszd,sjzdlx));
	}

	public void saveSjnr(String sjnr, String ybgztjljbm,String ybgzbm) {
		Tjlj_CgVO vo=new Tjlj_CgVO(ybgzbm, ybgztjljbm, sjnr);
		ruleManageBS.saveSjnr(vo);
	}

	public void updateZsdmx(YbgzmxVO mxvo) {
		ruleManageBS.updateZsdmx(mxvo);
	}

	public void startOrEnd(String id) {
		ruleManageBS.updateZsdmxYxbz(id);
	}

}
