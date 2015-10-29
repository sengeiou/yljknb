package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af46DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.BaseKa45Id;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.TbDicGzms;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka43DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka44DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka45DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbDicGzmsDTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbDicGzzbDTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbRuleDxzbDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;
import com.wondersgroup.local.k4.f10402006.vo.RuleTargetVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;
import com.wondersgroup.local.k4.f10402008.vo.F10402008VO;
import com.wondersgroup.local.k4.f10402008.vo.Tjlj_CgVO;
import com.wondersgroup.local.k4.f10402008.vo.YbgzmxVO;

public interface RuleManageBS {
	/**
	 * 根据条件查询规则模板
	 * @author wjz
	 * @param Page,ModelManageVO
	 * @return
	 */
	Page queryModelManageWithPage(Page page, ModelManageVO modelManageVo);
	
	/**
	 * 根据模板ID查询规则
	 * @author wjz
	 * @param Page,RuleVO
	 * @return
	 */
	Page queryRuleWithPageAndModel(Page page,String aaz320);
	/**
	 * 根据条件查询方案
	 * @author wjz
	 * @param Page,schemeVo
	 * @return
	 */
	Page querySchemeWithPage(Page page,PlanManageVO schemeVo,String type);
	
	/**
	 * 保存Ka43
	 * @author wjz
	 * @param ka43Dto
	 * @return
	 */
	Ka43DTO SaveKa43(Ka43DTO ka43Dto);

	/**
	 * 更新Ka43
	 * @author wjz
	 * @param Ka43DTO
	 * @return
	 */
	void updateKa43(Ka43DTO ka43Dto);
	
	/**
	 * 根据ID查询规则模板
	 * @author wjz
	 * @param id
	 * @return
	 */
	Ka43DTO queryModelById(Long id);
	
	/**
	 * 根据条件查询规则
	 * @author wjz
	 * @param page
	 * @param ruleVO
	 * @return
	 */
	Page queryRuleWithPage(Page page,RuleVO ruleVO);
	
	/**
	 * 保存Ka44
	 * @author wjz
	 * @param ka44dto
	 */
	Ka44DTO saveKa44(Ka44DTO ka44dto);
	
	/**
	 * 生成Aaa168
	 * @author wjz
	 * @param aaa153
	 * @return
	 */
	String getAaa168(String aaa153);
	
	/**
	 * 根据id加载数据
	 * @author wjz
	 * @param ruleVo
	 * @return
	 */
	Ka44DTO loadKa44(RuleVO ruleVo);
	
	/**
	 * 更新Ka44
	 * @author wjz
	 * @param ka44dto
	 * @return
	 */
	Ka44DTO updateKa44(Ka44DTO ka44dto);

	/**
	 * 根据ID加载af46
	 * @author wjz
	 * @param id
	 * @return
	 */
	Af46DTO loadAf46(String ids);

	/**
	 * 保存af46
	 * @author wjz
	 * @param analysisRuleVO
	 * @return
	 */
	void saveAf46(Af46DTO Af46Dto);

	/**
	 * 分页查询af46
	 * @author wjz
	 * @param page,analysisRuleVO
	 * @return
	 */
	Page queryAnalysisRuleWithPage(Page page,
			AnalysisRuleVO analysisRuleVO);
	
	/**
	 * 更新af46
	 * @author wjz
	 * @param Af46DTO
	 * @return
	 */
	void updateKa46(Af46DTO af46Dto);
	
	/**
	 * 更新Af46统计期别
	 * @param dto
	 */
	void updateAf46Aae043(Af46DTO dto );
	
	/**
	 * 启用或禁用Af46
	 * @author wjz
	 * @param dto
	 */
	void updateAf46Aae100(Af46DTO dto);
	
	/**
	 * 启用或禁用ka44
	 * @author wjz
	 * @param dto
	 */
	void updateKa44Aae100(Ka44DTO ka44Dto);
	

	/**
	 * 启用或禁用ka43
	 * @author wjz
	 * @param dto
	 */
	void updateKa43Aae100(Ka43DTO dto);
	
	/**
	 * 分页查询监控类型
	 * @author wjz
	 * @param page , ruleVO
	 */
	Page queryAaa153WithPage(Page page, RuleVO ruleVO);
	
	/**
	 * 分页查询规则	条件:监控类型
	 * @author wjz
	 * @param page , ruleVO
	 */
	Page queryKa44ByAaa153(Page page, RuleVO ruleVo);
	/**
	 * 保存Ka45
	 * @author wjz
	 * @param 
	 */
	void saveKa45(Ka45DTO dto);
	
	void updateKa45(Ka45DTO dto);
	
	/**
	 * 分页查询阈值信息	条件:规则ID
	 * @author wjz
	 * @param page , aaz319
	 */
	Page queryKa45WithPage(Page page, String aaz319);
	
	/**
	 * 删除阈值
	 * @author wjz
	 * @param KA45DTO
	 */
	void deleteKa45(Ka45DTO dto);
	
	/**
	 * 加载单个阈值信息
	* @author wjz
	 * @return
	 */
	Ka45DTO loadKa45(BaseKa45Id id);
	
	/**
	 * 添加addTbDicGzms
	* @author wjz
	 * @return
	 */
	TbDicGzmsDTO addTbDicGzms(TbDicGzmsDTO tgDto);
	
	/**
	 * 查询信息queryRuleMessage
	* @author 
	 * @return
	 */
	Page queryRuleMessage(Page page , TbDicGzmsDTO tgDto);
	/**
	 * 修改updateTbDicGzms
	* @author 
	 * @return
	 */
	void updateTbDicGzms(TbDicGzmsDTO tgDto,String gzdm1);
	
	/**
	 * 根据ID 加载修改信息
	* @author 
	 * @return
	 */
	TbDicGzmsDTO findtbdicgzms(String id);
	/**
	 * 删除deleteTbDicGzms
	* @author 
	 * @return
	 */
	void deleteTbDicGzms(String idStr);
	
	/**
	 *添加addTbDicGzzb
	* @author 
	 * @return
	 */
	TbDicGzzbDTO addTbDicGzzb(TbDicGzzbDTO tdDto);
	
	/**
	 * 查询queryRuleTarget
	* @author 
	 * @return
	 */
	Page queryRuleTarget(Page page , TbDicGzzbDTO tdDto);
	
	/**
	 * 删除deleteTbDicGzzb
	* @author 
	 * @return
	 */
	void deleteTbDicGzzb(String idStr);
	
	/**
	 * 保存SaveTbRuleDxzb
	* @author 
	 * @return
	 */
	TbRuleDxzbDTO SaveTbRuleDxzb(TbRuleDxzbDTO trDto);
	
	
	/**
	 * 查询稽核案件记录
	 * 查询tb_dic_gzms和tb_dic_gzzb稽核案件记录
	 * @param page
	 * @param caseVO
	 * @return
	 */
	Page queryCaseNumberWithPage(Page page, RuleTargetVO ruleTargetVO);

	/**
	 * 查询三大目录信息
	 * @author 
	 * @param Page,ModelManageVO
	 * @return
	 */
	Page  queryFwxmMl(Page page,DxzbVO dxzbVO);

	Page  queryYpMl( Page page,DxzbVO dxzbVO);

	Page queryCLMl(Page page,DxzbVO dxzbVO);

	Page  queryAllMl( Page page ,DxzbVO dxzbVO);
	
	/**
	 * 根据条件查询监控对象指标
	 * @author 
	 * @param 
	 * @return
	 */
	Page queryDxzbMessage(Page page, DxzbVO dxzbVO);
	
	/**
	 * 修改Dxzb信息
	* @author 
	 * @return
	 */
	TbDicGzmsDTO updateTbRuleDxzb(TbRuleDxzbDTO tgDto);
	
	/**
	 * 根据ID 加载修改信息
	* @author 
	 * @return
	 */
	TbRuleDxzbDTO findtbruledxzb(String id);
	
	/**
	 * 删除TbRuleDxzb
	* @author 
	 * @return
	 */
	void deleteTbRuleDxzb(String idStr);
	
	/**
	 * 根据规则维护信息ID查询规则指标信息
	 * @author 
	 * @param 
	 * @return
	 */
	Page queryGzzbByGzmsId(Page page,String gzdm);
	

	/**
	 * 查询gzms中得规则名称和规则代码
	 * @author 
	 * @param 
	 * @return
	 */
	List<TbDicGzms> queryModelFromGzms();
	


//	/**
//	 * 根据条件查询ka43导出
//	 * @author wjz
//	 * @return
//	 */
//	List<Map<String,Object>> queryModelManageForExport(Ka43DTO dto);
//	
//	String loadDicDataByNameAndCode(String name,String code);
	Integer checkDm(String sql);
	
	public List<F10402008VO> getYbgzfl();

	List<F10402008VO> getYbgzflxx(String bm);

	Page queryZsdWithPage(Page page, F10402008VO VO);

	YbgzmxVO loadZsdxx(String zsdid);

	List<Map<String, Object>> queryBySql(String sql);

	Page queryLjsjWithPage(Page page, String sjzdb, String sjms, String sjzszd, String sjzdlx);
	
	Object getObjBySql(String sql);

	void saveSjnr(Tjlj_CgVO vo);

	void updateZsdmx(YbgzmxVO mxvo);

	void updateZsdmxYxbz(String id);
}
