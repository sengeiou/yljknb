<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<%@page import="java.util.*,java.text.SimpleDateFormat"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医师报告</title>
<%
	String sss = request.getParameter("ysgh");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdfmonth = new SimpleDateFormat("yyyy-MM");
	Date d = new Date();
	String max_date = sdf.format(d);
	String beg_time = sdf.format(d).substring(0, 8) + "01";
	String month_date = sdfmonth.format(d);
%>
<%@ include file="../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/report_highcharts.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/jquery.widget.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/jquery.mCustomScrollbar.min.js"></script>
<link
	href="${pageContext.request.contextPath}/resource/css/jquery.mCustomScrollbar.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resource/css/ui.icon.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/resource/css/ui.widget.css"
	rel="stylesheet" type="text/css" />
</head>
<style>
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

.top_name {
	line-height: 35px;
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

.box_nei_top {
	width: 875px;
	height: 35px;
	line-height: 35px;
	padding-left: 25px;
}

.chartTitle1 {
	height: 50px;
	width: 440px;
	text-align: center;
}

.chartTitle2 {
	height: 50px;
	width: 440px;
	text-align: center;
}

.chartTitle3 {
	height: 35px;
	text-align: center;
}

.chartTitle4 {
	height: 35px;
	text-align: center;
}

.kuang {
	width: 100%;
	overflow: hidden;
	min-height: 100px;
}
</style>
<body>
	<div class="warp">
		<div style="margin: 30px;">
			<div class="top_box3">
				<div class="zhaopian">
					<img width="150" height="171" id="gerenImg" />
				</div>
				<div class="top_center">
					<div class="top_name">
						<label id="xm" class="top_name_fontsize"></label>
					</div>
					<div class="top_jj">
						<label id="xx"></label>
					</div>
					<div class="top_list">
						<ul>
							<li class="ll">身份证</li>
							<li class="lr"><label id="sfzh"></label>
							</li>
							<li class="ll">医师资格证</li>
							<li class="lr"><label id="yszgz"></label>
							</li>
							<li class="ll">行政职务</li>
							<li class="lr"><label id="xzzw"></label>
							</li>
						</ul>
					</div>
				</div>
				<div class="top_right">
					<ul>
						<li>今年累计接诊量<label id="jnljjzl" class="f24"></label>人次&nbsp;&nbsp;</li>
						<li>排在&nbsp;&nbsp;<span><label id="ljjzlbfb"
								class="f24"></label> </span>&nbsp;&nbsp;的医师前面</li>
						<li>今年日均接诊&nbsp;&nbsp;&nbsp;&nbsp;<span><label
								id="jnrjjz" class="f24"></label> </span>&nbsp;&nbsp;人次</li>
						<li>今年日均发生费用&nbsp;&nbsp;&nbsp;&nbsp;<span><label
								id="jnrjfsfy" class="f24"></label> </span>&nbsp;&nbsp;万元</li>
						<li>今年累计违规处罚&nbsp;&nbsp;<span><label id="jnljwgcf"
								class="f24"></label> </span>&nbsp;&nbsp;次，共&nbsp;&nbsp;<span><label
								id="wgje" class="f24"></label> </span>&nbsp;&nbsp;元</li>
					</ul>
				</div>

			</div>
			<div class="bottom_box">
				<div id="detail_tabs" class="mini-tabs" activeIndex="0"
					style="height: 450px; width:900px ;" onactivechanged="gerenTabs">

					<div title="就诊时间轴">
						<div id='yishisjz' style=" margin-left:20px; "></div>
					</div>

					<div title="接诊统计">
						<div class="box_nei_top">
							<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
								style="margin-top: 5px">
								<tr>
									<td class="textR" width="90">统计时间</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt21" name="tjsjt21" class="mini-datepicker"
														value="<%=month_date%>" onvaluechanged="valuechanged2" />
												</div>
											</div>
										</div></td>
									<td class="textR">至</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt22" name="tjsjt22" class="mini-datepicker"
														value="<%=month_date%>" onvaluechanged="valuechanged2" />
												</div>
											</div>
										</div></td>
									<td class="textR">就诊类型</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="jzlx2" name="jzlx2" class="mini-combobox"
														emptyText="选择就诊类型..." data="${dic['AKA130']}"
														onvaluechanged="valuechanged2" />
												</div>
											</div>
										</div></td>
								</tr>
							</table>
						</div>
						<div class="kuang"
							style="width:100%; margin-left:auto; margin-right:auto;height: 438px; ">
							<table border="0" cellpadding="0" cellspacing="0" height="420px"
								width="880px"
								style="background:url(${pageContext.servletContext.contextPath}/images/03_03_420.png) no-repeat">
								<tr style="height:230px">
									<td id="feeItemsConstituentChart" width="50%"></td>
									<td id="fundSourceConsituentChart" width="50%"></td>
								</tr>
								<tr style="height:190px">
									<td id="workloadStatisticsChart" width="50%"></td>
									<td id="feeStatisticsChart" width="50%"></td>
								</tr>
							</table>
						</div>
					</div>

					<div title="接诊排行">
						<div class="box_nei_top">
							<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
								style="margin-top: 5px">
								<tr>
									<td class="textR" width="90">统计时间</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt31" name="tjsjt31" class="mini-monthpicker"
														value="<%=month_date%>" onvaluechanged="valuechanged3" />
												</div>
											</div>
										</div></td>
									<td class="textR">至</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="tjsjt32" name="tjsjt32" class="mini-monthpicker"
														value="<%=month_date%>" onvaluechanged="valuechanged3" />
												</div>
											</div>
										</div></td>
									<td class="textR">就诊类型</td>
									<td>
										<div class="inputL" style="width: 130px">
											<div class="inputR">
												<div class="inputC">
													<input id="jzlx3" name="jzlx3" class="mini-combobox"
														emptyText="选择就诊类型..." data="${dic['AKA130']}"
														onvaluechanged="valuechanged3" />
												</div>
											</div>
										</div></td>
								</tr>
							</table>
						</div>
						<div style="width:96%; margin-left:auto; margin-right:auto;">
							<table width="880px" height="410px" border="0" cellpadding="0"
								cellspacing="0">
								<tr>
									<td class="chartTitle1"
										style="background:url(${pageContext.servletContext.contextPath}/images/02_12_2.png) no-repeat">接诊次数TOP10</td>

									<td class="chartTitle2"
										style="background:url(${pageContext.servletContext.contextPath}/images/02_14_1.png) no-repeat">医保范围内总额TOP10</td>
								</tr>
								<tr>
									<td id="frequencyTop10Chart"
										style="background:url(${pageContext.servletContext.contextPath}/images/02_12_3_375.png) no-repeat; height:380px; padding-top:0px;"></td>

									<td id="feeTop10Chart"
										style="background:url(${pageContext.servletContext.contextPath}/images/02_12_3_375.png) no-repeat; height:380px; padding-top:0px;"></td>
								</tr>
							</table>
						</div>
					</div>

					<div title="费用明细信息">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
							style="margin-top: 5px">
							<tr>
								<td class="textR" width="90">统计时间</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjsjt41" name="tjsjt41" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=beg_time%>"
													onvaluechanged="valuechanged4" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">至</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjsjt42" name="tjsjt42" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=max_date%>"
													onvaluechanged="valuechanged4" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">就诊类型</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="jzlx4" name="jzlx4" class="mini-combobox"
													emptyText="选择就诊类型..." data="${dic['AKA130']}"
													onvaluechanged="valuechanged4" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">费用</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="fylb4" name="fylb4" class="mini-combobox"
													emptyText="选择费用类别..." data="${dic['AKA063']}"
													onvaluechanged="valuechanged4" />
											</div>
										</div>
									</div>
								</td>
							</tr>
						</table>
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">费用明细</span>
							</h3>
						</div>
						<div id="fymxgrid" class="mini-datagrid"
							style="width: 100%; height: 355px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20"
							url="${pageContext.request.contextPath}/report/yishi/queryFymxGrid.action">
							<div property="columns">
								<div field="xmmc" width="100" headerAlign="center">项目名称</div>
								<div field="fsje" width="100" headerAlign="center">发生金额</div>
								<div field="cfts" width="100" headerAlign="center">处方天数</div>
								<div field="rlts" width="100" headerAlign="center">日历天数</div>
								<div field="clts" width="100" headerAlign="center">超量天数</div>
								<div field="sl" width="100" headerAlign="center">数量</div>
								<div field="scnysj" width="100" headerAlign="center">
									首次拿药时间</div>
								<div field="mcnysj" width="100" headerAlign="center">
									末次拿药时间</div>
							</div>
						</div>

					</div>

					<div title="交易记录">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
							style="margin-top: 5px;width: 60%">
							<tr>
								<td class="textR" width="90">统计时间</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa178" name="aaa178" class="mini-datepicker"
													format="yyyy-MM-dd" />
											</div>
										</div>
									</div></td>
								<td class="textR">至</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa178" name="aaa178" class="mini-datepicker"
													format="yyyy-MM-dd" />

											</div>
										</div>
									</div></td>
							</tr>
						</table>
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">交易记录列表</span>
							</h3>
						</div>
						<div id="jyjlgrid" class="mini-datagrid"
							style="width: 100%; height: 355px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20" url="#">
							<div property="columns">
								<div field="mc" width="100" headerAlign="center">医保号</div>
								<div field="gzdm" width="100" headerAlign="center">参保人员</div>
								<div field="gzms" width="100" headerAlign="center">医师名称</div>
								<div field="cjrmc" width="100" headerAlign="center">科室名称</div>
								<div field="cjsj" width="100" headerAlign="center">医院名称</div>
								<div field="cjrmc" width="100" headerAlign="center">费用总额</div>
								<div field="cjrmc" width="100" headerAlign="center">发生日期</div>
							</div>
						</div>

					</div>

					<div title="特病备案信息">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
							style="margin-top: 5px;width: 60%">
							<tr>
								<td class="textR" width="90">统计时间</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa178" name="aaa178" class="mini-datepicker"
													format="yyyy-MM-dd" />
											</div>
										</div>
									</div></td>
								<td class="textR">至</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa178" name="aaa178" class="mini-datepicker"
													format="yyyy-MM-dd" />

											</div>
										</div>
									</div></td>
							</tr>
						</table>
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">特备病案信息列表</span>
							</h3>
						</div>
						<div id="tbbagrid" class="mini-datagrid"
							style="width: 100%; height: 355px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20" url="#">
							<div property="columns">
								<div field="mc" width="100" headerAlign="center">备案日期</div>
								<div field="gzdm" width="100" headerAlign="center">开始时间</div>
								<div field="gzms" width="100" headerAlign="center">结束时间</div>
								<div field="cjrmc" width="100" headerAlign="center">备案科室</div>
								<div field="cjsj" width="100" headerAlign="center">特殊病种名称
								</div>
								<div field="cjrmc" width="100" headerAlign="center">治疗方案</div>
								<div field="cjrmc" width="100" headerAlign="center">经办人员</div>
								<div field="cjrmc" width="100" headerAlign="center">经办机构</div>
							</div>
						</div>

					</div>

					<div title="疑点信息">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
							style="margin-top: 5px;width: 60%">
							<tr>
								<td class="textR" width="90">统计时间</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjsjt71" name="tjsjt71" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=beg_time%>"
													onvaluechanged="valuechanged7" />
											</div>
										</div>
									</div></td>
								<td class="textR">至</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjsjt72" name="tjsjt72" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=max_date%>"
													onvaluechanged="valuechanged7" />
											</div>
										</div>
									</div></td>
							</tr>
						</table>
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">疑点信息列表</span>
							</h3>
						</div>
						<div id="ydxxgrid" class="mini-datagrid"
							style="width: 100%; height: 355px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20"
							url="${pageContext.request.contextPath}/report/yishi/queryYdxxGrid.action">
							<div property="columns">
								<div field="fyfssj" width="100" headerAlign="center">费用发生日期</div>
								<div field="cbrbm" width="100" headerAlign="center">参保人编码</div>
								<div field="xm" width="100" headerAlign="center">姓名</div>
								<div field="sfz" width="100" headerAlign="center">身份证号</div>
								<div field="xb" width="100" headerAlign="center">性别</div>
								<div field="age" width="100" headerAlign="center">年龄</div>
								<div field="jzyy" width="100" headerAlign="center">就诊医院</div>
								<div field="jzlx" width="100" headerAlign="center">就诊类型</div>
								<div field="fyje" width="100" headerAlign="center">费用金额</div>
								<div field="wgyy" width="100" headerAlign="center">违规原因</div>
								<div field="wglx" width="100" headerAlign="center">违规类型</div>
							</div>
						</div>

					</div>

					<div title="历史违规记录">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
							style="margin-top: 5px;width: 60%">
							<tr>
								<td class="textR" width="90">统计时间</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjsjt81" name="tjsjt81" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=beg_time%>"
													onvaluechanged="valuechanged8" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">至</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjsjt82" name="tjsjt82" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=max_date%>"
													onvaluechanged="valuechanged8" />
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
							style="width: 100%; height: 355px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20"
							url="${pageContext.request.contextPath}/report/yishi/queryLswgGrid.action">
							<div property="columns">
								<div field="fyfssj" width="100" headerAlign="center">费用发生日期</div>
								<div field="jzyy" width="100" headerAlign="center">就诊医院</div>
								<div field="jzlx" width="100" headerAlign="center">就诊类型</div>
								<div field="wgyy" width="100" headerAlign="center">违规原因</div>
								<div field="cfjg" width="100" headerAlign="center">处罚结果</div>
								<div field="cfje" width="100" headerAlign="center">处罚金额</div>
								<div field="jbr" width="100" headerAlign="center">经办人员</div>
								<div field="jbrq" width="100" headerAlign="center">经办日期</div>
								<div field="clyj" width="100" headerAlign="center">处理意见</div>
							</div>
						</div>


					</div>

					<div title="智能提醒记录">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
							style="margin-top: 5px;width: 60%">
							<tr>
								<td class="textR" width="90">统计时间</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa178" name="aaa178" class="mini-datepicker"
													format="yyyy-MM-dd" />
											</div>
										</div>
									</div></td>
								<td class="textR">至</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa178" name="aaa178" class="mini-datepicker"
													format="yyyy-MM-dd" />

											</div>
										</div>
									</div></td>
							</tr>
						</table>
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">智能提醒列表</span>
							</h3>
						</div>
						<div id="zntxgrid" class="mini-datagrid"
							style="width: 100%; height: 355px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20" url="#">
							<div property="columns">
								<div field="gzdm" width="100" headerAlign="center">就诊编号</div>
								<div field="gzms" width="100" headerAlign="center">明细项目</div>
								<div field="cjrmc" width="100" headerAlign="center">提醒名称</div>
								<div field="cjsj" width="100" headerAlign="center">提醒内容</div>
								<div field="cjrmc" width="100" headerAlign="center">提醒级别</div>
								<div field="cjrmc" width="100" headerAlign="center">操作时间</div>
							</div>
						</div>


					</div>

				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		//加载时间轴界面
		var id =<%=sss%>;
		function gerenTabs(e) {
			if (e.tab.title == '就诊时间轴') {

			} else if (e.tab.title == '接诊统计') {
				valuechanged2();
			} else if (e.tab.title == '接诊排行') {
				valuechanged3();
			} else if (e.tab.title == '费用明细信息') {
				valuechanged4();
			} else if (e.tab.title == '疑点信息') {
				valuechanged7();
			} else if (e.tab.title == '历史违规记录') {
				valuechanged7();
			}
		}
		$.ajax({
					url : "${pageContext.request.contextPath}/report/yishi/yishiinfo.action",
					type : "post",
					data : {
						id : id
					},
					success : function(text) {
						$("#xm").html(text.xm);
						$("#xx").html(text.xx);
						$("#sfzh").html(text.sfzh);
						$("#yszgz").html(text.yszgz);
						$("#xzzw").html(text.xzzw);
						$("#jnljjzl").html(text.jnljjzl);
						$("#ljjzlbfb").html(text.ljjzlbfb);
						$("#jnrjjz").html(text.jnrjjz);
						$("#jnrjfsfy").html(text.jnrjfsfy);
						$("#jnljwgcf").html(text.jnljwgcf);
						$("#wgje").html(text.wgje);
					}
				});
		valuechanged1();
		//tab页1的js查询
		function valuechanged1() {
			var yishisjz = document.getElementById('yishisjz');
			$
					.ajax({
						url : "${pageContext.request.contextPath}/report/yishi/yishisjz.action",
						type : "post",
						data : {
							id : id
						},
						success : function(text) {
							bulidTimeTxtBox(yishisjz, text.sjz, 600, 350);
						}
					});
		}
		//tab页2的js查询
		function valuechanged2() {
			var queryParams = {
				id : id,
				jzlx : mini.get("jzlx2").getValue(),
				tjsjt1 : mini.get("tjsjt21").getFormValue(),
				tjsjt2 : mini.get("tjsjt22").getFormValue(),
			};
			showFeeItemsConstituentChart(queryParams);
			showFundSourceConsituentChart(queryParams);
			showWorkloadStatisticsChart(queryParams);
			showFeeStatisticsChart(queryParams);
		}
		//tab页3的js查询
		function valuechanged3() {
			var queryParams = {
				id : id,
				jzlx : mini.get("jzlx3").getValue(),
				tjsjt1 : mini.get("tjsjt31").getFormValue() + "-01",
				tjsjt2 : mini.get("tjsjt32").getFormValue() + "-01",
			};
			showFrequencyTop10Chart(queryParams);
			showFeeTop10Chart(queryParams);
		}
		//tab页4的js查询
		function valuechanged4() {
			var queryParams = {
				id : id,
				jzlx : mini.get("jzlx4").getValue(),
				tjsjt1 : mini.get("tjsjt41").getFormValue(),
				tjsjt2 : mini.get("tjsjt42").getFormValue(),
				fylb : mini.get("fylb4").getFormValue()
			};
			var grid = mini.get("fymxgrid");
			grid.load(queryParams);
		}
		//tab页7的js查询
		function valuechanged7() {
			var queryParams = {
				id : id,
				tjsjt1 : mini.get("tjsjt71").getFormValue(),
				tjsjt2 : mini.get("tjsjt72").getFormValue(),
			};
			var grid = mini.get("ydxxgrid");
			grid.load(queryParams);
		}
		//tab页8的js查询
		function valuechanged8() {
			var queryParams = {
				id : id,
				tjsjt1 : mini.get("tjsjt81").getFormValue(),
				tjsjt2 : mini.get("tjsjt82").getFormValue(),
			};
			var grid = mini.get("lswggrid");
			grid.load(queryParams);
		}
		//-接诊次数TOP10 条形图
		function showFrequencyTop10Chart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yishi/getFrequencyTop10Data.action";
			getChatData(url, queryParams,
					function(data) {
						showBarChartReoprt('frequencyTop10Chart', '', data[0],
								data[1]);
					});
		}
		//医保范围内总额TOP10  条形图
		function showFeeTop10Chart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yishi/getFeeTop10Data.action";
			getChatData(url, queryParams, function(data) {
				showBarChartReoprt('feeTop10Chart', '', data[0], data[1]);
			});
		}
		//费用项目构成 饼图
		function showFeeItemsConstituentChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yishi/getFeeItemsConstituentData.action";
			getChatData(url, queryParams, function(data) {
				showPieChartYsJzphReoprt('feeItemsConstituentChart', '费用项目构成',
						data);
			});
		}
		//资金来源构成 饼图
		function showFundSourceConsituentChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yishi/getFundSourceConsituentData.action";
			getChatData(url, queryParams,
					function(data) {
						showPieChartReoprt('fundSourceConsituentChart',
								'资金来源构成', data);
					});
		}
		//工作量统计 条形图
		function showWorkloadStatisticsChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yishi/getWorkloadStatisticsData.action";
			getChatData(url, queryParams, function(data) {
				showBarChartReoprt('workloadStatisticsChart', '工作量统计值',
						data[0], data[1]);
			});
		}
		//费用统计 条形图
		function showFeeStatisticsChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/yishi/getFeeStatisticsData.action";
			getChatData(url, queryParams, function(data) {
				showBarChartReoprt('feeStatisticsChart', '费用统计值', data[0],
						data[1]);
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
