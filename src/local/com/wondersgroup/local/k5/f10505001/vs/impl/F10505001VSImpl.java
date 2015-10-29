package com.wondersgroup.local.k5.f10505001.vs.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.k5.K5Context;
import com.wondersgroup.bc.k5.f10505001.bs.DocAfterBS;
import com.wondersgroup.bc.medicarecostaudit.MedConstants;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10505001.vo.F10505001VO;
import com.wondersgroup.local.k5.f10505001.vo.Kc62VO;
import com.wondersgroup.local.k5.f10505001.vo.SubmitVO;
import com.wondersgroup.local.k5.f10505001.vs.F10505001VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10505001VSImpl implements F10505001VS {
	private DocAfterBS docAfterBS;

	public void setDocAfterBS(DocAfterBS docAfterBS) {
		this.docAfterBS = docAfterBS;
	}

	public DocAfterBS getDocAfterBS() {
		return docAfterBS;
	}

	public Map<String, Object> queryMedDocument(Page page, F10505001VO vo) {
		if (vo == null) {
			throw new BusinessException("F10505001VS-00:传入vo为空");
		}
		Kc63DTO dto = new Kc63DTO();
		BeanTools.copyProperties(vo, dto);
		Page result = this.getDocAfterBS().queryKc63WithPage(page, dto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryMedDocumentDetail(Page page, Kc62VO vo) {
		if (vo.getIds() == null) {
			throw new BusinessException("F10505001VS-01:传入违规单据IDs为空");
		}
		String strid = "";
		String[] ids = vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62DTO queryDto = new Kc62DTO();

		BeanTools.copyProperties(vo, queryDto);

		queryDto.setBaz001(strid);

		Page result = this.getDocAfterBS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public SubmitVO upload(SubmitVO vo) {
		if (vo == null || vo.getFiledata() == null) {
			throw new BusinessException("F10505001VS-02:上传文件为空");
		}

		String realpath = ServletActionContext.getServletContext().getRealPath(
				K5Context.UPLOADPATH);// 获取服务器路径
		realpath=realpath.replace('\\', '/');
		
		String[] str = vo.getFiledataFileName().split("\\.");
		String ftype = str[str.length - 1];
		String sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		String targetFileName=sdf+"."+ftype;
		for (int i = 0; i < 1; i++) {
			File target = new File(realpath, targetFileName);
			try {
				FileUtils.copyFile(vo.getFiledata(), target);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		vo.setRealpath(realpath);
		vo.setTargetFileName(targetFileName);
		return vo;
	}

	/**
	 * 保存ke02附件信息
	 * */
	private SubmitVO saveUpload(SubmitVO vo) {
		Ke02DTO dto = new Ke02DTO();
		String[] str = vo.getTargetFileName().split("\\.");
		String ftype = str[str.length - 1];
		String fpath =K5Context.UPLOADPATH+"/"+vo.getTargetFileName();
		String fname = vo.getFiledataFileName();
		
		String fuser = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人
		dto.setBaz035(ftype);
		dto.setBaz005(vo.getBaz005());
		dto.setBaz036(fpath);
		dto.setBaz037(fname);
		dto.setBaz038(fuser);
		dto.setBaz005(vo.getBaz005());
		dto = this.getDocAfterBS().saveKe02(dto);
		BeanTools.copyProperties(dto, vo);
		return vo;
	}

	public SubmitVO docSubmit(SubmitVO vo) {
		if (vo.getIds() == null) {
			throw new BusinessException("F10505001VS-02:传入违规明细IDs为空");
		}
		String user = BusinessContextUtils.getUserContext().getOperatorName();
		String comments = vo.getComments();
		String strid = "";
		String[] ids = vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		List<Kc62DTO> kc62Lists = this.getDocAfterBS().getKc62s(strid);
		if (null == kc62Lists || !(kc62Lists.size() > 0)) {
			throw new BusinessException("F10505001VS-03:根据违规明细IDs查询结果为空");
		}
		for (Kc62DTO kc62dto : kc62Lists) {
			Kc81DTO dto = new Kc81DTO();
			this.getDocAfterBS().updateKc62(kc62dto.getBaz003());
			String kc63id = this.getDocAfterBS().getKc63Id(kc62dto.getBaz003());
			dto.setBaz001(kc63id);
			dto.setBaz003(kc62dto.getBaz003());
			dto.setBaz031(MedConstants.BAZ031_CODE_04);// 审核状态 04 待申述
			dto.setBaz033("2");//违规类型
			dto.setBaz021(comments);
			dto.setBaz022(user);
			dto.setBaz101(MedConstants.BAZ101_CODE_3);
			dto.setAae100(AuditConstants.AAE100_CODE_1);
			dto.setBaz023(new Date());
			dto.setBaz025(MedConstants.BAZ025_CODE_2);
			dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
			dto = this.getDocAfterBS().saveKc81(dto);
			vo.setBaz005(dto.getBaz005());
			if (StringTools.hasText(vo.getTargetFileName())) {

				this.saveUpload(vo);
			}
		}
		return vo;
	}

	public void updateComplaintHandlingKc62(
			List<ComplaintHandlingKC86VO> listKc81) {
		UserContext userContext = BusinessContextUtils.getUserContext();
		String aae011 = userContext.getOperatorName();
		if (listKc81 != null) {
			for (int i = 0; i < listKc81.size(); i++) {
				ComplaintHandlingKC86VO kc81Vo = listKc81.get(i);
				if (kc81Vo.getBaz003() == null) {
					throw new BusinessException("F10504001VS-00:申诉处理BAZ003为空!");
				}

				if (!MedConstants.BAZ101_CODE_2.equals(kc81Vo.getBaz101())
						&& !MedConstants.BAZ031_CODE_04.equals(kc81Vo
								.getBaz031())) {
					throw new BusinessException(
							"F10504001VS-1:待人工初审和待申诉的明细才能送申诉处理!");
				}
				// 更新数据信息
				Kc81DTO queryDto = new Kc81DTO();
				Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,
						kc81Vo.getBaz003());
				if (kc81Vo.getBazValue().equals("2")||kc81Vo.getBazValue().equals("5")) {
					kc62.setBaz101(kc81Vo.getBazValue());
					queryDto.setBaz101(kc81Vo.getBazValue());
					queryDto.setBaz031(kc81Vo.getBaz031());
				} else {
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
				this.getDocAfterBS().saveKc81(queryDto);
			}
		}
	}

}
