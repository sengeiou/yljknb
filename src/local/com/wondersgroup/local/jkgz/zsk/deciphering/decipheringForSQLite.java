package com.wondersgroup.local.jkgz.zsk.deciphering;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.rowset.serial.SerialException;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.wondersgroup.local.jkgz.entity.Bzjbdy;
import com.wondersgroup.local.jkgz.entity.Ybgzfl;
import com.wondersgroup.local.jkgz.entity.Ybgztjlj;
import com.wondersgroup.local.jkgz.entity.Ybgztjsj;
import com.wondersgroup.local.jkgz.entity.Ybgzzsd;
import com.wondersgroup.local.jkgz.entity.Zlxmz;
import com.wondersgroup.local.jkgz.zsk.deciphering.sqlite3JNA.Clibrary;


public class decipheringForSQLite {
	private static PointerByReference pbr = new PointerByReference();
	private static PointerByReference ppStmt = new PointerByReference();
	
	private static String getFilePath(){
		String systemPath=System.getProperty("user.dir");
		systemPath.replace("\\","/");
		return systemPath+"\\src\\local\\com\\wondersgroup\\local\\jkgz\\zsk\\fileConfig.properties";
	}
	public static Map<String, String> getFile() throws IOException{
		Map<String, String> map = new HashMap<String, String>();
		Properties properties = new Properties();
		File file = new File(getFilePath());
		FileInputStream fis = new FileInputStream(file);
		properties.load(fis);
		fis.close();
		//System.out.println("FilePath:"+properties.getProperty("filepath")); 
		map.put("keypath", properties.getProperty("keypath"));
		map.put("filepath", properties.getProperty("filepath"));
		return map;
	}
	public static String getKey(String keypath){
		String key = "";
		 try {
             String encoding="GBK";
             File file=new File(keypath);
             if(file.isFile() && file.exists()){ //判断文件是否存在
                 InputStreamReader read = new InputStreamReader(
                 new FileInputStream(file),encoding);//考虑到编码格式
                 BufferedReader bufferedReader = new BufferedReader(read);
                 key = bufferedReader.readLine();
                 read.close();
             }else{
            	 System.out.println("找不到指定的文件");
             }
		 } catch (Exception e) {
			 System.out.println("读取文件内容出错");
			 e.printStackTrace();
		 }
		return key;
	}
	
	
	public static Ybgzzsd queryYbgzzsd(String xzqhdm_str) throws SerialException, SQLException{
		String sql = "select (case when yhk.xgbz = '0' then zsk.ybgzzsd_id else yhk.gzmx_id end) ybgzzsd_id,";
		sql += "       (case when yhk.xgbz = '0' then zsk.ybgzflbm else yhk.ybgzflbm end) ybgzflbm,";
		sql += "       (case when yhk.xgbz = '0' then zsk.zsdbm else yhk.zsdbm end) zsdbm,";
		sql += "       (case when yhk.xgbz = '0' then zsk.zsdmc else yhk.zsdmc end) zsdmc,";
		sql += "       zsk.gzmbbm,";
		sql += "       zsk.mbzhbj,";
		sql += "       zsk.zsdsm,";
		sql += "       yhk.shjg,";
		sql += "       yhk.kkgz,";
		sql += "       yhk.kkbl,";
		sql += "       yhk.xgbz";
		sql += "  from ybgz_ybgzzsd zsk, yhk_ybgzzsd yhk";
		sql += " where zsk.ybgzbm = yhk.ybgzbm";
		sql += "   and yhk.sfyx = '1'";
		sql += "   and yhk.xzqhdm = '" + xzqhdm_str + "'";
		int total=getCount(sql);
		String[] ybgzzsd_id=new String[total];
		String[] ybgzflbm=new String[total];
		String[] zsdbm=new String[total];
		String[] zsdmc=new String[total];
		String[] gzmbbm=new String[total];
		String[] mbzhbj=new String[total];
		String[] zsdsm=new String[total];
		String[] shjg=new String[total];
		String[] kkgz=new String[total];
		String[] kkbl=new String[total];
		String[] xgbz=new String[total];
		int i = 0;
        int ret =openDB(sql);
		while(ret==sqlite3JNA.SQLITE_ROW){
			ybgzzsd_id[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 0 );
			ybgzflbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 1 );
			zsdbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 2 );
			zsdmc[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 3 );
			gzmbbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 4 );
			mbzhbj[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 5 );
			zsdsm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 6 );
			shjg[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 7 );
			kkgz[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 8 );
			kkbl[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 9 );
			xgbz[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 10 );
			i++;
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
		}
		closeDB(ret);
		Ybgzzsd ybgzzsd=new Ybgzzsd();
		ybgzzsd.setYbgzzsd_id(ybgzzsd_id);
		ybgzzsd.setYbgzflbm(ybgzflbm);
		ybgzzsd.setZsdbm(zsdbm);
		ybgzzsd.setZsdmc(zsdmc);
		ybgzzsd.setGzmbbm(gzmbbm);
		ybgzzsd.setMbzhbj(mbzhbj);
		ybgzzsd.setZsdsm(zsdsm);
		ybgzzsd.setShjg(shjg);
		ybgzzsd.setKkgz(kkgz);
		ybgzzsd.setKkbl(kkbl);
		ybgzzsd.setXgbz(xgbz);
		return ybgzzsd;
	}
	
	
	public static Ybgztjlj queryYbtjlj(String xzqhdm){
		String sql=("select ybgztjlj_id,ybgztjljbm,gzmbbm,ysgz,ywlx,sjzdbm,tjgx,tjcj from ybgz_ybgztjlj where  xzqhdm='"+xzqhdm+"' ");
		int count=getCount(sql);
		String[] ybgztjlj_id=new String[count];
		String[] ybgztjljbm=new String[count];
		String[] gzmbbm=new String[count];
		String[] ysgz=new String[count];
		String[] ywlx=new String[count];
		String[] sjzdbm=new String[count];
		String[] tjgx=new String[count];
		String[] tjcj=new String[count];
        int ret =openDB(sql);
        int i = 0;
		while(ret==sqlite3JNA.SQLITE_ROW){
			ybgztjlj_id[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 0 );
			ybgztjljbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 1 );
			gzmbbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 2 );
			ysgz[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 3 );
			ywlx[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 4 );
			sjzdbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 5 );
			tjgx[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 6 );
			tjcj[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 7 );
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			i++;
		}
		closeDB(ret);
		Ybgztjlj ybgztjlj=new Ybgztjlj();
		ybgztjlj.setYbgztjlj_id(ybgztjlj_id);
		ybgztjlj.setYbgztjljbm(ybgztjljbm);
		ybgztjlj.setGzmbbm(gzmbbm);
		ybgztjlj.setYsgz(ysgz);
		ybgztjlj.setYwlx(ywlx);
		ybgztjlj.setSjzdbm(sjzdbm);
		ybgztjlj.setTjgx(tjgx);
		ybgztjlj.setTjcj(tjcj);
		return ybgztjlj;
	}
	
	public static Ybgztjsj queryYbtjsj(String xzqhdm){
		String sql=("select ybtjsj_id,ybgztjljbm,sjnr from ybgz_ybtjsj where xzqhdm='"+xzqhdm+"'");
		int count=getCount(sql);
		String[] ybtjsj_id=new String[count];
		String[] ybgztjljbm=new String[count];
		String[] sjnr=new String[count];
        int ret =openDB(sql);
        int i = 0;
		while(ret==sqlite3JNA.SQLITE_ROW){
			ybtjsj_id[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 0 );
			ybgztjljbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 1 );
			sjnr[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 2 );
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			i++;
		}
		closeDB(ret);
		Ybgztjsj ybgztjsj=new Ybgztjsj();
		ybgztjsj.setYbtjsj_id(ybtjsj_id);
		ybgztjsj.setYbgztjljbm(ybgztjljbm);
		ybgztjsj.setSjnr(sjnr);
		return ybgztjsj;
	}

	public static Ybgztjlj queryYhkYbtjlj(String xzqhdm) {
		String sql = "select ybgztjlj_id,ybgztjljbm,gzmbbm,ysgz,ywlx,sjzdbm,tjgx,tjcj from yhk_ybgztjlj where  xzqhdm='"
				+ xzqhdm + "' ";
		int count = getCount(sql);
		String[] ybgztjlj_id = new String[count];
		String[] ybgztjljbm = new String[count];
		String[] gzmbbm = new String[count];
		String[] ysgz = new String[count];
		String[] ywlx = new String[count];
		String[] sjzdbm = new String[count];
		String[] tjgx = new String[count];
		String[] tjcj = new String[count];
		int ret = openDB(sql);
		int i = 0;
		while (ret == sqlite3JNA.SQLITE_ROW) {
			ybgztjlj_id[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 0);
			ybgztjljbm[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 1);
			gzmbbm[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 2);
			ysgz[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt.getValue(),
					3);
			ywlx[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt.getValue(),
					4);
			sjzdbm[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 5);
			tjgx[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt.getValue(),
					6);
			tjcj[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt.getValue(),
					7);
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			i++;
		}
		closeDB(ret);
		Ybgztjlj ybgztjlj = new Ybgztjlj();
		ybgztjlj.setYbgztjlj_id(ybgztjlj_id);
		ybgztjlj.setYbgztjljbm(ybgztjljbm);
		ybgztjlj.setGzmbbm(gzmbbm);
		ybgztjlj.setYsgz(ysgz);
		ybgztjlj.setYwlx(ywlx);
		ybgztjlj.setSjzdbm(sjzdbm);
		ybgztjlj.setTjgx(tjgx);
		ybgztjlj.setTjcj(tjcj);
		return ybgztjlj;
	}

	public static Ybgztjsj queryYhkYbtjsj(String xzqhdm) {
		String sql = "select ybtjsj_id,ybgztjljbm,sjnr from yhk_ybtjsj where xzqhdm='"
				+ xzqhdm + "'";
		int count = getCount(sql);
		String[] ybtjsj_id = new String[count];
		String[] ybgztjljbm = new String[count];
		String[] sjnr = new String[count];
		int ret = openDB(sql);
		int i = 0;
		while (ret == sqlite3JNA.SQLITE_ROW) {
			ybtjsj_id[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 0);
			ybgztjljbm[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 1);
			sjnr[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt.getValue(),
					2);
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			i++;
		}
		closeDB(ret);
		Ybgztjsj ybgztjsj = new Ybgztjsj();
		ybgztjsj.setYbtjsj_id(ybtjsj_id);
		ybgztjsj.setYbgztjljbm(ybgztjljbm);
		ybgztjsj.setSjnr(sjnr);
		return ybgztjsj;
	}

	public static Ybgzfl queryYbgzfl(){
		String sql=("select ybgzflbm,ybgzflmc,ybfgzflbm from ybgz_ybgzfl");
		int count=getCount(sql);
		String[] ybgzflbm=new String[count];
		String[] ybgzflmc=new String[count];
		String[] ybfgzflbm=new String[count];
        int ret =openDB(sql);
        int i = 0;
		while(ret==sqlite3JNA.SQLITE_ROW){
			ybgzflbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 0 );
			ybgzflmc[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 1 );
			ybfgzflbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 2 );
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			i++;
		}
		closeDB(ret);
		Ybgzfl ybgzfl=new Ybgzfl();
		ybgzfl.setYbgzflbm(ybgzflbm);
		ybgzfl.setYbgzflmc(ybgzflmc);
		ybgzfl.setYbfgzflbm(ybfgzflbm);
		return ybgzfl;
	}
	
	public static Bzjbdy queryBzjydy() {
		String sql=("select bzbm,jbbm from icd_bzjbdy");
		int count=getCount(sql);
		String[] bzbm=new String[count];
		String[] jbbm=new String[count];
        int ret =openDB(sql);
        int i = 0;
		while(ret==sqlite3JNA.SQLITE_ROW){
			bzbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 0 );
			jbbm[i]=Clibrary.INSTANTCE.sqlite3_column_text( ppStmt.getValue(), 1 );
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			i++;
		}
		closeDB(ret);
		Bzjbdy bzjbdy=new Bzjbdy();
		bzjbdy.setBzbm(bzbm);
		bzjbdy.setJbbm(jbbm);
		return bzjbdy;
	}
	
	public static int getCount(String sql){
		int total=0;
		 int ret =openDB("select count(1) as total from("+sql+")");
			while(ret==sqlite3JNA.SQLITE_ROW){
				total=Clibrary.INSTANTCE.sqlite3_column_int(ppStmt.getValue(), 0);
				ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			}
		closeDB(ret);
		return total;
	}
	
	public static void queryJbbms() {
		String sql="select jbbm from icd_bzjbdy where jbbm='C16.802' and bzbm in (select sjnr from ybgz_ybtjsj where ybgztjljbm in" +
			                      	"(select ybgztjljbm from ybgz_ybgztjlj where gzmbbm in(select gzmbbm from ybgz_ybgzzsd where ybgzflbm='GZ0301'and zsdbm='100005650001')))";
	    int ret=openDB(sql);
		while(ret==sqlite3JNA.SQLITE_ROW){
			String jbbm=Clibrary.INSTANTCE.sqlite3_column_text(ppStmt.getValue(), 0);
			System.out.println(jbbm);
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
		}
		closeDB(ret);
	}
	
	
	static Pointer nativeString(String sql) { 
	    final byte[] data = sql.getBytes();
	    final Pointer pointer = new Memory(data.length + 1);
	    pointer.write(0L, data, 0, data.length);
	    pointer.setByte(data.length, (byte) 0);
	    return pointer;
	}

	private static int openDB(String sql){
		int ret = 0;
		pbr = new PointerByReference();
		Map<String, String> path = new HashMap<String, String>();
		try {
			path = getFile();
			ret = Clibrary.INSTANTCE.sqlite3_open(path.get("filepath").toString(),pbr);
		} catch (IOException e1) {
			e1.printStackTrace();
		} 	
		if(ret != sqlite3JNA.SQLITE_OK){
			System.out.println("CAN'T OPEN SQLITE");
		}
		/*String key = getKey(path.get("keypath").toString());
		ret = Clibrary.INSTANTCE.sqlite3_key(pbr.getValue(), key, key.length());
		if(ret != sqlite3JNA.SQLITE_OK){
			System.out.println("CAN'T KEY SQLITE");
		}*/
		//"select * from ICD_BZJBDY b where exists( select 1 from ybgz_ybtjsj s where exists( select 1 from ybgz_ybgztjlj j where exists(select 1 from ybgz_ybgzzsd where zsdbm='"+zsdbm+"' and ybgzflbm='"+ybgzflbm+"' and j.gzmbbm=gzmbbm) and j.ybgztjljbm=s.ybgztjljbm) and b.bzbm=s.sjnr)"
		Pointer sqlPnt =  nativeString(sql);
		PointerByReference pTail = new PointerByReference();
		ppStmt = new PointerByReference();
		ret = Clibrary.INSTANTCE.sqlite3_prepare_v2(pbr.getValue(), sqlPnt, -1, ppStmt, pTail);
		if(ret != sqlite3JNA.SQLITE_OK){
			System.out.println(Clibrary.INSTANTCE.sqlite3_errmsg(pbr.getValue()));
		}
		ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
		if(ret!=sqlite3JNA.SQLITE_ROW){
			System.out.println(ret);
			System.out.println(Clibrary.INSTANTCE.sqlite3_errmsg(pbr.getValue()));
		}
		return ret;
	}
	
	private static void closeDB(int ret){
		ret = Clibrary.INSTANTCE.sqlite3_finalize(ppStmt.getValue());
	    ret = Clibrary.INSTANTCE.sqlite3_close(pbr.getValue());	
		if(ret != sqlite3JNA.SQLITE_OK){
			System.out.println("can't close sqlite");
		}
	}

	public static Zlxmz queryZlxmz() {
		String sql = ("select zlxmbm,zlfwybbm from ylqc_zlxmz");
		int count = getCount(sql);
		String[] zlxmbm = new String[count];
		String[] zlfwybbm = new String[count];
		int ret = openDB(sql);
		int i = 0;
		while (ret == sqlite3JNA.SQLITE_ROW) {
			zlxmbm[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 0);
			zlfwybbm[i] = Clibrary.INSTANTCE.sqlite3_column_text(ppStmt
					.getValue(), 1);
			ret = Clibrary.INSTANTCE.sqlite3_step(ppStmt.getValue());
			i++;
		}
		closeDB(ret);
		Zlxmz zlxmz = new Zlxmz();
		zlxmz.setZlxmbm(zlxmbm);
		zlxmz.setZlfwybbm(zlfwybbm);
		return zlxmz;
	}

}
