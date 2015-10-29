package com.wondersgroup.bc.k2;

public interface K2Context {
	/**
	 *审核状态 BAZ031
	 */
	public static final String BAZ031_CODE_01 = "01"; //正常
	public static final String BAZ031_CODE_02 = "02"; //扣款
	public static final String BAZ031_CODE_03 = "03"; //有嫌疑
	public static final String BAZ031_CODE_04 = "04"; //待申诉
	public static final String BAZ031_CODE_05 = "05"; //人工初审
	public static final String BAZ031_CODE_06 = "06"; //已扣款
	public static final String BAZ031_CODE_11 = "11"; //待申诉
	public static final String BAZ031_CODE_12 = "12"; //待审核
	public static final String BAZ031_CODE_13 = "13"; //放弃申诉
	public static final String BAZ031_CODE_14 = "14"; //申诉过期
	public static final String BAZ031_CODE_15 = "15"; //审核通过
	public static final String BAZ031_CODE_16 = "16"; //审核不通过
	
	/**
	 * 智能审核结果BAZ021
	 */
	public static final String BAZ021_CODE_01 = "01"; //正常
	public static final String BAZ021_CODE_02 = "02"; //扣款
	public static final String BAZ021_CODE_03 = "03"; //有嫌疑
	public static final String BAZ021_CODE_04 = "04"; //人工初审
	
	/**
	 *审核类型 BAZ024
	 */
	public static final String BAZ025_CODE_1 = "1"; //系统审核
	public static final String BAZ025_CODE_2 = "2"; //人工审核
	
	/**
	 *违规标志 BAZ032
	 */
	public static final String BAZ032_CODE_0 = "0"; //正常
	public static final String BAZ032_CODE_1 = "1"; //违规
	
	/**
	 *计划状态BAZ045
	 */
	public static final String BAZ045_CODE_0 = "0"; //未生成
	public static final String BAZ045_CODE_1 = "1"; //已生成
	
	/**
	 * 有效标志AAE100
	 */
	public static final String AAE100_CODE_0 = "0";  //无效
	public static final String AAE100_CODE_1 = "1"; //有效
	
	/**
	 * 申诉状态BAZ101
	 */
	public static final String BAZ101_CODE_1= "1"; //待申诉
	public static final String BAZ101_CODE_2 = "2"; //待医师申诉
	public static final String BAZ101_CODE_3 = "3"; //待医保办审核
	
	/**
	 * 复议状态BAZ102
	 */
	
	public static final String BAZ102_CODE_0 = "0"; //未复议
	public static final String BAZ102_CODE_1 = "1"; //复议待审核
	public static final String BAZ102_CODE_2 = "2"; //复议通过
	public static final String BAZ102_CODE_3 = "3"; //复议不通过
	public static final String BAZ102_CODE_4 = "4"; //待医师复议申请
	public static final String BAZ102_CODE_5 = "5"; //待医保办审核
	
}
