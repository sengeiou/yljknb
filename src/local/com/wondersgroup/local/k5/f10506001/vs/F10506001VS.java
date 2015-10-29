package com.wondersgroup.local.k5.f10506001.vs;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10506001.vo.F10506001VO;
import com.wondersgroup.local.k5.f10506001.vo.HosDetailVO;
import com.wondersgroup.local.k5.f10506001.vo.PreCheckVO;

public interface F10506001VS {

	/**
	 * 
	 * @methodName: queryViolationsDocumentsCount
	 * @Description:分页查询违规单据统计信息（kc63）       
	 * @param page
	 * @param f10506001vo
	 * @return  Map<String,Object> 
	 * @author  张磊
	 * @date 2015-1-5 下午01:37:12
	 */
	Map<String, Object> queryViolationsDocumentsCount(Page page,F10506001VO f10506001vo);

	/**
	 * 
	 * @methodName: queryViolationsDocumentsDetail
	 * @Description:分页查询违规单据明细统计信息(kc62)       
	 * @param page
	 * @param f10506001vo
	 * @return  Map<String,Object> 
	 * @author  张磊
	 * @date 2015-1-5 下午02:08:51
	 */
	Map<String, Object> queryViolationsDocumentsDetail(Page page,F10506001VO f10506001vo);

	/**
	 * 
	 * @methodName: queryViolationsDocumentsDetailIllegal
	 * @Description:查询单据明细违规信息          
	 * @param resultVO
	 * @return  F10506001VO 
	 * @author  张磊
	 * @date 2015-1-5 下午02:52:54
	 */
	F10506001VO queryViolationsDocumentsDetailIllegal(F10506001VO f10506001VO);

	/**
	 * 
	 * @methodName: queryCheckRecordByBaz003
	 * @Description:查询单据明细审核信息       
	 * @param baz003
	 * @return  List<PreCheckVO> 
	 * @author  张磊
	 * @date 2015-1-5 下午03:08:59
	 */
	List<PreCheckVO> queryCheckRecordByBaz003(String baz003);

	/**
	 * 
	 * @methodName: queryViolationsDocumentIllegal
	 * @Description:查询违规单据违规信息       
	 * @param resultVO
	 * @return  F10506001VO 
	 * @author  张磊
	 * @date 2015-1-5 下午03:56:37
	 */
	F10506001VO queryViolationsDocumentIllegal(F10506001VO resultVO);

	//void saveKe02Info(String kc62Ids, String filePath, String fileName, String loginName);

	//void updateKc62(DxzbUploadVO dxzbUploadVO);

	F10506001VO preCheckMedDocDetail(F10506001VO f10506001vo);

	String getGzlbJson();

	String getGzxxJson(String parameter);

	List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO);

	List<Map<String, Object>> findKc62ByIds(String ids) throws ParseException;


}
