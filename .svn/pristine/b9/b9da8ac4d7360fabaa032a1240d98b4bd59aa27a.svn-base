package com.wondersgroup.local.k4.f10402006.action;

import java.util.List;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.TbDicGzms;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10402006.vs.F10402006VS;

public class BackJsonAction extends BaseAjaxAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private F10402006VS f10402006VS;
	public F10402006VS getF10402006VS() {
		return f10402006VS;
	}
	public void setF10402006VS(F10402006VS f10402006vs) {
		f10402006VS = f10402006vs;
	}
	protected String operate() {
		
		StringBuffer json=new StringBuffer();
		json.append("[");
		List<TbDicGzms> list=f10402006VS.queryMOdelFromGzms();
		for(TbDicGzms vo:list){
			json.append("{");
			json.append("\"id\":\""+vo.getGzdm()+"\",\"text\":\""+vo.getMc()+"\"");
			json.append("},");
		}
		String jsstr=json.toString();
		jsstr=jsstr.substring(0,jsstr.length()-1);
		jsstr+="]";
	   return jsstr;
	}


}
