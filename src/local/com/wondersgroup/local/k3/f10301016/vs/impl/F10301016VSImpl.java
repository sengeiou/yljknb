package com.wondersgroup.local.k3.f10301016.vs.impl;

import java.io.File;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Aa10;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.k3.f10301016.bs.F10301016BS;
import com.wondersgroup.bc.k5.K5Context;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke04;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke04DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.local.k3.f10301016.vs.F10301016VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301016VSImpl implements F10301016VS {
	private F10301016BS f10301016BS;
	
	public F10301016BS getF10301016BS() {
		return f10301016BS;
	}

	public void setF10301016BS(F10301016BS f10301016bs) {
		f10301016BS = f10301016bs;
	}

	public Map<String, Object> queryAf37WithPage(Page page, InquiryInputVO inquiryInputVO) {
		
		Af37DTO af37dto = new Af37DTO();
		
		BeanTools.copyProperties(inquiryInputVO, af37dto);
		
		Page result = this.getF10301016BS().queryAf37WithPage(page,af37dto);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public InquiryInputVO saveInquiry(InquiryInputVO inquiryInputVO) {
		
		Af37DTO af37dto = new Af37DTO();
		
		BeanTools.copyProperties(inquiryInputVO, af37dto);
		
		Aa10DTO aa10dto = this.getF10301016BS().getAA10ByAaa102(af37dto.getAaa027());
		
		Af37DTO af37dto2 = this.getF10301016BS().getMaxAbe177();
		
		String aaz006 = "";
		
		String aaz006_1 = DateTools.getSystemYear();
		
		if (af37dto2.getAbe177() == null || "0000000".equals(af37dto2.getAbe177())) {
			
			aaz006 = aa10dto.getAaa105() + aaz006_1 + "001";
			
		}else {
			
			aaz006 = aa10dto.getAaa105() + String.valueOf(Integer.valueOf(af37dto2.getAbe177()) + 1);
		}
		
		af37dto.setAbe177(aaz006);
		
		af37dto = this.getF10301016BS().save(af37dto);
		
		BeanTools.copyProperties(af37dto, inquiryInputVO);
		
		return inquiryInputVO;
	}

	public InquiryInputVO loadInquiry(InquiryInputVO inquiryInputVO) {
		
		Af37DTO af37dto = new Af37DTO();
		
		af37dto.setAaz381(inquiryInputVO.getAaz381());
		
		af37dto = this.getF10301016BS().loadAf37ById(af37dto);
		
		BeanTools.copyProperties(af37dto, inquiryInputVO);
		
		return inquiryInputVO;
	}

	public InquiryInputVO updateAf37(InquiryInputVO inquiryInputVO) {
		
		Af37DTO af37dto = new Af37DTO();
		
		BeanTools.copyProperties(inquiryInputVO, af37dto);
		
		af37dto = this.getF10301016BS().updateAf37(af37dto);
		if (StringTools.hasText(inquiryInputVO.getTargetFileName())) {
			
			this.saveUpload(inquiryInputVO);
		}
		
		return inquiryInputVO;
	}
	
	/**
	 * 保存ke04附件信息
	 * */
	private InquiryInputVO saveUpload(InquiryInputVO inquiryInputVO) {
		
		Ke04DTO dto = new Ke04DTO();
		
		if (StringTools.hasText(String.valueOf(inquiryInputVO.getAaz381()))) {
			
			Ke04 ke04 = new Ke04();
			
			ke04 = this.getF10301016BS().queryKe04ByAaz381(inquiryInputVO.getAaz381());
			
			if (ke04 != null ) {
				String name =ke04.getBaz036();
				String realPath = ServletActionContext.getServletContext().getRealPath("/");
				//String[] str = name.split("/");
				String filePath = realPath + name;
				File file = new File(filePath);
				if (file.exists()) {
					file.delete();
				}
				this.getF10301016BS().deleteKe04ByAaz381(inquiryInputVO.getAaz381());
			}
		} 
		String fpath = K5Context.UPLOADPATH + "/"
				+ inquiryInputVO.getTargetFileName();
		String fname = inquiryInputVO.getFiledataFileName();
		String[] str = inquiryInputVO.getTargetFileName().split("\\.");
		String ftype = str[str.length - 1];
		String fuser = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人
		dto.setBaz035(ftype);
		dto.setAaz381(inquiryInputVO.getAaz381());
		dto.setBaz036(fpath);
		dto.setBaz037(fname);
		dto.setBaz038(fuser);
		dto = this.getF10301016BS().saveKe04(dto);
		BeanTools.copyProperties(dto, inquiryInputVO);
		return inquiryInputVO;
	}

	public InquiryInputVO deleteInquiryByIds(String aaz381s) {
		if (!StringTools.hasText(aaz381s)) {
			throw new BusinessException("F10301016VSImpl-02:传入的主键为空.");
			
		}
		String[] aaz381str = aaz381s.split(",");
		String ids = "";
		
		for (int i = 0; i < aaz381str.length; i++) {
			if (i == aaz381str.length-1) {
				ids = ids + aaz381str[i];
			}else {
				ids = ids + aaz381str[i] + ",";
			}
		}
		
		InquiryInputVO inquiryInputVO = new InquiryInputVO();
		this.getF10301016BS().deleteInquryByIds(ids);
		return inquiryInputVO;
	}

	public Map<String, Object> queryAf37WithMap(InquiryInputVO inquiryInputVO) {
		if(inquiryInputVO.getAaz381() == null){
			throw new BusinessException("F10301016VSImpl-03:获取导出数据失败!");
		}
		Map<String, Object> dataMap = this.getF10301016BS().queryAf37WithMap(inquiryInputVO.getAaz381());
		return dataMap;
	}

	public Ke04DTO getKe04ById(InquiryInputVO inquiryInputVO) {
		
		Ke04DTO ke04=this.getF10301016BS().getKe04ById(inquiryInputVO.getAaz381());
		
		return ke04;
	}
	
}
