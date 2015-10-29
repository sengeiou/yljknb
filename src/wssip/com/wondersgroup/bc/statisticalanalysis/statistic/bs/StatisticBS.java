package com.wondersgroup.bc.statisticalanalysis.statistic.bs;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.AnalTopDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.CbrjyqsDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.DoctDrugDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.DoctTendDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc50DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke12DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke13DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kf27DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kf28DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.PresInfoDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.VisitInfoDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.AcceptDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.AnalAttenMediDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediDrugDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediFeeTrendDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediMoveAvgDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediClinDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.YlfwjgfxfyzbDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603005.vo.AcceptPeopleVO;
import com.wondersgroup.local.k6.f10603007.vo.F10603007VO;

public interface StatisticBS {

	public List<Kc50DTO> queryInsurWithPage(Kc50DTO kc50Dto);

	/**
	 * 根据条件查询 参保人就医趋势存储过程id
	 * 
	 * @param cbrjyqsDto
	 * @return 包含存储过程id的 CbrjyqsDTO对象
	 */
	public CbrjyqsDTO queryProccid(CbrjyqsDTO cbrjyqsDto);

	public Page querySeeDoctTrendWithPage(Page page, Kc50DTO kc50DTO);

	/****
	 * 查询移动平均
	 */
	public List<Kc50DTO> queryMoveAverage(Kc50DTO kc50DTO);

	/**
	 * 参保人查询医疗类别
	 * **/
	public Page queryMedicCateWithPage(Page page, Kc50DTO kc50Dto);

	/***
	 * 参保人查询疾病分类
	 * **/
	public Page queryDiseCateWithPage(Page page, Kc50DTO kc50Dto);
	
	public Ac01DTO getByAc01Id(String aac001);

	public Page queryInsurVisInfoByAac001(Page page, VisitInfoDTO visDto);

	/**
	 * 处方信息
	 * **/
	public Page queryPresInfoByAaz217(Page page, PresInfoDTO presDto);

	/**
	 * 历史违规信息
	 * **/
	public Page queryVoisRecdWithPage(Page page, Af31DTO af31Dto);

	/**
	 * 医师费用 查询存过得到 分析id
	 * **/
	public DoctTendDTO queryAnalidByDoctFee(DoctTendDTO dtDto);

	/**
	 * 查询医师费用分析 图表数据
	 * **/
	public List<AnalTopDTO> queryDoctExpenWithPage(Ke13DTO ke13Dto);

	/***
	 * 查询医师医疗类别
	 * **/
	public Page queryDoctMediCateWithPage(Page page, Ke13DTO ke13Dto);

	/***
	 * 查询医师身份类别
	 * **/
	public Page queryDoctStatuCateWithPage(Page page, Ke13DTO ke13Dto);

	/***
	 * 查询医师疾病分类
	 * **/
	public Page queryDoctDiseCateWithPage(Page page, Ke13DTO ke13Dto);

	/**
	 * 查询医师就诊信息
	 * **/
	public Page queryDoctVisitWithPage(Page page, VisitInfoDTO visitDto);

	/**
	 * 按医疗发票项目分类的三目构成情况
	 * 
	 */
	public List<Ke12DTO> queryInvoice(Ke12DTO ke12DTO);
	
	/****
	 * 查询收费项目等级分类
	 * */
	public Page queryChargeWithPage(Page page, Ke12DTO ke12Dto);
	
	/**
	 * 医师排名情况
	 *
	 */
	public List<Ke12DTO> queryDoctRank(Ke12DTO ke12Dto);
	
	/**
	 * 医师药品使用情况分析 生成柱状图分析数据
	 * **/
	public DoctDrugDTO queryAnalidByDoctDrug(DoctDrugDTO ddDto);

	/**
	 * 生成医疗机构分项费用趋势数据
	 * 
	 * @param returnVO
	 * @return
	 */
	public F10603007VO buildYLJGFXTYFZQSData(F10603007VO returnVO);

	/**
	 * 分页查询医疗机构分项费用趋势
	 * 
	 * @param page
	 * @param returnVO
	 * @return
	 */
	public Page queryYLJGFXTYFZQSWithPage(Page page, F10603007VO returnVO);
	
	/**
	 * 医师药品类别 （甲类 乙类 丙类）
	 * **/
	public Page queryDoctDrugCateWithPage(Page page, Ke12DTO ke12Dto);
	

	/**
	 * 查询医疗机构分项费用趋势图表数据
	 * 
	 * @param f10603007vo
	 * @return
	 */
	public F10603007VO queryYLJGFXTYFZQSMoveAverage(F10603007VO f10603007vo);
	
	/**
	 * 医疗机构医疗费用发展趋势分析
	 * (调用存过)得到分析id
	 * **/
	public MediFeeTrendDTO queryAnalidByMediFee(MediFeeTrendDTO mediFeeDto);
	
	/**
	 * 查询机构平均移动数据
	 * **/
	public List<MediMoveAvgDTO> queryMediFeeTrendList(Kf28DTO kf28Dto);
	
	/**
	 * 查询机构 发展趋势grid
	 * **/
	public Page queryMediFeeTrendWithPage(Page page , Kf28DTO kf28Dto);

	/**
	 * 医疗机构分项费用占比
	 * (调用存过)得到分析id
	 * **/
	public YlfwjgfxfyzbDTO qureyAnalId(YlfwjgfxfyzbDTO dto);
	/**
	 * 查询医疗机构分项费用占比
	 * @param dto
	 * @return
	 */
	public List<Kf28DTO> queryMediPartFee(Kf28DTO dto);
	/**
	 * 分页查询 按医疗类别分类的明细
	 * @param page
	 * @param dto
	 * @return
	 */
	public Page queryMedicalWithPage(Page page,Kf28DTO dto);
	/**
	 * 分页查询 按疾病分类的明细
	 * @param page
	 * @param dto
	 * @return
	 */
	public Page queryDiseaseWithPage(Page page,Kf28DTO dto);
	/**
	 * 分页查询 按身份类别分类的明细
	 */
	public Page queryIdentifyWithPage(Page page,Kf28DTO dto);
	/**
	 * 医疗机构药品使用情况分析
	 * (调用存过)得到分析id
	 * **/
	public MediDrugDTO queryAnalidByMediDrug(MediDrugDTO mediDrugDto);
	
	/**
	 * 查询医疗机构药品使用情况分析（图标）
	 * **/
	public List<AnalTopDTO> queryMediDrugExpenList(Kf27DTO kf27Dto);
	/**
	 * 按医疗发票项目分类的三目构成情况
	 * 
	 */
	public List<Kf27DTO> queryInvoice(Kf27DTO kf27DTO);
	/**
	 * 医院排名情况
	 *
	 */
	public List<Kf27DTO> queryMedicalRank(Kf27DTO kf27DTO);
	/****
	 * 查询收费项目等级分类
	 * */
	public Page queryChargeWithPage(Page page, Kf27DTO kf27DTO);
		
	
	/**
	 * 查询医疗机构（甲类)
	 * **/
	public Page queryMediDrugDiseaseWithPage(Page page , Kf27DTO kf27Dto);
	
	/**
	 * 查询医疗机构（乙类)
	 * **/
	public Page queryMediDrugMedicalWithPage(Page page , Kf27DTO kf27Dto);
	
	/**
	 * 查询医疗机构（丙类)
	 * **/
	public Page queryMediDrugIdentifyWithPage(Page page , Kf27DTO kf27Dto);
	
	/**
	 * 医疗机构就诊信息
	 * **/
	public Page queryMediVisitWithPage(Page page, VisitInfoDTO visitDto);
	
	/**
	 * 医疗机构门诊综合分析
	 * (调用存过)得到分析id
	 * **/
	public MediClinDTO queryAnalidByMediClinFee(MediClinDTO mediPntDto);
	
	/**
	 * 医疗机构门诊综合分析(圖表)
	 * **/
	public List<AnalTopDTO> queryMediClinExpenList(Kf28DTO kf28Dto);
	
	/**
	 * 医疗机构门诊综合分析
	 * 醫療類別
	 * **/
	public Page queryMediClinMediWithPage(Page page , Kf28DTO kf28Dto);
	
	/**
	 * 医疗机构门诊综合分析
	 * 身份類別
	 * **/
	public Page queryMediClinIdentifyWithPage(Page page , Kf28DTO kf28Dto);
	
	/**
	 * 医疗机构门诊综合分析
	 * 疾病分類
	 * **/
	public Page queryMediClinDiseaseWithPage(Page page , Kf28DTO kf28Dto);
	
	//接诊人次
	/**
	 * 接诊人次 查询存过得到 分析id
	 * **/
	public AcceptDTO queryAnalidByAccept(AcceptDTO atDto);
	
	/**
	 * 查询接诊人次 图表数据
	 * **/
	public List<AnalAttenMediDTO> queryAcceptPeopleList(AnalAttenMediDTO analAttenMediDTO);
	
	/**
	 * 分页查询医疗机构接诊人次趋势
	 * 
	 * @param page
	 * @param returnVO
	 * @return
	 */
	public Page queryYLJGJZRCFZQSWithPage(Page page, AcceptPeopleVO returnVO);
	
}
