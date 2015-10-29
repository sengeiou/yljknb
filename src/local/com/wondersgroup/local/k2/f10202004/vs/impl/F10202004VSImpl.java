package com.wondersgroup.local.k2.f10202004.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.k2.f10202004.bs.F10202004BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10202004.vo.F10202004VO;
import com.wondersgroup.local.k2.f10202004.vs.F10202004VS;
import com.wondersgroup.local.k2.f10202004.vo.Kc62VO;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10202004VSImpl implements F10202004VS{
	private F10202004BS f10202004BS;
	public F10202004BS getF10202004BS() {
		return f10202004BS;
	}
	public void setF10202004BS(F10202004BS f10202004bs) {
		f10202004BS = f10202004bs;
	}
	public Map<String, Object> queryMedDocument(Page page,
			F10202004VO f10202004vo) {
		if (f10202004vo == null) {
			throw new BusinessException(
					"F10202004VS-00:传入参数对象为空!");
		}
		if(!StringTools.hasText(f10202004vo.getBaz102())){
			throw new BusinessException("F10202003VS-03:传入复议状态为空!");
		}
		String baz102="";
		String[] baz102s=f10202004vo.getBaz102().split(",");
		for (int i = 0; i < baz102s.length; i++) {
			if((i+1)==baz102s.length){
				baz102+="'"+baz102s[i]+"'";
			}else{
				baz102+="'"+baz102s[i]+"',";
			}
		}
		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10202004vo, queryDto);
		queryDto.setBaz102(baz102);
		Page result = this.getF10202004BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10202004VO f10202004vo) {
		if (f10202004vo == null) {
			throw new BusinessException(
					"F10202003VS-01:传入参数对象为空!");
		}
		if (f10202004vo.getIds() == null) {
			throw new BusinessException("F10202003VS-02:分页查询传入ids为空!");
		}
		if(!StringTools.hasText(f10202004vo.getBaz102())){
			throw new BusinessException("F10202003VS-03:传入复议状态为空!");
		}
		String strid = "";
		String[] ids = f10202004vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		String baz102="";
		String[] baz102s=f10202004vo.getBaz102().split(",");
		for (int i = 0; i < baz102s.length; i++) {
			if((i+1)==baz102s.length){
				baz102+="'"+baz102s[i]+"'";
			}else{
				baz102+="'"+baz102s[i]+"',";
			}
		}
		Kc62VO queryDto = new Kc62VO();
		
		BeanTools.copyProperties(f10202004vo, queryDto);
		
		queryDto.setBaz001(strid);
		queryDto.setBaz102(baz102);
		
		Page result = this.getF10202004BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
}
