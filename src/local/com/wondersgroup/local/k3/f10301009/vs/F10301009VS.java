package com.wondersgroup.local.k3.f10301009.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301009.vo.TransferTurnVO;
import com.wondersgroup.local.k3.f10301009.vo.TurnMessageVO;


public interface F10301009VS {

	/***
	 *按查询条件查询出还未移交的，并且结论为行政处理处罚或司法处理的被稽核对象所属的案件
	 *@author
	 *@param
	 *@param
	 *@return
	 */
	public Map<String, Object> queryTransTurnCasees(Page page,TransferTurnVO returnVO);
	
	/***
	 *根据案件编号查询案件信息
	 *@author
	 *@param
	 *@param
	 *@return
	 */
	public Map<String, Object> queryTurnCaseByAbz001(Page page , TransferTurnVO returnVO);
	
	/***
	 *根据aaz318 查询 被稽核对象
	 *@author
	 *@param
	 *@param
	 *@return
	 */
	public Map<String, Object> queryTurnBeAuditByAaz318(Page page , TurnMessageVO returnVO);
	
	/***
	 *保存移交信息
	 *@author
	 *@param returnVO
	 *@return
	 */
	public TurnMessageVO saveTurnInfo(TurnMessageVO returnVO);
}
