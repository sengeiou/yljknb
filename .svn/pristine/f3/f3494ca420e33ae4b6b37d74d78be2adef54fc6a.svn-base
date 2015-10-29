package com.wondersgroup.local.k2.f10201001.vs;

import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.ZnshTjDTO;
import com.wondersgroup.framework.core.bo.Page;

public interface F10201001VS {
	
	/**
	 * 
	 * @Title: queryZnshTj 
	 * @Description: 查询智能审核统计的结果
	 * @param @param baz020  智能审核时间
	 * @param @param isDay ture表示按年月日统计，false表示按照年月统计
	 * @param @return    设定文件 
	 * @return ZnshTjDTO    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-21 上午09:44:56
	 */
	public ZnshTjDTO queryZnshTj(String baz020,boolean isDay);
	
	/**
	 * 
	 * @Title: queryZhshMxTjWithYljg 
	 * @Description:  查询智能审核医疗机构的统计情况
	 * @param @param page   分页对象
	 * @param @param baz020   智能审核时间
	 * @param @param isDay  ture表示按年月日统计，false表示按照年月统计
	 * @param @param isHosp 0表示统计医院和药店,1表示统计医院,-1表示统计药店
	 * @param @return    设定文件 
	 * @return Map<String,Object>    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-21 下午03:44:54
	 */
	public Map<String,Object> queryZhshMxTjWithYljg(Page page,String baz020,boolean isDay,int isHosp);
	
	
	/**
	 * 
	 * @Title: queryZhshMxTjWithGz 
	 * @Description:  查询智能审核规则的统计情况
	 * @param @param page   分页对象
	 * @param @param baz020   智能审核时间
	 * @param @param isDay  ture表示按年月日统计，false表示按照年月统计
	 * @param @param isHosp 0表示统计医院和药店,1表示统计医院,-1表示统计药店
	 * @param @return    设定文件 
	 * @return Map<String,Object>    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-21 下午03:46:05
	 */
	public Map<String,Object> queryZhshMxTjWithGz(Page page,String baz020,boolean isDay,int isHosp);

}
