package com.wondersgroup.local.jkgz.service.gz.impl;


import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.jkgz.bs.JkgzBS;
import com.wondersgroup.local.jkgz.model.GzModel;
import com.wondersgroup.local.jkgz.service.gz.Gz0300Service;
import com.wondersgroup.local.jkgz.utils.SqlList;
import com.wondersgroup.local.jkgz.ysgz.Jkgz_Ysgz;

public class Gz0300ServiceImpl implements Gz0300Service{
	private JkgzBS bs;
	
	public int gz0300_main(GzModel model) {
		if ("GZ0307".equals(model.getYbgzflbm())){
			return GZ0307(model);
		}else if("GZ0312".equals(model.getYbgzflbm())){
			return GZ0312(model);
		}else if("GZ0309".equals(model.getYbgzflbm())){
			return GZ0309(model);
		}else if("GZ0301".equals(model.getYbgzflbm())){
			return GZ0301(model);
		}else if("GZ0302".equals(model.getYbgzflbm())){
			return GZ0302(model);
		}
		else if("GZ0315".equals(model.getYbgzflbm())){
			return GZ0315(model);
		}else if("GZ0316".equals(model.getYbgzflbm())){
			return GZ0316(model);
		}else if("GZ0317".equals(model.getYbgzflbm())){
			return GZ0317(model);
		}
		else if("GZ0308".equals(model.getYbgzflbm())){
			return GZ0308(model);
		}
		return 0;
	}
	
	private int GZ0307(GzModel model) {//跑45分钟；共30356条数据
		int aa;
		try {
			Map<String, Object> map=bs.queryForMap(SqlList.GZ0300_GZ0307_SQL, model.getAaz213());
			model.setBjnr( map.get("nl").toString());  
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		aa = Jkgz_Ysgz.ysgz_main(model);
		System.out.println(aa);
		return Jkgz_Ysgz.ysgz_main(model);
		
	}
	
	private int GZ0312(GzModel model){
		String sex=null;
		int aa;
		try {
			Map<String, Object> map=bs.queryForMap(SqlList.GZ0300_GZ0312_SQL, model.getAaz213());
			sex=(String) map.get("aac004");
			if(sex.equals("2")){
				System.out.println();
			}
			model.setBjnr(sex);
		}
		catch (Exception e) {
			return 0;
		}
		aa = Jkgz_Ysgz.ysgz_main(model);
		System.out.println(aa);
		return Jkgz_Ysgz.ysgz_main(model);
	}
	private int GZ0309(GzModel model){
		String t_ksbm;
		String t_sjnr;
		try{
			Map<String, Object> map=bs.queryForMap(SqlList.GZ0300_GZ0309_SQL, model.getAaz213());
			Object obj = map.get("aaz307");
			if(obj == null){
				return 0;
			}
			t_ksbm =(String) obj;
			model.setBjnr(t_ksbm);
		}catch (Exception e){
			return 0;
		}
	   List<GzModel> ysgzs=bs.query(GzModel.class, SqlList.MAIN_SQL_4, model.getGzmbbm());
	   if(ysgzs.size()>1){
		   throw new BusinessException("GZ0300-GZ0309_2:返回的数据内容不匹配");
	   }else{
		  t_sjnr=ysgzs.get(0).getSjnr().substring(1, t_ksbm.length());
		  model.setSjnr(t_sjnr);
	   }
		return Jkgz_Ysgz.ysgz_main(model);
	}
	private int GZ0301(GzModel model){
		String t_aka130;
		String t_aka120;
		try{
			//t_aka130=(String) bs.getObject(SqlList.GZ0300_GZ0301_SQL_1, String.class,model.getAaz213());
			Map<String, Object> map=bs.queryForMap(SqlList.GZ0300_GZ0301_SQL_1, model.getAaz213());
			Object obj = map.get("aka130");
			if(obj==null){
				return 0;
			}
			t_aka130=(String)obj;
			Map<String, Object> map1=bs.queryForMap(SqlList.GZ0300_GZ0301_SQL_2, model.getAaz213());
			Object obj1= map1.get("aka120");
			if(obj1==null){
				return 0;
			}
			t_aka120=(String) obj1;
			//t_aka120=(String) bs.getObject(SqlList.GZ0300_GZ0301_SQL_2, String.class,model.getAaz213());
			model.setBjnr(t_aka120);
			if("21".equals(t_aka130)&& t_aka120 != null){
				List<GzModel> list = bs.query(GzModel.class,SqlList.GZ0300_GZ0301_SQL_3, model.getSjnr());
				int result=0;
				int i = 0 ;
				for (GzModel gzModel : list) {
					model.setSjnr(gzModel.getSjnr());
					result+=Jkgz_Ysgz.ysgz_main(model);
					if(result!=++i){
						return 0;
					}
				}
				return 1;
			}
		}catch(Exception e){
			e.printStackTrace();
			  throw new BusinessException("GZ0300-GZ0301:数据格式异常");
		}
		return Jkgz_Ysgz.ysgz_main(model);
	}
	private int GZ0302(GzModel model){
		String t_xzlx;
		try{
			Map<String, Object> map=bs.queryForMap(SqlList.GZ0300_GZ0302_SQL, model.getAaz213());
			Object obj=map.get("aae140");
			if(obj==null){
				return 0;
			}
			t_xzlx=(String) obj;
			//t_xzlx=(String) bs.getObject(SqlList.GZ0300_GZ0302_SQL, String.class,model.getAaz213());
			model.setBjnr(t_xzlx);
		}catch(Exception e){
			throw new BusinessException("GZ0300-GZ0302:数据格式异常");
		}
		return Jkgz_Ysgz.ysgz_main(model);
	}
	private int GZ0308(GzModel model){
		String zyxy;
		try{
			Map<String, Object> map = bs.queryForMap(SqlList.GZ0300_GZ0308_SQL, model.getAaz213());
			Object obj = map.get("aka130");
			if(obj==null){
				return 0;
			}
			zyxy = (String) obj;
			model.setBjnr(zyxy);
		}
		catch(Exception e){
			return 0;
		}
		return Jkgz_Ysgz.ysgz_main(model); 
	}

	
	private int GZ0315(GzModel model){
		String hospital = null;//医院有效
		try{
			Map<String,Object> map = bs.queryForMap(SqlList.GZ0300_GZ0315_SQL, model.getAaz213());
			hospital=(String) map.get("akb022");
			model.setBjnr(hospital);
		} 
		catch(NullPointerException e){
			throw new BusinessException("GZ0300-GZ315:医院名称NULL异常");
		}
		catch(Exception e){
			throw new BusinessException("GZ0300-GZ315:数据格式异常");
		}
		return Jkgz_Ysgz.ysgz_main(model);
	}
	private int GZ0316(GzModel model){
		String drugstore = null;//药店有效
		try{
			Map<String, Object> map = bs.queryForMap(SqlList.GZ0300_GZ0316_SQL, model.getAaz213());
			drugstore = (String) map.get("akb022");
			model.setBjnr(drugstore);
		}
		catch(NullPointerException e){
			throw new BusinessException("GZ0300-GZ316:药店名称NULL异常");
		}
		catch(Exception e){
			throw new BusinessException("GZ0300-GZ316:数据格式异常");
		}
		return Jkgz_Ysgz.ysgz_main(model);
	}
	private int GZ0317(GzModel model){
		 String medical = null;//医疗机构
		try{
			Map<String, Object> map=bs.queryForMap(SqlList.GZ0300_GZ0317_SQL, model.getAaz213());
			medical = (String) map.get("akb020");
			model.setBjnr(medical);
		}
		catch(NullPointerException e){
			throw new BusinessException("GZ0300-GZ0317:医疗机构名称NULL异常");
		}
		catch(Exception e){
			throw new BusinessException("GZ0300-GZ317:数据格式异常");
		}
		return Jkgz_Ysgz.ysgz_main(model);
	}
	
	
	
	public JkgzBS getBs() {
		return bs;
	}
	public void setBs(JkgzBS bs) {
		this.bs = bs;
	}

	

}
