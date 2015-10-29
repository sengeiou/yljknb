package com.wondersgroup.local.k5.f10507001.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k5.K5Context;
import com.wondersgroup.bc.k5.f10507001.bs.F10507001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10507001.vo.F10507001VO;
import com.wondersgroup.local.k5.f10507001.vo.Kc62VO;
import com.wondersgroup.local.k5.f10507001.vs.F10507001VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10507001VSImpl implements F10507001VS {

	private F10507001BS f10507001BS;

	public F10507001BS getF10507001BS() {
		return f10507001BS;
	}

	public void setF10507001BS(F10507001BS f10507001bs) {
		f10507001BS = f10507001bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10507001VO f10507001vo) {

		if (f10507001vo == null) {
			throw new BusinessException(
					"F10507001VS-00:分页查询违规单据统计信息传入f10507001vo为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10507001vo, queryDto);

		Page result = this.getF10507001BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10507001VO f10507001vo) {

		if (f10507001vo.getIds() == null) {
			throw new BusinessException("F10507001VS-00:分页查询传入ids为空！");
		}

		String strid = "";
		String[] ids = f10507001vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();

		BeanTools.copyProperties(f10507001vo, queryDto);

		queryDto.setBaz001(strid);

		Page result = this.getF10507001BS().queryKc62WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public F10507001VO queryMedDocumentDetailIllegal(F10507001VO f10507001vo) {

		if (f10507001vo == null) {
			throw new BusinessException(
					"F10507001VS-01:查询单据明细违规信息传入f10507001vo为空!");
		}

		Kc63DTO kc63Dto = this.getF10507001BS().getKc63ById(
				f10507001vo.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10507001VS-02:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(f10507001vo, queryDto);

		List<Kc72DTO> kc72List = this.getF10507001BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, f10507001vo);

		f10507001vo.setKc72List(kc72List);

		return f10507001vo;
	}

	/**
	 * 违规单据明细复议申请
	 * 
	 */
	public PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO) {

		if (!StringTools.hasText(returnVO.getIds())) {
			throw new BusinessException("F10507001VS:申请单据明细传入kc62ids为空！");
		}

		if (!StringTools.hasText(returnVO.getBaz021())) {
			throw new BusinessException("F10507001VS:申请单据明细信息传入baz021为空!");
		}

		if (!StringTools.hasText(returnVO.getBaz102())) {
			throw new BusinessException("F10507001VS:申请单据明细信息传入baz102为空!");
		}

		UserContext userContext = BusinessContextUtils.getUserContext();
		String aae011 = userContext.getOperatorName();

		List<Kc62DTO> kc62Dtos = this.getF10507001BS().findCaseID(
				returnVO.getIds());

		// 复议申请单据明细
		for (Kc62DTO kc62Dto : kc62Dtos) {

			Kc81DTO kc81Dto = new Kc81DTO();

			kc81Dto.setBaz001(kc62Dto.getBaz001());
			kc81Dto.setBaz003(kc62Dto.getBaz003());
			kc81Dto.setBaz031(kc62Dto.getBaz031()); // 审核状态
			kc81Dto.setBaz021(returnVO.getBaz021()); // 申请说明
			kc81Dto.setBaz022(aae011);// 经办人
			kc81Dto.setBaz023(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));// 经办时间
			// 审核类型(人工审核)
			kc81Dto.setBaz025(K5Context.BAZ025_CODE_2);
			kc81Dto.setAae100(K5Context.AAE100_CODE_1);// 有效标志
			kc81Dto.setBaz033(kc62Dto.getBaz033());// 违规类型
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));// 经办月份

			kc81Dto.setBaz102(returnVO.getBaz102()); // 复议状态改变
			// System.out.println(returnVO.getBaz102());

			// 保存复议申请日志
			this.getF10507001BS().saveKc81(kc81Dto);
			
			//返回kc81的主键
			returnVO.setBaz005(kc81Dto.getBaz005());

			// 同步单据明细复议状态
			kc62Dto.setBaz102(returnVO.getBaz102());
			if (K5Context.BAZ102_CODE_5.equals(returnVO.getBaz102())) {
				kc62Dto.setBaz102(K5Context.BAZ102_CODE_5);
			}
			kc62Dto.setBaz022(aae011);
			kc62Dto.setBaz023(new Date());
			this.getF10507001BS().updateKc62(kc62Dto);

			if (StringTools.hasText(returnVO.getTargetFileName())) {

				this.saveUpload(returnVO);
			}

		}

		return returnVO;

	}

	/**
	 * 保存ke02附件信息
	 * */
	private PreCheckVO saveUpload(PreCheckVO returnVO) {
		Ke02DTO dto = new Ke02DTO();
		String[] str = returnVO.getTargetFileName().split("\\.");
		String ftype = str[str.length - 1];
		String fpath = K5Context.UPLOADPATH+"/"+ returnVO.getTargetFileName();
		String fname = returnVO.getFiledataFileName();
		String fuser = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人
		dto.setBaz035(ftype);
		dto.setBaz036(fpath);
		dto.setBaz037(fname);
		dto.setBaz038(fuser);
		dto.setBaz005(returnVO.getBaz005());
		dto = this.getF10507001BS().saveKe02(dto);
		BeanTools.copyProperties(dto, returnVO);
		return returnVO;
	}

}
