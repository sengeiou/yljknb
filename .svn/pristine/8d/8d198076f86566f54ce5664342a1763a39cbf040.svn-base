package com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf06DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Kb41DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Kf65DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Kf66DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;

public interface AuditComplaintBS {

	/**
	 * 分页查询医疗机构违规信息
	 * @param page
	 * @param Af73DTO
	 * @return
	 */
	Page queryOrgDoubtList(Page page, Af73DTO queryDto);
	

	/**
	 * 分页查询医疗机构维护信息
	 * @param page
	 * @param Af73DTO
	 * @return
	 */
	Page queryKb41Message(Page page, Kb41DTO queryDto);
	/**
	 * 根据ID 加载修改信息
	* @author 
	 * @return
	 */
	Kb41DTO findKb41(String aaz107);
	/**
	 * 保存Kb41
	* @author 
	 * @return
	 */
	Kb41DTO updateHospMessage(Kb41DTO tgDto);

	/**
	 * 同意违规
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO consentBreach(ViolationComplaintVO violationComplaintVO);

	/**
	 * 保存当前申诉信息
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO saveOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO);


	/**
	 * 查询案件信息
	 * @param aaz077
	 * @return
	 */
	Af31DTO getPersonAuditInfoAndBaseInfo(String aaz077);
	/**
	 * 分页查询科室信息
	 * @param page
	 * @param Af73DTO
	 * @return
	 */
	Page queryKf66Message(Page page, Kf66DTO Kf66Dto);
	/**
	 * 分页查询医护人员信息
	 * @param page
	 * @param Af73DTO
	 * @return
	 */
	Page queryKf65Message(Page page, Kf65DTO Kf65Dto);	
	/**
	 * 新增Kf66
	* @author 
	 * @return
	 */
	Kf66DTO saveKf66Message(Kf66DTO tgDto);


	/**
	 * 查询申诉信息
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryBreAudit(Page page, Af73DTO queryDto);


	/**
	 * 查询申诉信息详细
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryBreAuditDetail(Page page, Af73DTO queryDto);



	/**
	 * 审批通过
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO breAuditPass(ViolationComplaintVO violationComplaintVO);


	/**
	 * 审批不通过
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO breAuditNotPass(
			ViolationComplaintVO violationComplaintVO);


	/**
	 * 查询af73并复制到vo中
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO findVioComp(ViolationComplaintVO violationComplaintVO);


	/**
	 * 保存材料上传
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO addOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO);


	/**
	 * 分页查看医疗机构违规信息
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page toOrgBreCompQuery(Page page, Af73DTO queryDto);

	


	/**
	 * 分页统计统筹区申诉情况
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryBreAuditCount(Page page, Af73DTO queryDto);


	/**
	 * 分页统计医疗服务机构申诉情况
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryOrgAuditCount(Page page, Af73DTO queryDto);


	/**
	 * 分页统计医师申诉情况
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryDoctorAuditCount(Page page, Af73DTO queryDto);
	/**
	 * 新增Kf65
	* @author 
	 * @return
	 */
	Kf65DTO saveKf65Message(Kf65DTO tgDto);
	
	/**
	 * 根据baz047   返回修改数据
	* @author 
	 * @return
	 */
	Kf06DTO findKf06UpdateMessage(String aaz307);
	/**
	 * 修改kf66
	* @author 
	 * @return
	 */
	void updateKf66(Kf66DTO tgDto );
	
	/**
	 * 修改kf65
	* @author 
	 * @return
	 */
	void updateKf65(Kf65DTO tgDto );
	
	

	/**
	 * 审批通过
	 * @param
	 * @return
	 */
	F10502001VO AuditPass(F10502001VO resultVO);


	/**
	 * 新增科室加载医疗服务机构
	 * @param f10502002vo
	 * @return
	 */
	F10502002VO loadAddMessage(F10502002VO f10502002vo);
	/**
	 * 修改科室加载医疗服务机构
	 * @param f10502002vo
	 * @return
	 */
	F10502003VO loadUpdateMessage(F10502003VO f10502003vo);


	/**
	 * 分页查询科室信息
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKf06Message(Page page, F10502002VO queryDto);
	/**
	 * 分页查询医护人员信息通过信息
	 * @param page
	 * @param Af73DTO
	 * @return
	 */
	Page queryKf05Message(Page page, Kf65DTO Kf65Dto);	


	/**
	 * 审批科室维护信息通过
	 * @param resultVO
	 * @return
	 */
	F10502002VO auditPassks(F10502002VO resultVO);

	/**
	 * 审批科室维护信息不通过
	 * @param resultVO
	 * @return
	 */
	F10502002VO auditNotPassks(F10502002VO resultVO);
	
	/**
	 *更改方案信息
	 *@author dumingqiang 2014-07-09
	 *@param resultVO
	 *@return
	 */
	Kf05DTO find(String aaz263);


	void deleteKf05ById(String aaz263);


	/**
	 * 添加删除科室信息
	 * @param resultVO
	 * @return
	 */
	F10502002VO deleteKf06Message(F10502002VO resultVO);
	/**
	 * 添加删除医护人员信息
	 * @param resultVO
	 * @return
	 */
	F10502003VO deleteKf05Message(F10502003VO resultVO);


	/**
	 * 审批医护维护信息通过
	 * @param resultVO
	 * @return
	 */
	F10502003VO auditPassys(F10502003VO resultVO);


	/**
	 * 审批医护维护信息不通过
	 * @param resultVO
	 * @return
	 */
	F10502003VO auditNotPassys(F10502003VO resultVO);

	/**
	 * 审批医疗机构维护信息不通过
	 * @param resultVO
	 * @return
	 */
	F10502001VO auditNotPassyy(F10502001VO resultVO);


	/**
	 * 审批医疗机构维护信息通过
	 * @param resultVO
	 * @return
	 */
	F10502001VO auditPassyy(F10502001VO resultVO);

}

