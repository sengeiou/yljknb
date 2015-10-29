package com.wondersgroup.local.jkgz.main.impl;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

import com.wondersgroup.local.jkgz.entity.Bzjbdy;
import com.wondersgroup.local.jkgz.entity.Ybgzfl;
import com.wondersgroup.local.jkgz.entity.Ybgztjlj;
import com.wondersgroup.local.jkgz.entity.Ybgztjsj;
import com.wondersgroup.local.jkgz.entity.Ybgzzsd;
import com.wondersgroup.local.jkgz.entity.Zlxmz;
import com.wondersgroup.local.jkgz.main.JkgzMainVS;
import com.wondersgroup.local.jkgz.zsk.deciphering.decipheringForSQLite;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;

public class JkgzMainVSImpl implements JkgzMainVS {

	/**
	 * 调用规则入口
	 * 1.通过规则编码查询知识点
	 * 2.储存到ORACLE数组中
	 * @throws SQLException 
	 * @throws SerialException 
	 **/
	public void main(String xzqhdm) throws SerialException, SQLException {
		Ybgzzsd ybgzzsd=decipheringForSQLite.queryYbgzzsd(xzqhdm);
		Ybgztjlj ybgztjlj=decipheringForSQLite.queryYbtjlj(xzqhdm);
		Ybgztjsj ybgztjsj=decipheringForSQLite.queryYbtjsj(xzqhdm);
		Ybgztjlj ybgztjlj_yhk=decipheringForSQLite.queryYhkYbtjlj(xzqhdm);
		Ybgztjsj ybgztjsj_yhk=decipheringForSQLite.queryYhkYbtjsj(xzqhdm);
		Ybgzfl ybgzfl=decipheringForSQLite.queryYbgzfl();
		Bzjbdy bzjbdy=decipheringForSQLite.queryBzjydy();
		Zlxmz zlxmz=decipheringForSQLite.queryZlxmz();
		Connection con=CommonJdbcDaoUtils.getConnection().getMetaData().getConnection();
		CallableStatement cs =con.prepareCall("{Call  pkg_yljk.prc_yljk_main(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");  
		ArrayDescriptor arrayDesc = ArrayDescriptor.createDescriptor("VARCHAR_VARRAY",cs.getConnection());
		/***知识点***/
		cs.setArray(1, new ARRAY(arrayDesc,con,ybgzzsd.getYbgzzsd_id()));
		cs.setArray(2, new ARRAY(arrayDesc,con,ybgzzsd.getYbgzflbm()));
		cs.setArray(3, new ARRAY(arrayDesc,con,ybgzzsd.getZsdbm()));
		cs.setArray(4, new ARRAY(arrayDesc,con,ybgzzsd.getZsdmc()));
		cs.setArray(5, new ARRAY(arrayDesc,con,ybgzzsd.getGzmbbm()));
		cs.setArray(6, new ARRAY(arrayDesc,con,ybgzzsd.getMbzhbj()));
		cs.setArray(7, new ARRAY(arrayDesc,con,ybgzzsd.getZsdsm()));
		cs.setArray(8, new ARRAY(arrayDesc,con,ybgzzsd.getShjg()));
		cs.setArray(9, new ARRAY(arrayDesc,con,ybgzzsd.getKkgz()));
		cs.setArray(10, new ARRAY(arrayDesc,con,ybgzzsd.getKkbl()));
		cs.setArray(11, new ARRAY(arrayDesc,con,ybgzzsd.getXgbz()));
		/***条件逻辑***/
		cs.setArray(12, new ARRAY(arrayDesc,con,ybgztjlj.getYbgztjlj_id()));
		cs.setArray(13, new ARRAY(arrayDesc,con,ybgztjlj.getYbgztjljbm()));
		cs.setArray(14, new ARRAY(arrayDesc,con,ybgztjlj.getGzmbbm()));
		cs.setArray(15, new ARRAY(arrayDesc,con,ybgztjlj.getYsgz()));
		cs.setArray(16, new ARRAY(arrayDesc,con,ybgztjlj.getYwlx()));
		cs.setArray(17, new ARRAY(arrayDesc,con,ybgztjlj.getSjzdbm()));
		cs.setArray(18, new ARRAY(arrayDesc,con,ybgztjlj.getTjgx()));
		cs.setArray(19, new ARRAY(arrayDesc,con,ybgztjlj.getTjcj()));
		/***条件数据***/
		cs.setArray(20, new ARRAY(arrayDesc,con,ybgztjsj.getYbtjsj_id()));
		cs.setArray(21, new ARRAY(arrayDesc,con,ybgztjsj.getYbgztjljbm()));
		cs.setArray(22, new ARRAY(arrayDesc,con,ybgztjsj.getSjnr()));
		/***条件逻辑  用户库***/
		cs.setArray(23, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getYbgztjlj_id()));
		cs.setArray(24, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getYbgztjljbm()));
		cs.setArray(25, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getGzmbbm()));
		cs.setArray(26, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getYsgz()));
		cs.setArray(27, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getYwlx()));
		cs.setArray(28, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getSjzdbm()));
		cs.setArray(29, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getTjgx()));
		cs.setArray(30, new ARRAY(arrayDesc,con,ybgztjlj_yhk.getTjcj()));
		/***条件数据 用户库***/
		cs.setArray(31, new ARRAY(arrayDesc,con,ybgztjsj_yhk.getYbtjsj_id()));
		cs.setArray(32, new ARRAY(arrayDesc,con,ybgztjsj_yhk.getYbgztjljbm()));
		cs.setArray(33, new ARRAY(arrayDesc,con,ybgztjsj_yhk.getSjnr()));
		/***规则分类***/
		cs.setArray(34, new ARRAY(arrayDesc,con,ybgzfl.getYbgzflbm()));
		cs.setArray(35, new ARRAY(arrayDesc,con,ybgzfl.getYbgzflmc()));
		cs.setArray(36, new ARRAY(arrayDesc,con,ybgzfl.getYbfgzflbm()));
		/***病种疾病编码***/
		cs.setArray(37, new ARRAY(arrayDesc,con,bzjbdy.getBzbm()));
		cs.setArray(38, new ARRAY(arrayDesc,con,bzjbdy.getJbbm()));
		/***诊疗项目组***/
		cs.setArray(39, new ARRAY(arrayDesc,con,zlxmz.getZlxmbm()));
		cs.setArray(40, new ARRAY(arrayDesc,con,zlxmz.getZlfwybbm()));
		cs.execute();
	}

}
