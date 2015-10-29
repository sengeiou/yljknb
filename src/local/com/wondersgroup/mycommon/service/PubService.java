package com.wondersgroup.mycommon.service;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.mycommon.web.vo.DistribAddressVO;
import com.wondersgroup.mycommon.web.vo.ManufProductsVO;
import com.wondersgroup.mycommon.web.vo.ModifyPwdVO;

public interface PubService {

	/**
	 * 修改密码
	 * 
	 * @param vo
	 */
	void modifypwd(ModifyPwdVO vo);

	/**
	 * 用于名字模糊查询医疗机构
	 * 
	 * @param page
	 * @param query
	 * @return
	 */
	Map<String, Object> findMedicalInstitution(Page page, String key);

	/**
	 * 根据医院编码查询其配送地址
	 * 
	 * @return
	 */
	List<DistribAddressVO> findAllAddress(String yybm);

	/**
	 * 查询中心带量采购商品
	 * 
	 * @param page
	 * @param splx商品类型
	 * @param yplx药品类型
	 * @param cpm产品名
	 * @param bzdwxz
	 * @return
	 */

	Map<String, Object> findManufProductsWithAmountMode(Page page, String yqbm, String splx, String yplx, String cpm);

	/**
	 * 用于联想框查询药企
	 * 
	 * @param page
	 * @param query
	 * @return
	 */
	Map<String, Object> findManufacturer(Page page, String query);

	/**
	 * 用于联想框查询中心商品目录商品
	 * 
	 * @param page
	 * @param query
	 * @return
	 */
	Map<String, Object> findZXManufacturer(Page page, String query);

	/**
	 * 用于联想查中心商品目录和药企商品目录
	 * 
	 * @param page
	 * @param query
	 * @return
	 */
	Map<String, Object> findYQManufacturer(Page page, String query, String yqbm);

	/**
	 * 根据中心编码以及药企编码查询药企申报的货品
	 * 
	 * @param zxspbm
	 * @return
	 */
	List<ManufProductsVO> findYqProductsByZx(String yqbm, String zxspbm);

	/**
	 * 查询挂网采购商品
	 * 
	 * @param page
	 * @param yqbm
	 * @param splx
	 * @param yplx
	 * @param cpm
	 * @param yybm
	 * @return
	 */
	Map<String, Object> findManufProductsWithNetPurchase(Page page, String yqbm, String splx, String yplx, String cpm, String yybm);

}
