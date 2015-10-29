package com.wondersgroup.local.k2.f10203001.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k2.K2Context;
import com.wondersgroup.bc.k2.f10203001.bs.F10203001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k2.f10203001.vo.F10203001VO;
import com.wondersgroup.local.k2.f10203001.vo.HosDetailVO;
import com.wondersgroup.local.k2.f10203001.vo.Kc62VO;
import com.wondersgroup.local.k2.f10203001.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10203001.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10203001.vs.F10203001VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10203001VSImpl implements F10203001VS {

	private F10203001BS f10203001BS;


	public F10203001BS getF10203001BS() {
		return f10203001BS;
	}


	public void setF10203001BS(F10203001BS f10203001bs) {
		f10203001BS = f10203001bs;
	}



	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10203001VO f10203001vo) {

		if (f10203001vo.getIds() == null) {
			throw new BusinessException("F10203001VS-00:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10203001vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();
		
		BeanTools.copyProperties(f10203001vo, queryDto);
		
		queryDto.setBaz001(strid);
		
		Page result = this.getF10203001BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}


	public Map<String, Object> queryMedDocument(Page page,F10203001VO f10203001vo) {
		if (f10203001vo == null) {
			throw new BusinessException(
					"F10203001VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}
		String straka130="''";
		if(null!=f10203001vo.getAka130()){
			straka130="";
			String [] aka130s=f10203001vo.getAka130().split(",");
			for (int i = 0; i < aka130s.length; i++) {
				if((i+1)==aka130s.length){
					straka130+="'"+aka130s[i]+"'";
				}else{
					straka130+="'"+aka130s[i]+"',";
				}
			}
		}
		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10203001vo, queryDto);
		queryDto.setAka130(straka130);
		Page result = this.getF10203001BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO) {
		if(!StringTools.hasText(returnVO.getIds())){
			throw new BusinessException("F10203001VS-04:审核单据明细传入kc62ids为空！");
		}
		if (!StringTools.hasText(returnVO.getBaz031())) {
			throw new BusinessException("F10203001VS-05:审核单据明细信息传入baz031为空!");
		}
		if (!StringTools.hasText(returnVO.getBaz021())) {
			throw new BusinessException("F10203001VS-06:审核单据明细信息传入baz021(审核意见)为空!");
		}
		if(!StringTools.hasText(returnVO.getBaz033())){
			throw new BusinessException("F10203001VS-07:审核单据明细信息传入baz033为空!");
		}
		
			
			UserContext userContext = BusinessContextUtils.getUserContext();
			String aae011 = userContext.getOperatorName();
			
		
			List<Kc62DTO> kc62Dtos = this.getF10203001BS(). findKc62ByIds(returnVO.getIds());
			//审核单据明细
			for(Kc62DTO kc62Dto : kc62Dtos){
				
				
				if(K2Context.BAZ031_CODE_01.equals(returnVO.getBaz031())){
					if(!K2Context.BAZ031_CODE_05.equals(kc62Dto.getBaz031())){
						throw new BusinessException("F10203001VS-08:待人工初审状态的明细才能设置为正常!");
					}
				}

				if(K2Context.BAZ031_CODE_04.equals(returnVO.getBaz031())){
					if(!K2Context.BAZ031_CODE_05.equals(kc62Dto.getBaz031())){
						throw new BusinessException("F10203001VS-09:待人工初审状态的明细才能设置为待申诉!");
					}
				}
				
				Kc81DTO kc81Dto = new Kc81DTO();
				//同步单据明细审核状态
				kc62Dto.setBaz031(returnVO.getBaz031());
				if(K2Context.BAZ031_CODE_01.equals(returnVO.getBaz031())){
					//设置违规标志为正常
					kc62Dto.setBaz032(K2Context.BAZ032_CODE_0);
					kc62Dto.setBaz101("");
				}else{
					kc62Dto.setBaz032(K2Context.BAZ032_CODE_1);
					//设置申诉状态为待申诉
					kc62Dto.setBaz101(K2Context.BAZ101_CODE_1);
					//更新到日志中
					kc81Dto.setBaz101(K2Context.BAZ101_CODE_1);
				}
		
				
				kc81Dto.setBaz001(kc62Dto.getBaz001());
				kc81Dto.setBaz003(kc62Dto.getBaz003());
				kc81Dto.setAae100(K2Context.AAE100_CODE_1);//有效标志(有效）
				kc81Dto.setBaz033(returnVO.getBaz033());  //违规类型
				kc81Dto.setBaz021(returnVO.getBaz021());  //审核意见
				//审核状态改变
				kc81Dto.setBaz031(returnVO.getBaz031());
				//操作人和操作时间
				kc81Dto.setBaz022(aae011);
				kc81Dto.setBaz023(new Date());
				//审核类型(人工审核)
				kc81Dto.setBaz025(K2Context.BAZ025_CODE_2);
				//经办月份
				kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
				
				kc62Dto.setBaz041(returnVO.getBaz041());
				//更新单据违规信息
				this.getF10203001BS().updateKc62(kc62Dto);
				
			
				//保存操作日志
				this.getF10203001BS().saveKc81(kc81Dto);
				
			
			}
			
			return returnVO;
	}


	public MedDocumentVO queryMedDocumentDetailIllegal(MedDocumentVO medDocumentVO) {
		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10203002VS-02:查询单据明细违规信息传入medDocumentVO为空!");
		}
		Kc63DTO kc63Dto = this.getF10203001BS().getKc63ById(
				medDocumentVO.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10203001VS-03:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		List<Kc72DTO> kc72List = this.getF10203001BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, medDocumentVO);

		medDocumentVO.setKc72List(kc72List);

		return medDocumentVO;
		
	}
	public List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO) {
		if (hosDetailVO == null) {
			throw new BusinessException(
					"F10203003VS-01:hosDetailVO为空!");
		}
		List<HosDetailVO> list = this.getF10203001BS().queryMedDocumentByHos(hosDetailVO);
		return list;
	}


}
