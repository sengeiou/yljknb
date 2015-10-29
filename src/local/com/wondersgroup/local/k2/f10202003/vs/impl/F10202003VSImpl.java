package com.wondersgroup.local.k2.f10202003.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.k2.f10202003.bs.F10202003BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10202003.vo.F10202003VO;
import com.wondersgroup.local.k2.f10202003.vs.F10202003VS;
import com.wondersgroup.local.k2.f10202003.vo.Kc62VO;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10202003VSImpl implements F10202003VS{
	private F10202003BS f10202003BS;
	public F10202003BS getF10202003BS() {
		return f10202003BS;
	}
	public void setF10202003BS(F10202003BS f10202003bs) {
		f10202003BS = f10202003bs;
	}
	public Map<String, Object> queryMedDocument(Page page,
			F10202003VO f10202003vo) {
		if (f10202003vo == null) {
			throw new BusinessException(
					"F10202003VS-00:传入参数对象为空!");
		}
		String baz031="";
		if (StringTools.hasText(f10202003vo.getBaz031())) {
			String[] baz031s=f10202003vo.getBaz031().split(",");
			for (int i = 0; i < baz031s.length; i++) {
				if((i+1)==baz031s.length){
					baz031+="'"+baz031s[i]+"'";
				}else{
					baz031+="'"+baz031s[i]+"',";
				}
			}
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10202003vo, queryDto);
		queryDto.setBaz031(baz031);
		Page result = this.getF10202003BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10202003VO f10202003vo) {
		if (f10202003vo == null) {
			throw new BusinessException(
					"F10202003VS-01:传入参数对象为空!");
		}
		if (f10202003vo.getIds() == null) {
			throw new BusinessException("F10202003VS-02:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10202003vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		String baz031="";
		if (StringTools.hasText(f10202003vo.getBaz031())) {
			String[] baz031s=f10202003vo.getBaz031().split(",");
			for (int i = 0; i < baz031s.length; i++) {
				if((i+1)==baz031s.length){
					baz031+="'"+baz031s[i]+"'";
				}else{
					baz031+="'"+baz031s[i]+"',";
				}
			}
		}
		Kc62VO queryDto = new Kc62VO();
		
		BeanTools.copyProperties(f10202003vo, queryDto);
		
		queryDto.setBaz001(strid);
		queryDto.setBaz031(baz031);
		Page result = this.getF10202003BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
}
