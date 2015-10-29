package com.wondersgroup.local.k3.f10301002.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.k3.f10301002.bs.F10301002BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.framework.core5.util.DateUtils;
import com.wondersgroup.local.k3.f10301002.vo.AuditCaseCecordVO;
import com.wondersgroup.local.k3.f10301002.vo.AuditFileVO;
import com.wondersgroup.local.k3.f10301002.vo.DoctorVO;
import com.wondersgroup.local.k3.f10301002.vo.OrganizeVO;
import com.wondersgroup.local.k3.f10301002.vo.PersonVO;
import com.wondersgroup.local.k3.f10301002.vo.StaffListVO;
import com.wondersgroup.local.k3.f10301002.vo.UnitListVO;
import com.wondersgroup.local.k3.f10301002.vs.F10301002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301002VSImpl implements F10301002VS {

	private AdminDisposalBS adminDisposalBS;
	private F10301002BS f10301002BS;

	public F10301002BS getF10301002BS() {
		return f10301002BS;
	}

	public void setF10301002BS(F10301002BS f10301002bs) {
		f10301002BS = f10301002bs;
	}

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public Map<String, Object> queryAuditFileRegistrationWithPage(Page page,
			AuditFileVO auditFileRegistration) {

		Page result = this
				.getAdminDisposalBS()
				.queryAuditFileRegistrationWithPage(page, auditFileRegistration);

		for (int i = 0; i < result.getResult().size(); i++) {

			Af32DTO af32Dto = (Af32DTO) result.getResult().get(i);

			if (af32Dto.getApe711() != 0) {

				String str = String.valueOf(af32Dto.getApe711());

				Date ape711s = DateTools.parseDate(str, "yyyyMMdd");

				af32Dto.setApe711s(ape711s);
			}
		}

		return GridUtils.getGridData(result);
	}

	public AuditFileVO getAuditFileById(String aaz281) {

		if (aaz281 == null || "".equals(aaz281)) {
			throw new BusinessException("F10301002VS-00:传入稽核登记ID为空!");
		}

		AuditFileVO returnVO = new AuditFileVO();

		Af32DTO af32DTO = this.getAdminDisposalBS().getAf32ById(aaz281);

		BeanTools.copyProperties(af32DTO, returnVO);

		return returnVO;
	}

	public int closeQuestion(AuditFileVO resultVO) {

		int succCount = 0;

		String[] str = resultVO.getAaz281str().split(",");

		String ape133 = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人

		resultVO.setApe133(ape133);

		String str1 = DateUtils.format(new Date(), "yyyyMMdd");// 格式化当前时间
																// 获取问题关闭日期

		Integer ape027 = Integer.valueOf(str1);

		resultVO.setApe027(ape027);// 关闭日期

		resultVO.setApa165(AuditConstants.APA165_CODE_2);// 设置问题状态

		resultVO.setApa166(AuditConstants.APA166_CODE_1);// 问题关闭标志 0（未关闭） 1（关闭）

		for (int i = 0; i < str.length; i++) {

			String aaz281 = str[i];

			resultVO.setAaz281(Long.valueOf(aaz281));

			Af32DTO af32DTO = this.getAdminDisposalBS().getAf32ById(aaz281);

			if (af32DTO == null) {
				continue;
			}

			if (AuditConstants.APA165_CODE_2.equals(af32DTO.getApa165())) {
				continue;
			}

			if (AuditConstants.APA165_CODE_3.equals(af32DTO.getApa165())) {
				continue;
			}

			if (AuditConstants.APA165_CODE_4.equals(af32DTO.getApa165())) {
				continue;
			}

			BeanTools.copyProperties(resultVO, af32DTO);

			af32DTO = this.getAdminDisposalBS().updateAf32(af32DTO);
			// succCount = succCount +
			// this.getAdminDisposalBS().closeQuestion(resultVO,aaz281);

			succCount++;
		}

		return succCount;
	}

	public List<Af53DTO> findCaseID(Long aaz281) {

		return this.getAdminDisposalBS().findCaseID(aaz281);
	}

	public List<Ac01DTO> findObj_Person(String caseID) {

		return this.getAdminDisposalBS().findObj_Person(caseID);
	}

	public List<Kf05DTO> findObj_Doctor(String caseID) {

		return this.getAdminDisposalBS().findObj_Doctor(caseID);
	}

	public List<Kb01DTO> findObj_Organize(String caseID) {

		return this.getAdminDisposalBS().findObj_Organize(caseID);
	}

	public Map<String, Object> queryPerson(Page page, AuditFileVO auditFileQuery) {

		Page result = this.getAdminDisposalBS().queryPerson(page,
				auditFileQuery);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryDoctor(Page page, AuditFileVO auditFileQuery) {

		Page result = this.getAdminDisposalBS().queryDoctor(page,
				auditFileQuery);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryOrganize(Page page,
			AuditFileVO auditFileQuery) {

		Page result = this.getAdminDisposalBS().queryOrganize(page,
				auditFileQuery);

		return GridUtils.getGridData(result);
	}
	//保存案件
	public AuditCaseCecordVO saveOrUpdateAuditCaseCecord(
			AuditCaseCecordVO resultVO, List<PersonVO> personObjs,
			List<DoctorVO> doctorObjs, List<OrganizeVO> organizeObjs, List<StaffListVO> staffLists,
			List<UnitListVO> unitLists) {

	    if (resultVO == null) {
	        throw new BusinessException("F10301002VS-01:传入案件对象为空!");
	      }
	    
		Date ape047s = new Date();
		String ape047Str = DateTools.formatDate(ape047s, "yyyyMMdd");
		String abz001_date = ape047Str.substring(0, 4);
		//取最大的案件编号
		String abz001_s = getF10301002BS().getMaxAbz001();
		//类型转换
		Integer abz001s1 = null;
		//根据辖区查询参数阀值说明
		String aaa105 = this.getF10301002BS().getValueByAaa027(resultVO.getAaa027());
		
		Af53DTO af53dto = new Af53DTO();
		//案件编号
		if(abz001_s == null || "0".equals(abz001_s)){
			resultVO.setAbz001(aaa105 + abz001_date + "001");
		}else{
			//类型转换
		    abz001s1 = Integer.valueOf(abz001_s);
			resultVO.setAbz001(aaa105 + Integer.valueOf(abz001s1+1).toString());
		}
		
		List<Af53DTO> af53List = this.getAdminDisposalBS()
				.getaf53List(resultVO);// 查询af53所有的案件编号

		UserContext userContext = BusinessContextUtils.getUserContext();

		String aae011 = userContext.getOperatorName();

		Af32DTO af32Dto = new Af32DTO();

		Long aaz281 = null;

		if (resultVO.getAaz281() == null || resultVO.getAaz281() == 0) {// 直接稽核立案,自动增加一个疑点问题

			BeanTools.copyProperties(resultVO, af32Dto);

			af32Dto.setAae036(new Date());

			af32Dto.setApa703(AuditConstants.APA703_CODE_6);
			
			af32Dto.setApe711(Integer.parseInt(DateTools
					.getYYYYMMDD(new Date())));

			af32Dto.setApa704(AuditConstants.APA704_CODE_21);

			af32Dto.setApa705(AuditConstants.APA705_CODE_6);

			af32Dto.setApe712(resultVO.getApf094());

			af32Dto.setApe713(resultVO.getAae011());

			af32Dto.setApa166(AuditConstants.APA166_CODE_0);

			af32Dto.setApa165(AuditConstants.APA165_CODE_3);

			af32Dto = this.getAdminDisposalBS().SaveAf32(af32Dto);

			aaz281 = af32Dto.getAaz281();

			resultVO.setAaz281(af32Dto.getAaz281());
		}

		if (!"D2".equals(resultVO.getType())) {
			if (resultVO.getAaz318() == null || resultVO.getAaz318() == 0) {// 新增案件

			/*	for (Af53DTO af53Dto : af53List) {
					// 得到案件编号
					//String abz001 = af53Dto.getAbz001();

					if (resultVO.getAbz001().equals(abz001)) {
						throw new BusinessException(
								"F10301002VS-12:案件编号已存在，请重新输入案件编号!");
					}
				}*/

				if (aaz281 == null && resultVO.getAaz281() != null) {

					af32Dto = this.getAdminDisposalBS().getAf32ById(
							String.valueOf(resultVO.getAaz281()));

					if (af32Dto == null) {
						throw new BusinessException(
								"F10301002VS-00:保存失败,该疑点问题可能被其他经办人员删除了!");
					}

					if (af32Dto.getAaz281() == null) {
						throw new BusinessException(
								"F10301002VS-01:保存失败,该疑点问题 主键为空 可能被其他经办人员删除了!");
					}

					if (AuditConstants.APA165_CODE_2
							.equals(af32Dto.getApa165())) {
						throw new BusinessException(
								"F10301002VS-02:保存失败,该疑点问题已经被其他经办人员关闭了!");
					}

					if (AuditConstants.APA165_CODE_3
							.equals(af32Dto.getApa165())) {
						throw new BusinessException(
								"F10301002VS-03:保存失败,该疑点问题已经被其他经办人员稽核立案了!");
					}

					af32Dto.setApa165(AuditConstants.APA165_CODE_3);

					this.getAdminDisposalBS().updateAf32(af32Dto);
				}

				resultVO.setAae426(AuditConstants.AAE426_CODE_1);

				BeanTools.copyProperties(resultVO, af53dto);

				af53dto.setAae011(aae011);
				// if(resultVO.getApe711s() != null)
				// af53dto.setApe711s(resultVO.getApe711s());

				af53dto = this.getAdminDisposalBS().saveAf53(af53dto);

				resultVO.setAaz318(af53dto.getAaz318());

			} else {// 更新案件

				af53dto = this.getAdminDisposalBS().getAf53ById(
						String.valueOf(resultVO.getAaz318()));

				if (af53dto == null) {
					throw new BusinessException(
							"F10301002VS-14:根据主键查询af53对象af53dto为空!");
				}

				// String abz001 = af53dto.getAbz001();//获取案件编号

				for (Af53DTO af53Dto : af53List) {

					String abz001 = af53Dto.getAbz001();

					if (resultVO.getAbz001().equals(abz001)) {
						throw new BusinessException(
								"F10301002VS-13:案件编号已存在，请重新输入案件编号!");
					}
				}

				if (af53dto.getAaz318() == null) {

					throw new BusinessException(
							"F10301002VS-04:保存失败,该案件状态出现异常,不能被修改!");

				} else if (AuditConstants.AAE426_CODE_2.equals(af53dto
						.getAae426())) {

					throw new BusinessException(
							"F10301002VS-05:保存失败,该案件已被其他经办人员撤销了!");

				} else if (AuditConstants.AAE426_CODE_3.equals(af53dto
						.getAae426())) {

					throw new BusinessException("F10301002VS-06:保存失败,该案件已被立案了!");

				} else if (AuditConstants.AAE426_CODE_4.equals(af53dto
						.getAae426())) {

					throw new BusinessException("F10301002VS-07:保存失败,该案件已被结案了!");

				} else if (AuditConstants.AAE426_CODE_1.equals(af53dto
						.getAae426())) {

					BeanTools.copyPropertiesIgnoreNull(resultVO, af53dto);

					af53dto = this.getAdminDisposalBS().updateAf53(af53dto);
				}
			}
		}
		// 处理稽核对象
		if (!CollectionUtils.isEmpty(personObjs)) {

			for (PersonVO person : personObjs) {

				Af31DTO af31DtoP = new Af31DTO();

				if (AuditConstants.state_add.equals(person.get_state())) {
					af31DtoP.setAaa027(resultVO.getAaa027());

					af31DtoP.setAae011(aae011);

					af31DtoP.setAae036(new Date());

					af31DtoP.setAaz010(person.getAac001() + "");

					af31DtoP.setAaz318(resultVO.getAaz318());

					af31DtoP.setApa701(person.getApa701());

					af31DtoP.setApa709(AuditConstants.APA709_CODE_1);
					
					af31DtoP.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoP.setApe008(person.getAac003());
					
					if ("D2".equals(resultVO.getType())) {
						if(getAdminDisposalBS().isAddObject(af31DtoP))
							throw new BusinessException(
									"操作失败,姓名为"+af31DtoP.getApe008()+"的稽核对象已绑定了该案件");
					}
					af31DtoP = this.getAdminDisposalBS().saveAf31(af31DtoP);

				} else if (AuditConstants.state_mod.equals(person.get_state())) {

					af31DtoP = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(person.getAaz077()));

					af31DtoP.setApa701(person.getApa701());
					
					af31DtoP.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoP = this.getAdminDisposalBS().updateAf31(af31DtoP);

				} else if (AuditConstants.state_del.equals(person.get_state())) {

					af31DtoP = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(person.getAaz077()));

					this.getAdminDisposalBS().deleteAf31(af31DtoP);

				} else {

					throw new BusinessException(
							"F10301002VS-08:操作失败,稽核对象状态获取失败  personObjs!");

				}
			}
		}

		if (!CollectionUtils.isEmpty(doctorObjs)) {

			for (DoctorVO doctor : doctorObjs) {

				Af31DTO af31DtoD = new Af31DTO();

				if (AuditConstants.state_add.equals(doctor.get_state())) {

					af31DtoD.setAaa027(resultVO.getAaa027());

					af31DtoD.setAae011(aae011);

					af31DtoD.setAae036(new Date());

					af31DtoD.setAaz010(doctor.getAaz263());
					
					af31DtoD.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoD.setAaz318(resultVO.getAaz318());

					af31DtoD.setApa701(doctor.getApa701());

					af31DtoD.setApa709(AuditConstants.APA709_CODE_2);

					af31DtoD.setApe008(doctor.getAac003());
					
					if ("D2".equals(resultVO.getType())) {
						if(getAdminDisposalBS().isAddObject(af31DtoD))
							throw new BusinessException(
									"操作失败,姓名为"+af31DtoD.getApe008()+"的稽核对象已绑定了该案件");
					}

					af31DtoD = this.getAdminDisposalBS().saveAf31(af31DtoD);

				} else if (AuditConstants.state_mod.equals(doctor.get_state())) {

					af31DtoD = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(doctor.getAaz077()));

					af31DtoD.setApa701(doctor.getApa701());
					
					af31DtoD.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoD = this.getAdminDisposalBS().updateAf31(af31DtoD);

				} else if (AuditConstants.state_del.equals(doctor.get_state())) {

					af31DtoD = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(doctor.getAaz077()));

					this.getAdminDisposalBS().deleteAf31(af31DtoD);

				} else {
					throw new BusinessException(
							"F10301002VS-09:操作失败,稽核对象状态获取失败 doctorObjs!");
				}
			}
		}

		if (!CollectionUtils.isEmpty(organizeObjs)) {

			for (OrganizeVO organ : organizeObjs) {

				Af31DTO af31DtoO = new Af31DTO();

				if (AuditConstants.state_add.equals(organ.get_state())) {

					af31DtoO.setAaa027(resultVO.getAaa027());

					af31DtoO.setAae011(aae011);

					af31DtoO.setAae036(new Date());

					af31DtoO.setAaz010(organ.getAaz107() + "");

					af31DtoO.setAaz318(resultVO.getAaz318());
					
					af31DtoO.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoO.setApa701(organ.getApa701());

					af31DtoO.setApa709(AuditConstants.APA709_CODE_3);

					af31DtoO.setApe008(organ.getAkb021());
					
					if ("D2".equals(resultVO.getType())) {
						if(getAdminDisposalBS().isAddObject(af31DtoO)){
							throw new BusinessException(
									"操作失败,姓名为"+af31DtoO.getApe008()+"的稽核对象已绑定了该案件");
						}
					}

					af31DtoO = this.getAdminDisposalBS().saveAf31(af31DtoO);

				} else if (AuditConstants.state_mod.equals(organ.get_state())) {

					af31DtoO = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(organ.getAaz077()));

					af31DtoO.setApa701(organ.getApa701());
					
					af31DtoO.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoO = this.getAdminDisposalBS().updateAf31(af31DtoO);

				} else if (AuditConstants.state_del.equals(organ.get_state())) {

					af31DtoO = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(organ.getAaz077()));

					this.getAdminDisposalBS().deleteAf31(af31DtoO);
				} else {
					throw new BusinessException(
							"F10301002VS-10:操作失败,稽核对象状态获取失败 organizeObjs!");
				}
			}
		}
		
		
		if (!CollectionUtils.isEmpty(staffLists)) {

			for (StaffListVO staff : staffLists) {

				Af31DTO af31DtoP = new Af31DTO();

				if (AuditConstants.state_add.equals(staff.get_state())) {
					af31DtoP.setAaa027(resultVO.getAaa027());

					af31DtoP.setAae011(aae011);

					af31DtoP.setAae036(new Date());

					af31DtoP.setAaz010(staff.getAac001() + "");

					af31DtoP.setAaz318(resultVO.getAaz318());
					
					af31DtoP.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoP.setApa701(staff.getApa701());

					af31DtoP.setApa709(AuditConstants.APA709_CODE_4);

					af31DtoP.setApe008(staff.getAac003());
					
					if ("D2".equals(resultVO.getType())) {
						if(getAdminDisposalBS().isAddObject(af31DtoP))
							throw new BusinessException(
									"操作失败,姓名为"+af31DtoP.getApe008()+"的稽核对象已绑定了该案件");
					}
					af31DtoP = this.getAdminDisposalBS().saveAf31(af31DtoP);

				}else if (AuditConstants.state_mod.equals(staff.get_state())) {

					af31DtoP = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(staff.getAaz077()));

					af31DtoP.setApa701(staff.getApa701());
					
					af31DtoP.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoP = this.getAdminDisposalBS().updateAf31(af31DtoP);

				} else if (AuditConstants.state_del.equals(staff.get_state())) {

					af31DtoP = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(staff.getAaz077()));

					this.getAdminDisposalBS().deleteAf31(af31DtoP);

				}  else {

					throw new BusinessException(
							"F10301002VS-08:操作失败,稽核对象状态获取失败  personObjs!");

				}
			}
		}
		
		
		if (!CollectionUtils.isEmpty(unitLists)) {

			for (UnitListVO unit : unitLists) {

				Af31DTO af31DtoO = new Af31DTO();

				if (AuditConstants.state_add.equals(unit.get_state())) {

					af31DtoO.setAaa027(resultVO.getAaa027());

					af31DtoO.setAae011(aae011);

					af31DtoO.setAae036(new Date());

					af31DtoO.setAaz010(unit.getAaz107() + "");
					
					af31DtoO.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoO.setAaz318(resultVO.getAaz318());

					af31DtoO.setApa701(unit.getApa701());

					af31DtoO.setApa709(AuditConstants.APA709_CODE_5);

					af31DtoO.setApe008(unit.getAkb021());
					
					if ("D2".equals(resultVO.getType())) {
						if(getAdminDisposalBS().isAddObject(af31DtoO)){
							throw new BusinessException(
									"操作失败,姓名为"+af31DtoO.getApe008()+"的稽核对象已绑定了该案件");
						}
					}

					af31DtoO = this.getAdminDisposalBS().saveAf31(af31DtoO);

				} else if (AuditConstants.state_mod.equals(unit.get_state())) {

					af31DtoO = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(unit.getAaz077()));

					af31DtoO.setApa701(unit.getApa701());
					
					af31DtoO.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_0));

					af31DtoO = this.getAdminDisposalBS().updateAf31(af31DtoO);

				} else if (AuditConstants.state_del.equals(unit.get_state())) {

					af31DtoO = this.getAdminDisposalBS().getAf31ById(
							String.valueOf(unit.getAaz077()));

					this.getAdminDisposalBS().deleteAf31(af31DtoO);
				} else {
					throw new BusinessException(
							"F10301002VS-10:操作失败,稽核对象状态获取失败 organizeObjs!");
				}
			}
		}
		return resultVO;
	}

	public AuditCaseCecordVO queryAuditDetailInfo(AuditCaseCecordVO resultVO) {

		// 没有选择问题，直接立案
		if (resultVO.getAaz281() == null || resultVO.getAaz281() == 0) {
			resultVO.setAbb006(AuditConstants.ABB006_CODE_3);
			resultVO.setAaa027("310100");
		} else {
			// 判断是已立案还是待立案
			if (AuditConstants.APA165_CODE_3.equals(resultVO.getApa165())) { // 已立
				List<Af53DTO> list = this.findCaseID(resultVO.getAaz281());// 根据问题ID查询对应的案件信息
				String caseID = null; // 案件ID号
				if (list.size() >= 1) {
					Af53DTO af53 = list.get(0);
					resultVO.setAaz318(af53.getAaz318());
					BeanTools.copyProperties(af53, resultVO);
					caseID = af53.getAaz318().toString();
				}
				// 获取被稽核对象信息
				List<Ac01DTO> list1 = this.findObj_Person(caseID);
				List<Kf05DTO> list2 = this.findObj_Doctor(caseID);
				List<Kb01DTO> list3 = this.findObj_Organize(caseID);
				resultVO.setPersonList(list1);
				resultVO.setDoctorList(list2);
				resultVO.setOrganList(list3);

			} else if (AuditConstants.APA703_CODE_1
					.equals(resultVO.getApa703())) {// 受理方式为系统监控，自动载入被稽核对象

				if (resultVO.getAaz281() != null && resultVO.getAaz281() != 0) {
					// 查询与疑点问题相关的对象
					// List list_per=regbs.findObj(aaz281, "1");
					// List list_doc=regbs.findObj(aaz281, "2");
					// List list_org=regbs.findObj(aaz281, "3");
					// 查询疑点问题的详情
					Af32DTO af32 = new Af32DTO();
					af32 = this.getAuditFileById(String.valueOf(resultVO
							.getAaz281()));
					if (af32 != null) {// 传疑点问题描述
						resultVO.setApf094(af32.getApe712());
					}
					// if(list_per!=null && list_per.size()>0){
					// request.setAttribute("personSet", list_per);
					// }
					// if(list_doc!=null && list_doc.size()>0){
					// request.setAttribute("doctorSet", list_doc);
					// }
					// if(list_org!=null && list_org.size()>0){
					// request.setAttribute("organizeSet", list_org);
					// }
				}
				// 根据问题受理方式设定案件来源
				if (AuditConstants.APA703_CODE_1.equals(resultVO.getApa703())) {
					resultVO.setAbb006(AuditConstants.ABB006_CODE_1);
				} else if (AuditConstants.APA703_CODE_6.equals(resultVO
						.getApa703())) {
					resultVO.setAbb006(AuditConstants.ABB006_CODE_3);
				} else {
					resultVO.setAbb006(AuditConstants.ABB006_CODE_2);
				}
			} else {
				// 查询疑点问题的详情
				Af32DTO af32 = new Af32DTO();
				af32 = this.getAuditFileById(String.valueOf(resultVO
						.getAaz281()));
				if (af32 != null) {// 传疑点问题描述
					resultVO.setApf094(af32.getApe712());
				}
				// 根据问题受理方式设定案件来源
				if (AuditConstants.APA703_CODE_1.equals(resultVO.getApa703())) {
					resultVO.setAbb006(AuditConstants.ABB006_CODE_1);
				} else if (AuditConstants.APA703_CODE_6.equals(resultVO
						.getApa703())) {
					resultVO.setAbb006(AuditConstants.ABB006_CODE_3);
				} else {
					resultVO.setAbb006(AuditConstants.ABB006_CODE_2);
				}
			}
		}
		return resultVO;
	}

	public AuditCaseCecordVO deleteCase(AuditCaseCecordVO resultVO) {

		if (resultVO.getAaz281() == null || resultVO.getAaz281() == 0) {
			throw new BusinessException("F10301002VS-10:操作失败,删除案件信息传入aaz281为空!");
		}

		if (resultVO.getAaz318() == null || resultVO.getAaz318() == 0) {
			throw new BusinessException("F10301002VS-11:操作失败,删除案件信息传入aaz318为空!");
		}

		if (!StringTools.hasText(resultVO.getAbz001())) {
			throw new BusinessException("F10301002VS-12:操作失败,删除案件信息传入abz001为空!");
		}

		UserContext uersContext = BusinessContextUtils.getUserContext();
		String aae011 = uersContext.getOperatorName();

		Af53DTO af53Dto = this.getAdminDisposalBS().getAf53ById(
				String.valueOf(resultVO.getAaz318()));

		if (af53Dto.getAaz318() == null || af53Dto.getAaz318() == 0) {
			throw new BusinessException("F10301002VS-13:操作失败,该案件可能已被其他人删除了!");
		}

		if (!aae011.equals(af53Dto.getAae011())) {
			throw new BusinessException("F10301002VS-17:操作失败,只能删除自己立的案件!");
		}

		if (AuditConstants.AAE426_CODE_2.equals(af53Dto.getAae426())) {
			throw new BusinessException("F10301002VS-14:操作失败,该案件已被其他经办人员撤销了!");
		} else if (AuditConstants.AAE426_CODE_3.equals(af53Dto.getAae426())) {
			throw new BusinessException("F10301002VS-15:操作失败,该案件已被立案了!");
		} else if (AuditConstants.AAE426_CODE_4.equals(af53Dto.getAae426())) {
			throw new BusinessException("F10301002VS-16:操作失败,该案件已被结案了!");
		} else if (AuditConstants.AAE426_CODE_1.equals(af53Dto.getAae426())) {

			this.getAdminDisposalBS().deleteAf53(af53Dto);
			this.getAdminDisposalBS().deleteAf31ByAaz318(resultVO.getAaz318());

			Af32DTO af32Dto = this.getAdminDisposalBS().getAf32ById(
					String.valueOf(resultVO.getAaz281()));
			if (af32Dto.getAaz281() == null || af32Dto.getAaz281() == 0) {
				throw new BusinessException(
						"F10301002VS-18:操作失败,没有查询到疑点问题Af32信息!");
			}
			af32Dto.setApa165(AuditConstants.APA165_CODE_1);

			this.getAdminDisposalBS().updateAf32(af32Dto);
		}

		return resultVO;
	}

}
