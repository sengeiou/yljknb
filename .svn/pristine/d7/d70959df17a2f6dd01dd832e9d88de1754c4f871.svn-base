package com.wondersgroup.local.jkgz.service.save.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.local.jkgz.bs.JkgzBS;
import com.wondersgroup.local.jkgz.model.GzModel;
import com.wondersgroup.local.jkgz.service.save.Gz_save;
import com.wondersgroup.local.jkgz.utils.SqlList;

public class Gz_saveImpl implements Gz_save{
	private JkgzBS bs;
	
	public void save_main(String AAZ217, String AAZ213STR, String YBGZFLBM){
		Map<String, Object> map=new HashMap<String, Object>();
		Object t_baz001;
		try {
			map=bs.queryForMap(SqlList.SAVE_Kc63_SQL_2, AAZ217);
			t_baz001 =  map.get("baz001");
		} catch (Exception e) {
			t_baz001=null;
		}
		if(t_baz001==null){
			map=bs.queryForMap(SqlList.SAVE_Kc63_SQL_3);
			t_baz001=  map.get("BAZ001");
		}
		 bs.insertOrUpdate(SqlList.SAVE_Kc63_SQL_1,t_baz001,AAZ217, AAZ217);
		
		String aaa027="310000";
		Object baz003;
		Object baz004;
		Object ake002;
		Object t_ybgzflbm;
		Object ybgzflmc;
		List<GzModel> list= bs.query(GzModel.class, SqlList.SAVE_Kc62_SQL_2,AAZ213STR);
		for(GzModel gzModel : list){
			map=bs.queryForMap(SqlList.SAVE_Kc62_SQL_3);
		    baz003= map.get("BAZ003");
		    if("1".equals(gzModel.getAke003())){
		    	try{
		    		 map =bs.queryForMap(SqlList.SAVE_Kc62_SQL_4,gzModel.getAke001());
			    	 ake002 = map.get("ake002");
		    	}catch(Exception e){
		    		ake002=0;
		    	}
		    }else if("2".equals(gzModel.getAke003())){
		    	try {
		    		 map =bs.queryForMap(SqlList.SAVE_Kc62_SQL_5,gzModel.getAke001());
			    	 ake002 = map.get("ake002");
				} catch (Exception e) {
					ake002=0;
				}
		    	
		    }else if("4".equals(gzModel.getAke003())){
		    	try {
		    		 map =bs.queryForMap(SqlList.SAVE_Kc62_SQL_6,gzModel.getAke001());
			    	 ake002 = map.get("ake002");
				} catch (Exception e) {
					ake002=0;
				}
		    }
		    ake002=null;
		    bs.insertOrUpdate(SqlList.SAVE_Kc62_SQL_1,baz003,t_baz001,gzModel.getAke001(),ake002,gzModel.getAke003(),gzModel.getAka065(),
		    		gzModel.getAka081(),gzModel.getAke135(),gzModel.getAka072(),gzModel.getAka071(),gzModel.getAke131(),gzModel.getAkc229(),
		    		gzModel.getAkc231(),gzModel.getAkc226(),gzModel.getAkc225(),gzModel.getAke130(),gzModel.getAka070(),
		    		gzModel.getAke006(),gzModel.getAke004(),gzModel.getAkb065(),gzModel.getAaz213(),aaa027);
		    
		    bs.insertOrUpdate(SqlList.SAVE_L3_TMP_WGMX_SQL,YBGZFLBM,gzModel.getAaz217(),gzModel.getAaz213(),gzModel.getAaz217(),
		    		gzModel.getAaz217(),gzModel.getGzmbbm());
		    
		    map=bs.queryForMap(SqlList.SAVE_Kc72_SQL_3);
		    baz004= map.get("BAZ004");
		    t_ybgzflbm=YBGZFLBM;
		     map =bs.queryForMap(SqlList.SAVE_Kc72_SQL_2,YBGZFLBM);
		    ybgzflmc = map.get("ybgzflmc");
		    if(ybgzflmc==null){
		    	ybgzflmc=YBGZFLBM;
		    }
		    bs.insertOrUpdate(SqlList.SAVE_Kc72_SQL_1,baz004,baz003,t_ybgzflbm,ybgzflmc,gzModel.getGzmbbm());
		    
		    
		}
		
	}

	public JkgzBS getBs() {
		return bs;
	}

	public void setBs(JkgzBS bs) {
		this.bs = bs;
	}
	
//	private void save_kc63(String AAZ217,String BAZ001){
//	    bs.insertOrUpdate(SqlList.SAVE_Kc63_SQL_1, AAZ217);
//			
//	
//	}
//	private void save_kc62(String AAZ213STR){
//		bs.insertOrUpdate(SqlList.SAVE_Kc62_SQL_1);
//		
//	}
//	private void save_L3_TMP_WGMX(String AAZ213STR){
//		
//	}
	
}
