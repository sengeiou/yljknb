package com.wondersgroup.bc.analysisreport.report1.bs.impl;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


import com.ibm.icu.util.Calendar;
import com.wondersgroup.bc.analysisreport.report1.bs.Report1BS;
import com.wondersgroup.bc.analysisreport.report1.model.dto.YiYuanDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kb01;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.yishi.vo.YishiGridVO;
import com.wondersgroup.local.report.yiyuan.vo.YiYuanVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.DicUtils;
import com.wondersgroup.wssip.util.StringTools;

public class Report1BSImpl implements Report1BS{

	public Page queryYdxxWithYydm(Page page, YiYuanVO yiyuanVO) {
		
		StringBuffer sql=new StringBuffer();
		sql.append(" select ka52.akc194 fyfssj,ka52.aac001 cbrbm,ka52.aac003 xm,ka52.aac002 sfz,ka52.aac004 xb ");
		sql.append(" ,(select ROUND(MONTHS_BETWEEN(ka52.akc194,to_date(a1.aac006,'yyyy-mm-dd'))/12) from ac01 a1 where a1.aac001=ka52.aac001) as age ");
		sql.append(" ,(select akb021 from kb01 where kb01.aaz107=ka52.aaz107) jzyy ");
		sql.append(" ,ka52.aka130 jzlx ");
		sql.append(" ,(select sum(AKC264) from kc24 where kc24.aaz217=ka52.aaz217)fyje,ka59.aae317 wgyy ");
		sql.append(" ,ka59.aaa153 wglx ");
		sql.append(" from ka59,ka52 where ka52.aaz328=ka59.aaz328 and ka59.apa709=1 and ka52.aaz107="+yiyuanVO.getAaz107()+" and ka52.akc194 > to_date('"+yiyuanVO.getTjsj1()+"', 'yyyy-mm-dd') and ka52.akc194 < to_date('"+yiyuanVO.getTjsj2()+"', 'yyyy-mm-dd')");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),YiYuanDTO.class);
		return result;
	}

	public Page queryLswgWithYydm(Page page, YiYuanVO yiyuanVO) {
		StringBuffer sql=new StringBuffer();
		sql.append(" select kc63.akc194 fyfssj ,kc63.akb021 jzyy ,kc63.aaz370 jzbh,kc63.aac003 xm,kc63.aac002 ybh ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc63.aka130 and  aa10.aaa100='AKA130') jzlx ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc81.baz033 and  aa10.aaa100='BAZ033') wgyy ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc81.baz031 and  aa10.aaa100='BAZ031') cfjg ");
		sql.append(" ,kc81.baz041 cfje ,kc81.baz022 jbr ,kc81.baz023 jbrq ,kc81.baz021 clyj ");
		sql.append(" from kc81,kc63 where kc63.baz001=kc81.baz001 and kc81.aae100=1 and kc81.baz031 in('09','11','12') ");
		sql.append(" and kc63.akb020=" + yiyuanVO.getAkb020()
				+ " and kc63.akc194 > to_date('" + yiyuanVO.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc63.akc194 < to_date('"
				+ yiyuanVO.getTjsj2() + "', 'yyyy-mm-dd')");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),YiYuanDTO.class);
		return result;
	}

	public Page queryFymxGrid(Page page, YishiGridVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select ake002 xmmc,akb065 fsje,(case when 1=1 then 0 end)  cfts ,akc229 rlts,(case when 1=1 then 0 end)  clts,akc226 sl ,akc221 scnysj,(akc221+akc229) mcnysj from kc22 ");
		sql.append(" where aaz217 in(select kc24.aaz217 from kc24,kc21 where kc21.aaz217=kc24.aaz217 and kc24.akc194 > to_date('"
				+ vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc24.akc194 < to_date('"
				+ vo.getTjsj2()
				+ "', 'yyyy-mm-dd') and kc24.aaz263 = "
				+ vo.getYsgh() + " ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
		}
		sql.append(" ) ");
		if (StringTools.hasText(vo.getFylb())) {
			sql.append(" and kc22.aka063 = " + vo.getFylb() + " ");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				YishiGridVO.class);
		return result;
	}

	public Page queryLSWGGrid(Page page, YishiGridVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select kc63.akc194 fyfssj ,kc63.akb021 jzyy ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc63.aka130 and  aa10.aaa100='AKA130') jzlx ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc81.baz033 and  aa10.aaa100='BAZ033') wgyy ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc81.baz031 and  aa10.aaa100='BAZ031') cfjg ");
		sql.append(" ,kc81.baz041 cfje ,kc81.baz022 jbr ,kc81.baz023 jbrq ,kc81.baz021 clyj ");
		sql.append(" from kc81,kc63 where kc63.baz001=kc81.baz001 and kc81.aae100=1 and kc81.baz031 in('09','11','12') ");
		sql.append(" and kc63.aaz263=" + vo.getYsgh()
				+ " and kc63.akc194 > to_date('" + vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc63.akc194 < to_date('"
				+ vo.getTjsj2() + "', 'yyyy-mm-dd')");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				YishiGridVO.class);
		return result;
	}

	public Page queryYdxxGrid(Page page, YishiGridVO vo) {
		StringBuffer sql=new StringBuffer();
		sql.append(" select ka52.akc194 fyfssj,ka52.aac001 cbrbm,ka52.aac003 xm,ka52.aac002 sfz,ka52.aac004 xb ");
		sql.append(" ,(select ROUND(MONTHS_BETWEEN(ka52.akc194,to_date(a1.aac006,'yyyy-mm-dd'))/12) from ac01 a1 where a1.aac001=ka52.aac001) as age ");
		sql.append(" ,(select akb021 from kb01 where kb01.aaz107=ka52.aaz107) jzyy ");
		sql.append(" ,ka52.aka130 jzlx ");
		sql.append(" ,(select sum(AKC264) from kc24 where kc24.aaz217=ka52.aaz217)fyje,ka59.aae317 wgyy ");
		sql.append(" ,ka59.aaa153 wglx ");
		sql.append(" from ka59,ka52 where ka52.aaz328=ka59.aaz328 and ka59.apa709=1 and ka52.aaz263="+vo.getYsgh()+" and ka52.akc194 > to_date('"+vo.getTjsj1()+"', 'yyyy-mm-dd') and ka52.akc194 < to_date('"+vo.getTjsj2()+"', 'yyyy-mm-dd')");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),YishiGridVO.class);
		return result;
	}

	public YiYuanVO getYiyuaninfo(YiYuanVO yiyuanVO) {
		Kb01 kb01 = CommonHibernateDaoUtils.load(Kb01.class, yiyuanVO.getAkb020());
		YiYuanVO resultVO = new YiYuanVO();
		if (kb01 != null) {
			if (StringTools.hasText(kb01.getAkb021())) {
				resultVO.setYymc(kb01.getAkb021());
			}
			if (StringTools.hasText(kb01.getAka101())) {
				if(DicUtils.getItemName("AKA101",kb01.getAka101())!=null && DicUtils.getItemName("AKA101",kb01.getAka101())!=""){
				resultVO.setYydj(DicUtils.getItemName("AKA101",kb01.getAka101()));
				}else{
					resultVO.setYydj("null");
				}
			}
			if (StringTools.hasText(kb01.getAkb023())) {
				resultVO.setYylx(DicUtils.getItemName("AKB023",kb01.getAkb023()));
			}
			if (StringTools.hasText(kb01.getAae006())) {
				resultVO.setYydz(kb01.getAae006());
			}
			if (StringTools.hasText(kb01.getAaa027())) {
				resultVO.setSsqy(kb01.getAaa027());
			}
			if (StringTools.hasText(kb01.getAkb022())) {
				resultVO.setYyxz(DicUtils.getItemName("AKB022",kb01.getAkb022()));
			}
			if (StringTools.hasText(kb01.getAae004())) {
				resultVO.setLxrmc(kb01.getAae004());
			}
			if (StringTools.hasText(kb01.getAae005())) {
				resultVO.setLxdh(kb01.getAae005());
			}
			
			Integer count = CommonJdbcDaoUtils.queryObject("select count(*) from kf05 where akb020='"+yiyuanVO.getAkb020()+"'", Integer.class);
				resultVO.setYssl(count);
			Integer count1 = CommonJdbcDaoUtils.queryObject("select count(*) from kf06 where akb020='"+yiyuanVO.getAkb020()+"'", Integer.class);
				resultVO.setKssl(count1);

	  }
		return resultVO;

	}

	public String getFeeItemsConstituentDataYiyuan(YiYuanVO yiyuanVO) {
		StringBuffer sql = new StringBuffer(" select t1.aaa103,t2.akb065 from  ");
         sql.append(" (select aa10.aaa102,aa10.aaa103 from aa10 where   aa10.aaa100='AKE003') t1 ");
         sql.append(" , (select kc22.ake003,sum(kc22.akb065) akb065 from kc22  where ");
         sql.append(" kc22.aaz217 in (select kc21.aaz217 from kc21 where kc21_bk.akc194 > to_date('"
	        	+ yiyuanVO.getTjsj1()
		        + "', 'yyyy-mm-dd') and kc21.akc194 < to_date('"
		        + yiyuanVO.getTjsj2()
		        + "', 'yyyy-mm-dd') and kc21.akb020 = "
		        + yiyuanVO.getAkb020() + " ");
         if (StringTools.hasText(yiyuanVO.getJzlx())) {
            	sql.append(" and kc21.aka130=" + yiyuanVO.getJzlx() + " ");
        }
                sql.append(" ) group by kc22.ake003) t2 ");
                sql.append(" where t1.aaa102=t2.ake003(+) ");
         List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql.toString());
             String result = "[";
         for (Map<String, Object> map : list) {
	         result = result + "{\"name\":\"" + map.get("aaa103") + "\",\"y\":";
	      if (map.get("akb065") == null) {
		      result = result + 0 + "},";
	       } else {
		      result = result + map.get("akb065") + "},";
	   }

  }
          result = result.substring(0, result.length() - 1) + "]";
           return result;
	}

	public String getFundSourceConsituentDataYiyuan(YiYuanVO yiyuanVO) {
		StringBuffer sql = new StringBuffer(
				" select sum(kc24.akc253+kc24.akc254) zf,sum(kc24.ake038) gz,sum(kc24.akc264-kc24.akc253-kc24.akc254-kc24.ake038) yb from kc24  where kc24.akb020="
						+ yiyuanVO.getAkb020()
						+ " and kc24.akc194 > to_date('"
						+ yiyuanVO.getTjsj1()
						+ "', 'yyyy-mm-dd') and kc24.akc194 < to_date('"
						+ yiyuanVO.getTjsj2() + "', 'yyyy-mm-dd')  ");
		if (StringTools.hasText(yiyuanVO.getJzlx())) {
			sql.append(" and kc24.aaz217 in (select kc21.aaz217 from kc21 where kc21.aka130="
					+ yiyuanVO.getJzlx() + ") ");
		}
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		String result = "[";
		for (Map<String, Object> map : list) {
			result = result + "{\"name\":\"医保\",\"y\":";
			if (map.get("yb") == null) {
				result = result + 0 + "},";
			} else {
				result = result + map.get("yb") + "},";
			}
			result = result + "{\"name\":\"个账\",\"y\":";
			if (map.get("gz") == null) {
				result = result + 0 + "},";
			} else {
				result = result + map.get("gz") + "},";
			}
			result = result + "{\"name\":\"现金\",\"y\":";
			if (map.get("zf") == null) {
				result = result + 0 + "},";
			} else {
				result = result + map.get("zf") + "},";
			}
		}
		result = result.substring(0, result.length() - 1) + "]";
		return result;
	}

	public String getOtherIndicatorsDataYiyuan(YiYuanVO yiyuanVO) {
		StringBuffer sql = new StringBuffer(
				"select to_char(kc21.akc194,'yyyy-mm-dd') akc194,count (kc21.aaz217) num1  from kc21 where kc21.akb020 = "
						+ yiyuanVO.getAkb020()
						+ "   and kc21.akc194 > to_date('"
						+ yiyuanVO.getTjsj1()
						+ "', 'yyyy-mm-dd')   and kc21.akc194 < to_date('"
						+ yiyuanVO.getTjsj2() + "', 'yyyy-mm-dd')   ");
		if (StringTools.hasText(yiyuanVO.getJzlx())) {
			sql.append(" and kc21.aka130 = " + yiyuanVO.getJzlx() + " ");
		}
		sql.append(" group by to_char(kc21.akc194,'yyyy-mm-dd') ");
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		
		int ljjzcs = 0;// 累计接诊次数
		int drjzzdcs = 0;// 单日接诊最大次数
		for (Map<String, Object> map : list) {
			ljjzcs = ljjzcs + ((BigDecimal) map.get("num1")).intValue();
			if (drjzzdcs < ((BigDecimal) map.get("num1")).intValue()) {
				drjzzdcs = ((BigDecimal) map.get("num1")).intValue();
			}
		}
		int jzts = list.size();// 就诊天数
		double rjjzcs = 0;// 日均就诊次数
		if (jzts > 0) {
			rjjzcs = ljjzcs / jzts;
		}
		String result = "[[\"累计接诊次数\",\"日均就诊次数\",\"单日接诊最大次数\"],["  + ljjzcs + "," + rjjzcs + "," + drjzzdcs + "]]";
		return result;
	}

	public List<YiYuanDTO> getCurrentYearMonthlyDistributionDataYiyuan(YiYuanVO yiyuanVO) {
		
		//查询当年的数据
		Calendar cal = Calendar.getInstance(); 
		int year = cal.get(Calendar.YEAR); 
		yiyuanVO.setTjsj1(year + "0101");
		yiyuanVO.setTjsj2(year + "1231");
		
		StringBuffer sql = new StringBuffer("select * from (select lpad(rownum,7,'2014-0') rn from dual connect by rownum<=12) a left join "
						+" (select to_char(kc21.akc194, 'yyyy-mm') akc194,"
						+" count(kc21.aaz217) jzrs,"     
						+" sum(kc24.akc264) fyfse,  0 ydzce "    
						+" from kc21, kc24" 
						+" where kc21.aaz217 = kc24.aaz217"
						+" and kc21.akb020 =" +yiyuanVO.getAkb020()
						+" and kc21.akc194 > to_date('"+yiyuanVO.getTjsj1()+"', 'yyyy-mm-dd')" 
						+" and kc21.akc194 < to_date('"+yiyuanVO.getTjsj2()+"', 'yyyy-mm-dd')");
						if (StringTools.hasText(yiyuanVO.getJzlx())) {
							sql.append(" and kc21.aka130 = " + yiyuanVO.getJzlx() + " ");
						}
						sql.append(" group by to_char(kc21.akc194, 'yyyy-mm')) b on a.rn=b.akc194   order by rn");
		List<YiYuanDTO> list = CommonJdbcDaoUtils.query(sql.toString(),YiYuanDTO.class);

		return list;
	}

	public List<YiYuanDTO> getYsslDataYiyuan(YiYuanVO yiyuanVO) {
		StringBuffer sql = new StringBuffer(
				"select aae386 ksmc,(select count(*) from kf05 where aaz307=kf06.aaz307) yssl from kf06 where akb020 = "
				+ yiyuanVO.getAkb020());
		
		List<YiYuanDTO> list = CommonJdbcDaoUtils.query(sql.toString(),YiYuanDTO.class);

		return list;
	}

	public List<YiYuanDTO> getJzslDataYiyuan(YiYuanVO yiyuanVO) {

		StringBuffer sql = new StringBuffer(
				"select kf06.aae386 ksmc,sum((select count(aaz217) from kc21_bk where aaz263 = kf05.aaz263 and kc21_bk.akc194 > to_date('"
	        	+ yiyuanVO.getTjsj1()
		        + "', 'yyyy-mm-dd') and kc21_bk.akc194 < to_date('"
		        + yiyuanVO.getTjsj2()
		        + "', 'yyyy-mm-dd'))) jzrs"
			    +" from kf06 left join kf05 on kf05.aaz307 = kf06.aaz307"
			    +" where kf06.akb020 = 128900 group by kf06.aae386");
		List<YiYuanDTO> list = CommonJdbcDaoUtils.query(sql.toString(),YiYuanDTO.class);

		return list;
	}
}