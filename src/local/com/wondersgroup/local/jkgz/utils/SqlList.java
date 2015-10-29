package com.wondersgroup.local.jkgz.utils;

public class SqlList {

/****************运行规则主SQL****************/
	/**
	 * 通过传入模板编码查询知识点,然后找到kc22里和知识点对应的数据
	 */
	public final static String MAIN_SQL_1 = "select k2.aaz213,k2.aaz217,zsd.gzmbbm,zsd.mbzhbj,zsd.zsdbm,zsd.ybgzflbm,zsd.zsdmc  from ylfwzb.kc22 k2,(select * from zsk.ybgz_ybgzzsd where ybgzflbm=?)zsd where  k2.ake001=zsd.zsdbm";

	/**
	 * 通过传入模板编码查询知识点,然后找到kc22里和知识点对应的数据的总数
	 */
	public final static String MAIN_SQL_2 = "select count(1) as count1 from (select k2.aaz213,k2.aaz217,zsd.gzmbbm,zsd.mbzhbj,zsd.zsdbm,zsd.ybgzflbm,zsd.zsdmc  from ylfwzb.kc22 k2,(select * from zsk.ybgz_ybgzzsd where ybgzflbm=?)zsd where  k2.ake001=zsd.zsdbm)";

	/**
	 * 查询有标记的知识点对应的其他规则
	 */
	public final static String MAIN_SQL_3 = "select max(gzmbbm) as gzmbbm,ybgzflbm from zsk.ybgz_ybgzzsd where zsdbm=? and ybgzflbm <> ? group by ybgzflbm";
	
	/**
	 * 通过规则模板编码查询规则数据内容和运算规则
	 */
	public final static String MAIN_SQL_4="select sj.sjnr,lj.ysgz from zsk.ybgz_ybgztjlj lj,zsk.ybgz_ybtjsj sj where lj.ybgztjljbm=sj.ybgztjljbm and lj.gzmbbm=?";
	

/****************规则0300****************/
	/**
	 * 查询年龄
	 */
	public final static String GZ0300_GZ0307_SQL="select nl from kc21 k1 , kc22 k2 where k2.aaz217=k1.aaz217 and k2.aaz213=?";
	public final static String GZ0300_GZ0312_SQL="select aac004 from ylfwzb.kc21 where aaz217 = (select aaz217 from ylfwzb.kc22 where aaz213 = ?)";
	/**
	 * 查询科室限用
	 */
	/**根据参数aaz217 查询科室代码*/
	public final static String GZ0300_GZ0309_SQL="select aaz307 from ylfwzb.kc22 where aaz213 = ?)";
	/**医院有效*/
	public final static String GZ0300_GZ0315_SQL="select ylfwzb.b1.akb022 from ylfwzb.kb01 b1 where b1.akb020 = (select akb020 from ylfwzb.kc21 where aaz217 = (select aaz217 from ylfwzb.kc22 where aaz213 = ?))";
	/**药店有效*/
	public final static String GZ0300_GZ0316_SQL="select ylfwzb.b1.akb022 from ylfwzb.kb01 b1 where b1.akb020 = (select akb020 from ylfwzb.kc21 where aaz217 = (select aaz217 from ylfwzb.kc22 where aaz213 = ?))";
	/**指定医疗机构有效*/
	public final static String GZ0300_GZ0317_SQL="select k1.akb020 from ylfwzb.kc21 k1 where k1.aaz217 = (select aaz217 from ylfwzb.kc22 where aaz213 = ?)";
   /** 
    * 查询病种限用
    */
	/**ylfwzb.kc21和 ylfwzb.kc22 关联查询 aka130*/
	public final static String GZ0300_GZ0301_SQL_1="select aka130 from ylfwzb.kc21 k1,ylfwzb.kc22 k2 where k1.aaz217=k2.aaz217 and k2.aaz213=?";
	/**ylfwzb.kc21和 ylfwzb.kc22 关联查询 aka120*/
	public final static String GZ0300_GZ0301_SQL_2="select aka120 from ylfwzb.kc21 where aaz217=(select aaz217 from ylfwzb.kc22 where aaz213=?)";
	/**根据参数Ybgzflbm 查询jbbm*/
	public final static String GZ0300_GZ0301_SQL_3="select jbbm as sjnr from zsk.ICD_BZJBDY where bzbm = ?";
   /**
    * 工伤限用
    */
	public final static String GZ0300_GZ0302_SQL="select aae140 from ylfwzb.kc21 where aaz217 = (select aaz217 from ylfwzb.kc22 where aaz213 = ?)";
	/** SAVE ylfwzb.kc63*/
	public final static String SAVE_Kc63_SQL_1=" insert into ylfwzb.kc63 select ?,a.aaz217,a.aac003,a.aac002,a.aac001,a.aac004,(select aac006 from ac01 where aac001 =(select aac001 from ylfwzb.kc21 where aaz217=?)),'',a.akb020," +
			                                     " (select t.akb021 from ylfwzb.kb01 t where t.akb020 = a.akb020),'',a.aaz307,'',a.aae386,a.aaz263,a.aka130,a.akc194," +
			                                     " (select sum(b.ake038) from ylfwzb.kc24 b where a.aaz217 = b.aaz217)," +
			                                     " (select sum(b.akc254) from ylfwzb.kc24 b where a.aaz217 = b.aaz217)," +
			                                     " (select sum(b.akc253) from ylfwzb.kc24 b where a.aaz217 = b.aaz217)," +
			                                     " (select sum(b.akb067) from ylfwzb.kc24 b where a.aaz217 = b.aaz217)," +
			                                     " (select sum(b.akc264) from ylfwzb.kc24 b where a.aaz217 = b.aaz217)," +
			                                     " a.akc050,a.akc193,a.akc185,a.aka120,a.akc186,a.akc188,a.akc274,a.akc275,a.akc276," +
			                                     " a.akc277,a.aae030,a.aae031,sysdate,'3','','4',a.aaa027,'','',a.aaz217,a.akc190" +
			                                     " from ylfwzb.kc21 a where  a.aaz217 = ?";
	/**根据参数aaz217 查询baz001*/
	public final static String SAVE_Kc63_SQL_2="select baz001 from ylfwzb.kc63 where aaz217=?";
	/**值为 null时，增加自增长序列*/
	public final static String SAVE_Kc63_SQL_3="select seq_baz001.nextval as baz001 from dual";
	/** 保存 ylfwzb.kc62*/
	public final static String SAVE_Kc62_SQL_1="insert into ylfwzb.kc62 values(?,?,?,?,?,?,?," +
			                                    "?,?,?,?,?,?,to_number(?),?,?," +
			                                    "?,?,'',?,?,?,'04','2',?,'1')";
	public final static String SAVE_Kc62_SQL_2="select * from ylfwzb.kc22 k2,(select t. column_value as t_aaz213 from table(str_split(?,',')) t )s2 where s2.t_aaz213=k2.aaz213";
	/**值为 null时，增加自增长序列*/
	public final static String SAVE_Kc62_SQL_3="select seq_baz003.nextval as baz003 from dual";
	/**根据得到ake003 的值 为1，查询对应的数据表*/
	public final static String SAVE_Kc62_SQL_4="select max(t.dfybypmc) from yhk.yhk_dfybypsp t where t.dfybypbm = ? group by t.dfybypbm";
	/**根据得到ake003 的值 为2，查询对应的数据表*/
	public final static String SAVE_Kc62_SQL_5="select max(xmmc) from yhk.YHK_DFYBZLXM where zlfwybbm= ? group by zlfwybbm";
	/**根据得到ake003 的值 为4，查询对应的数据表*/
	public final static String SAVE_Kc62_SQL_6="select max(mlmc3) from yhk.YHK_DFYBYLQC where ylqcybbm= ? group by ylqcybbm";
	/** SAVE ylfwzb.L3_TMP_WGMX*/
	public final static String SAVE_L3_TMP_WGMX_SQL="insert into ylfwzb.L3_TMP_WGMX values( '',?,?,?," +
			                                        "(select to_char(a.akc194,'yyyymmdd') from ylfwzb.kc21 a where a.aaz217 = ?)," +
			                                        " (select to_char(a.akc194,'yyyymm') from ylfwzb.kc21 a where a.aaz217 = ?)," +
			                                        "(select gzmbms as T_IsCrimeMsg from zsk.ybgz_ybgzmb where gzmbbm=?),'0','0')";
	/**SAVE ylfwzb.kc72*/
	public final static String SAVE_Kc72_SQL_1="insert into ylfwzb.kc72 values(?,?,?,?,(select gzmbms as T_IsCrimeMsg from zsk.ybgz_ybgzmb where gzmbbm=?))";
	/**查询ybgzflmc*/  
	public final static String SAVE_Kc72_SQL_2="select ybgzflmc from zsk.ybgz_ybgzfl where ybgzflbm=?";
	/**值为 null时，增加自增长序列*/
	public final static String SAVE_Kc72_SQL_3="select seq_baz004.nextval as baz004 from dual";
	
	
	
	/**住院限用*/
	public final static String GZ0300_GZ0308_SQL="select aka130 from ylfwzb.kc21 where aaz217 = (select aaz217 from ylfwzb.kc22 where aaz213 = ?)";
	
}

