package com.wondersgroup.local.k2.f10204001.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k2.K2Context;
import com.wondersgroup.bc.k2.f10204001.bs.F10204001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10204001.vo.F10204001VO;
import com.wondersgroup.local.k2.f10204001.vo.Kc62VO;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10204001.vs.F10204001VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10204001VSImpl implements F10204001VS {

	private F10204001BS f10204001BS;

	public F10204001BS getF10204001BS() {
		return f10204001BS;
	}

	public void setF10204001BS(F10204001BS f10204001bs) {
		f10204001BS = f10204001bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10204001VO f10204001vo) {

		if (f10204001vo == null) {
			throw new BusinessException(
					"F10204001VS-00:分页查询违规单据统计信息传入f10204001vo为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10204001vo, queryDto);

		Page result = this.getF10204001BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10204001VO f10204001vo) {

		if (f10204001vo.getIds() == null) {
			throw new BusinessException("F10204001VS-00:分页查询传入ids为空！");
		}

		String strid = "";
		String[] ids = f10204001vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();

		BeanTools.copyProperties(f10204001vo, queryDto);

		queryDto.setBaz001(strid);

		Page result = this.getF10204001BS().queryKc62WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public F10204001VO queryMedDocumentDetailIllegal(F10204001VO f10204001vo) {

		if (f10204001vo == null) {
			throw new BusinessException(
					"F10204001VS-01:查询单据明细违规信息传入f10204001vo为空!");
		}

		Kc63DTO kc63Dto = this.getF10204001BS().getKc63ById(
				f10204001vo.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10204001VS-02:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(f10204001vo, queryDto);

		List<Kc72DTO> kc72List = this.getF10204001BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, f10204001vo);

		f10204001vo.setKc72List(kc72List);

		return f10204001vo;
	}

	/**
	 * 违规单据明细复议审核
	 * 
	 */
	public PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO) {

		if (!StringTools.hasText(returnVO.getIds())) {
			throw new BusinessException("F10204001VS:审核单据明细传入kc62ids为空！");
		}

		if (!StringTools.hasText(returnVO.getBaz102())) {
			throw new BusinessException("F10204001VS:审核单据明细信息传入baz102为空!");
		}

		String[] id = returnVO.getIds().split(",");
		List<Kc62DTO> kc62Dtos = this.getF10204001BS().findCaseID(
				returnVO.getIds());
		returnVO.setSuccess(kc62Dtos.size());
		returnVO.setError(id.length - kc62Dtos.size());
		// 复议审核单据明细
		for (Kc62DTO kc62Dto : kc62Dtos) {

			Kc81DTO kc81Dto = new Kc81DTO();

			kc81Dto.setBaz001(kc62Dto.getBaz001());
			kc81Dto.setBaz003(kc62Dto.getBaz003());
			kc81Dto.setBaz031(kc62Dto.getBaz031()); // 审核状态
			kc81Dto.setBaz021(returnVO.getBaz021()); // 审核意见
			kc81Dto.setBaz022(returnVO.getOperatorName());// 经办人
			kc81Dto.setBaz023(CommonJdbcDaoUtils.queryObject(
					"select sysdate from dual", Date.class));// 经办时间
			// 审核类型(人工审核)
			kc81Dto.setBaz025(K2Context.BAZ025_CODE_2);
			kc81Dto.setAae100(K2Context.AAE100_CODE_1);// 有效标志
			kc81Dto.setBaz033(kc62Dto.getBaz033());// 违规类型
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));// 经办月份
			kc81Dto.setBaz026(returnVO.getOrgan());//存放经办机构
			kc81Dto.setBaz102(returnVO.getBaz102()); // 复议状态改变
			// 同步单据明细复议状态
			
			if (K2Context.BAZ102_CODE_2.equals(returnVO.getBaz102())) {// 复议通过
				String result=isClear(kc62Dto.getBaz003(),returnVO.getOperatorId(),returnVO.getOperatorName(),kc62Dto.getBaz042());
				if (!"success".equals(result)) {//结算通过才能更新kc62
					throw new BusinessException("结算失败!失败原因："+result);
				}
				kc62Dto.setBaz102(K2Context.BAZ102_CODE_2);
				kc62Dto.setBaz042(0.0);
				kc81Dto.setBaz021("复议通过："+kc81Dto.getBaz021());
			} else if (K2Context.BAZ102_CODE_3.equals(returnVO.getBaz102())) {// 复议扣除
				if (returnVO.getBaz042() ==-1) {//复议全部扣除
					kc62Dto.setBaz042(kc62Dto.getBaz041());
					kc81Dto.setBaz021("复议全部扣除："+kc81Dto.getBaz021());
				}else {//复议部分扣除
					if (returnVO.getBaz042()!=kc62Dto.getBaz042()) {
						String result=isClear(kc62Dto.getBaz003(),returnVO.getOperatorId(),returnVO.getOperatorName(),(kc62Dto.getBaz042()-returnVO.getBaz042()));
						if (!"success".equals(result)) {//结算通过才能更新kc62
							throw new BusinessException("结算失败!失败原因："+result);
						}
						kc62Dto.setBaz042(returnVO.getBaz042());
						kc81Dto.setBaz041(returnVO.getBaz042());
						kc81Dto.setBaz021("复议部分扣除："+kc81Dto.getBaz021());
					}
				}
				kc62Dto.setBaz102(K2Context.BAZ102_CODE_3);
			}else {
				throw new BusinessException("F10204001VS:审核单据明细信息传入baz102有误!");
			}
			kc62Dto.setBaz102(returnVO.getBaz102());
			// 保存复议审核日志
			this.getF10204001BS().saveKc81(kc81Dto);

			kc62Dto.setBaz022(returnVO.getOperatorName());
			kc62Dto.setBaz023(new Date());
			this.getF10204001BS().updateKc62(kc62Dto);

		}

		return returnVO;

	}

	/**
	 * 结算并返回 成功标示
	 * @param baz003
	 * @param opId
	 * @param opName
	 * @return
	 */
	private String isClear(String baz003, String operatorId, String operatorName,Double je) {
		return this.getF10204001BS().isClear(baz003,operatorId,operatorName,je);
	}

}
