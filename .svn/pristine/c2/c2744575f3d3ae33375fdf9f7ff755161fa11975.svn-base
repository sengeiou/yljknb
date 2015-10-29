package com.wondersgroup.local.k5.f10506002.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.k2.K2Context;
import com.wondersgroup.bc.k5.f10506002.bs.F10506002BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10506002.vo.QueryNumberVO;
import com.wondersgroup.local.k5.f10506002.vs.F10506002VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10506002VSImpl implements F10506002VS {

	private F10506002BS f10506002Bs;

	public F10506002BS getF10506002Bs() {
		return f10506002Bs;
	}

	public void setF10506002Bs(F10506002BS f10506002Bs) {
		this.f10506002Bs = f10506002Bs;
	}

	public Map<String, Object> queryComplaintHandling(Page page,
			ComplaintHandlingVO complaintHandlingVO) {
		if (complaintHandlingVO == null) {
			throw new BusinessException(
					"F10506002VS-00:分页查询申诉单据统计信息传入complaintHandlingVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(complaintHandlingVO, queryDto);

		Page result = this.getF10506002Bs().queryComplaintHandling(page,
				queryDto);

		return GridUtils.getGridData(result);
	}

	public ComplaintHandlingVO queryComplaintHandlingDetail(
			ComplaintHandlingVO complaintHandlingVO) {
		if (complaintHandlingVO == null) {
			throw new BusinessException(
					"F10506002VS-01:分页查询申诉单据描述统计信息传入complaintHandlingVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();

		BeanTools.copyProperties(complaintHandlingVO, queryDto);

		List<Kc73DTO> kc73List = this.getF10506002Bs().queryComplaintHandlingDetail(queryDto);

		complaintHandlingVO.setKc73List(kc73List);

		return complaintHandlingVO;
	}

	public Map<String, Object> queryComplaintHandlingPage(Page page,
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		if (complaintHandlingKc62VO.getIds() == null) {
			throw new BusinessException("F10506002VS-00:分页查询传入ids为空!");
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
		Page result = this.getF10506002Bs().queryComplaintHandlingInfo(page,kc62VO);

		return GridUtils.getGridData(result);
	}

	public ComplaintHandlingKc62VO queryComplaintHandlingInfoDetail(
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		if (complaintHandlingKc62VO == null) {
			throw new BusinessException(
					"F10506002VS-01:分页查询申诉单据描述统计信息传入complaintHandlingKc62VO为空!");
		}
		Kc63DTO kc63Dto = this.getF10506002Bs().getKc63ById(
				complaintHandlingKc62VO.getBaz001());
		
		Kc72DTO kc72Dto = new Kc72DTO();

		BeanTools.copyProperties(complaintHandlingKc62VO, kc72Dto);

		List<Kc72DTO> kc72List = this.getF10506002Bs().queryComplaintHandlingInfoDetail(kc72Dto);

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
					throw new BusinessException("F10506002VS-00:申诉处理BAZ003为空!");
				}
				
			    if (!K2Context.BAZ102_CODE_5.equals(kc81Vo.getBaz102())
								&& !K2Context.BAZ031_CODE_06.equals(kc81Vo.getBaz031())) {
					 throw new BusinessException("F10506002VS-1:待医保办审核才能复议申请审核处理!");
				}
					//更新数据信息
			        Kc81DTO queryDto = new Kc81DTO();
					Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,kc81Vo.getBaz003());
					if(kc81Vo.getBazValue().equals("1")){
						kc62.setBaz102(kc81Vo.getBazValue());
						queryDto.setBaz102(kc81Vo.getBazValue());
						queryDto.setBaz031(kc81Vo.getBaz031());
					}else{
						kc62.setBaz102(kc81Vo.getBazValue());
						queryDto.setBaz102(kc81Vo.getBazValue());
						queryDto.setBaz031(kc81Vo.getBaz031());
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
					queryDto.setBaz023(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));// 经办时间
					queryDto.setBaz025(K2Context.BAZ025_CODE_2);
					queryDto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
					this.getF10506002Bs().saveKc81(queryDto);
			}
		}
		
	}
	
	public List<QueryNumberVO> queryNumber(String akb020) {
		//要查询的医院编号
//    	String yybh = "'42491010400','42500377601','42501272800','42501272801','42508443000'";
    	List<QueryNumberVO> result = this.getF10506002Bs().getQueryNumberVO(akb020);
		return result;
	}
}
