package com.wondersgroup.local.k3.f10301008.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.k3.f10301008.vo.Af52VO;
import com.wondersgroup.local.k3.f10301008.vo.Af54VO;
import com.wondersgroup.local.k3.f10301008.vo.Af62VO;
import com.wondersgroup.local.k3.f10301008.vo.Af63VO;
import com.wondersgroup.local.k3.f10301008.vo.Af64VO;
import com.wondersgroup.local.k3.f10301008.vo.ConveyRecordVO;
import com.wondersgroup.local.k3.f10301008.vo.QueryDetailsVO;
import com.wondersgroup.local.k3.f10301008.vo.VerdictFinishVO;
import com.wondersgroup.local.k3.f10301008.vo.VerdictConveyVO;

public interface F10301008VS {

	/**
	 *按查询条件查询出已结案，但未告知终结的案件
	 *@author
	 *@param page
	 *@param returnVO
	 *@return
	 */
	public Map<String, Object> queryAuditCaseWithPage(Page page ,VerdictConveyVO returnVO);
	
	/**
	 *查询被稽核对象信息
	 */
	public Map<String, Object> queryBeAuditWithPage(Page page , VerdictFinishVO returnVO);
	
	/***
	 *根据aaz318 查询对象
	 */
	public VerdictConveyVO queryVerdictCaseInfoByAaz318(String aaz318);
	
	/**
	 *保存稽核结论传达记录
	 *@author
	 *@param 
	 *@return
	 */
	public ConveyRecordVO saveConveyRecord(ConveyRecordVO returnVO);
	
	/**
	 *分页查询 稽核传达记录
	 *@author
	 *@param page
	 *@param returnVO
	 *@return
	 */
	public Map<String, Object> queryConveyRecordWithPage(Page page , ConveyRecordVO returnVO);
	
	/**
	 *删除 稽核传达记录
	 *@author
	 *@param aaz147s
	 *@return
	 */
	public ConveyRecordVO deleteConveyRecordByIds(String aaz147s);
	
	/***
	 *告知终结
	 *@author
	 *@param aaz077
	 *@return 
	 */
	public VerdictFinishVO finishConvey(String aaz077);
	/**
	 * 获取传达信息
	 * @param af54vo
	 * @return
	 */
	Af54VO queryAf54Info(Af54VO af54vo);
	/**
	 * 
	 * @param af54vo
	 * @return
	 */
	Af54VO saveConver(Af54VO af54vo);
	
	/**
	 * 
	 * @param af54vo
	 * @return
	 */
	Map<String, Object> queryAf54WithMap(Af54VO af54vo);
	
	/**
	 * 查询AF38
	 * @param queryDetailsVO
	 * @return
	 */
	public QueryDetailsVO queryDetailsByAaz077(String aaz077);
	/**
	 * 案件移交
	 * @param af52vo
	 * @return
	 */
	Af52VO caseMove(Af52VO af52vo);
	/**
	 * 
	 * @param af52vo
	 * @return
	 */
	Map<String, Object> queryAf52WithMap(Af52VO af52vo);
	/**
	 * 
	 * @param af62vo
	 * @return
	 */
	Af62VO changeOfTime(Af62VO af62vo);
	/**
	 * 
	 * @param af62vo
	 * @return
	 */
	Map<String, Object> queryAf62WithMap(Af62VO af62vo);
	/**
	 * 
	 * @param af63vo
	 * @return
	 */
	Af63VO recovery(Af63VO af63vo);
	/**
	 * 
	 * @param af63vo
	 * @return
	 */
	Map<String, Object> queryAf63WithMap(Af63VO af63vo);
	/**
	 * 
	 * @param af64vo
	 * @return
	 */
	Af64VO queryReturnInfo(Af64VO af64vo);
	/**
	 * 
	 * @param af64vo
	 * @return
	 */
	Af64VO saveReturnProveInfo(Af64VO af64vo);
	/**
	 * 
	 * @param af64vo
	 * @return
	 */
	Map<String, Object> queryAf64WithMap(Af64VO af64vo);

	/**
	 * 对象恢复查询
	 * @param aaz077
	 * @return
	 */
	public BeAuditTargetVO queryBeAuditTargetInfoById(String aaz077);

	public BeAuditTargetVO queryAf31ByAaz077(String aaz077);
}
