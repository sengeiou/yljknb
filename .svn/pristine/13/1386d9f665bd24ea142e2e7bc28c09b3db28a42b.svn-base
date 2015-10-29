package com.wondersgroup.local.k5.f10504002.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.k5.f10504002.bs.F10504002BS;
import com.wondersgroup.bc.medicarecostaudit.MedConstants;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10504002.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10504002.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10504002.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10504002.vs.F10504002VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10504002VSImpl implements F10504002VS {

	private F10504002BS f10504002Bs;



	public F10504002BS getF10504002Bs() {
		return f10504002Bs;
	}

	public void setF10504002Bs(F10504002BS f10504002Bs) {
		this.f10504002Bs = f10504002Bs;
	}

	public Map<String, Object> queryComplaintHandling(Page page,
			ComplaintHandlingVO complaintHandlingVO) {
		if (complaintHandlingVO == null) {
			throw new BusinessException(
					"F10504002VS-00:分页查询申诉单据统计信息传入complaintHandlingVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(complaintHandlingVO, queryDto);

		Page result = this.getF10504002Bs().queryComplaintHandling(page,
				queryDto);

		return GridUtils.getGridData(result);
	}

	public ComplaintHandlingVO queryComplaintHandlingDetail(
			ComplaintHandlingVO complaintHandlingVO) {
		if (complaintHandlingVO == null) {
			throw new BusinessException(
					"F10504002VS-01:分页查询申诉审核单据描述统计信息传入complaintHandlingVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();

		BeanTools.copyProperties(complaintHandlingVO, queryDto);

		List<Kc73DTO> kc73List = this.getF10504002Bs().queryComplaintHandlingDetail(queryDto);

		complaintHandlingVO.setKc73List(kc73List);

		return complaintHandlingVO;
	}

	public Map<String, Object> queryComplaintHandlingPage(Page page,
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		if (complaintHandlingKc62VO.getIds() == null) {
			throw new BusinessException("F10504002VS-00:分页查询传入ids为空!");
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
		Page result = this.getF10504002Bs().queryComplaintHandlingInfo(page,kc62VO);

		return GridUtils.getGridData(result);
	}

	public ComplaintHandlingKc62VO queryComplaintHandlingInfoDetail(
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		if (complaintHandlingKc62VO == null) {
			throw new BusinessException(
					"F10504002VS-01:分页查询申诉审核单据描述统计信息传入complaintHandlingKc62VO为空!");
		}
		Kc63DTO kc63Dto = this.getF10504002Bs().getKc63ById(
				complaintHandlingKc62VO.getBaz001());
		
		Kc72DTO kc72Dto = new Kc72DTO();

		BeanTools.copyProperties(complaintHandlingKc62VO, kc72Dto);

		List<Kc72DTO> kc72List = this.getF10504002Bs().queryComplaintHandlingInfoDetail(kc72Dto);

		complaintHandlingKc62VO.setKc72List(kc72List);

		complaintHandlingKc62VO.setAkc050(kc63Dto.getAkc050());
		
		return complaintHandlingKc62VO;
	}

	public void updateComplaintHandlingKc62(List<ComplaintHandlingKC86VO> listKc81) {
		UserContext userContext = BusinessContextUtils.getUserContext();
		String aae011 = userContext.getOperatorName();
		if(listKc81!=null){
			for (int i = 0; i < listKc81.size(); i++) {
				ComplaintHandlingKC86VO kc81Vo=listKc81.get(i);
				if (kc81Vo.getBaz003() == null) {
					throw new BusinessException("F10504002VS-00:申诉审核BAZ003为空!");
				}
				
			    if (!MedConstants.BAZ101_CODE_3.equals(kc81Vo.getBaz101())
								&& !MedConstants.BAZ031_CODE_04.equals(kc81Vo.getBaz031())) {
					 throw new BusinessException("F10504002VS-1:待医保办审核和待申诉的明细才能送申诉处理!");
				}
					//更新数据信息
			        Kc81DTO queryDto = new Kc81DTO();
					Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,kc81Vo.getBaz003());
					if(kc81Vo.getBazValue().equals("2")){
						kc62.setBaz101(kc81Vo.getBazValue());
						queryDto.setBaz101(kc81Vo.getBazValue());
						queryDto.setBaz031(kc81Vo.getBaz031());
					}else{
						kc62.setBaz031(kc81Vo.getBazValue());
						queryDto.setBaz031(kc81Vo.getBazValue());
						queryDto.setBaz101(kc81Vo.getBaz101());
					}
					kc62.setBaz022(aae011);
					kc62.setBaz023(new Date());
					CommonHibernateDaoUtils.update(kc62);
					// 插入日志数据信息
					queryDto.setBaz001(kc81Vo.getBaz001());
					queryDto.setBaz003(kc81Vo.getBaz003());
					queryDto.setAae100(AuditConstants.AAE100_CODE_1);
					queryDto.setBaz033(kc81Vo.getBaz033());
					queryDto.setBaz021(kc81Vo.getBaz021());
					queryDto.setBaz022(aae011);
					queryDto.setBaz023(new Date());
					queryDto.setBaz025(MedConstants.BAZ025_CODE_2);
					queryDto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
					this.getF10504002Bs().saveKc81(queryDto);
			}
		}
		
	}
}

