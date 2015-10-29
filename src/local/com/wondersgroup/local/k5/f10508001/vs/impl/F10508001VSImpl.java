package com.wondersgroup.local.k5.f10508001.vs.impl;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k5.f10508001.bs.F10508001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10508001.vo.Kc62VO;
import com.wondersgroup.local.k5.f10508001.vo.F10508001VO;
import com.wondersgroup.local.k5.f10508001.vs.F10508001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10508001VSImpl implements F10508001VS{
	private F10508001BS f10508001BS;
	public F10508001BS getF10508001BS() {
		return f10508001BS;
	}
	public void setF10508001BS(F10508001BS f10508001bs) {
		f10508001BS = f10508001bs;
	}
	public Map<String, Object> queryMedDocument(Page page,
			F10508001VO f10508001vo) {
		if (f10508001vo == null) {
			throw new BusinessException(
					"F10508001VS-00:传入参数对象为空!");
		}
		String baz031="";
		if (StringTools.hasText(f10508001vo.getBaz031())) {
			String[] baz031s=f10508001vo.getBaz031().split(",");
			for (int i = 0; i < baz031s.length; i++) {
				if((i+1)==baz031s.length){
					baz031+="'"+baz031s[i]+"'";
				}else{
					baz031+="'"+baz031s[i]+"',";
				}
			}
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10508001vo, queryDto);
		queryDto.setBaz031(baz031);
		Page result = this.getF10508001BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10508001VO f10508001vo) {
		if (f10508001vo == null) {
			throw new BusinessException(
					"F10508001VS-01:传入参数对象为空!");
		}
		if (f10508001vo.getIds() == null) {
			throw new BusinessException("F10508001VS-02:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10508001vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		String baz031="";
		if (StringTools.hasText(f10508001vo.getBaz031())) {
			String[] baz031s=f10508001vo.getBaz031().split(",");
			for (int i = 0; i < baz031s.length; i++) {
				if((i+1)==baz031s.length){
					baz031+="'"+baz031s[i]+"'";
				}else{
					baz031+="'"+baz031s[i]+"',";
				}
			}
		}
		Kc62VO queryDto = new Kc62VO();
		
		BeanTools.copyProperties(f10508001vo, queryDto);
		
		queryDto.setBaz001(strid);
		queryDto.setBaz031(baz031);
		Page result = this.getF10508001BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
	public List<Map<String, Object>> findKc62ByIds(String ids) throws ParseException {
		if(!StringTools.hasText(ids)) {
			throw new BusinessException("F10201002-12: 未获取到相应的Ids");
		}
		
		String strids = "";
		String[] id = ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				strids += "'" + id[i] + "'";
			} else {
				strids += "'" + id[i] + "',";
			}
		}
		List<Map<String, Object>> listKc62 = this.getF10508001BS().findKc62List(strids);
		
		return listKc62;
	}
}
