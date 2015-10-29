<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<%@page import="java.util.*,java.text.SimpleDateFormat"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>参保人报告</title>
<%
	String sss = request.getParameter("ybh");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date d = new Date();
	String max_date = sdf.format(d);
	String beg_time = sdf.format(d).substring(0, 8) + "01";
%>
<%@ include file="../../pages/pub/pubsource.jsp"%>
<script
	src="${pageContext.request.contextPath}/resource/timeline_2.3.0/timeline_ajax/simile-ajax-api.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resource/timeline_2.3.0/timeline_js/timeline-api.js?bundle=true"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resource/timeline_2.3.0/timelines.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/report_highcharts.js"></script>

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

.box {
	border: 1px solid #c8cccc;
	width: 938px;
	overflow: hidden;
	height: 480px;
	margin-bottom: 10px;
}

.box_nei_top {
	width: 875px;
	height: 35px;
	line-height: 35px;
	padding-left: 25px;
}

.asLabel .mini-textbox-border,.asLabel .mini-textbox-input,.asLabel .mini-buttonedit-border,.asLabel .mini-buttonedit-input,.asLabel .mini-textboxlist-border
	{
	border: 0;
	background: none;
	cursor: default;
}

.asLabel .mini-buttonedit-button,.asLabel .mini-textboxlist-close {
	display: none;
}

.asLabel .mini-textboxlist-item {
	padding-right: 8px;
}

.kuang {
	width: 100%;
	overflow: hidden;
	min-height: 100px;
}

.chartTitle1 {
	height: 30px;
	text-align: center;
}

.chartTitle2 {
	height: 30px;
	text-align: center;
}

.chartTitle3 {
	height: 30px;
	text-align: center;
}
</style>
</head>
<body id="body">
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
							<li class="ll">身份证号</li>
							<li class="lr"><label id="sfzh"></label>
							</li>
							<li class="ll">医保号</li>
							<li class="lr"><label id="ybh"></label>
							</li>
							<li class="ll">人员类别</li>
							<li class="lr"><label id="rylb"></label>
							</li>
						</ul>
					</div>
				</div>
				<div class="top_right">
					<ul>
						<li>健康特征&nbsp;&nbsp;<span> <label id="jktz"
								class="f20"></label> </span>&nbsp;&nbsp;</li>
						<li class="h50">今年累计医疗支出 &nbsp;&nbsp; <label class="f24"
							id="jnljylzc"></label><br />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;排在&nbsp;&nbsp;<span> <label
								id="pmbfb" class="f24"></label> </span>&nbsp;&nbsp;的人前面</li>
						<li>今年累计违规处罚&nbsp;&nbsp;<span> <label id="jnljwgcf"
								class="f24"></label> </span>&nbsp;&nbsp;次，共&nbsp;&nbsp;<span> <label
								id="wgje" class="f24"></label> </span>&nbsp;&nbsp;元</li>
					</ul>
				</div>
			</div>
			<div class="bottom_box" style="overflow:hidden;">
				<div id="detail_tabs" class="mini-tabs" activeIndex="0"
					style="height: 480px; width:900px ;" onactivechanged="gerenTabs">
					<div title="就诊时间轴" style="height: 480px; width:938px ;">
						<div class="box" id="lin_main_0">
							<div class="box_nei_top">
								<table>
									<tr>
										<td><img src="../../images/dull-blue-circle.png" /></td>
										<td width="120">
											<div id="ck1" name="ptjzjl" class="mini-checkbox"
												checked="true" readOnly="false" text="普通就诊记录"
												onvaluechanged="ckchange"></div>
										</td>
										<td><img src="../../images/red-circle.png" /></td>
										<td width="120"><div id="ck2" name="wgjzjl"
												class="mini-checkbox" checked="true" readOnly="false"
												text="违规就诊记录" onvaluechanged="ckchange"></div></td>
										<td><img src="../../images/brown-rircle.png" /></td>
										<td width="120"><div id="ck3" name="yswgjzjl"
												class="mini-checkbox" checked="true" readOnly="false"
												text="疑似违规就诊记录" onvaluechanged="ckchange"></div></td>
									</tr>
								</table>
							</div>
							<div id="my-timeline"
								style=" height: 420px; border: 1px solid #aaa; overflow: hidden;"></div>
						</div>
					</div>
					<div title="就诊结算统计" style="height: 480px; width:938px ;">
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
														format="yyyy-MM-dd" value="<%=beg_time%>"
														onvaluechanged="valuechanged2" />
												</div>
											</div>
										</div>
									</td>
									<td class="textR">至</td>
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
										</div>
									</td>
								</tr>
							</table>
						</div>
						<div class="kuang"
							style="width:100%; margin-left:auto; margin-right:auto;height: 238px; ">
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
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">就诊情况按医院汇总</span>
							</h3>
						</div>
						<div id="jzqkgrid" class="mini-datagrid" idField="id" pageSize="5"
							multiSelect="false" style="width: 100%; height:170px;"
							allowResize="true"
							url="${pageContext.request.contextPath}/report/geren/queryJZQKGrid.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="yymc" width="160" headerAlign="center"
									allowSort="true">医院名称</div>
								<div field="bz" width="80" headerAlign="center" allowSort="true">病种</div>
								<div field="ys" width="80" headerAlign="center" allowSort="true">医师</div>
								<div field="jzcs" width="80" headerAlign="center"
									allowSort="true">就诊次数</div>
								<div field="fsje" width="80" headerAlign="center"
									allowSort="true">发生金额</div>
								<div field="sjkd" width="80" headerAlign="center"
									allowSort="true">时间跨度</div>
							</div>
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
												<input id="tjsjt31" name="tjsjt31" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=beg_time%>"
													onvaluechanged="valuechanged3" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">至</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjsjt32" name="tjsjt32" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=max_date%>"
													onvaluechanged="valuechanged3" />
											</div>
										</div>
									</div>
								</td>
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
									</div>
								</td>
								<td class="textR">费用</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="fylb3" name="fylb3" class="mini-combobox"
													emptyText="选择费用类别..." data="${dic['AKA063']}"
													onvaluechanged="valuechanged3" />
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
							style="width: 100%; height: 380px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="15"
							url="${pageContext.request.contextPath}/report/geren/queryFYMXGrid.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="xmmc" width="100" headerAlign="center">项目名称</div>
								<div field="fsje" width="80" headerAlign="center">发生金额</div>
								<div field="cfts" width="80" headerAlign="center">处方天数</div>
								<div field="rlts" width="80" headerAlign="center">日历天数</div>
								<div field="clts" width="80" headerAlign="center">超量天数</div>
								<div field="sl" width="80" headerAlign="center">数量</div>
								<div field="scnysj" width="100" headerAlign="center"
									dateFormat="yyyy-MM-dd">首次拿药时间</div>
								<div field="mcnysj" width="100" headerAlign="center"
									dateFormat="yyyy-MM-dd">末次拿药时间</div>
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
							</tr>
						</table>
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">交易记录明细</span>
							</h3>
						</div>
						<div id="jyjlgrid" class="mini-datagrid"
							style="width: 100%; height: 380px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20" url="#">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="mc" width="100" headerAlign="center">医保号</div>
								<div field="gzdm" width="100" headerAlign="center">医师名称</div>
								<div field="gzms" width="100" headerAlign="center">科室名称</div>
								<div field="cjrmc" width="100" headerAlign="center">医院名称</div>
								<div field="cjrmc" width="100" headerAlign="center">费用总额</div>
								<div field="cjrmc" width="100" headerAlign="center"
									format="yyyy-MM-dd">发生日期</div>
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
												<input id="tjsjt51" name="tjsjt51" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=beg_time%>"
													onvaluechanged="valuechanged5" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">至</td>
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
							style="width: 100%; height: 380px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="15"
							url="${pageContext.request.contextPath}/report/geren/queryYDXXGrid.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="fyfssj" width="100" headerAlign="center"
									dateFormat="yyyy-MM-dd">费用发生日期</div>
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
												<input id="tjsjt61" name="tjsjt61" class="mini-datepicker"
													format="yyyy-MM-dd" value="<%=beg_time%>"
													onvaluechanged="valuechanged6" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">至</td>
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
							style="width: 100%; height: 380px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="15"
							url="${pageContext.request.contextPath}/report/geren/queryLSWGGrid.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="fyfssj" width="100" headerAlign="center"
									dateFormat="yyyy-MM-dd">费用发生日期</div>
								<div field="jzyy" width="100" headerAlign="center">就诊医院</div>
								<div field="jzlx" width="100" headerAlign="center">就诊类型</div>
								<div field="wgyy" width="100" headerAlign="center">违规原因</div>
								<div field="cfjg" width="100" headerAlign="center">处罚结果</div>
								<div field="cfje" width="100" headerAlign="center">处罚金额</div>
								<div field="jbr" width="100" headerAlign="center">经办人员</div>
								<div field="jbrq" width="100" headerAlign="center"
									dateFormat="yyyy-MM-dd">经办日期</div>
								<div field="clyj" width="100" headerAlign="center">处理意见</div>
							</div>
						</div>
					</div>

					<div title="资格审查台账">
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
									</div>
								</td>
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
									</div>
								</td>
							</tr>
						</table>
						<div class="listTit">
							<h3 class="cxTit fL">
								<span class="iconCx">资格审查台账信息</span>
							</h3>
						</div>
						<div id="zgsctzgrid" class="mini-datagrid"
							style="width: 100%; height: 380px;" idField="id"
							multiSelect="true" allowResize="false" pageSize="20" url="#">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="mc" width="100" headerAlign="center">资格名称</div>
								<div field="gzdm" width="100" headerAlign="center">操作起始时间
								</div>
								<div field="gzms" width="100" headerAlign="center">操作结束时间
								</div>
								<div field="cjrmc" width="100" headerAlign="center">
									经办机构名称</div>
								<div field="cjrmc" width="100" headerAlign="center">经办人</div>
								<div field="cjrmc" width="100" headerAlign="center">医院名称</div>
								<div field="cjrmc" width="100" headerAlign="center">操作时间</div>
								<div field="cjrmc" width="100" headerAlign="center">操作原因</div>
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
		onLoad('my-timeline');
		var id =<%=sss%>;
		function gerenTabs(e) {
			if (e.tab.title == '就诊时间轴') {
				ckchange();
			} else if (e.tab.title == '就诊结算统计') {
				valuechanged2();
			} else if (e.tab.title == '费用明细信息') {
				valuechanged3();
			} else if (e.tab.title == '疑点信息') {
				valuechanged5();
			} else if (e.tab.title == '历史违规记录') {
				valuechanged6();
			}
		}
		$.ajax({
					url : "${pageContext.request.contextPath}/report/geren/gereninfo.action",
					type : "post",
					data : {
						id : id
					},
					success : function(text) {
						$("#xm").html(text.xm);
						$("#xx").html(text.xx);
						$("#sfzh").html(text.sfzh);
						$("#ybh").html(text.ybh);
						$("#rylb").html(text.rylb);
						$("#jktz").html(text.jktz);
						$("#jnljylzc").html(text.jnljylzc);
						$("#pmbfb").html(text.pmbfb);
						$("#jnljwgcf").html(text.jnljwgcf);
						$("#wgje").html(text.wgje);
					}
				});
		//tab页1的js查询
		function ckchange() {
			var flag = "";
			var ck1 = mini.get("ck1");
			if (ck1.checked) {
				flag = flag + '1';
			} else {
				flag = flag + '0';
			}
			var ck2 = mini.get("ck2");
			if (ck2.checked) {
				flag = flag + ',1';
			} else {
				flag = flag + ',0';
			}
			var ck3 = mini.get("ck3");
			if (ck3.checked) {
				flag = flag + ',1';
			} else {
				flag = flag + ',0';
			}
			clickbtn("19530527", "29991231", "my-timeline",
					"${pageContext.request.contextPath}/report/geren/timeline.action?id="
							+ id + "&flag=" + flag + "&t="
							+ (new Date().getTime()));
		}
		//tab页2的js查询
		function valuechanged2() {
			var queryParams = {
				id : id,
				jzlx : mini.get("jzlx2").getValue(),
				tjsjt1 : mini.get("tjsjt21").getFormValue(),
				tjsjt2 : mini.get("tjsjt22").getFormValue()
			};
			showFeeItemsConstituentChart(queryParams);
			showFundSourceConsituentChart(queryParams);
			showOtherIndicatorsChart(queryParams);
			var grid = mini.get("jzqkgrid");
			grid.load(queryParams);
		}
		//tab页3的js查询
		function valuechanged3() {
			var queryParams = {
				id : id,
				jzlx : mini.get("jzlx3").getValue(),
				tjsjt1 : mini.get("tjsjt31").getFormValue(),
				tjsjt2 : mini.get("tjsjt32").getFormValue(),
				fylb : mini.get("fylb3").getFormValue()
			};
			var grid = mini.get("fymxgrid");
			grid.load(queryParams);
		}
		//tab页5的js查询
		function valuechanged5() {
			var queryParams = {
				id : id,
				tjsjt1 : mini.get("tjsjt51").getFormValue(),
				tjsjt2 : mini.get("tjsjt52").getFormValue(),
			};
			var grid = mini.get("ydxxgrid");
			grid.load(queryParams);
		}
		//tab页6的js查询
		function valuechanged6() {
			var queryParams = {
				id : id,
				tjsjt1 : mini.get("tjsjt61").getFormValue(),
				tjsjt2 : mini.get("tjsjt62").getFormValue(),
			};
			var grid = mini.get("lswggrid");
			grid.load(queryParams);
		}
		//费用项目构成 饼图
		function showFeeItemsConstituentChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/geren/getFeeItemsConstituentDataGeren.action";
			getChatData(url, queryParams, function(data) {
				showPieChartReoprt('feeItemsConstituentChart', '费用项目构成', data);
			});
		}
		//资金来源构成 饼图
		function showFundSourceConsituentChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/geren/getFundSourceConsituentDataGeren.action";
			getChatData(url, queryParams,
					function(data) {
						showPieChartReoprt('fundSourceConsituentChart',
								'资金来源构成', data);
					});
		}
		//其它指标  饼图
		function showOtherIndicatorsChart(queryParams) {
			var url = "${pageContext.request.contextPath}/report/geren/getOtherIndicatorsDataGeren.action";
			getChatData(url, queryParams, function(data) {
				showBarChartReoprt('otherIndicatorsChart', '其它指标', data[0],
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
