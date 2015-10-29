package com.wondersgroup.local.k2.f10201004.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.medicarecostaudit.MedConstants;
import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k2.f10201004.vo.F10201004CheckedVO;
import com.wondersgroup.local.k2.f10201004.vo.F10201004VO;
import com.wondersgroup.local.k2.f10201004.vs.F10201004VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10201004VSImpl implements F10201004VS {

	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public Map<String, Object> queryF10201004(Page page, F10201004VO f10201004VO) {
		if (f10201004VO == null) {
			throw new BusinessException(
					"F10201004VS-00:分页查询违规单据信息传入f10201004VO为空!");
		}
		Kc63DTO queryDto = new Kc63DTO();
		BeanTools.copyProperties(f10201004VO, queryDto);
		queryDto.setAc62Exist(true);
		if(StringTools.hasText(queryDto.getAc62Baz031())){
			String[] str = new String[]{queryDto.getAc62Baz031()};
			queryDto.setAc62Baz031s(str);
		}else{
			String[] str = new String[]{MedConstants.BAZ031_CODE_08};
			queryDto.setAc62Baz031s(str);
		}
		Page result = this.getMedAuditBS().queryKc63WithPage(page, queryDto);
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryF10201004Detail(Page page,
			F10201004VO f10201004VO) {
		if (f10201004VO == null) {
			throw new BusinessException(
					"F10201004VS-01:分页查询违规单据信息传入f10201004VO为空!");
		}
		Kc62DTO queryDto = new Kc62DTO();
		BeanTools.copyProperties(f10201004VO, queryDto);
		Page result = this.getMedAuditBS().queryKc62WithPage(page, queryDto);
		return GridUtils.getGridData(result);
	}

	@SuppressWarnings("unchecked")
	public F10201004CheckedVO saveF10201004(
			F10201004CheckedVO f10201004CheckedVO) {
		
		if(!StringTools.hasText(f10201004CheckedVO.getJsonData())){
			throw new BusinessException("F10201004VS-02:审核单据明细信息传入JsonData为空!");
		}
		if(!StringTools.hasText(f10201004CheckedVO.getBaz033())){
			throw new BusinessException("F10201004VS-03:审核单据明细信息传入违规类型baz033为空!");
		}
		//获取当前用户名
		UserContext userContext = BusinessContextUtils.getUserContext();
		String aae011 = userContext.getOperatorName();
		
		//把页面选中的明细转化成list
		List<Kc62DTO> listKc62 = VOUtils.getBeanListFromJsonData(f10201004CheckedVO.getJsonData(), Kc62DTO.class);
		Kc81DTO queryDto = new Kc81DTO();
		
		//迭代所有的明细做 审核操作
		for(Kc62DTO kc62DTO :listKc62){
			// 1:把审核记录表中相关的有效的记录，更改为无效
			queryDto.setBaz001(kc62DTO.getBaz001());
			queryDto.setBaz003(kc62DTO.getBaz003());
			queryDto.setAae100(AuditConstants.AAE100_CODE_1);
			queryDto.setBaz033(kc62DTO.getBaz033());
			
			List<Kc81DTO> kc81Dtos = this.getMedAuditBS().queryKc81Info(queryDto);
			if(CollectionUtils.isNotEmpty(kc81Dtos)){
				for(Kc81DTO kc81:kc81Dtos){
					kc81.setAae100(AuditConstants.AAE100_CODE_0);
					this.getMedAuditBS().updateKc81(kc81);
				}
			}
			
			if(MedConstants.BAZ031_CODE_01.equals(f10201004CheckedVO.getBaz031())){
				if(!MedConstants.BAZ031_CODE_08.equals(kc62DTO.getBaz031())){
					throw new BusinessException("F10201003VS-07:申诉待复议的明细才能设置为正常!");
				}
			}else if(MedConstants.BAZ031_CODE_10.equals(f10201004CheckedVO.getBaz031())){
				if(!MedConstants.BAZ031_CODE_08.equals(kc62DTO.getBaz031())){
					throw new BusinessException("F10201003VS-08:申诉待复议的明细才能送稽核!");
				}
			}else if(MedConstants.BAZ031_CODE_11.equals(f10201004CheckedVO.getBaz031())){
				if(!MedConstants.BAZ031_CODE_08.equals(kc62DTO.getBaz031())){
					throw new BusinessException("F10201003VS-09:申诉待复议的明细才能扣款!");
				}
			}
			
			// 2:记录审核记录表
			Kc81DTO kc81Dto = new Kc81DTO();
			BeanTools.copyProperties(kc62DTO, kc81Dto);
			kc81Dto.setBaz021(f10201004CheckedVO.getBaz021());
			kc81Dto.setBaz031(f10201004CheckedVO.getBaz031());
			kc81Dto.setBaz033(f10201004CheckedVO.getBaz033());
			kc81Dto.setBaz025(MedConstants.BAZ025_CODE_2);
			kc81Dto.setAae100(AuditConstants.AAE100_CODE_1);
			kc81Dto.setBaz023(new Date());
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
			kc81Dto.setBaz022(aae011);
			
			if(f10201004CheckedVO.getDeductAllFlag()){
				kc81Dto.setBaz041(kc62DTO.getAkb065());
			}else{
				if(f10201004CheckedVO.getBaz041() > kc62DTO.getAkb065()){
					throw new BusinessException("F10201003VS-06:扣除金额大于单据明细金额!单据明细编号:"+kc62DTO.getBaz003());
				}
				kc81Dto.setBaz041(f10201004CheckedVO.getBaz041());
			}
			this.getMedAuditBS().saveKc81(kc81Dto);
			
			// 3:同步单据明细审核状态
			Kc62DTO kc62 = 	this.getMedAuditBS().getKc62ById(kc62DTO.getBaz003());
			kc62.setBaz031(f10201004CheckedVO.getBaz031());
			this.getMedAuditBS().updateKc62(kc62);
		}
		
		
		return f10201004CheckedVO;
	}

}
