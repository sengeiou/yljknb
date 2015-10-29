package com.wondersgroup.mycommon.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.security.encoder.PasswordEncoderUtils;
import com.wondersgroup.mycommon.service.PubService;
import com.wondersgroup.mycommon.web.vo.CenterProductsVO;
import com.wondersgroup.mycommon.web.vo.DistribAddressVO;
import com.wondersgroup.mycommon.web.vo.ManufProductsVO;
import com.wondersgroup.mycommon.web.vo.ManufacturerVO;
import com.wondersgroup.mycommon.web.vo.MedicalInstitutionVO;
import com.wondersgroup.mycommon.web.vo.ModifyPwdVO;
import com.wondersgroup.mycommon.web.vo.UserPwdDTO;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.DicUtils;

public class PubServiceImpl implements PubService {

	public void modifypwd(ModifyPwdVO vo) {
		UserPwdDTO dto = CommonJdbcDaoUtils.getFirst("select * from cs_user where id = ?", UserPwdDTO.class, vo.getId());

		String password = PasswordEncoderUtils.encodePassword(vo.getOldpassword(), "");
		if (!dto.getPassword().equals(password)) {
			throw new BusinessException("原密码不符，请重新输入");
		}
		password = PasswordEncoderUtils.encodePassword(vo.getNewpassword(), "");

		CommonJdbcDaoUtils.update("update cs_user set password = ? where id =  ?", password, vo.getId());
	}

	/**
	 * 用于名字模糊查询医疗机构
	 */
	public Map<String, Object> findMedicalInstitution(Page page, String key) {

		StringBuffer sql = new StringBuffer(
				"SELECT YYBM,YBBM,YYMC,JGLX,JGDJ,SZDZ,SZQX,GLQX,YZBM,LXR,LXDH,EMAIL,KHYH,YHZH,YXBZ,KSRQ,JSRQ,YYMCPYM,YYMCWBM FROM TB_YYXX WHERE YXBZ='1'");

		if (StringUtils.isNotBlank(key)) {
			sql.append(" AND (YYMC LIKE '" + key + "%' OR YYMCPYM LIKE '" + key.toUpperCase() + "%' OR YYMCWBM LIKE '" + key.toUpperCase()
					+ "%')");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), MedicalInstitutionVO.class);

		return GridUtils.getGridData(result);
	}

	/**
	 * 根据医院编码查询其配送地址
	 */
	public List<DistribAddressVO> findAllAddress(String yybm) {
		List<DistribAddressVO> result = null;

		if (StringUtils.isNotBlank(yybm)) {
			String sql = "SELECT YYBM,PSDBM,PSDMC,PSDZ,LXRXM,LXDH,YZBM,BZXX,TO_CHAR(KSRQ,'YYYY-MM-DD') AS KSRQ,TO_CHAR(JSRQ,'YYYY-MM-DD HH24:MI:SS') AS JSRQ,YXBZ FROM TB_YYPSD WHERE YXBZ = '1' AND YYBM = ?";
			result = CommonJdbcDaoUtils.query(sql, DistribAddressVO.class, yybm);
		}
		return result;
	}

	/**
	 * 查询中心带量采购商品
	 */
	public Map<String, Object> findManufProductsWithAmountMode(Page page, String yqbm, String splx, String yplx, String cpm) {
		/**
		 * SELECT
		 * A.SPLX,A.ZXSPBM,A.YBBM,A.YPLX,A.TYM,A.CPM,A.SPM,A.YPJX,A.GG,A.GGBZ
		 * ,A.BZDWXZ,A.BZDWMC,
		 * A.BZFS,A.YYDWMC,A.BZNHSL,A.SCQYMC,A.BWM,A.PZWH,B.KCSL
		 * ,B.XSDJ,A.TYMPYM,A.TYMWBM,A.CPMPYM, A.CPMWBM,A.SPMPYM,A.SPMWBM FROM
		 * TB_ZXSPML A, TB_DLCGZBXX B, TB_CGLX C WHERE A.ZXSPBM = B.ZXSPBM AND
		 * A.YXBZ = '1' AND B.ZT = '10' AND SYSDATE BETWEEN A.KSRQ AND A.JSRQ
		 * AND A.ZXSPBM = C.ZXSPBM AND C.YXBZ = '1' AND C.CGLX = '1' AND SYSDATE
		 * BETWEEN C.KSSJ AND C.JSSJ AND B.YQBM = ?
		 */

		String $sql = "SELECT A.SPLX,A.ZXSPBM,A.YBBM,A.YPLX,A.TYM,A.CPM,A.SPM,A.YPJX,A.GG,A.GGBZ,A.BZDWXZ,A.BZDWMC,A.BZFS,A.YYDWMC,A.BZNHSL,A.SCQYMC,A.BWM,A.PZWH,B.KCSL,B.XSDJ,A.TYMPYM,A.TYMWBM,A.CPMPYM,A.CPMWBM,A.SPMPYM,A.SPMWBM FROM TB_ZXSPML A, TB_DLCGZBXX B, TB_CGLX C WHERE A.ZXSPBM = B.ZXSPBM AND A.YXBZ = '1' AND B.ZT = '10' AND SYSDATE BETWEEN A.KSRQ AND A.JSRQ AND A.ZXSPBM = C.ZXSPBM AND C.YXBZ = '1' AND C.CGLX = '1' AND SYSDATE BETWEEN C.KSSJ AND C.JSSJ AND B.YQBM = ?";

		StringBuffer sql = new StringBuffer($sql);

		List<Object> params = new ArrayList<Object>();
		params.add(yqbm);

		if (StringUtils.isNotBlank(splx)) {
			sql.append(" AND A.SPLX =  ?");
			params.add(splx);
		}

		if (StringUtils.isNotBlank(yplx)) {
			sql.append(" AND A.YPLX =  ?");
			params.add(yplx);
		}

		if (StringUtils.isNotBlank(cpm)) {
			sql.append(" AND (A.TYM LIKE ? OR A.TYMPYM LIKE ? OR A.TYMWBM LIKE ?");
			sql.append(" OR A.CPM LIKE ? OR A.CPMPYM LIKE ? OR A.CPMWBM LIKE ?");
			sql.append(" OR A.SPM LIKE ? OR A.SPMPYM LIKE ? OR A.SPMWBM LIKE ?)");
			
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
			
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
			
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), ManufProductsVO.class, params.toArray());

		// 界面显示，设置批发价补充说明
		@SuppressWarnings("unchecked")
		List<ManufProductsVO> list = result.getResult();
		list = setPfjMess(list);
		result.setResult(list);

		return GridUtils.getGridData(result);
	}

	// 根据包装单位性质，设置批发价补充说明
	private List<ManufProductsVO> setPfjMess(List<ManufProductsVO> list) {
		List<ManufProductsVO> mlist = new ArrayList<ManufProductsVO>();
		String _bzdwxz = null;
		for (ManufProductsVO manufProductsVO : list) {
			_bzdwxz = DicUtils.getDicItemName("BZXZ", manufProductsVO.getBzdwxz());
			manufProductsVO.setXsdjMess(_bzdwxz);
			mlist.add(manufProductsVO);
		}
		return mlist;
	}

	public Map<String, Object> findManufacturer(Page page, String key) {
		/**
		 * SELECT QYBM ,QYMC ,ZCDZ ,QYDZ ,JYXKZ ,FDDBR ,QYFZR ,FZBM ,FZRQ
		 * ,YXRQ,JYFS ,JYFW , KHYH ,YHZH , LXR ,LXDH ,YZBM ,DZYJ ,MGSBM ,PSXYSJ
		 * ,YXBZ,KSRQ ,JSRQ FROM TB_YQXX WHERE YXBZ = '1' AND QYMC LIKE '%?%'
		 */

		StringBuffer sql = new StringBuffer(
				"SELECT QYBM ,QYMC ,ZCDZ ,QYDZ ,JYXKZ ,FDDBR ,QYFZR ,FZBM ,FZRQ ,YXRQ ,JYFS ,JYFW ,KHYH ,YHZH ,LXR ,LXDH ,YZBM ,DZYJ ,MGSBM ,PSXYSJ ,YXBZ ,KSRQ ,JSRQ,QYMCPYM,QYMCWBM FROM TB_YQXX WHERE YXBZ = '1'");

		if (StringUtils.isNotBlank(key)) {
			sql.append(" AND (QYMC LIKE '" + key + "%' OR QYMCPYM LIKE '" + key.toUpperCase() + "%' OR QYMCWBM LIKE '" + key.toUpperCase()
					+ "%')");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), ManufacturerVO.class);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> findZXManufacturer(Page page, String key) {
		/**
		 * SELECT ZXMLID, SPLX, ZXSPBM, YBBM, YPLX, TYM, CPM, SPM, YPJX,
		 * GG,GGBZ,BZDWXZ, BZDWMC, BZFS, YYDWMC, BZNHSL, SCQYMC, BWM, PZWH,
		 * TZMS,KSRQ, JSRQ, YXBZ FROM TB_ZXSPML WHERE YXBZ = '1' AND AND CPM
		 * LIKE '%?%'
		 */

		StringBuffer sql = new StringBuffer(
				"SELECT ZXMLID, SPLX, ZXSPBM, YBBM, YPLX, TYM, CPM, SPM, YPJX, GG, GGBZ,BZDWXZ, BZDWMC, BZFS, YYDWMC, BZNHSL, SCQYMC, BWM, PZWH, TZMS, KSRQ, JSRQ, YXBZ, TYMPYM, TYMWBM, CPMPYM, CPMWBM, SPMPYM, SPMWBM FROM TB_ZXSPML WHERE YXBZ = '1' ");

		if (StringUtils.isNotBlank(key)) {
			sql.append(" AND (CPM LIKE '" + key + "%' OR TYMPYM LIKE '" + key.toUpperCase() + "%' OR TYMWBM LIKE '" + key.toUpperCase()
					+ "%' OR CPMPYM LIKE '" + key.toUpperCase() + "%' OR CPMWBM LIKE '" + key.toUpperCase() + "%' OR SPMPYM LIKE '"
					+ key.toUpperCase() + "%' OR SPMWBM LIKE '" + key.toUpperCase() + "%')");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), CenterProductsVO.class);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> findYQManufacturer(Page page, String key, String yqbm) {
		/**
		 * SELECT ZXMLID, SPLX, ZXSPBM, YBBM, YPLX, TYM, CPM, SPM, YPJX,
		 * GG,GGBZ,BZDWXZ, BZDWMC, BZFS, YYDWMC, BZNHSL, SCQYMC, BWM, PZWH,
		 * TZMS,KSRQ, JSRQ, YXBZ FROM TB_ZXSPML WHERE YXBZ = '1' AND AND CPM
		 * LIKE '%?%'
		 */

		StringBuffer sql = new StringBuffer(
				"SELECT a.ZXMLID, a.SPLX, a.ZXSPBM, a.YBBM, a.YPLX, a.TYM, a.CPM, a.SPM, a.YPJX, a.GG, a.GGBZ,a.BZDWXZ, a.BZDWMC, a.BZFS, a.YYDWMC, a.BZNHSL, a.SCQYMC, a.BWM, a.PZWH, a.TZMS, a.KSRQ, a.JSRQ, a.YXBZ, a.TYMPYM, a.TYMWBM, a.CPMPYM, a.CPMWBM, a.SPMPYM, a.SPMWBM FROM TB_ZXSPML a,Tb_Yqspml b WHERE a.ZXSPBM=b.ZXSPBM and a.YXBZ = '1' and b.spbz='1' and  b.yqbm='"
						+ yqbm + "'");

		if (StringUtils.isNotBlank(key)) {
			sql.append(" AND (a.CPM LIKE '" + key + "%' OR a.TYMPYM LIKE '" + key.toUpperCase() + "%' OR a.TYMWBM LIKE '"
					+ key.toUpperCase() + "%' OR a.CPMPYM LIKE '" + key.toUpperCase() + "%' OR a.CPMWBM LIKE '" + key.toUpperCase()
					+ "%' OR a.SPMPYM LIKE '" + key.toUpperCase() + "%' OR a.SPMWBM LIKE '" + key.toUpperCase() + "%')");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), CenterProductsVO.class);

		return GridUtils.getGridData(result);
	}

	public List<ManufProductsVO> findYqProductsByZx(String yqbm, String zxspbm) {
		List<ManufProductsVO> result = null;
		if (StringUtils.isNotBlank(zxspbm)) {
			String sql = "SELECT YQMLID,YQBM,SPLX,ZXSPBM,YQSPBM,YPLX,TYM,CPM,SPM,YPLX,GG,BZDWXZ,BZDWMC,BZNHSL,YYDWMC,SCQYMC,BWM,PZWH,TZMS FROM TB_YQSPML WHERE YQBM = ? AND ZXSPBM = ? AND KSRQ <= SYSDATE AND JSRQ >SYSDATE AND SPBZ='1'";
			result = CommonJdbcDaoUtils.query(sql, ManufProductsVO.class, new Object[] { yqbm, zxspbm });
		}
		return result;
	}

	public Map<String, Object> findManufProductsWithNetPurchase(Page page, String yqbm, String splx, String yplx, String cpm, String yybm) {

		/**
		
	    */

		String $sql = "SELECT A.SPLX,A.ZXSPBM,A.YPLX,A.TYM,A.CPM,A.SPM,A.YPJX,A.GG,A.BZDWXZ,A.BZDWMC,A.YYDWMC,A.BZNHSL,A.SCQYMC,A.BWM,A.PZWH FROM TB_YQSPML A,TB_CGLX B WHERE A.ZXSPBM = B.ZXSPBM AND A.SPBZ ='1' AND SYSDATE BETWEEN A.KSRQ AND A.JSRQ AND B.YXBZ = '1' AND B.CGLX = '3' AND SYSDATE BETWEEN B.KSSJ AND B.JSSJ AND A.YQBM = ?";

		StringBuffer sql = new StringBuffer($sql);

		List<Object> params = new ArrayList<Object>();
		params.add(yqbm);

		if (StringUtils.isNotBlank(splx)) {
			sql.append(" AND A.SPLX =  ?");
			params.add(splx);
		}

		if (StringUtils.isNotBlank(yplx)) {
			sql.append(" AND A.YPLX =  ?");
			params.add(yplx);
		}

		if (StringUtils.isNotBlank(cpm)) {
			sql.append(" AND (A.CPM LIKE ? OR A.CPM LIKE ? OR A.SPM LIKE ?)");
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
			params.add("%" + cpm + "%");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), ManufProductsVO.class, params.toArray());

		// 设置批发价
		@SuppressWarnings("unchecked")
		List<ManufProductsVO> list = result.getResult();
		list = setPfj(list, yybm, yqbm);
		result.setResult(list);

		return GridUtils.getGridData(result);
	}

	// 挂网采购是设置批发价
	private List<ManufProductsVO> setPfj(List<ManufProductsVO> list, String yybm, String yqbm) {
		List<ManufProductsVO> mlist = new ArrayList<ManufProductsVO>();
		String bj_sql = "SELECT MIN(B.YQBJ) FROM TB_XJXX A,TB_BJXX B WHERE A.XJXXID = B.XJXXID AND SYSDATE BETWEEN B.SYKSRQ AND B.SYJSRQ AND B.YXBZ = '1' AND A.YYBM= ? AND B.YQBM = ? AND A.ZXSPBM = ?";
		String wj_sql = "SELECT ZGLSJ FROM TB_WJXX WHERE SYSDATE BETWEEN KSSJ AND JSSJ AND YXBZ = '1' AND ZXSPBM = ?";
		for (ManufProductsVO manufProductsVO : list) {
			Double xsdj = CommonJdbcDaoUtils.queryObject(bj_sql, Double.class, yybm, yqbm, manufProductsVO.getZxspbm());
			String xsdjMess = "(商品最小零售单位) 药企报价";
			if (xsdj == null) {
				xsdj = CommonJdbcDaoUtils.queryObject(wj_sql, Double.class, manufProductsVO.getZxspbm());
				xsdjMess = "(商品最小零售单位) 最高零售价";
			}
			if (xsdj == null) {
				xsdj = 0d;
				xsdjMess = "无";
			}
			manufProductsVO.setXsdj(xsdj);
			manufProductsVO.setXsdjMess(xsdjMess);
			// 设置库存数量为最大值
			manufProductsVO.setKcsl(Integer.MAX_VALUE);
			mlist.add(manufProductsVO);
		}
		return mlist;
	}

}
