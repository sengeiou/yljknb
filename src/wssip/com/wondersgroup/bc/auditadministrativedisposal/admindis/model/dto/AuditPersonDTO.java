package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto;

import java.util.Date;


public class AuditPersonDTO extends Af31DTO{
	
	// 参保人基本信息
	private String aac001;// 人员编号
	private String aac003;// 姓名
	private String aac004;// 性别
	private Integer aac006;// 出生日期
	private String aac084;// 离退休
	private String aac002;// 社会保障号
	private String apa151;// 监控等级
	private String aae005;// 联系电话
	private Integer aae138;//入狱/失踪/死亡日期
	private String aac060;//生存状态
	private Date aac006s;
	private Date aae138s;
	
	// 医师基本信息
	 private String aaz263;//医护人员编号
     private String aaa027;//统筹区编码
     private String aaz107;//医疗服务机构ID
     private String akb020;//医疗服务机构编号
     private String aaz307;//科室编码
     private String aab014;//公民身份号码
     private String akc049;//行政职务名称代码
     private String aaf009;//卫生技术人员专业技术职务
     private String akc054;//医师资格证编码
     private String akc056;//医师执业证编码
     private String akc057;//第一执业地点
     private String akc051;//多点执业标志
     private String akc052;//门诊大病医师标识
     private String aae100;//当前有效标志
     private String akc053;//医师医保服务资格状态
     private String aae013;//备注
     private String akc278;//药师类别
     private String akc279;//药师执业类别
     private String akc281;//药师执业范围
     private String akc282;//执业药师资格证书编号
     private String akc283;//执业药师注册证编号
     private String aae386;
	
	// 医疗机构基本信息
     private String akb021;//医疗服务机构名称
     private String akb022;//医疗服务机构类型
     private String aab112;//所有制形式
     private String aka101;//医院等级
     private String akb011;//联网结算标识
     private String akb012;//定点医疗机构医保评级
     private String akb023;//医疗机构分类代码
     private String akb026;//医疗机构执业许可证登记号
     private Integer akf015;//床位数
     private String akb100;//分院标志
     private String akb101;//上级医疗机构编码
     private String aab013;//法定代表人姓名
     private String aab304;//机构负责人
     private String aab062;//分管医保负责人
     private String aae004;//医保联系人
     private String aae006;//地址
     private String aae007;//邮政编码
     private Integer aae030;//开始日期
     private Integer aae031;//终止日期
     private String akb102;//医疗机构执业范围代码
     private String akb101mc;
     private Date aae030s;
     private Date aae031s;
     

	public String getAac001() {
		return aac001;
	}

	public void setAac001(String aac001) {
		this.aac001 = aac001;
	}

	public String getAac003() {
		return aac003;
	}

	public void setAac003(String aac003) {
		this.aac003 = aac003;
	}

	public String getAac004() {
		return aac004;
	}

	public void setAac004(String aac004) {
		this.aac004 = aac004;
	}

	public Integer getAac006() {
		return aac006;
	}

	public void setAac006(Integer aac006) {
		this.aac006 = aac006;
	}

	public String getAac084() {
		return aac084;
	}

	public void setAac084(String aac084) {
		this.aac084 = aac084;
	}

	public String getAac002() {
		return aac002;
	}

	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}

	public String getApa151() {
		return apa151;
	}

	public void setApa151(String apa151) {
		this.apa151 = apa151;
	}

	public String getAae005() {
		return aae005;
	}

	public void setAae005(String aae005) {
		this.aae005 = aae005;
	}

	public String getAaz263() {
		return aaz263;
	}

	public void setAaz263(String aaz263) {
		this.aaz263 = aaz263;
	}

	public String getAab014() {
		return aab014;
	}

	public void setAab014(String aab014) {
		this.aab014 = aab014;
	}

	public String getAkb020() {
		return akb020;
	}

	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}

	public String getAaz307() {
		return aaz307;
	}

	public void setAaz307(String aaz307) {
		this.aaz307 = aaz307;
	}

	public String getAae386() {
		return aae386;
	}

	public void setAae386(String aae386) {
		this.aae386 = aae386;
	}

	public String getAkc049() {
		return akc049;
	}

	public void setAkc049(String akc049) {
		this.akc049 = akc049;
	}

	public String getAaf009() {
		return aaf009;
	}

	public void setAaf009(String aaf009) {
		this.aaf009 = aaf009;
	}

	public String getAkc054() {
		return akc054;
	}

	public void setAkc054(String akc054) {
		this.akc054 = akc054;
	}

	public String getAkc056() {
		return akc056;
	}

	public void setAkc056(String akc056) {
		this.akc056 = akc056;
	}

	public String getAkc278() {
		return akc278;
	}

	public void setAkc278(String akc278) {
		this.akc278 = akc278;
	}

	public String getAkc279() {
		return akc279;
	}

	public void setAkc279(String akc279) {
		this.akc279 = akc279;
	}

	public String getAkc281() {
		return akc281;
	}

	public void setAkc281(String akc281) {
		this.akc281 = akc281;
	}

	public String getAkc282() {
		return akc282;
	}

	public void setAkc282(String akc282) {
		this.akc282 = akc282;
	}

	public String getAkc283() {
		return akc283;
	}

	public void setAkc283(String akc283) {
		this.akc283 = akc283;
	}

	public String getAkb021() {
		return akb021;
	}

	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}

	public String getAkb022() {
		return akb022;
	}

	public void setAkb022(String akb022) {
		this.akb022 = akb022;
	}

	public String getAka101() {
		return aka101;
	}

	public void setAka101(String aka101) {
		this.aka101 = aka101;
	}

	public String getAkb011() {
		return akb011;
	}

	public void setAkb011(String akb011) {
		this.akb011 = akb011;
	}

	public String getAkb023() {
		return akb023;
	}

	public void setAkb023(String akb023) {
		this.akb023 = akb023;
	}

	public String getAkb026() {
		return akb026;
	}

	public void setAkb026(String akb026) {
		this.akb026 = akb026;
	}

	public String getAkb100() {
		return akb100;
	}

	public void setAkb100(String akb100) {
		this.akb100 = akb100;
	}

	public String getAkb101() {
		return akb101;
	}

	public void setAkb101(String akb101) {
		this.akb101 = akb101;
	}

	public String getAkb101mc() {
		return akb101mc;
	}

	public void setAkb101mc(String akb101mc) {
		this.akb101mc = akb101mc;
	}

	public String getAae007() {
		return aae007;
	}

	public void setAae007(String aae007) {
		this.aae007 = aae007;
	}

	public String getAae006() {
		return aae006;
	}

	public void setAae006(String aae006) {
		this.aae006 = aae006;
	}

	public Integer getAae138() {
		return aae138;
	}

	public void setAae138(Integer aae138) {
		this.aae138 = aae138;
	}

	public String getAac060() {
		return aac060;
	}

	public void setAac060(String aac060) {
		this.aac060 = aac060;
	}

	public String getAaa027() {
		return aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	public String getAaz107() {
		return aaz107;
	}

	public void setAaz107(String aaz107) {
		this.aaz107 = aaz107;
	}

	public String getAkc057() {
		return akc057;
	}

	public void setAkc057(String akc057) {
		this.akc057 = akc057;
	}

	public String getAkc051() {
		return akc051;
	}

	public void setAkc051(String akc051) {
		this.akc051 = akc051;
	}

	public String getAkc052() {
		return akc052;
	}

	public void setAkc052(String akc052) {
		this.akc052 = akc052;
	}

	public String getAae100() {
		return aae100;
	}

	public void setAae100(String aae100) {
		this.aae100 = aae100;
	}

	public String getAkc053() {
		return akc053;
	}

	public void setAkc053(String akc053) {
		this.akc053 = akc053;
	}

	public String getAae013() {
		return aae013;
	}

	public void setAae013(String aae013) {
		this.aae013 = aae013;
	}

	public String getAab112() {
		return aab112;
	}

	public void setAab112(String aab112) {
		this.aab112 = aab112;
	}

	public String getAkb012() {
		return akb012;
	}

	public void setAkb012(String akb012) {
		this.akb012 = akb012;
	}

	public Integer getAkf015() {
		return akf015;
	}

	public void setAkf015(Integer akf015) {
		this.akf015 = akf015;
	}

	public String getAab013() {
		return aab013;
	}

	public void setAab013(String aab013) {
		this.aab013 = aab013;
	}

	public String getAab304() {
		return aab304;
	}

	public void setAab304(String aab304) {
		this.aab304 = aab304;
	}

	public String getAab062() {
		return aab062;
	}

	public void setAab062(String aab062) {
		this.aab062 = aab062;
	}

	public String getAae004() {
		return aae004;
	}

	public void setAae004(String aae004) {
		this.aae004 = aae004;
	}

	public Integer getAae030() {
		return aae030;
	}

	public void setAae030(Integer aae030) {
		this.aae030 = aae030;
	}

	public Integer getAae031() {
		return aae031;
	}

	public void setAae031(Integer aae031) {
		this.aae031 = aae031;
	}

	public String getAkb102() {
		return akb102;
	}

	public void setAkb102(String akb102) {
		this.akb102 = akb102;
	}

	public Date getAac006s() {
		return aac006s;
	}

	public void setAac006s(Date aac006s) {
		this.aac006s = aac006s;
	}

	public Date getAae138s() {
		return aae138s;
	}

	public void setAae138s(Date aae138s) {
		this.aae138s = aae138s;
	}

	public Date getAae030s() {
		return aae030s;
	}

	public void setAae030s(Date aae030s) {
		this.aae030s = aae030s;
	}

	public Date getAae031s() {
		return aae031s;
	}

	public void setAae031s(Date aae031s) {
		this.aae031s = aae031s;
	}
	
}
