package com.wondersgroup.bc.medicarecostaudit.medaudit.bs;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CountDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc24DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FxTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FyTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FyYyTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FyZTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd30DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd33DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd34DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke01DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.MedDeductPlanDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.PmTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.ZnshTjDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10201006.vo.F10201006VO;
import com.wondersgroup.local.k2.f10201006.vo.Kc62VO;
import com.wondersgroup.local.k2.f10202002.vo.F10202002VO;
import com.wondersgroup.local.k6.f10604001.vo.FyVO;
import com.wondersgroup.local.k6.f10604001.vo.PmVO;

public interface MedAuditBS {

	/**
	 * 分页查询违规单据统计表
	 * 
	 * @param page
	 * @param kc63Dto
	 * @return
	 */
	Page queryKc63WithPage(Page page, Kc63DTO kc63Dto);

	/**
	 * 根据主键查询违规单据统计表
	 * 
	 * @param baz001
	 * @return
	 */
	Kc63DTO getKc63ById(String baz001);

	/**
	 * 更新违规单据统计表
	 * 
	 * @param kc63Dto
	 * @return
	 */
	Kc63DTO updateKc63(Kc63DTO kc63Dto);

	/**
	 * 分页查询违规单据明细统计表
	 * 
	 * @param page
	 * @param kc62Dto
	 * @return
	 */
	Page queryKc62WithPage(Page page, Kc62DTO kc62Dto);

	/**
	 * 根据主键查询违规单据明细统计表
	 * 
	 * @param baz003
	 * @return
	 */
	Kc62DTO getKc62ById(String baz003);

	/**
	 * 更新违规单据明细统计表
	 * 
	 * @param kc62Dto
	 * @return
	 */
	Kc62DTO updateKc62(Kc62DTO kc62Dto);

	/**
	 * 分页查询单据违规信息表
	 * 
	 * @param page
	 * @param kc73Dto
	 * @return
	 */
	Page queryKc73WithPage(Page page, Kc73DTO kc73Dto);

	/**
	 * 查询单据违规信息表
	 * 
	 * @param kc73Dto
	 * @return
	 */
	List<Kc73DTO> queryKc73(Kc73DTO kc73Dto);

	/**
	 * 分页查询单据明细违规信息表
	 * 
	 * @param page
	 * @param kc72Dto
	 * @return
	 */
	Page queryKc72WithPage(Page page, Kc72DTO kc72Dto);

	/**
	 * 查询单据明细违规信息表
	 * 
	 * @param kc72Dto
	 * @return
	 */
	List<Kc72DTO> queryKc72(Kc72DTO kc72Dto);

	/**
	 * 查询审核信息表
	 * 
	 * @param kc81Dto
	 * @return
	 */
	List<Kc81DTO> queryKc81Info(Kc81DTO kc81Dto);

	/**
	 * 保存审核信息表
	 * 
	 * @param kc81Dto
	 * @return
	 */
	Kc81DTO saveKc81(Kc81DTO kc81Dto);

	/**
	 * 更新审核信息表
	 * 
	 * @param kc81Dto
	 * @return
	 */
	Kc81DTO updateKc81(Kc81DTO kc81Dto);

	/**
	 * 
	 * @Title: queryZnshTj
	 * @Description: 查询智能审核统计的结果
	 * @param @param baz020 智能审核时间
	 * @param @param isDay ture表示按年月日统计，false表示按照年月统计
	 * @param @return 设定文件
	 * @return ZnshTjDTO 返回类型
	 * @throws
	 * @author chenlin
	 * @date 2014-7-21 上午09:33:39
	 */
	ZnshTjDTO queryZnshTj(String baz020, boolean isDay);

	/**
	 * 
	 * @Title: queryZnshMXTj
	 * @Description: 查询智能审核明细的统计情况
	 * @param @param page 分页对象
	 * @param @param baz020 智能审核时间
	 * @param @param isDay ture表示按年月日统计，false表示按照年月统计
	 * @param @param isYljg true表示按照医疗机构统计,false表示按照规则统计
	 * @param @param isHosp 0表示统计医院和药店,1表示统计医院,-1表示统计药店
	 * @param @return 设定文件
	 * @return ZnshMxTjDTO 返回类型
	 * @throws
	 * @author chenlin
	 * @date 2014-7-21 下午03:17:32
	 */
	Page queryZnshMXTj(Page page, String baz020, boolean isDay, boolean isYljg,
			int isHosp);

	/**
	 * 查询交互信息表
	 * 
	 * @param ke01dto
	 * @return
	 */
	List<Ke01DTO> queryKe01Info(Ke01DTO ke01dto);

	/**
	 * 保存交互信息表
	 * 
	 * @param Ke01Dto
	 * @return
	 */
	Ke01DTO saveKe01(Ke01DTO ke01Dto);

	/**
	 * 保存计划事件信息
	 * 
	 * @param Kd30Dto
	 * @return
	 */
	Kd30DTO saveKd30(Kd30DTO kd30Dto);

	/**
	 * 分页查询计划事件信息表
	 * 
	 * @param page
	 * @param kd30Dto
	 * @return
	 */
	Page queryKd30WithPage(Page page, Kd30DTO kd30Dto);

	/**
	 * 分页查询医疗机构扣款信息表
	 * 
	 * @param page
	 * @param kd33Dto
	 * @return
	 */
	Page queryKd33WithPage(Page page, Kd33DTO kd33Dto);

	/**
	 * 分页查询明细扣款信息表
	 * 
	 * @param page
	 * @param kd34Dto
	 * @return
	 */
	Page queryKd34WithPage(Page page, Kd34DTO kd34Dto);

	/**
	 * 调用存储过程保存扣款信息
	 * 
	 * @param medDeductPlanDto
	 * @return
	 */
	void saveMedDeductPlan(MedDeductPlanDTO medDeductPlanDto);

	/**
	 * 分页统计医院单据数
	 * 
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryKc63HosMedCountWithPage(Page page, Kc63DTO kc63Dto);

	/**
	 * 根据结算ID查询结算信息
	 * 
	 * @param aaz308
	 * @return
	 */
	Kc24DTO getKc24ById(String aaz308);

	/**
	 * 根据Kc21Dto查询就诊信息
	 * 
	 * @param queryDto
	 * @return
	 */
	List<Kc21DTO> queryKc21Info(Kc21DTO queryDto);

	// 以下是单病种demo的查询方法
	public Page queryFyTempWithPage(Page page, FyTempDTO fyTempDTO);

	public Page queryfyZTempWithPage(Page page, FyZTempDTO fyZTempDTO);

	public Page queryPmTempWithPage(Page page, PmTempDTO pmTempDTO);

	List<FyVO> queryPie(FyVO fyVO);

	public Page queryFxTempXbWithPage(Page page, FxTempDTO fxTempDto);

	public Page queryfxTempNldWithPage(Page page, FxTempDTO fxTempDto);

	List<PmVO> queryColumn(PmVO pmVO);

	public List<FxTempDTO> queryFxList(FxTempDTO fxTempDto);

	public Page queryFyYyTempWithPage(Page page, FyYyTempDTO fyYyTempDto);

	public List<FyYyTempDTO> queryFyYyTempList(FyYyTempDTO fyYyTempDTO);

	List<CountDTO> getF10202002Chart(F10202002VO f10202002vo);

	/**
	 * 根据规则分类分页查询医疗机构下的违法规则数
	 * 
	 * @param page
	 * @param f10202002vo
	 * @return
	 */
	Page queryF10202002Rules(Page page, F10202002VO f10202002vo);

	/**
	 * 分页查询该医疗机构下的参保人详细信息
	 * 
	 * @param page
	 * @param queryDto
	 * @return
	 */
	Page queryF10202002Detail(Page page, F10202002VO f10202002vo);
	/**
	 * 根据baz001 查询 Kc62
	 * 
	 * @param resultVO
	 * @return
	 */
	List<F10202002VO> queryKc62(F10202002VO resultVO);

	/**
	 * 根据多个baz001分页查询违规单据明细统计表
	 * 
	 * @param page
	 * @param kc62Dto
	 * @return
	 */
	Page queryKc62sWithPage(Page page, Kc62VO queryDto);

	F10201006VO querySZJ(F10201006VO f10201006vo);

}
