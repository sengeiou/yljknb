package com.wondersgroup.local.jkgz.service.filter.impl;

import java.util.List;

import com.wondersgroup.local.jkgz.bs.JkgzBS;
import com.wondersgroup.local.jkgz.model.GzModel;
import com.wondersgroup.local.jkgz.service.filter.FilterService;
import com.wondersgroup.local.jkgz.service.gz.Gz0300Service;
import com.wondersgroup.local.jkgz.utils.SqlList;

public class FilterServiceImpl implements FilterService{
	private Gz0300Service gz0300Service;
	private JkgzBS bs;
	private List<GzModel> ysgzs;
	
	/**
	 * 过滤违规数据 
	 * return   true:不违规,false:违规
	 */
	public boolean filter_main(GzModel model) {
		boolean IsCrime=true;
		int result=0;
		int i=0;
		initYsgzs(model);
		for (GzModel ysgz : ysgzs) {
			model.setSjnr(ysgz.getSjnr());
			model.setYsgz(ysgz.getYsgz());
			result+=gz0300Service.gz0300_main(model);
			if(ysgz.getYsgz()==2){//范围运算 例:指定医疗机构
				i++;
				if(result<i){
					break;
				}
				if(i==ysgzs.size()){
					IsCrime=false;
				}
			}else{			      //普通运算
				if(result>0){
					IsCrime=false;
					break;
				}
			}
		}
		return IsCrime;
	}
	
	/**
	 * 初始化运算规则集合
	 * @param model
	 * @return
	 */
	private void initYsgzs(GzModel model){
		ysgzs=bs.query(GzModel.class, SqlList.MAIN_SQL_4, model.getGzmbbm());
	}
	
	public JkgzBS getBs() {
		return bs;
	}

	public void setBs(JkgzBS bs) {
		this.bs = bs;
	}

	public Gz0300Service getGz0300Service() {
		return gz0300Service;
	}

	public void setGz0300Service(Gz0300Service gz0300Service) {
		this.gz0300Service = gz0300Service;
	}

}
