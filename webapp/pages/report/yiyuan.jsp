<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<%@page import="java.util.*,java.text.SimpleDateFormat"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医疗服务机构报告</title>
		<%
			String sss = request.getParameter("yydm");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = new Date();
			String max_date = sdf.format(d);
			String beg_time = sdf.format(d).substring(0, 8) + "01";
		%>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/report_highcharts.js"></script>
		<script type="text/javascript" 
		    src="${pageContext.request.contextPath}/resource/highcharts/highcharts-more.js"></script>	
	</head>
	<style>
.chartTitle1 {
	background-color: #38bcbc;
	height: 30px;
	text-align: center;
}

.warp {
	width: 960px;
	background-color: #edf3f3;
	margin-left: auto;
	margin-right: auto;
	overflow: hidden;
}

.top_box3 {
	height: 180px;
	width: 940px;
	margin-left: auto;
	margin-right: auto;
	padding-top: 10px;
}

.top_box2 {
	height: 170px;
	width: 940px;
	margin-left: auto;
	margin-right: auto;
	padding-top: 10px;
}

.bottom_box {
	width: 940px;
	margin-left: auto;
	margin-right: auto;
	padding-top: 10px;
	height: 540px;
}

.zhaopian {
	width: 150px;
	height: 171px;
	float: left;
	display: inline;
	margin-left: 10px;
}

.top_center {
	width: 380px;
	float: left;
	display: inline;
	margin-left: 30px;
}

.top_center2 {
	width: 510px;
	float: left;
	display: inline;
	margin-left: 10px;
}

.top_name {
	line-height: 35px;
	font-size: 24px;
	color: #4584c8;
	border-bottom: 2px solid #bfbfbf;
	font-weight: bold;
}

.top_name_fontsize {
	font-size: 24px !important;
	font-weight: bold;
	font-family: "微软雅黑";
}

.top_jj {
	line-height: 25px;
	overflow: hidden;
	margin-top: 5px;
}

.top_list {
	overflow: hidden;
	margin-top: 5px;
}

.top_list2 {
	overflow: hidden;
	margin-top: 5px;
}

.top_list2 ul li {
	font-size: 12px;
	line-height: 25px;
	float: left;
	display: inline;
}

.top_list2 ul li.ll2 {
	width: 100px;
	overflow: hidden;
}

.top_list2 ul li.lr2 {
	width: 140px;
	overflow: hidden;
}

.top_list ul li.ll {
	width: 80px;
	overflow: hidden;
}

.top_list ul li.lr {
	width: 280px;
	overflow: hidden;
}

.top_list ul li {
	font-size: 12px;
	line-height: 25px;
	float: left;
	display: inline;
}

.top_right {
	width: 320px;
	float: left;
	display: inline;
	margin-left: 50px;
	font-size: 14px;
	color: #34466d;
}

.top_right2 {
	width: 350px;
	float: left;
	display: inline;
	margin-left: 15px;
	font-size: 14px;
	color: #34466d;
}

.top_right ul li {
	height: 38px;
	overflow: hidden;
	line-height: 38px;
	font-size: 14px;
	color: #34466d;
}

.top_right ul li.h50 {
	height: 75px;
	overflow: hidden;
	line-height: 30px;
	padding-top: 10px;
	font-size: 14px;
	color: #34466d;
}

.f24 {
	font-size: 28px !important;
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
	color: #ffad1f;
}

.f20 {
	font-size: 20px !important;
	font-weight: bold;
	color: #4584bf;
}

.top_right2 ul li.h60 {
	height: 115px;
	overflow: hidden;
	line-height: 30px;
	padding-top: 10px;
	font-size: 14px;
	color: #34466d;
}

.top_right2 ul li {
	height: 38px;
	overflow: hidden;
	line-height: 38px;
	font-size: 14px;
	color: #34466d;
}
</style>
	<body>

		<div class="warp">
			<div style="margin: 30px;">
				<div class="top_box2">
					<input id="yydm" name="yydm" class="mini-hidden" />
					<div class="top_center2">
						<div class="top_name">
							<label id="yymc" class="top_name_fontsize"></label>
						</div>
						<div class="top_jj">
							医院等级&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="yydj"></label>
						</div>
						<div class="top_list2">
							<ul>
								<li class="ll2">
									医院类型
								</li>
								<li class="lr2">
									<label id="yylx"></label>
								</li>
								<li class="ll2">
									医院性质
								</li>
								<li class="lr2">
									<label id="yyxz"></label>
								</li>
								<li class="ll2">
									科室数
								</li>
								<li class="lr2">
									<label id="kssl"></label>
								</li>
								<li class="ll2">
									所属区域
								</li>
								<li class="lr2">
									<label id="ssqy"></label>
								</li>
								<li class="ll2">
									医师数量
								</li>
								<li class="lr2">
									<label id="yssl"></label>
								</li>
								<li class="ll2">
									联系人
								</li>
								<li class="lr2">
									<label id="lxrmc"></label>
								</li>
								<li class="ll2">
									医院地址
								</li>
								<li class="lr2">
									<label id="yydz"></label>
								</li>
								<li class="ll2">
									联系人电话
								</li>
								<li class="lr2">
									<label id="lxdh"></label>
								</li>
							</ul>
						</div>
					</div>
					<div class="top_right2">
						<ul>
							<li class="h60">
								门诊特殊病种范围
								<br />
								<span><label id="mjztsbzfw" class="f20">
										冠心病、肾透析、肾移植术后、帕金森病、类风湿关节炎、糖尿病、肝硬化
									</label> </span>&nbsp;&nbsp;
							</li>
							<li>
								今年累计违规处罚
								<span><label id="ljfkcs" class="f24">
										255
									</label> </span>次，共
								<span><label id="ljfkje" class="f24">
										0
									</label> </span>元
							</li>
						</ul>
					</div>

				</div>
				<div class="bottom_box">
					<div id="detail_tabs" class="mini-tabs" activeIndex="0"
						style="height: 500px; width: 900px;">

						<div title="科室信息" style="height: 480px; width: 938px;">
							<div class="box_nei_top">
								<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
									style="margin-top: 5px">
									<tr>
										<td class="textR" width="90">
											统计时间
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="tjsjt11" name="tjsjt11" class="mini-datepicker"
															format="yyyy-MM-dd" value="<%=beg_time%>"
															onvaluechanged="valuechanged1" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											至
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="tjsjt12" name="tjsjt12" class="mini-datepicker"
															format="yyyy-MM-dd" value="<%=max_date%>"
															onvaluechanged="valuechanged1" />
													</div>
												</div>
											</div>
										</td>
									</tr>
								</table>
								<div class="kuang1"
									style="float: left; width: 435px; padding-left: 10px; height: 438px;">
									<table border="0" cellpadding="0" cellspacing="0"
										height="220px" width="435px">
										<tr>
											<td class="chartTitle1">
												各科室备案医师数量
											</td>
										</tr>
										<tr>
											<td id="YsslChart" style="height: 380px"></td>
										</tr>
									</table>
								</div>
								<div style="width: 10px; float: left; height: 238px;"></div>
								<div class="kuang2"
									style="width: 435px; float: left; padding-right: 10px; height: 438px;">
									<table border="0" cellpadding="0" cellspacing="0"
										height="220px" width="435px">
										<tr>
											<td class="chartTitle1">
												各科室累计接诊数量
											</td>
										</tr>
										<tr>
											<td id="JzslChart" style="height: 380px"></td>
										</tr>
									</table>
								</div>
							</div>
						</div>

						<div title="就诊结算统计" style="height: 480px; width: 938px;">
							<div class="box_nei_top">
								<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
									style="margin-top: 5px">
									<tr>
										<td class="textR" width="90">
											统计时间
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="tjsjt21" name="tjsjt21" class="mini-datepicker"
															format="yyyy-MM-dd" value="<%=beg_time%>"
															onvaluechanged="valuechanged2" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											至
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="tjsjt22" name="tjsjt22" class="mini-datepicker"
															format="yyyy-MM-dd" value="<%=max_date%>"
															onvaluechanged="valuechanged2" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											就诊类型
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="jzlx2" name="jzlx2" class="mini-combobox"
															emptyText="选择就诊类型..." data="${dic['AKA130']}"
															onvaluechanged="valuechanged2" />
													</div>
												</div>
											</div>
										</td>
									</tr>
								</table>
							</div>
							<div class="kuang"
								style="width: 100%; margin-left: auto; margin-right: auto; height: 238px;">
								<table border="0" cellpadding="0" cellspacing="0" height="220px"
									width="880px"
									style="background:url(${pageContext.servletContext.contextPath}/images/03_03_240.png) no-repeat">
									<tr>
										<td id="feeItemsConstituentChart" width="33%"></td>
										<td id="fundSourceConsituentChart" width="33%"></td>
										<td id="otherIndicatorsChart" width="34%"></td>
									</tr>
								</table>
							</div>
							<div class="kuang2"
								style="width: 100%; margin-left: auto; margin-right: auto; height: 238px;">
								<table border="0" cellpadding="0" cellspacing="0" height="220px"
									width="880px">
									<tr>
										<td colspan="5" class="chartTitle1">
											当年接诊按月分布
										</td>
									</tr>
									<tr>
										<td id="currentYearMonthlyDistribution" colspan="5"
											style="height: 180px"></td>
									</tr>
								</table>
							</div>

						</div>

						<div title="医师备案">

						</div>

						<div title="特病备案">
							<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
								style="margin-top: 5px; width: 60%">
								<tr>
									<td class="textR" width="90">
										统计时间
									</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt51" name="tjsjt51" class="mini-datepicker"
														format="yyyy-MM-dd" value="<%=beg_time%>"
														onvaluechanged="valuechanged5" />
												</div>
											</div>
										</div>
									</td>
									<td class="textR">
										至
									</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt52" name="tjsjt52" class="mini-datepicker"
														format="yyyy-MM-dd" value="<%=max_date%>"
														onvaluechanged="valuechanged5" />
												</div>
											</div>
										</div>
									</td>
								</tr>
							</table>
							<div class="listTit">
								<h3 class="cxTit fL">
									<span class="iconCx">特备病案信息列表</span>
								</h3>
							</div>
							<div id="tbbagrid" class="mini-datagrid"
								style="width: 100%; height: 360px;" idField="id"
								multiSelect="true" allowResize="false" pageSize="20" url="#">
								<div property="columns">
									<div field="mc" width="100" headerAlign="center">
										备案日期
									</div>
									<div field="gzdm" width="100" headerAlign="center">
										开始时间
									</div>
									<div field="gzms" width="100" headerAlign="center">
										结束时间
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										备案科室
									</div>
									<div field="cjsj" width="100" headerAlign="center">
										特殊病种名称
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										治疗方案
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										经办人员
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										经办机构
									</div>
								</div>
							</div>

						</div>

						<div title="疑点信息">
							<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
								style="margin-top: 5px; width: 60%">
								<tr>
									<td class="textR" width="90">
										统计时间
									</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt51" name="tjsjt51" class="mini-datepicker"
														format="yyyy-MM-dd" value="<%=beg_time%>"
														onvaluechanged="valuechanged5" />
												</div>
											</div>
										</div>
									</td>
									<td class="textR">
										至
									</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt52" name="tjsjt52" class="mini-datepicker"
														format="yyyy-MM-dd" value="<%=max_date%>"
														onvaluechanged="valuechanged5" />
												</div>
											</div>
										</div>
									</td>
								</tr>
							</table>
							<div class="listTit">
								<h3 class="cxTit fL">
									<span class="iconCx">疑点信息列表</span>
								</h3>
							</div>
							<div id="ydxxgrid" class="mini-datagrid"
								style="width: 100%; height: 360px;" idField="id"
								multiSelect="true" allowResize="false" pageSize="20"
								url="${pageContext.request.contextPath}/report/yiyuan/queryYdxxGrid.action">
								<div property="columns">
									<div field="fyfssj" width="100" headerAlign="center"
										dateFormat="yyyy-MM-dd">
										费用发生日期
									</div>
									<div field="cbrbm" width="100" headerAlign="center">
										参保人编码
									</div>
									<div field="xm" width="100" headerAlign="center">
										姓名
									</div>
									<div field="sfz" width="100" headerAlign="center">
										身份证号
									</div>
									<div field="xb" width="100" headerAlign="center"
										type="comboboxcolumn">
										性别
										<input property="editor" class="mini-combobox"
											style="width: 100%" data="${dic['AAC004']}">
									</div>
									<div field="age" width="100" headerAlign="center">
										年龄
									</div>
									<div field="jzyy" width="100" headerAlign="center">
										就诊医院
									</div>
									<div field="jzlx" width="100" headerAlign="center"
										type="comboboxcolumn">
										就诊类型
										<input property="editor" class="mini-combobox"
											style="width: 100%" data="${dic['AKA130']}">
									</div>
									<div field="fyje" width="100" headerAlign="center">
										费用金额
									</div>
									<div field="wgyy" width="100" headerAlign="center">
										违规原因
									</div>
									<div field="wglx" width="100" headerAlign="center"
										type="comboboxcolumn">
										违规类型
										<input property="editor" class="mini-combobox"
											style="width: 100%" data="${dic['AAA153']}">
									</div>
								</div>
							</div>

						</div>

						<div title="历史违规记录">
							<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
								style="margin-top: 5px; width: 60%">
								<tr>
									<td class="textR" width="90">
										费用发生时间
									</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt61" name="tjsjt61" class="mini-datepicker"
														format="yyyy-MM-dd" value="<%=beg_time%>"
														onvaluechanged="valuechanged6" />
												</div>
											</div>
										</div>
									</td>
									<td class="textR">
										至
									</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt62" name="tjsjt62" class="mini-datepicker"
														format="yyyy-MM-dd" value="<%=max_date%>"
														onvaluechanged="valuechanged6" />
												</div>
											</div>
										</div>
									</td>
								</tr>
							</table>
							<div class="listTit">
								<h3 class="cxTit fL">
									<span class="iconCx">历史违规信息列表</span>
								</h3>
							</div>
							<div id="lswggrid" class="mini-datagrid"
								style="width: 100%; height: 360px;" idField="id"
								multiSelect="true" allowResize="false" pageSize="20"
								url="${pageContext.request.contextPath}/report/yiyuan/queryLswgGrid.action">
								<div property="columns">
									<div field="fyfssj" width="100" headerAlign="center"
										dateFormat="yyyy-MM-dd">
										费用发生日期
									</div>
									<div field="jzbh" width="100" headerAlign="center">
										就诊编号
									</div>
									<div field="jzlx" width="100" headerAlign="center">
										就诊类型
									</div>
									<div field="ybh" width="100" headerAlign="center">
										医保号
									</div>
									<div field="xm" width="100" headerAlign="center">
										姓名
									</div>
									<div field="wgyy" width="100" headerAlign="center">
										违规原因
									</div>
									<div field="cfjg" width="100" headerAlign="center">
										处罚结果
									</div>
									<div field="cfje" width="100" headerAlign="center">
										处罚金额
									</div>
									<div field="jbr" width="100" headerAlign="center">
										经办人员
									</div>
									<div field="jbrq" width="100" headerAlign="center"
										dateFormat="yyyy-MM-dd">
										经办日期
									</div>
									<div field="clyj" width="100" headerAlign="center">
										处理意见
									</div>
								</div>
							</div>


						</div>

						<div title="月度测算情况">
							<form id="form1" action="#">
								<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
									style="margin-top: 5px; width: 60%">
									<tr>
										<td class="textR" width="90">
											统计时间
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="aaa178" name="aaa178" class="mini-datepicker"
															format="yyyy-MM-dd" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											至
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="aaa178" name="aaa178" class="mini-datepicker"
															format="yyyy-MM-dd" />

													</div>
												</div>
											</div>
										</td>
									</tr>
								</table>
							</form>
							<div class="listTit">
								<h3 class="cxTit fL">
									<span class="iconCx">结算指标信息</span>
								</h3>
							</div>
							<div id="ydcsgrid" class="mini-datagrid"
								style="width: 100%; height: 360px;" idField="id"
								multiSelect="true" allowResize="false" pageSize="20" url="#">
								<div property="columns">
									<div field="mc" width="100" headerAlign="center">
										结算年月
									</div>
									<div field="gzms" width="100" headerAlign="center">
										就诊类型
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										结算类别
									</div>
									<div field="cjsj" width="100" headerAlign="center">
										审核前费用合计
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										审核前人次或床日
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										定额标准
									</div>
									<div field="cjrmc" width="100" headerAlign="center">
										结算金额
									</div>
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
		</div>

		<script type="text/javascript">
	
		mini.parse();
			var yydm =<%=sss%>;
			var queryParams = {
				yydm : yydm,
			//	tjsjt1 : mini.get("tjsjt11").getFormValue(),
			//	tjsjt2 : mini.get("tjsjt12").getFormValue(),
			};
			showYsslChart(queryParams);
	
//		var yydm='${param.yydm}';
//		mini.get("yydm").setValue(yydm);
//		var y = mini.get("yydm").getValue();
//  	var grids = mini.get("ydxxgrid");
//		grids.load({"yydm": y});


$.ajax({
					url : "${pageContext.request.contextPath}/report/yiyuan/yiyuaninfo.action",
					type : "post",
					data : {
						yydm : yydm
					},
					success : function(text) {
						$("#yymc").html(text.yymc);
						$("#yydj").html(text.yydj);
						$("#yylx").html(text.yylx);
						$("#yssl").html(text.yssl);
						$("#kssl").html(text.kssl);
						$("#yydz").html(text.yydz);
						$("#yyxz").html(text.yyxz);
						$("#ssqy").html(text.ssqy);
						$("#lxrmc").html(text.lxrmc);
						$("#lxdh").html(text.lxdh);
					}
				});
				
	//tab页1的js查询
	function valuechanged1() {
			var queryParams = {
				yydm : yydm,
				tjsjt1 : mini.get("tjsjt11").getFormValue(),
				tjsjt2 : mini.get("tjsjt12").getFormValue(),
			};
		//	showYsslChart(queryParams);
			showJzslChart(queryParams);
		}
	//tab页2的js查询
	function valuechanged2() {
			var queryParams = {
				yydm : yydm,
				jzlx : mini.get("jzlx2").getValue(),
				tjsjt1 : mini.get("tjsjt21").getFormValue(),
				tjsjt2 : mini.get("tjsjt22").getFormValue()
			};
			showFeeItemsConstituentChart(queryParams);
			showFundSourceConsituentChart(queryParams);
			showOtherIndicatorsChart(queryParams);
			showCurrentYearMonthlyDistributionChart(queryParams);
		}
  function valuechanged5() {
			var queryParams = {
				yydm : yydm,
				tjsjt1 : mini.get("tjsjt51").getFormValue(),
				tjsjt2 : mini.get("tjsjt52").getFormValue(),
			};
			var grid = mini.get("ydxxgrid");
			grid.load(queryParams);
		}
		
	function valuechanged6() {
			var queryParams = {
				yydm : yydm,
				tjsjt1 : mini.get("tjsjt61").getFormValue(),
				tjsjt2 : mini.get("tjsjt62").getFormValue()
			};
			var grid = mini.get("lswggrid");
			grid.load(queryParams);
		}
		//费用项目构成 饼图
		function showFeeItemsConstituentChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yiyuan/getFeeItemsConstituentDataYiyuan.action";
			getChatData(url, queryParams, function(data) {
				showPieChartReoprt('feeItemsConstituentChart', '费用项目构成', data);
			});
		}
		//资金来源构成 饼图
		function showFundSourceConsituentChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yiyuan/getFundSourceConsituentDataYiyuan.action";
			getChatData(url, queryParams,
					function(data) {
						showPieChartReoprt('fundSourceConsituentChart',
								'资金来源构成', data);
					});
		}
		//其它指标  线状图 
	
		function showOtherIndicatorsChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yiyuan/getOtherIndicatorsDataYiyuan.action";
			getChatData(url, queryParams, function(data) {
				showBarChartReoprt('otherIndicatorsChart', '其它指标', data[0],
						data[1]);
			});
		}
		//当年接诊按月分布 
	function showCurrentYearMonthlyDistributionChart(queryParams) {
	      var url = "${pageContext.request.contextPath}/report/yiyuan/getCurrentYearMonthlyDistributionDataYiyuan.action";
		      getChatData(url, queryParams, function(data) {
				var datas = [{name:'接诊人数', data: data[1],color: 'rgb(150,214,17)'}, {name:'费用发生率', data: data[2],color: 'rgb(250,159,52)'}, {name:'月度支出额', data: data[3],color: 'rgb(85,199,235)'}];
				showLineChartReoprt("currentYearMonthlyDistribution", " ", data[0], datas);
			});
		}
			
		//医院下的科室和医护人员人数 
		function showYsslChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yiyuan/getYsslDataYiyuan.action";
			getChatData(url, queryParams, function(data) {
				var datas = [{type: 'area', name: '单位：人', data: data[1]}];
				showPolarChartReoprt('YsslChart', ' ', data[0], datas);
			});
	}	
		
	  //医院下的科室和累计就就诊人数 
		function showJzslChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yiyuan/getJzslDataYiyuan.action";
			getChatData(url, queryParams, function(data) {
			 var datas = [{type: 'area', name: '单位：人次', data: data[1],color: 'rgb(150,214,17)'}];
				showPolarChartReoprt('JzslChart', ' ', data[0], datas);
			});
		}
		function getChatData(url, params, callback) {
			$.ajax({
				url : url,
				type : "post",
				data : params,
				success : function(text) {
					callback(text);
				}
			});

		}
		</script>
	</body>
</html>
