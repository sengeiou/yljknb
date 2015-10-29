package com.wondersgroup.local.k5.f10504001.vs.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.k5.K5Context;
import com.wondersgroup.bc.k5.f10504001.bs.F10504001BS;
import com.wondersgroup.bc.medicarecostaudit.MedConstants;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10504001.vo.QueryDocVO;
import com.wondersgroup.local.k5.f10504001.vs.F10504001VS;
import com.wondersgroup.local.k5.f10504003.vo.QueryNumberVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10504001VSImpl implements F10504001VS {

	private F10504001BS f10504001Bs;

	public F10504001BS getF10504001Bs() {
		return f10504001Bs;
	}

	public void setF10504001Bs(F10504001BS f10504001Bs) {
		this.f10504001Bs = f10504001Bs;
	}

	public Map<String, Object> queryComplaintHandling(Page page,
			ComplaintHandlingVO complaintHandlingVO) {
		if (complaintHandlingVO == null) {
			throw new BusinessException(
					"F10504001VS-00:分页查询申诉单据统计信息传入complaintHandlingVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(complaintHandlingVO, queryDto);

		Page result = this.getF10504001Bs().queryComplaintHandling(page,
				queryDto);

		return GridUtils.getGridData(result);
	}

	public ComplaintHandlingVO queryComplaintHandlingDetail(
			ComplaintHandlingVO complaintHandlingVO) {
		if (complaintHandlingVO == null) {
			throw new BusinessException(
					"F10504001VS-01:分页查询申诉单据描述统计信息传入complaintHandlingVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();

		BeanTools.copyProperties(complaintHandlingVO, queryDto);

		List<Kc73DTO> kc73List = this.getF10504001Bs()
				.queryComplaintHandlingDetail(queryDto);

		complaintHandlingVO.setKc73List(kc73List);

		return complaintHandlingVO;
	}

	public Map<String, Object> queryComplaintHandlingPage(Page page,
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		if (complaintHandlingKc62VO.getIds() == null) {
			throw new BusinessException("F10504001VS-00:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = complaintHandlingKc62VO.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		ComplaintHandlingKc62VO kc62VO = new ComplaintHandlingKc62VO();

		BeanTools.copyProperties(complaintHandlingKc62VO, kc62VO);

		kc62VO.setBaz001(strid);
		Page result = this.getF10504001Bs().queryComplaintHandlingInfo(page,
				kc62VO);

		return GridUtils.getGridData(result);
	}

	public ComplaintHandlingKc62VO queryComplaintHandlingInfoDetail(
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		if (complaintHandlingKc62VO == null) {
			throw new BusinessException(
					"F10504001VS-01:分页查询申诉单据描述统计信息传入complaintHandlingKc62VO为空!");
		}
		Kc63DTO kc63Dto = this.getF10504001Bs().getKc63ById(
				complaintHandlingKc62VO.getBaz001());

		Kc72DTO kc72Dto = new Kc72DTO();

		BeanTools.copyProperties(complaintHandlingKc62VO, kc72Dto);

		List<Kc72DTO> kc72List = this.getF10504001Bs()
				.queryComplaintHandlingInfoDetail(kc72Dto);

		complaintHandlingKc62VO.setKc72List(kc72List);
		complaintHandlingKc62VO.setAkc050(kc63Dto.getAkc050());
		return complaintHandlingKc62VO;
	}

	public QueryDocVO updateComplaintHandlingKc62(
			List<ComplaintHandlingKC86VO> listKc81) {
		QueryDocVO returnVO = new QueryDocVO();
		int suCount = 0;
		int toCount = 0;
		int erCount = 0;
		if (listKc81 != null) {
			toCount = listKc81.size();
			for (int i = 0; i < listKc81.size(); i++) {
				ComplaintHandlingKC86VO kc81Vo = listKc81.get(i);
				if (kc81Vo.getBaz003() == null) {
					throw new BusinessException("F10504001VS-00:申诉处理BAZ003为空!");
				}

				if (!MedConstants.BAZ101_CODE_1.equals(kc81Vo.getBaz101())
						&& !MedConstants.BAZ031_CODE_04.equals(kc81Vo
								.getBaz031())) {
					throw new BusinessException(
							"F10504001VS-1:待人工初审和待申诉的明细才能送申诉处理!");
				}
				Boolean find = this.getF10504001Bs().queryKc05(
						kc81Vo.getBaz003());
				if (kc81Vo.getBazValue().equals("2")) {
					if (find) {
						suCount++;
					} else {
						erCount++;
						continue;
					}
				}
				// 更新数据信息
				Kc81DTO queryDto = new Kc81DTO();

				Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,
						kc81Vo.getBaz003());
				if (kc81Vo.getBazValue().equals("2")
						&& kc62.getBaz101().equals("2")) {
				} else {
					if (kc81Vo.getBazValue().equals("2")) {
						kc81Vo.setBaz021("提出申诉："+kc81Vo.getBaz021());
						kc62.setBaz101(kc81Vo.getBazValue());
						queryDto.setBaz101(kc81Vo.getBazValue());
						queryDto.setBaz031(kc81Vo.getBaz031());
						queryDto.setBaz041(kc62.getBaz041());
					} else if ("4".equals(kc81Vo.getBazValue())) {// 放弃申诉
						String result=isClear(kc62.getBaz003(),kc81Vo.getOperatorId(),kc81Vo.getOperatorName(),kc62.getBaz041());
						if (!"success".equals(result)) {//结算通过才能更新kc62
							throw new BusinessException("结算失败!失败原因："+result);
						}
						kc81Vo.setBaz021("放弃申诉："+kc81Vo.getBaz021());
						kc62.setBaz031("06");// kc62状态位baz031改为 已扣款 06
						kc62.setBaz101("4");// kc62状态位baz101 扣除（放弃申诉）
						kc62.setBaz102("6");// kc62状态位baz102改为 放弃复议 6 （新增状态）
						kc62.setBaz042(kc62.getBaz041());// 拟扣金额放到已扣金额中
						queryDto.setBaz101(kc81Vo.getBazValue());
						queryDto.setBaz031("06");
						queryDto.setBaz102("6");
					} else {
						kc62.setBaz031(kc81Vo.getBazValue());
						queryDto.setBaz031(kc81Vo.getBazValue());
						queryDto.setBaz101(kc81Vo.getBaz101());
						queryDto.setBaz041(kc62.getBaz041());
					}
					kc62.setBaz022(kc81Vo.getOperatorName());
					kc62.setBaz023(new Date());
					CommonHibernateDaoUtils.update(kc62);
					// 插入日志数据信息
					queryDto.setBaz001(kc81Vo.getBaz001());
					queryDto.setBaz003(kc81Vo.getBaz003());
					queryDto.setAae100(AuditConstants.AAE100_CODE_1);
					queryDto.setBaz033(kc81Vo.getBaz033());
					queryDto.setBaz021(kc81Vo.getBaz021());
					queryDto.setBaz026(kc81Vo.getOrgan());
					queryDto.setBaz022(kc81Vo.getOperatorName());
					queryDto.setBaz023(new Date());
					queryDto.setBaz025(MedConstants.BAZ025_CODE_2);
					queryDto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
					this.getF10504001Bs().saveKc81(queryDto);
				}
			}
		}
		returnVO.setSuCount(suCount);
		returnVO.setErCount(erCount);
		returnVO.setToCount(toCount);
		return returnVO;

	}

	public List<QueryNumberVO> queryNumber(String akb020orakb021, String baz101) {
		List<QueryNumberVO> result = this.getF10504001Bs().getQueryNumberVO(
				akb020orakb021, baz101);
		return result;
	}

	public PreCheckVO preCheckZjssDetail(PreCheckVO returnVO) {
		if (!StringTools.hasText(returnVO.getIds())) {
			throw new BusinessException("F10504001VS:申请单据明细传入kc62ids为空！");
		}

		if (!StringTools.hasText(returnVO.getBaz021())) {
			throw new BusinessException("F10504001VS:申诉单据明细信息传入baz021为空!");
		}

		if (!StringTools.hasText(returnVO.getBaz031())) {
			throw new BusinessException("F10504001VS:申诉单据明细信息传入baz031为空!");
		}
		List<Kc62DTO> kc62Dtos = this.getF10504001Bs().findCaseID(
				returnVO.getIds());

		// 申诉单据明细
		for (Kc62DTO kc62Dto : kc62Dtos) {

			Kc81DTO kc81Dto = new Kc81DTO();

			kc81Dto.setBaz001(kc62Dto.getBaz001());
			kc81Dto.setBaz003(kc62Dto.getBaz003());
			kc81Dto.setBaz031(kc62Dto.getBaz031()); // 审核状态
			kc81Dto.setBaz021("提出申诉："+returnVO.getBaz021()); // 申请说明
			kc81Dto.setBaz022(returnVO.getOperatorName());// 经办人
			kc81Dto.setBaz023(CommonJdbcDaoUtils.queryObject(
					"select sysdate from dual", Date.class));// 经办时间
			kc81Dto.setBaz026(returnVO.getOrgan());
			// 审核类型(人工审核)
			kc81Dto.setBaz025(K5Context.BAZ025_CODE_2);
			kc81Dto.setAae100(K5Context.AAE100_CODE_1);// 有效标志
			kc81Dto.setBaz033(kc62Dto.getBaz033());// 违规类型
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));// 经办月份

			kc81Dto.setBaz031(returnVO.getBaz031()); // 申诉状态改变

			// 保存直接申诉日志
			this.getF10504001Bs().saveKc81(kc81Dto);

			// 返回kc81的主键
			returnVO.setBaz005(kc81Dto.getBaz005());

			// 同步单据明细复议状态
			kc62Dto.setBaz031(returnVO.getBaz031());
			if (K5Context.BAZ102_CODE_3.equals(returnVO.getBaz102())) {
				kc62Dto.setBaz102(K5Context.BAZ102_CODE_3);
			}
			kc62Dto.setBaz022(returnVO.getOperatorName());
			kc62Dto.setBaz023(new Date());
			Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,
					kc62Dto.getBaz003());

			BeanTools.copyPropertiesIgnoreNull(kc62Dto, kc62);

			CommonHibernateDaoUtils.update(kc62);

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
		String fpath = K5Context.UPLOADPATH + "/"
				+ returnVO.getTargetFileName();
		String fname = returnVO.getFiledataFileName();
		String[] str = returnVO.getTargetFileName().split("\\.");
		String ftype = str[str.length - 1];
		String fuser = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人
		dto.setBaz035(ftype);
		dto.setBaz036(fpath);
		dto.setBaz037(fname);
		dto.setBaz038(fuser);
		dto.setBaz005(returnVO.getBaz005());
		dto = this.getF10504001Bs().saveKe02(dto);
		BeanTools.copyProperties(dto, returnVO);
		return returnVO;
	}
	
	/**
	 * 结算并返回 成功标示
	 * @param baz003
	 * @param opId
	 * @param opName
	 * @param je 
	 * @return
	 */
	private String isClear(String baz003, String opId, String opName, Double je) {
		return this.getF10504001Bs().isClear(baz003,opId,opName,je);
	}

	public List<Map<String, Object>> findKc62ByIds(String ids) throws ParseException {
		if(!StringTools.hasText(ids)) {
			throw new BusinessException("F10201002-12: 未获取到相应的Ids");
		}
		
		String strids = "";
		String[] id = ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				strids += "'" + id[i] + "'";
			} else {
				strids += "'" + id[i] + "',";
			}
		}
		List<Map<String, Object>> listKc62 = this.getF10504001Bs().findKc62List(strids);
		
		return listKc62;
	}
}
