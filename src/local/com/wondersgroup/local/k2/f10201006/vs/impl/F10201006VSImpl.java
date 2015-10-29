package com.wondersgroup.local.k2.f10201006.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10201006.vo.F10201006VO;
import com.wondersgroup.local.k2.f10201006.vo.Kc62VO;
import com.wondersgroup.local.k2.f10201006.vs.F10201006VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10201006VSImpl implements F10201006VS {

	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10201006VO f10201006vo) {

		if (f10201006vo.getIds() == null) {
			throw new BusinessException("F10201006VS-00:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10201006vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();
		
		BeanTools.copyProperties(f10201006vo, queryDto);
		
		queryDto.setBaz001(strid);
		
		Page result = this.getMedAuditBS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public F10201006VO querySZJ(F10201006VO f10201006vo) {
		f10201006vo=this.getMedAuditBS().querySZJ(f10201006vo);
		return f10201006vo;
	}

}
