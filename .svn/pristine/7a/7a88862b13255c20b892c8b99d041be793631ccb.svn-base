package com.wondersgroup.local.k5.f10510001.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.k5.f10510001.bs.F10510001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc65DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10510001.vo.F10510001VO;
import com.wondersgroup.local.k5.f10510001.vs.F10510001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10510001VSImpl implements F10510001VS {

	private F10510001BS f10510001BS;

	public F10510001BS getF10510001BS() {
		return f10510001BS;
	}

	public void setF10510001BS(F10510001BS f10510001bs) {
		f10510001BS = f10510001bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10510001VO f10510001vo) {

		if (f10510001vo == null) {
			throw new BusinessException(
					"F10204001VS-00:分页查询违规单据统计信息传入f10204001vo为空!");
		}

		Kc65DTO queryDto = new Kc65DTO();

		BeanTools.copyProperties(f10510001vo, queryDto);

		Page result = this.getF10510001BS().queryKc65WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}



}
