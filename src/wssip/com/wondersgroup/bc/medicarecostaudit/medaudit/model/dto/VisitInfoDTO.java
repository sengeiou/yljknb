package com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto;

import java.util.Date;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;

//就诊信息dto  kc21 kc24 kb01
public class VisitInfoDTO extends Kc21DTO{

	//kc24
	private String aaz308;
    private String aaa027;
    private String akb020;
    private String aac003;
    private String aac001;
    private String aac002;
    private String akc190;
    private String akc021;
    private Date akc194;
    private String aaz217;
    private Double ake039;
    private Double ake029;
    private Double ake035;
    private Double ake043;
    private Double ake032;
    private Double ake042;
    private Double ake038;
    private Double akc254;
    private Double akc253;
    private Double akc264;
    private Double aka151;
    private Double aka153;
    private Double ake092;
    private Long aae418;
    private Double ake026;
    private Double akb067;
	
	//kb01
    private String akb021;//医疗服务机构名称
    private String akb022;//医疗服务机构类型
    private String aab112;//所有制形式
    private String aka101;//医院等级
    private String akb011;//联网结算标识
    private String akb012;//定点医疗机构医保评级
    private String akb023;//医疗机构分类代码
    private String akb026;//医疗机构执业许可证登记号
    private Integer akf015;//床位数
    private String aae100;//当前有效标志
    private String akb100;//分院标志
    private String akb101;//上级医疗机构编码
    private String aab013;//法定代表人姓名
    private String aab304;//机构负责人
    private String aab062;//分管医保负责人
    private String aae004;//医保联系人
    private String aae006;//地址
    private String aae007;//邮政编码
    private String aae005;//联系电话
    private String akb102;//医疗机构执业范围代码
    private String apa151;//监控等级
    
    //ac01
    private String aac004;//性别
    private Integer aac006;//出生日期
    private String aac084;//离退休标识
    private Integer aae138;//入狱/失踪/死亡日期
    private String aac060;//生存状态
    private String aaz500;//社会保障卡卡号
    
    //查询条件
    private String aae041;
    private String aae042;
    private String aka130;
    private String aka122;
    private String aka065;
    private String ake003;
    private String aka063;
    private String aae140;
    private String tjlb;    
    
	public String getAaz308() {
		return aaz308;
	}
	public void setAaz308(String aaz308) {
		this.aaz308 = aaz308;
	}
	public String getAaa027() {
		return aaa027;
	}
	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
	public String getAkb020() {
		return akb020;
	}
	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}
	public String getAac003() {
		return aac003;
	}
	public void setAac003(String aac003) {
		this.aac003 = aac003;
	}
	public String getAac001() {
		return aac001;
	}
	public void setAac001(String aac001) {
		this.aac001 = aac001;
	}
	public String getAac002() {
		return aac002;
	}
	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}
	public String getAkc190() {
		return akc190;
	}
	public void setAkc190(String akc190) {
		this.akc190 = akc190;
	}
	public String getAkc021() {
		return akc021;
	}
	public void setAkc021(String akc021) {
		this.akc021 = akc021;
	}
	public Date getAkc194() {
		return akc194;
	}
	public void setAkc194(Date akc194) {
		this.akc194 = akc194;
	}
	public String getAaz217() {
		return aaz217;
	}
	public void setAaz217(String aaz217) {
		this.aaz217 = aaz217;
	}
	public Double getAke039() {
		return ake039;
	}
	public void setAke039(Double ake039) {
		this.ake039 = ake039;
	}
	public Double getAke029() {
		return ake029;
	}
	public void setAke029(Double ake029) {
		this.ake029 = ake029;
	}
	public Double getAke035() {
		return ake035;
	}
	public void setAke035(Double ake035) {
		this.ake035 = ake035;
	}
	public Double getAke043() {
		return ake043;
	}
	public void setAke043(Double ake043) {
		this.ake043 = ake043;
	}
	public Double getAke032() {
		return ake032;
	}
	public void setAke032(Double ake032) {
		this.ake032 = ake032;
	}
	public Double getAke042() {
		return ake042;
	}
	public void setAke042(Double ake042) {
		this.ake042 = ake042;
	}
	public Double getAke038() {
		return ake038;
	}
	public void setAke038(Double ake038) {
		this.ake038 = ake038;
	}
	public Double getAkc254() {
		return akc254;
	}
	public void setAkc254(Double akc254) {
		this.akc254 = akc254;
	}
	public Double getAkc253() {
		return akc253;
	}
	public void setAkc253(Double akc253) {
		this.akc253 = akc253;
	}
	public Double getAkc264() {
		return akc264;
	}
	public void setAkc264(Double akc264) {
		this.akc264 = akc264;
	}
	public Double getAka151() {
		return aka151;
	}
	public void setAka151(Double aka151) {
		this.aka151 = aka151;
	}
	public Double getAka153() {
		return aka153;
	}
	public void setAka153(Double aka153) {
		this.aka153 = aka153;
	}
	public Double getAke092() {
		return ake092;
	}
	public void setAke092(Double ake092) {
		this.ake092 = ake092;
	}
	public Long getAae418() {
		return aae418;
	}
	public void setAae418(Long aae418) {
		this.aae418 = aae418;
	}
	public Double getAke026() {
		return ake026;
	}
	public void setAke026(Double ake026) {
		this.ake026 = ake026;
	}
	public Double getAkb067() {
		return akb067;
	}
	public void setAkb067(Double akb067) {
		this.akb067 = akb067;
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
	public String getAab112() {
		return aab112;
	}
	public void setAab112(String aab112) {
		this.aab112 = aab112;
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
	public String getAkb012() {
		return akb012;
	}
	public void setAkb012(String akb012) {
		this.akb012 = akb012;
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
	public Integer getAkf015() {
		return akf015;
	}
	public void setAkf015(Integer akf015) {
		this.akf015 = akf015;
	}
	public String getAae100() {
		return aae100;
	}
	public void setAae100(String aae100) {
		this.aae100 = aae100;
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
	public String getAae006() {
		return aae006;
	}
	public void setAae006(String aae006) {
		this.aae006 = aae006;
	}
	public String getAae007() {
		return aae007;
	}
	public void setAae007(String aae007) {
		this.aae007 = aae007;
	}
	public String getAae005() {
		return aae005;
	}
	public void setAae005(String aae005) {
		this.aae005 = aae005;
	}
	public String getAkb102() {
		return akb102;
	}
	public void setAkb102(String akb102) {
		this.akb102 = akb102;
	}
	public String getApa151() {
		return apa151;
	}
	public void setApa151(String apa151) {
		this.apa151 = apa151;
	}
	public String getAae041() {
		return aae041;
	}
	public void setAae041(String aae041) {
		this.aae041 = aae041;
	}
	public String getAae042() {
		return aae042;
	}
	public void setAae042(String aae042) {
		this.aae042 = aae042;
	}
	public String getAka130() {
		return aka130;
	}
	public void setAka130(String aka130) {
		this.aka130 = aka130;
	}
	public String getAka122() {
		return aka122;
	}
	public void setAka122(String aka122) {
		this.aka122 = aka122;
	}
	public String getAka065() {
		return aka065;
	}
	public void setAka065(String aka065) {
		this.aka065 = aka065;
	}
	public String getAke003() {
		return ake003;
	}
	public void setAke003(String ake003) {
		this.ake003 = ake003;
	}
	public String getAka063() {
		return aka063;
	}
	public void setAka063(String aka063) {
		this.aka063 = aka063;
	}
	public String getTjlb() {
		return tjlb;
	}
	public void setTjlb(String tjlb) {
		this.tjlb = tjlb;
	}
	public String getAae140() {
		return aae140;
	}
	public void setAae140(String aae140) {
		this.aae140 = aae140;
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
	public String getAaz500() {
		return aaz500;
	}
	public void setAaz500(String aaz500) {
		this.aaz500 = aaz500;
	}
	
}
