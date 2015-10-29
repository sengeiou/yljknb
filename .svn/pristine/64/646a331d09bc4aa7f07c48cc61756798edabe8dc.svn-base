package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
//定点医疗服务机构
@MappedSuperclass
public abstract class BaseUnitList  {


     private Integer aaz107;//医疗服务机构ID
     private String aaa027;//统筹地区编码
     private String akb020;//医疗服务机构编号
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
     private Integer aae030;//开始日期
     private Integer aae031;//终止日期
     private String akb102;//医疗机构执业范围代码
     private String apa151;//监控等级

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_UNIT_LIST", allocationSize = 1)
    @Column(name="AAZ107", unique=true, nullable=false, precision=20, scale=0)
    public Integer getAaz107() {
        return this.aaz107;
    }
    
    public void setAaz107(Integer aaz107) {
        this.aaz107 = aaz107;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AKB020", length=20)
    public String getAkb020() {
        return this.akb020;
    }
    
    public void setAkb020(String akb020) {
        this.akb020 = akb020;
    }
    
    @Column(name="AKB021", length=100)
    public String getAkb021() {
        return this.akb021;
    }
    
    public void setAkb021(String akb021) {
        this.akb021 = akb021;
    }
    
    @Column(name="AKB022", length=1)
    public String getAkb022() {
        return this.akb022;
    }
    
    public void setAkb022(String akb022) {
        this.akb022 = akb022;
    }
    
    @Column(name="AAB112", length=1)
    public String getAab112() {
        return this.aab112;
    }
    
    public void setAab112(String aab112) {
        this.aab112 = aab112;
    }
    
    @Column(name="AKA101", length=2)
    public String getAka101() {
        return this.aka101;
    }
    
    public void setAka101(String aka101) {
        this.aka101 = aka101;
    }
    
    @Column(name="AKB011", length=1)
    public String getAkb011() {
        return this.akb011;
    }
    
    public void setAkb011(String akb011) {
        this.akb011 = akb011;
    }
    
    @Column(name="AKB012", length=1)
    public String getAkb012() {
        return this.akb012;
    }
    
    public void setAkb012(String akb012) {
        this.akb012 = akb012;
    }
    
    @Column(name="AKB023", length=2)
    public String getAkb023() {
        return this.akb023;
    }
    
    public void setAkb023(String akb023) {
        this.akb023 = akb023;
    }
    
    @Column(name="AKB026", length=20)
    public String getAkb026() {
        return this.akb026;
    }
    
    public void setAkb026(String akb026) {
        this.akb026 = akb026;
    }
    
    @Column(name="AKF015", precision=8, scale=0)
    public Integer getAkf015() {
        return this.akf015;
    }
    
    public void setAkf015(Integer akf015) {
        this.akf015 = akf015;
    }
    
    @Column(name="AAE100", length=1)
    public String getAae100() {
        return this.aae100;
    }
    
    public void setAae100(String aae100) {
        this.aae100 = aae100;
    }
    
    @Column(name="AKB100", length=1)
    public String getAkb100() {
        return this.akb100;
    }
    
    public void setAkb100(String akb100) {
        this.akb100 = akb100;
    }
    
    @Column(name="AKB101", length=20)
    public String getAkb101() {
        return this.akb101;
    }
    
    public void setAkb101(String akb101) {
        this.akb101 = akb101;
    }
    
    @Column(name="AAB013", length=50)
    public String getAab013() {
        return this.aab013;
    }
    
    public void setAab013(String aab013) {
        this.aab013 = aab013;
    }
    
    @Column(name="AAB304", length=20)
    public String getAab304() {
        return this.aab304;
    }
    
    public void setAab304(String aab304) {
        this.aab304 = aab304;
    }
    
    @Column(name="AAB062", length=20)
    public String getAab062() {
        return this.aab062;
    }
    
    public void setAab062(String aab062) {
        this.aab062 = aab062;
    }
    
    @Column(name="AAE004", length=50)
    public String getAae004() {
        return this.aae004;
    }
    
    public void setAae004(String aae004) {
        this.aae004 = aae004;
    }
    
    @Column(name="AAE006", length=150)
    public String getAae006() {
        return this.aae006;
    }
    
    public void setAae006(String aae006) {
        this.aae006 = aae006;
    }
    
    @Column(name="AAE007", length=6)
    public String getAae007() {
        return this.aae007;
    }
    
    public void setAae007(String aae007) {
        this.aae007 = aae007;
    }
    
    @Column(name="AAE005", length=40)
    public String getAae005() {
        return this.aae005;
    }
    
    public void setAae005(String aae005) {
        this.aae005 = aae005;
    }
    
    @Column(name="AAE030", precision=8, scale=0)
    public Integer getAae030() {
        return this.aae030;
    }
    
    public void setAae030(Integer aae030) {
        this.aae030 = aae030;
    }
    
    @Column(name="AAE031", precision=8, scale=0)
    public Integer getAae031() {
        return this.aae031;
    }
    
    public void setAae031(Integer aae031) {
        this.aae031 = aae031;
    }
    
    @Column(name="AKB102", length=4)
    public String getAkb102() {
        return this.akb102;
    }
    
    public void setAkb102(String akb102) {
        this.akb102 = akb102;
    }
    
    @Column(name="APA151", length=1)
    public String getApa151() {
        return this.apa151;
    }
    
    public void setApa151(String apa151) {
        this.apa151 = apa151;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Transient
	public Integer getEntityId() {

		return getAaz107();
	}

	@Transient
	public Integer getObjectId() {

		return getAaz107();
	}
	
}


