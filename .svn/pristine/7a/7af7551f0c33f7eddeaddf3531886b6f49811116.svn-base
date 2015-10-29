package com.wondersgroup.local.k2.f10203002.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k2.K2Context;
import com.wondersgroup.bc.k2.f10203002.bs.F10203002BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.util.DateUtils;
import com.wondersgroup.local.k2.f10203002.vo.F10203002VO;
import com.wondersgroup.local.k2.f10203002.vo.Kc62VO;
import com.wondersgroup.local.k2.f10203002.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10203002.vo.QueryNumberVO;
import com.wondersgroup.local.k2.f10203002.vo.SuspectedVO;
import com.wondersgroup.local.k2.f10203002.vs.F10203002VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10203002VSImpl implements F10203002VS {

	private F10203002BS f10203002BS;

	public F10203002BS getF10203002BS() {
		return f10203002BS;
	}

	public void setF10203002BS(F10203002BS f10203002bs) {
		f10203002BS = f10203002bs;
	}

	public Map<String, Object> querySuspectedDocument(Page page,
			MedDocumentVO medDocumentVO) {
		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10203002VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		Page result = this.getF10203002BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> querySuspectedDocumentDetail(Page page,
			F10203002VO f10203002VO) {
		if (f10203002VO.getIds() == null) {
			throw new BusinessException("F10203002VS-01:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10203002VO.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();

		BeanTools.copyProperties(f10203002VO, queryDto);

		queryDto.setBaz001(strid);

		Page result = this.getF10203002BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public MedDocumentVO querySusDocumentDetailIllegal(
			MedDocumentVO medDocumentVO) {
		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10203002VS-02:查询单据明细违规信息传入medDocumentVO为空!");
		}
		String baz003 = medDocumentVO.getBaz003();
		Kc63DTO kc63Dto = this.getF10203002BS().getKc63ById(
				medDocumentVO.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10203002VS-03:没有查询到违规单据信息!");
		}
		if (!StringTools.hasText(medDocumentVO.getBaz003() + "")) {
			throw new BusinessException("F10203002VS-10:没有违规明细信息!");
		}
		double baz041 = this.getF10203002BS().getKc62ById(baz003);

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		List<Kc72DTO> kc72List = this.getF10203002BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, medDocumentVO);
		medDocumentVO.setBaz041(baz041);
		medDocumentVO.setKc72List(kc72List);
		medDocumentVO.setBaz003(baz003);
		return medDocumentVO;
	}

	public SuspectedVO susDocuDetailOperate(SuspectedVO suspectedVO) {

		if (!StringTools.hasText(suspectedVO.getIds())) {
			throw new BusinessException("F10203002VS-04:审核单据明细传入kc62ids为空！");
		}
		if (!StringTools.hasText(suspectedVO.getBaz031())) {
			throw new BusinessException("F10203002VS-05:审核单据明细信息传入baz031为空!");
		}
		if (!StringTools.hasText(suspectedVO.getBaz033())) {
			throw new BusinessException("F10203002VS-07:审核单据明细信息传入baz033为空!");
		}

		String[] id = suspectedVO.getIds().split(",");
		List<Kc62DTO> kc62Dtos = this.getF10203002BS().findCaseID(
				suspectedVO.getIds());
		suspectedVO.setSuccess(kc62Dtos.size());
		suspectedVO.setError(id.length - kc62Dtos.size());
		// 审核单据明细
		for (Kc62DTO kc62Dto : kc62Dtos) {
			Kc81DTO kc81Dto = new Kc81DTO();
			kc81Dto.setBaz001(kc62Dto.getBaz001());
			kc81Dto.setBaz003(kc62Dto.getBaz003());
			kc81Dto.setAae100(K2Context.AAE100_CODE_1); // 有效标志(有效）
			kc81Dto.setBaz033(suspectedVO.getBaz033()); // 违规类型
			kc81Dto.setBaz021(suspectedVO.getBaz021()); // 审核意见
			kc81Dto.setBaz041(suspectedVO.getBaz041());// 扣款金额
			// 审核状态改变
			kc81Dto.setBaz031(suspectedVO.getBaz031());
			// 操作人
			kc81Dto.setBaz022(suspectedVO.getOperatorName());
			//经办机构
			kc81Dto.setBaz026(suspectedVO.getOrgname());
			//操作时间
			kc81Dto.setBaz023(new Date());
			// 审核类型(人工审核)
			kc81Dto.setBaz025(K2Context.BAZ025_CODE_2);
			// 经办月份
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));

			if (K2Context.BAZ031_CODE_01.equals(suspectedVO.getBaz031())) {
				// 设置违规标志为正常
				kc62Dto.setBaz032(K2Context.BAZ032_CODE_0);
				kc62Dto.setBaz101("");
				kc81Dto.setBaz021("通过："+kc81Dto.getBaz021());
			} else if (K2Context.BAZ031_CODE_06.equals(suspectedVO.getBaz031())) {
				String result = isClear(kc62Dto.getBaz003(),
						suspectedVO.getOperatorId(),
						suspectedVO.getOperatorName(), kc62Dto.getBaz041());
				if (!"success".equals(result)) {// 结算通过才能更新kc62
					throw new BusinessException("结算失败!失败原因：" + result);
				}
				kc81Dto.setBaz021("手动扣款："+kc81Dto.getBaz021());
				kc81Dto.setBaz031(K2Context.BAZ031_CODE_06);
				kc62Dto.setBaz024(DateUtils.addDays(new Date(), 15));// 复议过期时间
				kc62Dto.setBaz032(K2Context.BAZ032_CODE_1);
				kc62Dto.setBaz102("0");
				kc62Dto.setBaz031(K2Context.BAZ031_CODE_06);
				kc62Dto.setBaz042(kc62Dto.getBaz041());// 拟扣金额变成已扣金额
			} else {
				kc81Dto.setBaz021("发医院："+kc81Dto.getBaz021());
				kc62Dto.setBaz032(K2Context.BAZ032_CODE_1);
				kc62Dto.setBaz024(DateUtils.addDays(new Date(), 15));// 申诉过期时间
				// 设置申诉状态为待申诉
				kc62Dto.setBaz031(K2Context.BAZ031_CODE_04);
				kc62Dto.setBaz101(K2Context.BAZ101_CODE_1);
				// 同步kc81申诉状态
				kc81Dto.setBaz101(K2Context.BAZ101_CODE_1);
			}
			// 同步单据明细审核状态
			kc62Dto.setBaz031(suspectedVO.getBaz031());
			// 保存操作日志
			this.getF10203002BS().saveKc81(kc81Dto);

			// 更新单据违规信息
			kc62Dto.setBaz022(suspectedVO.getOperatorName());
			kc62Dto.setBaz023(new Date());
			this.getF10203002BS().updateKc62(kc62Dto);
		}
		return suspectedVO;
	}

	/**
	 * 结算并返回 成功标示
	 * 
	 * @param baz003
	 * @param opId
	 * @param opName
	 * @return
	 */
	private String isClear(String baz003, String opId, String opName, Double je) {
		return this.getF10203002BS().isClear(baz003, opId, opName, je);
	}

	public List<QueryNumberVO> queryNumber(String akb020orakb021, String baz031) {
		// 要查询的医院编号
		List<QueryNumberVO> result = this.getF10203002BS().getQueryNumberVO(
				akb020orakb021, baz031);
		return result;
	}

}
