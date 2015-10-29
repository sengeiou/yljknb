<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>申诉查询</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
<script type="text/javascript">
	var cq = [ {
		id : 0,
		text : '是'
	}, {
		id : 1,
		text : '否'
	} ];
	mini.parse();
</script>
<style type="text/css">
.rowtype1 {
	background: #fceee2;
}

.rowtype2 {
	background: #fcccc2;
}

.top_name {
	line-height: 35px;
	border-bottom: 2px solid #bfbfbf;
	font-weight: bold;
}

.top_name_fontsize {
	font-size: 18px !important;
	font-weight: bold;
	font-family: "微软雅黑";
}

.td_number {
	color: #FF9900;
	font-size: 22px !important;
	font-weight: bold;
	font-family: "微软雅黑";
	text-align: center;
}

.td_number2 {
	color: red;
	font-size: 16px !important;
	font-weight: bold;
	font-family: "微软雅黑";
	text-align: center;
}
</style>
</head>
<body>

	<div class="mainlistCon">
		<div id="layout1" class="mini-layout nobor" allowResize="false"
			style="width: 100%; height: 506px;">
			<div title="center" region="center" style="padding: 5px;">
				<div id="sp1" class="mini-splitter" style="width:100%;height:100%;"
					vertical="true" allowResize="false">
					<div size="14%" showCollapseButton="true">
						<div id="editForm1" class="cxTabbox">
							<form id="form1" action="#" onsubmit="return false;">
								<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
									width="100%">
									<tr>
										<td class="textR">参保人姓名：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="aac003" name="aac003" class="mini-textbox" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">医师姓名：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="bac003" name="bac003" class="mini-textbox" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">就诊类型：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="aka130" name="aka130" class="mini-combobox"
															emptyText="选择就诊类别..." data="${dic['AKA130']}" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">知识点名称：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="zsdmc" name="zsdmc" class="mini-textbox" />
													</div>
												</div>
											</div>
										</td>
									</tr>
									<tr>
										<td id="selectyy1" class="textR" style="display: none">机构名称：</td>
										<td id="selectyy2" style="display: none">
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="akb021" name="akb021" class="mini-textbox" />
													</div>
												</div>
											</div>
										</td>
										<td id="selectgz1" class="textR">规则类别：</td>
										<td id="selectgz2">
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">

														<input id="gzfl" name="ybfgzflbm"
															onvaluechanged="onDeptChanged" emptyText="请选择..."
															class="mini-combobox"
															url="${pageContext.request.contextPath}/k4/f10402008/getGzfl.action" />
													</div>
												</div>
											</div>
										</td>
										<td id="selectgz3" class="textR">规则名称：</td>
										<td id="selectgz4">
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="gzflmc" name="ybgzflbm" emptyText="请选择..."
															class="mini-combobox" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">是否超期：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="cq" name="cq" class="mini-combobox"
															emptyText="请选择..." data="cq" />
													</div>
												</div>
											</div>
										</td>
										<td style="text-align: center; padding-top: 5px;" colspan="2">
											<input type="button" value="" class="cxsubmit"
											onclick="search();" /> <input type="button" value=""
											class="cxreset" onclick="resetFrom();" />
										</td>
									</tr>
								</table>
							</form>
						</div>
					</div>
					<div showCollapseButton="false">
						<div id="sp2" class="mini-splitter"
							style="width:100%;height:100%;" vertical="true"
							allowResize="false" handlerSize="0">
							<div size="50%" showCollapseButton="false">
								<div id="detailgrid1_Form" style="display: none;">
									<div id="detailgrid1"></div>
								</div>
								<div id="detailgrid2_Form" style="display: none;">
									<div id="detailgrid2" style="width: 600px">
									</div>
								</div>
								<div id="datagrid1" class="mini-datagrid"
									style="width: 100%; height: 100%;" idField="id"
									multiSelect="true" allowResize="false" pageSize="20"
									onselectionchanged="queryDetail" showSummaryRow="true"
									onshowrowdetail="onShowRowDetail1" onload="afterload"
									showColumnsMenu="true"
									url="${pageContext.request.contextPath}/k5/f10504003/queryCompain.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div type="expandcolumn">~</div>
										<div type="reportcolumn" width="80"
											renderer="onReportRenderer">报告</div>
										<div field="baz031" type="comboboxcolumn" width="100"
											headerAlign="center" visible="false">
											审核状态<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['BAZ031'] }" />
										</div>
										<div field="baz021" type="comboboxcolumn" width="100"
											headerAlign="center" visible="false">
											智能审核结果<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['BAZ021']}" />
										</div>
										<div field="baz001" width="100" headerAlign="center"
											visible="false">违规单据ID</div>
										<div field="aaz370" width="100" headerAlign="center">就诊编号</div>
										<div field="aaz308" width="100" headerAlign="center"
											visible="false">结算信息ID</div>
										<div field="aac003" width="100" headerAlign="center">参保人姓名</div>
										<div field="aac002" width="100" headerAlign="center">社会保障号</div>
										<div field="aac001" width="100" headerAlign="center"
											visible="false">参保人ID</div>
										<div field="aac004" type="comboboxcolumn" width="100"
											headerAlign="center">
											参保人性别<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AAC004']}" />
										</div>
										<div field="aac006" width="100" headerAlign="center">
											参保人出生日期</div>
										<div field="aac012" type="comboboxcolumn" width="100"
											headerAlign="center">
											个人身份<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AAC012']}" />
										</div>
										<div field="akb020" width="100" headerAlign="center"
											visible="false">机构编号</div>
										<div field="akb021" width="100" headerAlign="center">机构名称</div>
										<div field="akb022" type="comboboxcolumn" width="100"
											headerAlign="center">
											机构类型<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AKB022']}" />
										</div>
										<div field="aaz307" width="100" headerAlign="center"
											visible="false">科室编码</div>
										<div field="akf001" type="comboboxcolumn" width="100"
											headerAlign="center">
											科室分类<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AKF001']}" />
										</div>
										<div field="aae386" width="100" headerAlign="center">科室名称</div>
										<div field="aaz263" width="100" headerAlign="center"
											visible="false">医师编号</div>
										<div field="aaz264" width="100" headerAlign="center">医师姓名</div>
										<div field="aka130" type="comboboxcolumn" width="100" headerAlign="center">
											就诊类别<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AKA130']}" />
										</div>
										<div field="akc194" width="100" dateFormat="yyyyMMdd"
											headerAlign="center">就诊结算时间</div>
										<div field="ake038" width="100" headerAlign="center">个人账户支出
										</div>
										<div field="akc254" width="100" headerAlign="center">个人自付金额
										</div>
										<div field="akc253" width="100" headerAlign="center">自费金额</div>
										<div field="akb067" width="100" headerAlign="center">
											个人现金支付金额</div>
										<div field="akc264" width="100" headerAlign="center">总费用</div>
										<div field="akc050" width="100" headerAlign="center">
											入院疾病诊断名称</div>
										<div field="akc193" width="100" headerAlign="center"
											visible="false">入院疾病诊断代码</div>
										<div field="akc185" width="100" headerAlign="center">
											出院主要疾病诊断</div>
										<div field="aka120" width="100" headerAlign="center"
											visible="false">出院主要诊断编码</div>
										<div field="akc186" width="100" headerAlign="center"
											visible="false">出院次要疾病诊断</div>
										<div field="akc188" width="100" headerAlign="center"
											visible="false">出院次要疾病诊断编码</div>
										<div field="akc274" width="100" headerAlign="center"
											visible="false">出院次要疾病第三诊断</div>
										<div field="akc275" width="100" headerAlign="center"
											visible="false">出院次要疾病第三诊断编码</div>
										<div field="akc276" width="100" headerAlign="center"
											visible="false">出院次要疾病第四诊断</div>
										<div field="akc277" width="100" headerAlign="center"
											visible="false">出院次要疾病第四诊断编码</div>
										<div field="aae030" width="100" headerAlign="center">入院日期</div>
										<div field="aae031" width="100" headerAlign="center">出院日期</div>
										<div field="baz020" width="100" dateFormat="yyyyMMdd"
											headerAlign="center">智能审核时间</div>
										<div field="baz022" width="100" headerAlign="center">
											智能审核结果说明</div>
										<div field="aaa027" width="100" headerAlign="center"
											visible="false">统筹区</div>
									</div>
								</div>
							</div>
							<div size="50%" showCollapseButton="false">
								<div id="toolbar1" class="mini-toolbar" style="height: 10%;">
									<table style="width:100%;">
										<tr>
											<td style="width:100%;">
												<!-- <a class="mini-menubutton" plain="true" menu="#popupMenu">所选明细</a> -->
												<!-- <span class="btnMini"  style="margin:0 10px;"><em><input type="button"   onclick="plcl('01')" value="正常"/></em></span>
												<span class="btnMini"  style="margin:0 10px;"><em><input type="button"   onclick="plcl('04')" value="待申诉"/></em></span> -->
												<input id="baz003s" name="baz003s" class="mini-hidden"
												value="" /></td>
										</tr>
									</table>
								</div>
								<!--menu-->
								<!-- <ul id="popupMenu" class="mini-menu" style="display:none;">
									<li onclick="plcl('正常');">正常</li>
									<li onclick="plcl('待申诉');">待申诉</li>
								</ul> -->
								<div id="datagrid2" class="mini-datagrid" style="height: 86%;"
									idField="id" multiSelect="true" allowResize="false"
									pageSize="20" onshowrowdetail="onShowRowDetail2"
									onrowclick="queryCheckRecord" onrowdblclick="queryHistory"
									showColumnsMenu="true"
									url="${pageContext.request.contextPath}/k5/f10504003/querySuspectedDocumentDetail.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div type="expandcolumn">~</div>
										<div field="baz031" type="comboboxcolumn" width="100"
											headerAlign="center" visible="false">
											审核状态<input property="editor" class="mini-combobox"
												style="width:100%" data="shjg">
										</div>
										<div field="aac003" width="80" headerAlign="center">姓名</div>
										<div field="aac004" type="comboboxcolumn" width="50"
											headerAlign="center">
											性别<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AAC004']}">
										</div>
										<div field="aac006" width="50" headerAlign="center">年龄</div>
										<div field="akb021" width="150" headerAlign="center">机构名称</div>
										<div field="akc221" width="100" dateFormat="yyyyMMdd"
											headerAlign="center">费用发生时间</div>
										<div field="akc194" width="100" dateFormat="yyyyMMdd"
											headerAlign="center">就诊结算时间</div>
										<div field="baz020" width="100" dateFormat="yyyyMMdd"
											headerAlign="center">智能审核时间</div>
										<div field="baz033" type="comboboxcolumn" width="100"
											headerAlign="center">
											违规类型<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['BAZ033']}">
										</div>
										<div field="baz003" width="100" headerAlign="center"
											visible="false">违规明细ID</div>
										<div field="baz001" width="100" headerAlign="center"
											visible="false">违规单据ID</div>
										<div field="ake001" width="100" headerAlign="center">
											社保三大目录统一编码</div>
										<div field="ake002" width="100" headerAlign="center">
											社保三大目录名称</div>
										<div field="ake003" type="comboboxcolumn" width="100"
											headerAlign="center">
											三大目录类别<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AKE003']}">
										</div>
										<div field="aka065" type="comboboxcolumn" width="100"
											headerAlign="center">
											收费项目等级<input property="editor" class="mini-combobox"
												style="width:100%" data="${dic['AKA065']}">
										</div>
										<div field="aka081" width="100" headerAlign="center">用药途径
										</div>
										<div field="ake106" width="100" headerAlign="center">常规用量
										</div>
										<div field="aka072" width="100" headerAlign="center">用药频次
										</div>
										<div field="aka071" width="100" headerAlign="center">单次用量
										</div>
										<div field="ake131" width="100" headerAlign="center">
											用量单位类型</div>
										<div field="akc229" width="100" headerAlign="center">用药天数
										</div>
										<div field="akc231" width="100" headerAlign="center">药量天数
										</div>
										<div field="akc226" width="100" headerAlign="center">数量</div>
										<div field="akc225" width="100" headerAlign="center">单价</div>
										<div field="aka052" width="100" headerAlign="center">计价单位
										</div>
										<div field="aka074" width="100" headerAlign="center">规格</div>
										<div field="ake004" width="100" headerAlign="center">材料名称
										</div>
										<div field="aka098" width="100" headerAlign="center">生产单位
										</div>
										<div field="ake005" width="100" headerAlign="center">
											生产地类别</div>
										<div field="akb065" width="100" headerAlign="center">合计</div>
										<div field="aaz213" width="100" headerAlign="center"
											visible="false">明细ID</div>
										<div field="aaa027" width="100" headerAlign="center"
											visible="false">统筹区</div>
									</div>
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
			<div title="east" region="east" width="300" expanded="false"
				showSplitIcon="true" showHeader="false" style="padding: 5px;">
				<div id="audit_tabs" class="mini-tabs" activeIndex="0"
					style="height: 100%; border: 0;" plain="false"
					buttons="#tabsButtons" onactivechanged="selectTabs">
					<div title="医院汇总">
						<div style="text-align:center; margin:10px;">
							<form id="form2" action="#" onsubmit="return false;">
								<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
									width="100%">
									<tr>
										<td>
											<div class="inputL" style="width: 160px">
												<div class="inputR">
													<div class="inputC">
														<input id="akb020orakb021" emptyText="机构名称或代码"
															name="akb020orakb021" class="mini-textbox" />
													</div>
												</div>
											</div>
										</td>
										<td><input type="button" value="" class="cxsubmit"
											onclick="queryNumber()" />
										</td>
									</tr>
								</table>

								<div id="menuList1"></div>
							</form>
						</div>
					</div>
					<div title="规则汇总">
						<div style="text-align:center; margin:10px;">
							<form id="form2" action="#">
								<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
									width="100%">
									<tr>
										<td class="textR">规则类别：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="tabgzfl" name="tabybfgzflbm"
															onitemclick="showeast" onvaluechanged="tabChanged"
															emptyText="请选择..." class="mini-combobox"
															url="${pageContext.request.contextPath}/k4/f10402008/getGzfl.action" />
													</div>
												</div>
											</div>
										</td>
									</tr>
									<tr>
										<td class="textR">规则名称：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="tabgzflmc" name="tabybfgzflbm"
															emptyText="请选择..." class="mini-combobox" />
													</div>
												</div>
											</div>
										</td>
										<td><input type="button" value="" class="cxsubmit"
											onclick="findByGz();" />
										</td>
									</tr>
								</table>
								<div id="menuList">
									<div class="top_name">
										<a class="top_name_fontsize" href="#"
											onclick="ruleSearch('超量用药')">超量用药</a>
									</div>
									<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
										width="100%">
										<tr>
											<td style="padding-bottom:6px;">直接扣款数：871</td>
											<td style="padding-bottom:6px;">待审核数：</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">送核查数：309</td>
											<td style="padding-bottom:6px;" rowspan="3"><div
													class="td_number">142</div>
											</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">已审核数：186</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">涉及医院数：20</td>
										</tr>
									</table>
									<div class="top_name">
										<a class="top_name_fontsize" href="#"
											onclick="ruleSearch('GZ0302')">工伤限用</a>
									</div>
									<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
										width="100%">
										<tr>
											<td style="padding-bottom:6px;">直接扣款数：5657</td>
											<td style="padding-bottom:6px;">待审核数：</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">送核查数：122</td>
											<td style="padding-bottom:6px;" rowspan="3"><div
													class="td_number">10</div>
											</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">已审核数：79</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">涉及医院数：10</td>
										</tr>
									</table>
									<div class="top_name">
										<a class="top_name_fontsize" href="#" onclick="">年龄限用</a>
									</div>
									<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
										width="100%">
										<tr>
											<td style="padding-bottom:6px;">直接扣款数：324</td>
											<td style="padding-bottom:6px;">待审核数：</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">送核查数：134</td>
											<td style="padding-bottom:6px;" rowspan="3"><div
													class="td_number">33</div>
											</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">已审核数：42</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">涉及医院数：6</td>
										</tr>
									</table>
									<div class="top_name">
										<a class="top_name_fontsize" href="#" onclick="">收费次数限制</a>
									</div>
									<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
										width="100%">
										<tr>
											<td style="padding-bottom:6px;">直接扣款数：524</td>
											<td style="padding-bottom:6px;">待审核数：</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">送核查数：124</td>
											<td style="padding-bottom:6px;" rowspan="3"><div
													class="td_number">30</div>
											</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">已审核数：60</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">涉及医院数：11</td>
										</tr>
									</table>
									<div class="top_name">
										<a class="top_name_fontsize" href="#" onclick="">重复收费</a>
									</div>
									<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
										width="100%">
										<tr>
											<td style="padding-bottom:6px;">直接扣款数：323</td>
											<td style="padding-bottom:6px;">待审核数：</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">送核查数：58</td>
											<td style="padding-bottom:6px;" rowspan="3"><div
													class="td_number">12</div>
											</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">已审核数：22</td>
										</tr>
										<tr>
											<td style="padding-bottom:6px;">涉及医院数：8</td>
										</tr>
									</table>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		var grid1 = mini.get("datagrid1");
		var grid2 = mini.get("datagrid2");
		var detailgrid1_Form = document.getElementById("detailgrid1_Form");
		var detailgrid2_Form = document.getElementById("detailgrid2_Form");
		var gzfl = mini.get("gzfl");
		var gzflmc = mini.get("gzflmc");
		var tabgzfl = mini.get("tabgzfl");
		var tabgzflmc = mini.get("tabgzflmc");
		var queryForm = new mini.Form("form1");
		var form2 = new mini.Form("form2");
		var layout = mini.get("layout1");
		grid1.load();
		//加载查询数据
		queryNumber();

			grid2
					.on(
							"drawcell",
							function(e) {
								var record = e.record, column = e.column, field = e.field, value = e.value;
								var rows = e.data;
								//违规明细,红色标识
								if (field == "baz032" && value == '1') {
									e.rowStyle = "color:red";
								}
							});
			grid1.on("drawSummaryCell", function(e) {
				var result = e.result;
				var grid = e.sender;
				var rows = e.data;
				if (e.field == "akc264") {
					var total = 0;
					for ( var i = 0, l = rows.length; i < l; i++) {
						var row = rows[i];
						var t = row.akc264;
						if (isNaN(t))
							continue;
						total += t;
					}
					total = Math.round(total * 100) / 100;
					e.cellHtml = "总计: " + total;
				}
			});

		function selectTabs(e) {
			if (e.tab.title == '医院汇总') {
				document.getElementById("selectyy1").style.display = "none";
				document.getElementById("selectyy2").style.display = "none";
				document.getElementById("selectgz1").style.display = "";
				document.getElementById("selectgz2").style.display = "";
				document.getElementById("selectgz3").style.display = "";
				document.getElementById("selectgz4").style.display = "";
			} else if (e.tab.title == '规则汇总') {
				document.getElementById("selectyy1").style.display = "";
				document.getElementById("selectyy2").style.display = "";
				document.getElementById("selectgz1").style.display = "none";
				document.getElementById("selectgz2").style.display = "none";
				document.getElementById("selectgz3").style.display = "none";
				document.getElementById("selectgz4").style.display = "none";
			}
		}
		function onDeptChanged(e) {
			var id = gzfl.getValue();
			gzflmc.setValue("");
			var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id="
					+ id;
			gzflmc.setUrl(url);
			positionCombo.select(0);
		}
		function tabChanged(e) {

			var id = tabgzfl.getValue();
			tabgzflmc.setValue("");
			var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id="
					+ id;
			tabgzflmc.setUrl(url);
			positionCombo.select(0);
		}
		function showeast(e) {
			layout.expandRegion("east");
		}
		function search() {
			var data = queryForm.getData(true);
			grid1.load(data);
		}
		function afterload(e) {
			var grid = e.sender;
			if (e.data.length == 0) {
				grid2.clearRows();
			}
		}
		function queryDetail(e) {
			var grid = e.sender;
			var record = grid.getSelecteds();
			var ids = "";
			for ( var int = 0; int < record.length; int++) {
				if (int + 1 == record.length) {
					ids += record[int].baz001;
				} else {
					ids += record[int].baz001 + ",";
				}
			}
			grid2.load({
				ids : ids
			});
		}
		function queryMedVisitInfo(aaz308, aaz370) {
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k2/f10201002/queryMedVisitInfo.action",
						type : "post",
						data : {
							aaz308 : aaz308,
							aaz370 : aaz370
						},
						success : function(text) {
							if (text.success) {
								document.getElementById("akb020_jz").innerHTML = text.result[0].kc21.akb020;
								document.getElementById("aac001_jz").innerHTML = text.result[0].kc21.aac001;
								document.getElementById("aac002_jz").innerHTML = text.result[0].kc21.aac002;
								document.getElementById("aac003_jz").innerHTML = text.result[0].kc21.aac003;
								document.getElementById("aae140_jz").innerHTML = text.result[0].kc21.aae140;
								document.getElementById("aka130_jz").innerHTML = text.result[0].kc21.aka130;
								document.getElementById("aae030_jz").innerHTML = text.result[0].kc21.aae030;
								document.getElementById("aae031_jz").innerHTML = text.result[0].kc21.aae031;
								document.getElementById("akc194_jz").innerHTML = text.result[0].kc24.akc194Str;
								document.getElementById("akc264_jz").innerHTML = text.result[0].kc24.akc264;
								document.getElementById("akc185_jz").innerHTML = text.result[0].kc24.akc185;
								document.getElementById("akc186_jz").innerHTML = text.result[0].kc24.akc186;
								document.getElementById("akc274_jz").innerHTML = text.result[0].kc24.akc274;
								document.getElementById("akc276_jz").innerHTML = text.result[0].kc24.akc276;
							} else {
								mini.alert(text.msg);
							}
						}
					});
		}
		//查询单据违规详情
		function onShowRowDetail1(e) {
			var grid = e.sender;
			var row = e.record;
			var td = grid.getRowDetailCellEl(row);
			td.appendChild(detailgrid1_Form);
			detailgrid1_Form.style.display = "block";
			$("#detailgrid1").html("");
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k5/f10504001/indexDetailAction.action",
						type : "post",
						data : {
							baz001 : row.baz001
						},
						success : function(text) {
							if (text.success) {
								var htmlStr = "";
								for ( var i = 0; i < text.result[0].kc73List.length; i++) {
									htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
									htmlStr += "<span>";
									htmlStr += text.result[0].kc73List[i].aaa167
											+ "：";
									htmlStr += "</span>";
									htmlStr += text.result[0].kc73List[i].aaa133;
									htmlStr += "</div>";
								}
								$("#detailgrid1").append(htmlStr);
							} else {
								mini.alert(text.msg);
							}
						}
					});
		}

		function queryCheckRecord(e) {
			var grid = e.sender;
			var record = grid.getSelected();
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k2/f10201002/queryCheckRecord.action",
						type : "post",
						data : {
							baz003 : record.baz003
						},
						success : function(text) {
							if (text.success) {
								//mini.get("checkRecord").setData(text.result);
								//mini.get("audit_tabs").activeTab(1);
							} else {
								mini.alert(text.msg);
							}
						}
					});
		}

		function ruleSearch(ybgzflbm) {

			if (mini.get("gzflmc").getValue() != ybgzflbm) {
				mini.get("gzflmc").setValue(ybgzflbm);
				mini.get("gzfl").setValue("bwk");
				var data = queryForm.getData(true);
				grid1.load(data);
			}
			mini.get("gzfl").setValue("");
		}

		function queryHistory(e) {
			var grid = e.sender;
			var record = grid.getSelected();
			mini
					.open({
						url : "${pageContext.request.contextPath}/pages/pub/queryHistory_sjz.jsp",
						title : "审核历史",
						width : 550,
						height : 300,
						onload : function() {
							var iframe = this.getIFrameEl();
							var data = {baz003 : record.baz003};
							iframe.contentWindow.SetData(data);
						},
						ondestroy : function(action) {

						}
					});
		}


		function onValueChanged(e) {
			var checked = this.getChecked();
			if (checked) {
				mini.get("baz041").disable();
			} else {
				mini.get("baz041").enable();
			}
		}
		function onReportRenderer(e) {
			var record = e.row;
			var akb020 = record.akb020;
			akb020 = akb020.replace(/[ ]/g, "");
			var str = "<a href='javascript:void(0)' title='参保人' onclick = viewPerson('"
					+ record.aac001
					+ "')><img src='../../images/cbr.png'/></a> ";
			str += "<a href='javascript:void(0)' title='医院' onclick = viewHospital('"
					+ akb020 + "')><img src='../../images/ddjg.png'/></a> ";
			str += "<a href='javascript:void(0)' title='医师' onclick = viewDoctor('"
					+ record.aaz263
					+ "')><img src='../../images/ys.png'/></a> ";
			return str;
		}
		function resetFrom() {
			queryForm.reset();
		}
		
		function onShowRowDetail1(e) {
			var grid = e.sender;
			var row = e.record;
			var td = grid.getRowDetailCellEl(row);
			td.appendChild(detailgrid1_Form);
			detailgrid1_Form.style.display = "block";
			$("#detailgrid1").html("");
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k5/f10504002/indexDetailAction.action",
						type : "post",
						data : {
							baz001 : row.baz001
						},
						success : function(text) {
							if (text.success) {
								var htmlStr = "";
								for ( var i = 0; i < text.result[0].kc73List.length; i++) {
									htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
									htmlStr += "<span>";
									htmlStr += text.result[0].kc73List[i].aaa167
											+ "：";
									htmlStr += "</span>";
									htmlStr += text.result[0].kc73List[i].aaa133;
									htmlStr += "</div>";
								}
								$("#detailgrid1").append(htmlStr);
							} else {
								mini.alert(text.msg);
							}
						}
					});
		}
		
		//查询单据明细违规详情
		function onShowRowDetail2(e) {
			var grid = e.sender;
			var row = e.record;
			var td = grid.getRowDetailCellEl(row);
			td.appendChild(detailgrid2_Form);
			detailgrid2_Form.style.display = "block";
			$("#detailgrid2").html("");
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k5/f10504002/indexInfoDetailAction.action",
						type : "post",
						data : {
							baz001 : row.baz001,
							baz003 : row.baz003
						},
						success : function(text) {
							if (text.success) {
								var htmlStr = "";
								htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
								htmlStr += "<table cellpadding='0' class='cxTab' cellspacing='0' border='0' width='100%'>";
								htmlStr += "<tr><td style='width:100px'>诊断：</td><td colspan='3' style='width:500px'>";
								htmlStr += text.result[0].akc050+"</td></tr>";
								for ( var i = 0; i < text.result[0].kc72List.length; i++) {
									htmlStr += "<tr><td style='width:100px'>违规描述："
											+ "</td><td colspan='3' style='width:500px'>"
											+ text.result[0].kc72List[i].aaa167+"："
											+ text.result[0].kc72List[i].aaa133
											+ "</td></tr>";
								}
								//htmlStr += "<tr><td style='width:100px'>审核意见：</td><td colspan='3' style='width:500px'><textarea  name='baz021' id='baz021'  class='mini-textarea' style='width:400px' ></textarea></td></tr>";
								//htmlStr += "<tr><td></td><td colspan='2'><span class='btnMini' style='margin:0 10px'><em><input type='button' onclick=preCheck('1','03') value='审核通过' /></em></span><span class='btnMini' style='margin:0 10px'><em><input type='button' onclick=preCheck('1','2') value='驳回' /></em></span></td><td></td></tr>";
								htmlStr += "</table>";
								htmlStr += "</div>";
								$("#detailgrid2").append(htmlStr);
							} else {
								mini.alert(text.msg);
							}
						}
					});
		}

		//east 条件查询
		function setandsearch(name, id) {
			if (mini.get("akb021").getValue() != name) {
				mini.get("akb021").setValue(name);
				var data = queryForm.getData(true);
				grid1.load(data);
			}
			/* var sbtitle = document.getElementById(id);
			if (sbtitle.style.display == '') {
				sbtitle.style.display = 'none';
			} else {
				sbtitle.style.display = '';
			} */
		}

		//医院汇总查询
		function queryNumber() {
			var akb020orakb021 = mini.get("akb020orakb021").getValue();
			$("#menuList1").html("<font color=\"red\">正在查询医院数据,请稍等...</font>");
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k5/f10504003/queryNumber.action",
						type : "post",
						data : {
							akb020orakb021 : akb020orakb021
						},
						success : function(text) {
							if (text.success) {
								$("#menuList1").empty();
								for ( var i = 0; i < text.result.length; i++) {
									var htmlStr = "";
									htmlStr += "<div class='top_name'>";
									htmlStr += "<a class='top_name_fontsize' href='#' onclick=setandsearch('"
											+ text.result[i].yymc
											+ "','"
											+ text.result[i].yybh.trim()
											+ "')>"
											+ text.result[i].yymc
											+ "</a>";
									htmlStr += "</div>";

									htmlStr += "<table cellpadding='0' class='cxTab' cellspacing='0' border='0' width='100%'>";
									htmlStr += "<tr>";
									/* 	htmlStr+="<td style='padding-bottom:6px;'>直接扣款数："+text.result[i].zjkks+"</td>"; */
									htmlStr += "<td style='padding-bottom:6px;'>待申诉处理数：</td>";
									htmlStr += "<td style='padding-bottom:6px;'>待申诉审核数：</td>";
									htmlStr += "</tr>";

									htmlStr += "<tr>";
									/* htmlStr+="<td style='padding-bottom:6px;'>送核查数："+text.result[i].shcs+"</td>"; */
									htmlStr += "<td style='padding-bottom:6px;'><div class='td_number'>"
											+ text.result[i].dsscls
											+ "</div>	</td>";
									htmlStr += "<td style='padding-bottom:6px;'><div class='td_number'>"
											+ text.result[i].dssshs
											+ "</div>	</td>";
									htmlStr += "</tr>";

									htmlStr += "<tr>";
									/* htmlStr+="<td style='padding-bottom:6px;'>已审核数："+text.result[i].yshs+"</td>"; */
									htmlStr += "<td></td>";
									//		htmlStr+="<td style='padding-bottom:6px;'>超期数：	<div class='td_number2'>"+text.result[i].cqs+"</div>	</td>";
									htmlStr += "</tr>";

									/* 	htmlStr+="<tbody id='"+text.result[i].yybh.trim()+"' style='display: none; border-top: 2px solid #bfbfbf;'>";
										htmlStr+="<tr>";
										htmlStr+="<td style='padding-bottom:6px;' colspan='4'>病种限用："+232+"</td>";
										htmlStr+="</tr>";
										
										htmlStr+="<tr>";
										htmlStr+="<td style='padding-bottom:6px;'>超量用药："+67+"</td>";
										htmlStr+="</tr>";
										
										htmlStr+="<tr>";
										htmlStr+="<td style='padding-bottom:6px;'>年龄限用："+42+"</td>";
										htmlStr+="</tr>";
										
										htmlStr+="</tbody>"; */

									htmlStr += "</table>";

									$("#menuList1").append(htmlStr);

								}
							} else {

								$("#menuList1")
										.html(
												"<font color=\"red\">没有找到相关医院<br/>请输入医疗机构名称关键字或完整的医疗机构代码</font>");
							}
						}

					});
		}
		function findByGz() {
			var fl = tabgzfl.getValue();
			var mc = tabgzflmc.getValue();
			gzfl.setValue(fl);
			var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id="
					+ fl;
			gzflmc.setUrl(url);
			gzflmc.setValue(mc);
			var data = queryForm.getData(true);
			grid1.load(data);
		}
	</script>
</body>
</html>
