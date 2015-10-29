package com.wondersgroup.local.k3.f10301001.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k3.f10301001.vo.AuditProblemVO;
import com.wondersgroup.local.k3.f10301001.vs.F10301001VS;
import com.wondersgroup.wssip.bc.commons.event.BusilogUtils;
import com.wondersgroup.wssip.bc.commons.event.model.dto.BusilogCreateDTO;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301001VSImpl implements F10301001VS {

	private AdminDisposalBS adminDisposalBS;

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public AuditProblemVO saveAuditProblem(AuditProblemVO resultVO) {

		if (resultVO == null) {
			throw new BusinessException("F10301001VS-00:传入参数为空!");
		}

		@SuppressWarnings("unused")
		BusilogCreateDTO busilogCreateDto = BusilogUtils
				.createBusinessLog("1030100101");// 业务日志 保存外部受理登记 疑点

		// BusilogCheckDTO busilogCheckDTO = new BusilogCheckDTO();

		// busilogCheckDTO.setAaz002(busilogCreateDto.getAaz002());

		// BusilogUtils.checkBusiness(busilogCheckDTO);

		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人

		resultVO.setAae011(aae011);// 设置当前操作人

		resultVO.setApa165(AuditConstants.APA165_CODE_1);// 设置状态 待稽核立案

		resultVO.setAae036(new Date());// 设置当前时间

		resultVO.setApa166(AuditConstants.APA166_CODE_0);// 设置问题关闭标志为0

		Af32DTO af32Dto = new Af32DTO();
		Af32DTO af32dto2 = this.getAdminDisposalBS().getMaxAaz171();
		String aaz171 = "";
		String aaz171_1 =  DateTools.getSystemYear();
		if(af32dto2.getAaz171() == null || "0000000".equals(af32dto2.getAaz171())){
			aaz171 = aaz171_1 + "001";
		}else{
			aaz171 = String.valueOf(((Integer.valueOf(af32dto2.getAaz171())) + 1));
		}
		BeanTools.copyProperties(resultVO, af32Dto);
		
		af32Dto.setAaz171(aaz171);
		
		af32Dto.setWtsc(AuditConstants.WTSC_CODE_0); // 问题删除标志

		af32Dto = this.getAdminDisposalBS().SaveAf32(af32Dto);

		BeanTools.copyProperties(af32Dto, resultVO);

		return resultVO;

	}

	public AuditProblemVO updateAuditProblem(AuditProblemVO resultVO) {
		if (resultVO == null) {
			throw new BusinessException("F10301001VS-01:修改的时候 传入疑点问题参数为空!");
		}

		if (resultVO.getAaz281() == null) {
			throw new BusinessException("F10301001VS-02:修改的时候 传入疑点问题主键为空!");
		}

		@SuppressWarnings("unused")
		BusilogCreateDTO busilogCreateDto = BusilogUtils
				.createBusinessLog("1030100102");// 业务日志 修改外部受理登记疑点信息

		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();

		resultVO.setAae011(aae011);

		Af32DTO af32Dto = this.getAdminDisposalBS().getAf32ById(
				String.valueOf(resultVO.getAaz281()));

		if (AuditConstants.APA165_CODE_2.equals(af32Dto.getApa165())) {
			throw new BusinessException("F10301001VS-03:提示，该疑点问题已被其他经办人员关闭了");
		}

		if (AuditConstants.APA165_CODE_3.equals(af32Dto.getApa165())) {
			throw new BusinessException("F10301001VS-04:提示，该疑点问题已被其他经办人员稽核立案了!");
		}

		if (AuditConstants.APA165_CODE_4.equals(af32Dto.getApa165())) {
			throw new BusinessException("F10301001VS-05:提示，该疑点问题已被其他经办人员不予立案!");
		}

		BeanTools.copyPropertiesIgnoreNull(resultVO, af32Dto);

		af32Dto = this.getAdminDisposalBS().updateAf32(af32Dto);

		return resultVO;
	}

	public Map<String, Object> queryAuditProblemWithPage(Page page,
			AuditProblemVO auditProblemVO) {

		Page result = this.getAdminDisposalBS().queryAuditProblemWithPage(page,
				auditProblemVO);

		for (int i = 0; i < result.getResult().size(); i++) {

			Af32DTO af32Dto = (Af32DTO) result.getResult().get(i);

			if (af32Dto.getApe711() != 0) {

				String str = String.valueOf(af32Dto.getApe711());

				Date ape711s = DateTools.parseDate(str, "yyyyMMdd");

				af32Dto.setApe711s(ape711s);
			}
		}

		return GridUtils.getGridData(result);
	}

	public AuditProblemVO queryAuditProblemById(String aaz281) {

		AuditProblemVO returnVO = new AuditProblemVO();

		if (aaz281 == null) {
			throw new BusinessException(
					"F10301001VS-10:提示，根据主键查询一个af32对象，主键aaz281为空!");
		}

		Af32DTO af32DTO = this.getAdminDisposalBS().getAf32ById(aaz281);

		if (af32DTO.getApe711() != null) {

			String str = String.valueOf(af32DTO.getApe711());

			Date ape711s = DateTools.parseDate(str, "yyyyMMdd");

			af32DTO.setApe711s(ape711s);
		}

		if (af32DTO.getApe027() != null) {

			String str = String.valueOf(af32DTO.getApe027());

			Date ape027s = DateTools.parseDate(str, "yyyyMMdd");

			af32DTO.setApe027s(ape027s);
		}

		List<Af53DTO> af53List = this.getAdminDisposalBS().findCaseID(
				Long.valueOf(aaz281));

		if (af53List != null && af53List.size() > 0) {

			String abz001 = af53List.get(0).getAbz001();

			if (StringTools.hasText(abz001)) {

				af32DTO.setAbz001(abz001);
			}
		}

		BeanTools.copyProperties(af32DTO, returnVO);

		return returnVO;
	}

	public AuditProblemVO deleteAuditProblemByIds(String aaz281s) {

		if (!StringTools.hasText(aaz281s)) {
			throw new BusinessException("F10301001VS-11:提示，根据主键删除疑点信息，传入的主键为空!");
		}

		@SuppressWarnings("unused")
		BusilogCreateDTO busilogCreateDto = BusilogUtils
				.createBusinessLog("1030100103");// 业务日志 根据主键删除疑点信息

		String[] aaz281Str = aaz281s.split(",");

		String ids = "";

		for (int i = 0; i < aaz281Str.length; i++) {

			String aaz281 = aaz281Str[i];

			Af32DTO af32Dto = this.getAdminDisposalBS().getAf32ById(aaz281);

			if (AuditConstants.APA165_CODE_2.equals(af32Dto.getApa165())) {
				continue;
			}

			if (AuditConstants.APA165_CODE_3.equals(af32Dto.getApa165())) {
				continue;
			}

			if (AuditConstants.APA165_CODE_4.equals(af32Dto.getApa165())) {
				continue;
			}

			if (i == aaz281Str.length - 1) {
				ids = ids + aaz281Str[i];
			} else {
				ids = ids + aaz281Str[i] + ",";
			}
		}

		AuditProblemVO resultVO = new AuditProblemVO();

		this.getAdminDisposalBS().deleteAf32ByIds(ids);

		return resultVO;
	}

	public AuditProblemVO simpExcute(String aaz281s,String aae200) {
		if (!StringTools.hasText(aaz281s)) {
			throw new BusinessException("F10301001VS-12:提示，传入的主键为空!");
		}
		if(!StringTools.hasText(aaz281s)){
			throw new BusinessException("F10301001VS-12:提示，传入的处理意见为空!");
		}
		AuditProblemVO resultVO = new AuditProblemVO();
		this.getAdminDisposalBS().updateAf32Byid(aaz281s,aae200);
		return resultVO;
	}

	public Map<String, Object> queryAf32WithMap(AuditProblemVO auditProblemVO) {
		if(auditProblemVO.getAaz281() == null){
			throw new BusinessException("F10301001VSImpl-03:获取导出数据失败!");
		}
		Map<String, Object> dataMap = this.getAdminDisposalBS().queryAf32WithMap(auditProblemVO.getAaz281());
		return dataMap;
	}

}
