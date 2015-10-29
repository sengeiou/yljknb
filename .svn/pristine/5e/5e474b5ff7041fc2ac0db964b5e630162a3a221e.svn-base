package com.wondersgroup.local.k6.f10605001.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kcnb11DTO;
import com.wondersgroup.bc.k6.f10605001.bs.F10605001BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k6.f10605001.vo.MedInstitutionVO;
import com.wondersgroup.local.k6.f10605001.vo.MediFeeTendVO;
import com.wondersgroup.local.k6.f10605001.vs.F10605001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10605001VSImpl implements F10605001VS {

	private F10605001BS f10605001BS;

	public F10605001BS getF10605001BS() {
		return f10605001BS;
	}

	public void setf10605001BS(F10605001BS f10605001BS) {
		this.f10605001BS = f10605001BS;
	}

	/*public String queryStrip(MediFeeTendVO returnVO) {

		if (returnVO == null) {
			throw new BusinessException("F10605001VS-00:传入参数为空!");
		}


		if (StringTools.hasText(returnVO.getAae042End())) {

			String aae042 = returnVO.getAae042End().replaceAll("-", "");

			returnVO.setAae042(aae042);
		}

		if (StringTools.hasText(returnVO.getFyqs())) {
			returnVO.setAnalcode(returnVO.getFyqs());
		}

		String userid = BusinessContextUtils.getUserContext().getOperatorId();// 当前操作人id

		returnVO.setUserid(userid);// 设置当前人id

		returnVO.setAaa027("310000");

		returnVO.setIsdelete(K6Context.ISDELETE_CODE_0);// 不重新生成

		MediFeeTrendDTO mftDto = new MediFeeTrendDTO();

		BeanTools.copyProperties(returnVO, mftDto);

		mftDto = this.getF10605001BS().queryAnalidByMediFee(mftDto);// 调用存储过程

		if (!StringTools.hasText(mftDto.getAnalid())) {
			throw new BusinessException("F10605001VS-01:根据存过 查询分析id为空!");
		}

		returnVO.setAnalid(mftDto.getAnalid());// 设置分析id

		List<MediMoveAvgDTO> result = this.getF10605001BS()
				.queryMediFeeTrendList(returnVO);

		String xAxisCategories = "";// 横坐标 时间 memo

		String dates1 = "";// valueA 医疗费用

		String dates2 = "";// valueB 移动平均

		for (MediMoveAvgDTO mediMoveAvgDTO : result) {

			xAxisCategories = xAxisCategories + "\"" + mediMoveAvgDTO.getMemo()
					+ "\",";

			dates1 = dates1 + mediMoveAvgDTO.getValueA() + ",";

			dates2 = dates2 + mediMoveAvgDTO.getValueB() + ",";
		}

		xAxisCategories = "["
				+ xAxisCategories.substring(0, xAxisCategories.length() - 1)
				+ "]";

		dates1 = "[" + dates1.substring(0, dates1.length() - 1) + "]";

		dates2 = "[" + dates2.substring(0, dates2.length() - 1) + "]";

		String jsonData = "{\"xAxisCategories\":" + xAxisCategories
				+ ",\"dates1\":" + dates1 + ",\"dates2\":" + dates2
				+ ",\"analid\":" + returnVO.getAnalid() + "}";

		return jsonData;
	}*/

	public Map<String, Object> queryMedInstitutionObjWithPage(Page page,
			MedInstitutionVO medInstitutionVO) {

//		Kb01DTO queryDto = new Kb01DTO();
		Kcnb11DTO queryDto = new Kcnb11DTO();
		
		BeanTools.copyProperties(medInstitutionVO, queryDto);

		Page result = this.getF10605001BS().queryKcnb11WithPage(page,
				queryDto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryMediFeeTrendWithPage(Page page,
			MediFeeTendVO returnVO) {

		if (returnVO == null) {
			throw new BusinessException("F10605001VS-01:传入参数为空!");
		}

		if (StringTools.hasText(returnVO.getAae041())) {
			String aae041 = returnVO.getAae041().replace("-", "");
			returnVO.setAae041(aae041);
		}

		if (StringTools.hasText(returnVO.getAae042())) {

			String aae042 = returnVO.getAae042().replaceAll("-", "");

			returnVO.setAae042(aae042);
		}

		Page result = this.getF10605001BS().queryMediFeeTrendWithPage(page,
				returnVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}
	
	
}
