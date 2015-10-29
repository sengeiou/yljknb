package com.wondersgroup.local.k2.f10205001.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k2.K2Context;
import com.wondersgroup.bc.k2.f10205001.bs.F10205001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc65DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc83DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10205001.vo.F10205001VO;
import com.wondersgroup.local.k2.f10205001.vs.F10205001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10205001VSImpl implements F10205001VS {

	private F10205001BS f10205001BS;

	public F10205001BS getF10205001BS() {
		return f10205001BS;
	}

	public void setF10205001BS(F10205001BS f10205001bs) {
		f10205001BS = f10205001bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10205001VO f10205001vo) {

		if (f10205001vo == null) {
			throw new BusinessException(
					"F10204001VS-00:分页查询违规单据统计信息传入f10204001vo为空!");
		}

		Kc65DTO queryDto = new Kc65DTO();

		BeanTools.copyProperties(f10205001vo, queryDto);

		Page result = this.getF10205001BS().queryKc65WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}


	public F10205001VO queryMedDocumentDetailIllegal(F10205001VO f10205001vo) {

		if (f10205001vo == null) {
			throw new BusinessException(
					"F10204001VS-01:查询单据明细违规信息传入f10204001vo为空!");
		}

		Kc65DTO kc65Dto = this.getF10205001BS().getKc65ById(
				f10205001vo.getBaz011());

		if (!StringTools.hasText(kc65Dto.getBaz011())) {
			throw new BusinessException("F10204001VS-02:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(f10205001vo, queryDto);

		List<Kc72DTO> kc72List = this.getF10205001BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc65Dto, f10205001vo);

		f10205001vo.setKc72List(kc72List);

		return f10205001vo;
	}


	public F10205001VO dealMedDocument(F10205001VO f10205001vo) {
		if (!StringTools.hasText(f10205001vo.getIds())) {
			throw new BusinessException("F10205001VS:审核单据明细传入kc65ids为空！");
		}
		if (!StringTools.hasText(f10205001vo.getBaz031())) {
			throw new BusinessException("F10205001VS:审核单据明细信息传入baz031为空!");
		}
		String[] id = f10205001vo.getIds().split(",");
		List<Kc65DTO> kc65Dtos=this.getF10205001BS().findKc65CaseID(f10205001vo.getIds());
		f10205001vo.setSuccess(kc65Dtos.size());
		f10205001vo.setError(id.length - kc65Dtos.size());
		for (Kc65DTO kc65Dto : kc65Dtos) {
			Kc83DTO kc83Dto = new Kc83DTO();
			kc83Dto.setBaz011(kc65Dto.getBaz011());
			kc83Dto.setAae100(K2Context.AAE100_CODE_1); // 有效标志(有效）
			kc83Dto.setBaz021(f10205001vo.getBaz021()); // 审核意见
			// 审核状态改变
			kc83Dto.setBaz031(f10205001vo.getBaz031());
			// 操作人
			kc83Dto.setBaz022(f10205001vo.getOperatorName());
			//经办机构
			kc83Dto.setBaz026(f10205001vo.getOrgname());
			//操作时间
			kc83Dto.setBaz023(new Date());
			//违规类型
			kc83Dto.setBaz033("1");//单据违规
			if (K2Context.BAZ031_CODE_15.equals(f10205001vo.getBaz031())) {
				// 设置状态为通过
				kc65Dto.setBaz031(K2Context.BAZ031_CODE_15);
				kc83Dto.setBaz021("通过："+kc83Dto.getBaz021());
				kc83Dto.setAka131(kc65Dto.getAka133());
				kc65Dto.setAka134(kc65Dto.getAka133());
			} else if(K2Context.BAZ031_CODE_16.equals(f10205001vo.getBaz031())){
				kc83Dto.setBaz021("不通过："+kc83Dto.getBaz021());
				// 设置状态为不通过
				kc65Dto.setBaz031(K2Context.BAZ031_CODE_16);
				kc65Dto.setAka134(kc65Dto.getAka132());
				kc83Dto.setAka131(kc65Dto.getAka132());
			}
			// 保存操作日志
			this.getF10205001BS().saveKc83(kc83Dto);
			
			// 更新单据违规信息
			this.getF10205001BS().updateKc65(kc65Dto);
		}
		return f10205001vo;
	}

}
