package com.wondersgroup.local.k2.f10206001.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.k2.f10206001.bs.F10206001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc65DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10206001.vo.F10206001VO;
import com.wondersgroup.local.k2.f10206001.vs.F10206001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10206001VSImpl implements F10206001VS {

	private F10206001BS f10206001BS;

	public F10206001BS getF10206001BS() {
		return f10206001BS;
	}

	public void setF10206001BS(F10206001BS f10206001bs) {
		f10206001BS = f10206001bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10206001VO f10206001vo) {

		if (f10206001vo == null) {
			throw new BusinessException(
					"F10204001VS-00:分页查询违规单据统计信息传入f10204001vo为空!");
		}

		Kc65DTO queryDto = new Kc65DTO();

		BeanTools.copyProperties(f10206001vo, queryDto);

		Page result = this.getF10206001BS().queryKc65WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}



}
