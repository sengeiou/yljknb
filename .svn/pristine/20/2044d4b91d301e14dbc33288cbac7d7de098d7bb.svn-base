package com.wondersgroup.bc.analysisreport.report.bs.impl;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import com.wondersgroup.bc.analysisreport.report.bs.ReportBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ac01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kb01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf05;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.util.DateUtils;
import com.wondersgroup.local.report.geren.vo.GerenGridVO;
import com.wondersgroup.local.report.geren.vo.GerenVO;
import com.wondersgroup.local.report.geren.vo.TimeLineVO;
import com.wondersgroup.local.report.yishi.vo.YishiGridVO;
import com.wondersgroup.local.report.yishi.vo.YishiSJZVO;
import com.wondersgroup.local.report.yishi.vo.YishiVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.DicUtils;
import com.wondersgroup.wssip.util.StringTools;

public class ReportBSImpl implements ReportBS {

	public GerenVO getGereninfo(GerenVO gerenVO) {
		Ac01 dbAc01 = CommonHibernateDaoUtils.load(Ac01.class, gerenVO.getId());
		GerenVO resultVO = new GerenVO();
		if (dbAc01 != null) {
			if (StringTools.hasText(dbAc01.getAac001())) {
				resultVO.setId(dbAc01.getAac001());
			}
			if (StringTools.hasText(dbAc01.getAac003())) {
				resultVO.setXm(dbAc01.getAac003().trim());
			}
			if ("0".equals(dbAc01.getAac084())) {
				resultVO.setRylb("非离退休");
			}
			if ("1".equals(dbAc01.getAac084())) {
				resultVO.setRylb("离退休");
			}
			if (StringTools.hasText(dbAc01.getAaz500())) {
				resultVO.setSfzh(dbAc01.getAaz500());
			}
			if (StringTools.hasText(dbAc01.getAac002())) {
				resultVO.setYbh(dbAc01.getAac002());
			}
			String xx = "";
			if (StringTools.hasText(dbAc01.getAac004())) {
				if ("1".equals(dbAc01.getAac004())) {
					xx = xx + "男";
				} else {
					xx = xx + "女";
				}
			}
			if (dbAc01.getAac006() != null && dbAc01.getAac006() != 0) {
				int nianlin = DateUtils.getYearsOldFromBirthDay(DateUtils
						.getDateFromYYYYMMDDString(dbAc01.getAac006()
								.toString()), new Date());
				xx = xx + "，" + nianlin;
			}
			resultVO.setXx(xx);
		}
		return resultVO;
	}

	public String getTimeline(GerenVO gerenVO) {
		String[] flag = gerenVO.getFlag().split(",");

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" CASE WHEN exists (select ka59.aaz281 from ka52, ka59 where ka52.aaz328 = ka59.aaz328 and ka59.aaz281 is not null and ka52.aaz217 = t.aaz217) THEN '1' ELSE NULL END wg,/*违规就诊*/ ");
		sql.append(" CASE WHEN exists (select ka52.aaz351 from ka52 where ka52.aaz217 = t.aaz217) THEN '1' ELSE NULL END ys,/*疑似违规就诊*/ ");
		sql.append(" (select kb01.akb021 from kb01 where kb01.aaz107=t.aaz107) akb021,/*医疗机构*/ ");
		sql.append(" (select kf06.aae386 from kf06 where kf06.aaz307=t.aaz307) aae386,/*科室名称*/ ");
		sql.append(" (select kf05.aac003 from kf05 where kf05.aaz263=t.aaz263) kf05aac003,/*医护人员姓名*/ ");
		sql.append(" (select aa10.aaa103 from aa10 where aa10.aaa102 = t.aka130 and aa10.aaa100='AKA130') aaa103,/*疾病类别名称*/ ");
		sql.append(" t.aka130,/*疾病类别代码*/ ");
		sql.append(" t.akc050,/*入院疾病诊断名称*/ t.aae030,/*入院时间*/ t.aae031,/*出院时间*/ t.akc194/*数据发生时间*/ ");
		sql.append(" from KC21 t where 1=1 and t.aac001 =  ?");
		if (flag[0].equals("0")) {
			sql.append("and exists (select * from ka52 where ka52.aaz217=t.aaz217)");
		}
		if (flag[1].equals("0")) {
			sql.append("and  not exists (select ka59.aaz281 from ka52, ka59 where ka52.aaz328 = ka59.aaz328 and ka59.aaz281 is not null and ka52.aaz217 = t.aaz217)");
		}
		if (flag[2].equals("0")) {
			sql.append("and not exists(select ka59.aaz281 from ka52, ka59 where ka52.aaz328 = ka59.aaz328 and ka59.aaz281 is null and ka52.aaz217 = t.aaz217)");
		}
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(
				sql.toString(), gerenVO.getId());
		List<TimeLineVO> timeLine = new ArrayList<TimeLineVO>();
		for (Map<String, Object> map : list) {
			TimeLineVO vo = formatTimeLineVO(map);
			timeLine.add(vo);
		}
		StringBuffer str = new StringBuffer();
		str.append("{'dateTimeFormat': 'gbk', 'encoding':'gbk','events' : [");
		for (int i = 0; i < timeLine.size(); i++) {
			TimeLineVO timeLineVO = timeLine.get(i);
			str.append("{'start':'" + timeLineVO.getStart() + "','end':'"
					+ timeLineVO.getEnd() + "','durationEvent':"
					+ timeLineVO.getDurationEvent() + ",'title':'"
					+ timeLineVO.getTitle() + "','icon':'"
					+ timeLineVO.getIcon() + "','color':'"
					+ timeLineVO.getColor() + "','description':'"
					+ timeLineVO.getDescription() + "'}");
			if ((i + 1) != timeLine.size()) {
				str.append(",");
			}
		}
		str.append("]}");
		return str.toString();
	}

	/**
	 * 拼装时间轴的vo对象
	 * 
	 * @param map
	 * @return
	 */
	private TimeLineVO formatTimeLineVO(Map<String, Object> map) {
		TimeLineVO vo = new TimeLineVO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String startdate = "";
		String enddate = "";
		// 时间设置、坐标点或线的设置、标题设置
		if (map.get("aae030") != null && map.get("aae031") != null) {
			vo.setStart(dateToGmtTime(map.get("aae030").toString()));
			vo.setEnd(dateToGmtTime(map.get("aae031").toString()));
			long start = ((BigDecimal) map.get("aae030")).longValue();
			long end = ((BigDecimal) map.get("aae031")).longValue();
			if ((end - start) > 0) {
				vo.setDurationEvent("true");
			} else if ((end - start) == 0) {
				vo.setDurationEvent("false");
			} else {
				throw new BusinessException("ReportBS-00:入院出院时间出错!");
			}
			try {
				DateFormat dd = new SimpleDateFormat("yyyyMMdd");
				startdate = sdf.format(dd.parse(map.get("aae030").toString()));
				enddate = sdf.format(dd.parse(map.get("aae031").toString()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String titlem = Long.valueOf(map.get("aae030").toString()
					.substring(4, 6))
					+ "月";
			String titled = Long.valueOf(map.get("aae030").toString()
					.substring(6, 8))
					+ "日:";
			vo.setTitle(titlem + titled + map.get("aaa103"));
		} else {
			vo.setDurationEvent("false");
			if (map.get("aae030") != null && map.get("aae031") == null) {
				vo.setStart(dateToGmtTime(map.get("aae030").toString()));
				if (map.get("aae036") != null) {
					vo.setEnd(dateToGmtTime((Date) map.get("aae036")));
				} else {
					vo.setEnd(dateToGmtTime(map.get("aae030").toString()));
				}
				try {
					DateFormat dd = new SimpleDateFormat("yyyyMMdd");
					startdate = sdf.format(dd.parse(map.get("aae030")
							.toString()));
					enddate = sdf
							.format(dd.parse(map.get("aae030").toString()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				String titlem = Long.valueOf(map.get("aae030").toString()
						.substring(4, 6))
						+ "月";
				String titled = Long.valueOf(map.get("aae030").toString()
						.substring(6, 8))
						+ "日:";
				vo.setTitle(titlem + titled + map.get("aaa103"));
			}
			if (map.get("aae031") != null && map.get("aae030") == null) {
				vo.setStart(dateToGmtTime(map.get("aae031").toString()));
				vo.setEnd(dateToGmtTime(map.get("aae031").toString()));
				try {
					DateFormat dd = new SimpleDateFormat("yyyyMMdd");
					startdate = sdf.format(dd.parse(map.get("aae031")
							.toString()));
					enddate = sdf
							.format(dd.parse(map.get("aae031").toString()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				String titlem = Long.valueOf(map.get("aae031").toString()
						.substring(4, 6))
						+ "月";
				String titled = Long.valueOf(map.get("aae031").toString()
						.substring(6, 8))
						+ "日:";
				vo.setTitle(titlem + titled + map.get("aaa103"));
			}
			if (map.get("aae030") == null && map.get("aae031") == null) {
				if (map.get("aae036") != null) {
					vo.setStart(dateToGmtTime((Date) map.get("aae036")));
					vo.setEnd(dateToGmtTime((Date) map.get("aae036")));
					String fsdate = sdf.format((Date) map.get("aae036"));
					try {
						DateFormat dd = new SimpleDateFormat("yyyyMMdd");
						startdate = sdf.format(dd.parse(map.get("aae036")
								.toString()));
						enddate = sdf.format(dd.parse(map.get("aae036")
								.toString()));
					} catch (ParseException e) {
						e.printStackTrace();
					}
					String titlem = Long.valueOf(fsdate.substring(5, 7)) + "月";
					String titled = Long.valueOf(fsdate.substring(8, 10))
							+ "日:";
					vo.setTitle(titlem + titled + map.get("aaa103"));
				} else {
					throw new BusinessException("ReportBS-00:入院出院时间出错!");
				}
			}
		}
		// 颜色设置
		vo.setColor("bule");// 默认设置绿色
		vo.setIcon("../../images/dull-blue-circle.png");
		if (map.get("ys") != null) {
			vo.setColor("brown");
			vo.setIcon("../../images/brown-circle.png");
		}
		if (map.get("wg") != null) {
			vo.setColor("red");
			vo.setIcon("../../images/red-circle.png");
		}
		// 设置说明
		vo.setDescription("时间：" + startdate + " -" + enddate
				+ " &amp;lt;br&amp;gt; 医疗机构名称：" + map.get("akb021")
				+ " &amp;lt;br&amp;gt; 科室名称：" + map.get("aae386") + " 医师："
				+ map.get("kf05aac003") + " &amp;lt;br&amp;gt; 病种名称："
				+ map.get("akc050") + "");
		return vo;
	}

	/**
	 * 时间转换为GMT格式字符串
	 * 
	 * @param date
	 * @return
	 */
	public String dateToGmtTime(String strdate) {
		DateFormat dd = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = dd.parse(strdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 转GMT时间时，会比当前时间小一天，所以需加一天
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, 1);// 把日期往后增加一天.整数往后推,负数往前移动
		date = calendar.getTime(); // 这个时间就是日期往后推一天的结果
		DateFormat sft = new SimpleDateFormat(" dd MMM yyyy 'GMT'", Locale.US);
		// 如果只需要年月日为：DateFormat format=new SimpleDateFormat("EEE, dd MMM yyyy");
		sft.setTimeZone(TimeZone.getTimeZone("GMT"));
		return sft.format(date);
	}

	/**
	 * 时间转换为GMT格式字符串
	 * 
	 * @param date
	 * @return
	 */
	public String dateToGmtTime(Date date) {
		// 转GMT时间时，会比当前时间小一天，所以需加一天
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		date = calendar.getTime(); // 这个时间就是日期往后推一天的结果
		DateFormat sft = new SimpleDateFormat(" dd MMM yyyy 'GMT'", Locale.US);
		// 如果只需要年月日为：DateFormat format=new SimpleDateFormat("EEE, dd MMM yyyy");
		sft.setTimeZone(TimeZone.getTimeZone("GMT"));
		return sft.format(date);
	}

	public String getFeeItemsConstituentDataGeren(GerenGridVO vo) {
		StringBuffer sql = new StringBuffer(
				" select t1.aaa103,t2.akb065 from  ");
		sql.append(" (select aa10.aaa102,aa10.aaa103 from aa10 where   aa10.aaa100='AKE003') t1 ");
		sql.append(" , (select kc22.ake003,sum(kc22.akb065) akb065 from kc22  where ");
		sql.append(" kc22.aaz217 in (select kc21.aaz217 from kc21 where kc21.akc194 > to_date('"
				+ vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc21.akc194 < to_date('"
				+ vo.getTjsj2()
				+ "', 'yyyy-mm-dd') and kc21.aac001 = "
				+ vo.getId() + " ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130=" + vo.getJzlx() + " ");
		}
		sql.append(" ) group by kc22.ake003) t2 ");
		sql.append(" where t1.aaa102=t2.ake003(+) ");
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql
				.toString());
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

	public String getFundSourceConsituentDataGeren(GerenGridVO vo) {
		StringBuffer sql = new StringBuffer(
				" select sum(kc24.akc253+kc24.akc254) zf,sum(kc24.ake038) gz,sum(kc24.akc264-kc24.akc253-kc24.akc254-kc24.ake038) yb from kc24  where kc24.aac001="
						+ vo.getId()
						+ " and kc24.akc194 > to_date('"
						+ vo.getTjsj1()
						+ "', 'yyyy-mm-dd') and kc24.akc194 < to_date('"
						+ vo.getTjsj2() + "', 'yyyy-mm-dd')  ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc24.aaz217 in (select kc21.aaz217 from kc21 where kc21.aka130="
					+ vo.getJzlx() + ") ");
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

	public String getOtherIndicatorsDataGeren(GerenGridVO vo) {
		StringBuffer sql = new StringBuffer(
				"select to_char(kc21.akc194,'yyyy-mm-dd') akc194,count (kc21.aaz217) num1  from kc21 where kc21.aac001 = "
						+ vo.getId()
						+ "   and kc21.akc194 > to_date('"
						+ vo.getTjsj1()
						+ "', 'yyyy-mm-dd')   and kc21.akc194 < to_date('"
						+ vo.getTjsj2() + "', 'yyyy-mm-dd')   ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
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
		String result = "[[\"就诊天数\",\"日均就诊次数\",\"就诊次数\",\"单日就诊最大次数\"],[" + jzts
				+ "," + rjjzcs + "," + ljjzcs + "," + drjzzdcs + "]]";
		return result;
	}

	public Page queryJZQKGrid(Page page, GerenGridVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select (select AKB021 from kb01 where kb01.aaz107=t.aaz107) yymc,t.akc050 bz,(select aac003 from kf05 where kf05.aaz263=t.aaz263) ys ,count(t.aaz217) jzcs,sum(t.num2) sjkd,sum(t.akc264) fsje ");
		sql.append(" from (select kc21.aaz217,kc21.aaz107,kc21.akc050,kc21.aaz263,sum(kc21.aae031-kc21.aae030) num2,sum(kc24.akc264) akc264 from kc21,kc24 where kc21.aaz217=kc24.aaz217 and kc21.aac001 = "
				+ vo.getId()
				+ " and kc21.akc194 > to_date('"
				+ vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc21.akc194 < to_date('"
				+ vo.getTjsj2() + "', 'yyyy-mm-dd') ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
		}
		sql.append(" group by kc21.aaz217,kc21.aaz107,kc21.akc050,kc21.aaz263)t  ");
		sql.append(" group by t.aaz107,t.akc050,t.aaz263");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				GerenGridVO.class);
		return result;
	}

	public Page queryFYMXGrid(Page page, GerenGridVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select ake002 xmmc,akb065 fsje,(case when 1=1 then 0 end)  cfts ,akc229 rlts,(case when 1=1 then 0 end)  clts,akc226 sl ,akc221 scnysj,(akc221+akc229) mcnysj from kc22 ");
		sql.append(" where kc22.aaz217 in(select kc21.aaz217 from kc21 where kc21.akc194 > to_date('"
				+ vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc21.akc194 < to_date('"
				+ vo.getTjsj2()
				+ "', 'yyyy-mm-dd') and kc21.aac001 = "
				+ vo.getId() + " ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
		}
		sql.append(" ) ");
		if (StringTools.hasText(vo.getFylb())) {
			sql.append(" and kc22.aka063 = " + vo.getFylb() + " ");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				GerenGridVO.class);
		return result;
	}

	public Page queryYDXXGrid(Page page, GerenGridVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select ka52.akc194 fyfssj,ka52.aac001 cbrbm,ka52.aac003 xm,ka52.aac002 sfz,ka52.aac004 xb ");
		sql.append(" ,floor(months_between(ka52.akc194,to_date((select ac01.aac006 from ac01 where ac01.aac001=10138633),'yyyy-mm-dd'))/12) as age ");
		sql.append(" ,(select akb021 from kb01 where kb01.aaz107=ka52.aaz107) jzyy ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=ka52.aka130 and  aa10.aaa100='AKA130') jzlx ");
		sql.append(" ,(select sum(AKC264) from kc24 where kc24.aaz217=ka52.aaz217)fyje,ka59.aae013 wgyy ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=ka59.aaa153 and  aa10.aaa100='AAA153') wglx ");
		sql.append(" from ka59,ka52 where ka52.aaz328=ka59.aaz328 and ka59.apa709=1 and ka52.aac001="
				+ vo.getId()
				+ " and ka52.akc194 > to_date('"
				+ vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and ka52.akc194 < to_date('"
				+ vo.getTjsj2() + "', 'yyyy-mm-dd')");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				GerenGridVO.class);
		return result;
	}

	public Page queryLSWGGrid(Page page, GerenGridVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select kc63.akc194 fyfssj ,kc63.akb021 jzyy ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc63.aka130 and  aa10.aaa100='AKA130') jzlx ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc81.baz033 and  aa10.aaa100='BAZ033') wgyy ");
		sql.append(" ,(select aa10.aaa103 from aa10 where aa10.aaa102=kc81.baz031 and  aa10.aaa100='BAZ031') cfjg ");
		sql.append(" ,kc81.baz041 cfje ,kc81.baz022 jbr ,kc81.baz023 jbrq ,kc81.baz021 clyj ");
		sql.append(" from kc81,kc63 where kc63.baz001=kc81.baz001 and kc81.aae100=1 and kc81.baz031 in('09','11','12') ");
		sql.append(" and kc63.aac001=" + vo.getId()
				+ " and kc63.akc194 > to_date('" + vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc63.akc194 < to_date('"
				+ vo.getTjsj2() + "', 'yyyy-mm-dd')");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				GerenGridVO.class);
		return result;
	}

	public YishiVO getYishiinfo(YishiVO yishiVO) {
		Kf05 dbkf05 = CommonHibernateDaoUtils.load(Kf05.class, yishiVO.getId());
		YishiVO resultVO = new YishiVO();
		if (dbkf05 != null) {
			if (StringTools.hasText(dbkf05.getAaz263())) {
				resultVO.setId(dbkf05.getAaz263());
			}
			if (StringTools.hasText(dbkf05.getAac003())) {
				resultVO.setXm(dbkf05.getAac003());
			}
			if (StringTools.hasText(dbkf05.getAab014())) {
				resultVO.setSfzh(dbkf05.getAab014());
			}
			if (StringTools.hasText(dbkf05.getAkc054())) {
				resultVO.setYszgz(dbkf05.getAkc054());
			}
			String xx = "";
			if (StringTools.hasText(dbkf05.getAkc049())) {
				resultVO.setXzzw(DicUtils.getItemName("AKC049",
						dbkf05.getAkc049()));
				xx = xx + DicUtils.getItemName("AKC049", dbkf05.getAkc049());
			}
			if (StringTools.hasText(dbkf05.getAaz107())) {
				Kb01 dbkb01 = CommonHibernateDaoUtils.load(Kb01.class,
						dbkf05.getAaz107());
				if (dbkb01 != null) {
					if (StringTools.hasText(xx)) {
						xx = xx + "," + dbkb01.getAkb021();
					} else {
						xx = xx + dbkb01.getAkb021();
					}
				}
			}
			resultVO.setXx(xx);
		}
		return resultVO;
	}

	public String getFrequencyTop10Data(YishiGridVO vo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(sdf.parse(vo.getTjsj2()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		StringBuffer sql = new StringBuffer(
				"select kc21.aac001,(select aac003 from ac01 where ac01.aac001=kc21.aac001) aac003,count(kc21.aac001) countnumber  from kc21 where kc21.aaz263 = "
						+ vo.getYsgh()
						+ "   and kc21.akc194 > to_date('"
						+ vo.getTjsj1()
						+ "', 'yyyy-mm-dd')   and kc21.akc194 < to_date('"
						+ sdf.format(calendar.getTime())
						+ "', 'yyyy-mm-dd')  and rownum <=10  ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
		}
		sql.append(" group by kc21.aac001 order by count(kc21.aac001),kc21.aac001 desc");
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		String[] xAxisCategories = new String[10];
		int[] datas = new int[10];
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			if (map.get("aac003") != null) {
				xAxisCategories[i] = map.get("aac003").toString().trim();
			} else {
				xAxisCategories[i] = map.get("aac001").toString();
			}
			datas[i] = ((BigDecimal) map.get("countnumber")).intValue();
		}
		for (int i = list.size(); i < 10; i++) {
			xAxisCategories[i] = "";
			datas[i] = 0;
		}
		String resultxAxisCategories = "[";
		for (int i = 0; i < xAxisCategories.length; i++) {
			resultxAxisCategories = resultxAxisCategories + "\""
					+ xAxisCategories[i] + "\",";
		}
		resultxAxisCategories = resultxAxisCategories.substring(0,
				resultxAxisCategories.length() - 1) + "]";
		String resultdatas = "[";
		for (int i = 0; i < datas.length; i++) {
			resultdatas = resultdatas + "" + datas[i] + ",";
		}
		resultdatas = resultdatas.substring(0, resultdatas.length() - 1) + "]";
		String result = "[" + resultxAxisCategories + "," + resultdatas + "]";
		return result;
	}

	public String getFeeTop10Data(YishiGridVO vo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(sdf.parse(vo.getTjsj2()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		StringBuffer sql = new StringBuffer(
				" select * from ( select kc21.aac001,(select aac003 from ac01 where ac01.aac001=kc21.aac001) aac003,sum(kc24.akc264-kc24.akc253-kc24.akc253-kc24.ake038) summunber from kc21,kc24 where kc21.aaz217=kc24.aaz217 and kc24.aaz263 = "
						+ vo.getYsgh()
						+ "   and kc21.akc194 > to_date('"
						+ vo.getTjsj1()
						+ "', 'yyyy-mm-dd')   and kc21.akc194 < to_date('"
						+ sdf.format(calendar.getTime())
						+ "', 'yyyy-mm-dd')   ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
		}
		sql.append(" group by kc21.aac001 order by sum(kc24.akc264-kc24.akc253-kc24.akc253-kc24.ake038) desc ) t where rownum <=10");
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		String[] xAxisCategories = new String[10];
		double[] datas = new double[10];
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			if (map.get("aac003") != null) {
				xAxisCategories[i] = map.get("aac003").toString().trim();
			} else {
				xAxisCategories[i] = map.get("aac001").toString();
			}
			if (map.get("summunber") != null) {
				datas[i] = ((BigDecimal) map.get("summunber")).doubleValue();
			} else {
				datas[i] = 0;
			}

		}
		for (int i = list.size(); i < 10; i++) {
			xAxisCategories[i] = "";
			datas[i] = 0;
		}
		String resultxAxisCategories = "[";
		for (int i = 0; i < xAxisCategories.length; i++) {
			resultxAxisCategories = resultxAxisCategories + "\""
					+ xAxisCategories[i] + "\",";
		}
		resultxAxisCategories = resultxAxisCategories.substring(0,
				resultxAxisCategories.length() - 1) + "]";
		String resultdatas = "[";
		for (int i = 0; i < datas.length; i++) {
			resultdatas = resultdatas + "" + datas[i] + ",";
		}
		resultdatas = resultdatas.substring(0, resultdatas.length() - 1) + "]";
		String result = "[" + resultxAxisCategories + "," + resultdatas + "]";
		return result;
	}

	public String getFeeItemsConstituentDataYishi(YishiGridVO vo) {
		StringBuffer sql = new StringBuffer(
				" select t1.aaa103,t2.akb065 from  ");
		sql.append(" (select aa10.aaa102,aa10.aaa103 from aa10 where   aa10.aaa100='AKE003') t1 ");
		sql.append(" , (select kc22.ake003,sum(kc22.akb065) akb065 from kc22  where ");
		sql.append(" kc22.aaz217 in (select kc21.aaz217 from kc21 where kc21.akc194 > to_date('"
				+ vo.getTjsj1()
				+ "', 'yyyy-mm-dd') and kc21.akc194 < to_date('"
				+ vo.getTjsj2()
				+ "', 'yyyy-mm-dd') and kc21.aaz263 = "
				+ vo.getYsgh() + " ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130=" + vo.getJzlx() + " ");
		}
		sql.append(" ) group by kc22.ake003) t2 ");
		sql.append(" where t1.aaa102=t2.ake003(+) ");
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql
				.toString());
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

	public String getFundSourceConsituentDataYishiYishi(YishiGridVO vo) {
		StringBuffer sql = new StringBuffer(
				" select sum(kc24.akc253+kc24.akc254) zf,sum(kc24.ake038) gz,sum(kc24.akc264-kc24.akc253-kc24.akc254-kc24.ake038) yb from kc24  where ");
		sql.append(" kc24.aaz217 in (select kc21.aaz217 from kc21 where ");
		sql.append(" kc21.aaz263=" + vo.getYsgh());
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130=" + vo.getJzlx() + " ");
		}
		sql.append(" and kc21.akc194 > to_date('" + vo.getTjsj1()
				+ "', 'yyyy-mm-dd') ");
		sql.append(" and kc21.akc194 < to_date('" + vo.getTjsj2()
				+ "', 'yyyy-mm-dd') )");

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

	public String getWorkloadStatisticsDataYishi(YishiGridVO vo) {
		StringBuffer sql = new StringBuffer(
				"select to_char(kc21.akc194,'yyyy-mm-dd') akc194,count (kc21.aaz217) num1  from kc21 where kc21.aac001 = "
						+ vo.getYsgh()
						+ "   and kc21.akc194 > to_date('"
						+ vo.getTjsj1()
						+ "', 'yyyy-mm-dd')   and kc21.akc194 < to_date('"
						+ vo.getTjsj2() + "', 'yyyy-mm-dd')   ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
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
		String result = "[[\"就诊天数\",\"日均就诊次数\",\"就诊次数\",\"单日就诊最大次数\"],[" + jzts
				+ "," + rjjzcs + "," + ljjzcs + "," + drjzzdcs + "]]";
		return result;
	}

	public String getFeeStatisticsDataYishi(YishiGridVO vo) {
		StringBuffer sql = new StringBuffer(
				"select to_char(kc21.akc194,'yyyy-mm-dd') akc194,count (kc21.aaz217) num1  from kc21 where kc21.aaz263 = "
						+ vo.getYsgh()
						+ "   and kc21.akc194 > to_date('"
						+ vo.getTjsj1()
						+ "', 'yyyy-mm-dd')   and kc21.akc194 < to_date('"
						+ vo.getTjsj2() + "', 'yyyy-mm-dd')   ");
		if (StringTools.hasText(vo.getJzlx())) {
			sql.append(" and kc21.aka130 = " + vo.getJzlx() + " ");
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
		double fsfyze = 0;
		double jcfsfy = 0;
		double rjfsfy = 0;
		StringBuffer zesql = new StringBuffer(
				"select sum(t2.akc264) akc264 from kc24 t2 where t2.aaz217 in (select t.aaz217 from kc21 t where ");
		zesql.append(" t.aaz263=" + vo.getYsgh() + " ");
		if (StringTools.hasText(vo.getJzlx())) {
			zesql.append(" and t.aka130=" + vo.getJzlx() + " ");
		}
		zesql.append(" and t.akc194 > to_date('" + vo.getTjsj1()
				+ "', 'yyyy-mm-dd') ");
		zesql.append(" and t.akc194 < to_date('" + vo.getTjsj2()
				+ "', 'yyyy-mm-dd') )");
		Map<String, Object> map = CommonJdbcDaoUtils.queryForMap(zesql
				.toString());
		if (map != null) {
			if (map.get("akc264") != null) {
				fsfyze = ((BigDecimal) map.get("akc264")).doubleValue();
			}
		}
		if (ljjzcs != 0) {
			jcfsfy = fsfyze / ljjzcs;
		}
		if (jzts != 0) {
			rjfsfy = fsfyze / jzts;
		}
		String result = "[[\"次均发生费用\",\"日均发生费用\",\"发生费用总额\"],[" + jcfsfy + ","
				+ rjfsfy + "," + fsfyze + "]]";
		return result;
	}

	public YishiGridVO getyishisjz(YishiGridVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select to_char(temp.akc194,'yyyy/MM/dd') akc194 , ");
		sql.append(" count(temp.aaz217) number1,sum(temp.number1) number2  ");
		sql.append(" from (select t1.aaz217,t1.AKC194,  ");
		sql.append(" (select sum(AKC264) from kc24 t4 where t4.aaz217=t1.aaz217) number1 from kc21 t1 where   ");
		sql.append(" t1.akc194>to_date(to_char(sysdate,'yyyy')||'/01/01','yyyy/MM/dd' )   and t1.akc194<to_date(to_char(sysdate,'yyyy')||'/12/31','yyyy/MM/dd') ");
		if (StringTools.hasText(vo.getYsgh())) {
			sql.append(" and t1.aaz263=" + vo.getYsgh() + " ");
		}
		sql.append("  ) temp group by to_char(temp.akc194,'yyyy/MM/dd')   order by to_char(temp.akc194,'yyyy/MM/dd') desc ");
		List<Map<String, Object>> list = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		List<YishiSJZVO> resultList = new ArrayList<YishiSJZVO>();
		for (Map<String, Object> map : list) {
			String nian = "";
			String yue = "";
			String ri = "";
			if (map.get("akc194") != null) {
				String date = (String) map.get("akc194");
				nian = date.substring(0, 4);
				yue = date.substring(5, 7);
				ri = date.substring(8, 10);
			}
			YishiSJZVO sjz = new YishiSJZVO();
			sjz.setNian(Integer.parseInt(nian));
			sjz.setYue(Integer.parseInt(yue));
			sjz.setRi(Integer.parseInt(ri));
			sjz.setJzrc(((BigDecimal) map.get("number1")).intValue());
			sjz.setFy(((BigDecimal) map.get("number2")).doubleValue());
			resultList.add(sjz);
		}
		List<YishiSJZVO> sjzList = new ArrayList<YishiSJZVO>();
		for (int i = 1; i < 13; i++) {
			YishiSJZVO sjz = new YishiSJZVO();
			sjz.setYue(i);
			for (int j = 0; j < resultList.size(); j++) {
				YishiSJZVO child = resultList.get(j);
				if (child.getYue() == sjz.getYue()) {
					sjz.getChild().add(child);
					if (child.getRi() < 10) {
						child.setMonth("0" + child.getRi() + "日");
					} else {
						child.setMonth(child.getRi() + "日");
					}
					child.setTxt("接诊"+child.getJzrc()+"人次，费用"+child.getFy()+"元");
					sjz.setNian(child.getNian());
					sjz.setJzrc(sjz.getJzrc() + child.getJzrc());
					sjz.setFy(sjz.getFy() + child.getFy());
				}
			}
			if (sjz.getJzrc() > 0) {
				String nian=sjz.getNian()+"";
				if (sjz.getYue()<10) {
					sjz.setMonth(nian.substring(2, nian.length())+"年0"+sjz.getYue()+"月");
				}else {
					sjz.setMonth(nian.substring(2, nian.length())+"年"+sjz.getYue()+"月");
				}
				NumberFormat nf = NumberFormat.getNumberInstance();
		        nf.setMaximumFractionDigits(2);
				sjz.setTxt("出诊"+sjz.getChild().size()+"天，接诊"+sjz.getJzrc()+"人次，共发生费用"+nf.format(sjz.getFy()/10000)+"万元");
				sjz.setFlag(sjzList.size()+1+"");
				if (sjz.getYue()<10) {
					sjz.setYear(sjz.getNian() + "0" + sjz.getYue());
				}else {
					sjz.setYear(sjz.getNian() + "" + sjz.getYue());
				}
				sjzList.add(sjz);
			}
		}
		String sjz="[";
		for (int i = 0; i < sjzList.size(); i++) {
			YishiSJZVO sjzvo = sjzList.get(i);
			sjz=sjz+"{\"year\":\""+sjzvo.getYear()+"\",\"flg\":\""+sjzvo.getFlag()+"\",child:[{\"month\":\""+sjzvo.getMonth()+"\",\"txt\":\""+sjzvo.getTxt()+"\"},";
			for (int j = 0; j < sjzvo.getChild().size(); j++) {
				YishiSJZVO child = sjzvo.getChild().get(j);
				sjz=sjz+"{\"month\":\""+child.getMonth()+"\",\"txt\":\""+child.getTxt()+"\"}";
				if ((j+1)!=sjzvo.getChild().size()) {
					sjz=sjz+",";
				}
			}
			sjz=sjz+"]}";
			if ((i+1)!=sjzList.size()) {
				sjz=sjz+",";
			}
		}
		sjz=sjz+"]";
		vo.setSjz(sjz);
		return vo;
	}

}
