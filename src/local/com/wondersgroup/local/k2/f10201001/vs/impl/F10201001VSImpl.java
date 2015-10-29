package com.wondersgroup.local.k2.f10201001.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.ZnshTjDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10201001.vs.F10201001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.StringTools;

public class F10201001VSImpl implements F10201001VS {

	private MedAuditBS medAuditBS;
	
	public ZnshTjDTO queryZnshTj(String baz020, boolean isDay) {
		if(!StringTools.hasText(baz020)){
			throw new BusinessException("F10201001VS-00:审核日期baz020为空");
		}
		
		return medAuditBS.queryZnshTj(baz020, isDay);
	}

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public Map<String, Object> queryZhshMxTjWithGz(Page page, String baz020,
			boolean isDay, int isHosp) {
		if(!StringTools.hasText(baz020)){
			throw new BusinessException("F10201001VS-01:审核日期baz020为空");
		}
		
		page = medAuditBS.queryZnshMXTj(page, baz020, isDay, false, isHosp);
		
		
		return GridUtils.getGridData(page);
	}

	public Map<String, Object> queryZhshMxTjWithYljg(Page page, String baz020,
			boolean isDay,  int isHosp) {
		
		if(!StringTools.hasText(baz020)){
			throw new BusinessException("F10201001VS-02:审核日期baz020为空");
		}
		
		page = medAuditBS.queryZnshMXTj(page, baz020, isDay, true, isHosp);
		
		return GridUtils.getGridData(page);
	}

}
