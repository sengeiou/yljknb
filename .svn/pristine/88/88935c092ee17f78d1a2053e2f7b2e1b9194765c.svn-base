package com.wondersgroup.local.k4.f10402007.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;

import com.wondersgroup.local.k4.f10402007.vo.DxzbUploadResultVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbUploadVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;




public interface F10402007VS {
	/**
	 *添加监控对象指标
	 *@author 
	 *@param resultVO
	 *@return
	 */
	
	
	public DxzbVO saveDxzb(DxzbVO dxzbVO);
	
	/**
	 *查询三大目录信息
	 *@author 
	 *@param resultVO
	 *@return
	 */
	
	public Map<String, Object> queryMldx(Page page,
			DxzbVO dxzbVO);
	/**
	 *查询监控指标信息
	 *@author 
	 *@param resultVO
	 *@return
	 */
	
	public Map<String, Object> queryDxzbMessage(Page page,
			DxzbVO dxzbVO);
	
	/**
	 *更改方案信息
	 *@author 
	 *@param resultVO
	 *@return
	 */
     public  DxzbVO updateDxzbMessage(DxzbVO resultVO);
 	/**
 	 *启动方案
 	 *@author 
 	 *@param aaz100
 	 *@return
 	 */	
     
	public DxzbVO find(String id);
	
	/**
	 *删除监控对象信息
	 *@author 
	 *@param resultVO
	 *@return
	 */
	public void deleteDxzbRuleMessage(String idStr);
	
	/**
	 * 查询dxzb信息
	 * @param page
	 * @param 
	 * @return
	 */
	Map<String, Object> queryCaseWithPage(Page page, DxzbVO dxzbVO);
	
	
	/**
	 * 根据规则维护信息ID查询规则指标信息
	 * @author 
	 * @param id
	 * @return
	 */

	Map<String, Object> queryGzzbByGzmsId(Page page,String gzdm);
    /**
     * 上传对象指标信息
     * @param dxzbUploadVO
     * @return
     */
	public DxzbUploadResultVO uploadDxzbInfo(DxzbUploadVO dxzbUploadVO);
    /**
     * 从临时表中查询上传成功的对象指标保存(批量上传)
     * @param resultVO
     * @return
     */
	public DxzbVO saveBacthDxzbInfo(DxzbVO resultVO);

	/**
	 * 分页查询上传的对象指标信息
	 * @param page
	 * @param bsz005
	 * @return
	 */
	public Map<String, Object> queryDxzbApplyInfo(Page page, String bsz005);

}
