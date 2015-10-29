package com.wondersgroup.bc.auditadministrativedisposal;

/**
 * 稽核行政处理常量定义
 * 
 * @author RHX
 */
public interface AuditConstants {
	/**
	 * 审批状态AKC175
	 */
	public static final String AKC175_CODE_0 = "0"; // 未审批
	public static final String AKC175_CODE_1 = "1"; // 审批通过
	public static final String AKC175_CODE_2 = "2"; // 审批未通过
	
	/**
	 * 稽核立案状态APA165
	 */
	public static final String APA165_CODE_1 = "1";//待稽核立案
	public static final String APA165_CODE_2 = "2";//问题关闭
	public static final String APA165_CODE_3 = "3";//稽核立案
	public static final String APA165_CODE_4 = "4";//立案被否决
	public static final String APA165_CODE_5 = "5";//已简单处理

	
	/**
	 * 行政处理处罚标志APA155
	 */
	public static final String APA155_CODE_0 = "0"; // 不予行政处罚
	public static final String APA155_CODE_1 = "1"; // 移交行政处罚
	
	/**
	 * 移交标志APA168
	 */
	public static final String APA168_CODE_0 = "0"; // 不移交
	public static final String APA168_CODE_1 = "1"; // 移交
	
	/**
	 * 行政处理处罚登记执行标志Flag
	 */
	public static final String FLAG_REG = "reg"; // 行政处理处罚等级
	public static final String FLAG_EXCU = "excu"; // 行政处理处罚执行
	
	/**
	 * 案件状态AAE426
	 */
	public static final String AAE426_CODE_1 = "1"; // 立案待确认
	public static final String AAE426_CODE_2 = "2"; // 不予立案
	public static final String AAE426_CODE_3 = "3"; // 立案待查
	public static final String AAE426_CODE_4 = "4"; // 已结案
	public static final String AAE426_CODE_5 = "5"; // 案件撤销
	public static final String AAE426_CODE_6 = "6"; // 立案待审批
	public static final String AAE426_CODE_7 = "7"; // 案件调查完成
	public static final String AAE426_CODE_8 = "8"; // 结论待确认
	public static final String AAE426_CODE_9 = "9"; // 结论待审批
	public static final String AAE426_CODE_10 = "10"; // 结论审批完成
	
	/**
	 * 不予处理标志APA154
	 */
	public static final String APA154_CODE_0 = "0"; // 不予处理
	public static final String APA154_CODE_1 = "1"; // 需处理
	
	/**
	 *经办处理处罚 apa156
	 */
	public static final String APA156_CODE_0 = "0"; //不予经办处理
	public static final String APA156_CODE_1 = "1"; //经办处理处罚
	
	/**
	 *司法处理 apa158
	 */
	public static final String APA158_CODE_0 = "0"; //不予司法处理
	public static final String APA158_CODE_1 = "1"; //移交司法处理
	
	/**
	 *冻结社会保障卡就医标识 apa162
	 */
	public static final String APA162_CODE_0 = "0";//不冻结社保卡就医
	public static final String APA162_CODE_1 = "1";//冻结社保卡就医
	
	/**
	 *暂停个人医保待遇标志 apa163
	 */
	public static final String APA163_CODE_0 = "0";//不暂停个人医保待遇
	public static final String APA163_CODE_1 = "1";//暂停个人医保待遇
	
	/**
	 *停止医疗服务资格标志 apa161
	 */
	public static final String APA161_CODE_0 = "0";//不停止医疗服务资格
	public static final String APA161_CODE_1 = "1";//停止医疗服务资格
	
	/**
	 *纳入重点监控标识 apa157
	 */
	public static final String APA157_CODE_0 = "0";//不纳入重点监控
	public static final String APA157_CODE_1 = "1";//纳入重点监控
	
	/**
	 * 结案标志APA014
	 */
	public static final String APA014_CODE_0 = "0"; // 未结案
	public static final String APA014_CODE_1 = "1"; // 执行完成
	
	/**
	 *立案确认状态 APA011 
	 */
	public static final String APA011_CODE_0 = "0"; //待确认
	public static final String APA011_CODE_1 = "1"; //确认通过
	public static final String APA011_CODE_2 = "2"; //调查重审
	public static final String APA011_CODE_3 = "3"; //确认待审批
	
	/**
	 *监控对象类型 APA709 
	 */
	public static final String APA709_CODE_1 = "1"; //参保人
	public static final String APA709_CODE_2 = "2"; //医师
	public static final String APA709_CODE_3 = "3"; //医疗服务机构
	public static final String APA709_CODE_4 = "4"; //人员
	public static final String APA709_CODE_5 = "5"; //单位
	/**
	 *疑点问题受理方式 APA703
	 */
	public static final String APA703_CODE_1 = "1"; //系统监控
	public static final String APA703_CODE_2 = "2"; //举报
	public static final String APA703_CODE_3 = "3"; //投诉
	public static final String APA703_CODE_4 = "4"; //转办
	public static final String APA703_CODE_5 = "5"; //交办
	public static final String APA703_CODE_6 = "6"; //主动稽核
	/**
	 *信息来源方类型 APA704
	 */
	public static final String APA704_CODE_11 = "11"; //参保人员
	public static final String APA704_CODE_12 = "12"; //医护人员
	public static final String APA704_CODE_13 = "13"; //其他自然人
	public static final String APA704_CODE_21 = "21"; //稽核部门
	public static final String APA704_CODE_22 = "22"; //本单位其他部门
	public static final String APA704_CODE_23 = "23"; //外部单位
	public static final String APA704_CODE_31 = "31"; //医疗服务机构
	
	/**
	 *信息来源方式 APA705
	 */
	public static final String APA705_CODE_1 = "1"; //监控
	public static final String APA705_CODE_2 = "2"; //来电
	public static final String APA705_CODE_3 = "3"; //来信
	public static final String APA705_CODE_4 = "4"; //来访
	public static final String APA705_CODE_5 = "5"; //来文
	public static final String APA705_CODE_6 = "6"; //主动稽核
	public static final String APA705_CODE_7 = "7"; //网络
	public static final String APA705_CODE_8 = "8"; //分析
	
	/**
	 *问题关闭标志 APA166 
	 */
	public static final String APA166_CODE_0 = "0"; //未关闭
	public static final String APA166_CODE_1 = "1"; //已关闭
	
	/**
	 *列表状态 stat 
	 */
	public static final String state_add = "added"; //新增
	public static final String state_mod = "modified"; //修改
	public static final String state_del = "removed"; //删除
	
	/**
	 *稽核问题类型APA701
	 */
	public static final String APA701_CODE_01 = "01"; //频繁就医
	public static final String APA701_CODE_02 = "02"; //超高费用
	public static final String APA701_CODE_03 = "03"; //超量用药
	public static final String APA701_CODE_04 = "04"; //过度诊疗
	public static final String APA701_CODE_05 = "05"; //重复诊疗
	public static final String APA701_CODE_06 = "06"; //重复用药
	public static final String APA701_CODE_07 = "07"; //不合理用药
	public static final String APA701_CODE_08 = "08"; //不合理入院
	public static final String APA701_CODE_09 = "09"; //冒名就医
	public static final String APA701_CODE_10 = "10"; //虚假费用
	
	/**
	 *案件来源ABB006
	 */
	public static final String ABB006_CODE_1 = "1"; //系统监控
	public static final String ABB006_CODE_2 = "2"; //外部受理
	public static final String ABB006_CODE_3 = "3"; //主动稽核
	
	/***
	 *是否发单 apa702
	 */
	public static final String APA702_CODE_0 = "0"; //未发单
	public static final String APA702_CODE_1 = "1";//已发单
	
	/***
	 *稽核结论类型 apa005
	 */
	public static final String APA005_CODE_01 = "01"; //當事人排除
	public static final String APA005_CODE_02 = "02"; //案件撤銷
	public static final String APA005_CODE_10 = "10"; //違約行為
	public static final String APA005_CODE_20 = "20"; //違規行為
	public static final String APA005_CODE_30 = "30"; //有觸犯法律嫌疑
	
	/**
	 * 监控等级 apa151
	 */
	public static final String APA151_CODE_1 = "1";//黑名单
	public static final String APA151_CODE_2 = "2";//灰名单
	
	/**
	 *告知终结标志 aae425
	 */
	public static final String AAE425_CODE_0 = "0";//尚未传达
	public static final String AAE425_CODE_1 = "1";//部分传达
	public static final String AAE425_CODE_2 = "2";//已传达
	
	/**
	 *有效标志 aae100
	 */
	public static final String AAE100_CODE_0 = "0";//无效
	public static final String AAE100_CODE_1 = "1";//有效
	
	/**
	 * 核查任务状态 ape140
	 * */
	public static final String APE140_CODE_1 = "1";//待审核
	public static final String APE140_CODE_2 = "2";//审核通过
	public static final String APE140_CODE_3 = "3";//审核不通过
	public static final String APE140_CODE_4 = "4";//已受理
	public static final String APE140_CODE_5 = "5";//完成
	
	public static final String DCBZ_CODE_0 = "0";//为未调查
	public static final String DCBZ_CODE_1 = "1";//调查完成
	
	public static final String JLBZ_CODE_0 = "0";//结论登记
	public static final String JLBZ_CODE_1 = "1";//结论登记待确认
	
	public static final String WTSC_CODE_0 = "0";// 未删除
	public static final String WTSC_CODE_1 = "1";//已删除
	
}
