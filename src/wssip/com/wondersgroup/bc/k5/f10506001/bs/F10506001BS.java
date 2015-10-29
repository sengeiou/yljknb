package com.wondersgroup.bc.k5.f10506001.bs;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10506001.vo.HosDetailVO;
import com.wondersgroup.local.k5.f10506001.vo.RuleManageVO;

public interface F10506001BS {

	/**
	 * 
	 * @methodName: queryViolationsDocumentsCount
	 * @Description:分页查询违规单据统计信息（kc63）
	 * @param page
	 * @param queryDto
	 * @return Page
	 * @author 张磊
	 * @date 2015-1-5 下午01:47:17
	 */
	Page queryKc63WithPage(Page page, Kc63DTO queryDto);

	/**
	 * 
	 * @methodName: queryKc62WithPage
	 * @Description:分页查询违规单据明细统计信息(kc62)
	 * @param page
	 * @param queryDto
	 * @return Page
	 * @author 张磊
	 * @date 2015-1-5 下午02:12:37
	 */
	Page queryKc62WithPage(Page page, Kc62DTO kc62DTO);

	/**
	 * 
	 * @methodName: getKc63ById
	 * @Description:根据baz001ID查询实体类信息
	 * @param baz001
	 * @return Kc63DTO
	 * @author 张磊
	 * @date 2015-1-5 下午02:57:33
	 */
	Kc63DTO getKc63ById(String baz001);

	/**
	 * 
	 * @methodName: queryKc72
	 * @Description:根据Baz003查询Kc72信息
	 * @param queryDto
	 * @return List<Kc72DTO>
	 * @author 张磊
	 * @date 2015-1-5 下午02:59:15
	 */
	List<Kc72DTO> queryKc72(Kc72DTO queryDto);

	/**
	 * 
	 * @methodName: queryKc81Info
	 * @Description:查询KC81信息
	 * @param queryDto
	 * @return List<Kc81DTO>
	 * @author 张磊
	 * @date 2015-1-5 下午03:11:44
	 */
	List<Kc81DTO> queryKc81Info(Kc81DTO queryDto);

	/**
	 * 
	 * @methodName: queryKc73
	 * @Description:查询Kc73实体信息
	 * @param kc72Dto
	 * @return List<Kc73DTO>
	 * @author 张磊
	 * @date 2015-1-5 下午03:58:51
	 */
	List<Kc73DTO> queryKc73(Kc73DTO kc73Dto);

	void saveKe02Info(Ke02DTO ke02DTO);

	Kc62DTO updateKc62(Kc62DTO kc62dto);

	//void updateKc62StateBaz102(String strid);

	List<RuleManageVO> getYbgzfl();

	List<RuleManageVO> getYbgzflxx(String bm);

	Kc62DTO getKc62ById(String string);

	/**
	 * 保存kc81
	 * @param kc81dto
	 * @return
	 */
	Kc81DTO saveKc81Info(Kc81DTO kc81dto);

	List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO);

	/**
	 * 根据一组id查询kc62
	 * 
	 * @param kc62Ids
	 * @return
	 */
	List<Kc62DTO> findCaseID(String kc62Ids);

	/**
	 * 保存附件信息
	 * 
	 * @param dto
	 * @return
	 */
	Ke02DTO saveKe02(Ke02DTO ke02Dto);

	Boolean queryKc05(String baz003);

	List<Map<String, Object>> findKc62List(String strids) throws ParseException;

}
