<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>申诉审核</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>

</style>
</head>
<body>

	<div class="mainlistCon">
		<div id="layout1" class="mini-layout nobor" allowResize="false"
			style="width: 100%; height: 490px;">
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
											</div></td>
										<td class="textR">医师姓名：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="bac003" name="bac003" class="mini-textbox" />
													</div>
												</div>
											</div></td>
										<td class="textR">就诊类型：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="aka130" name="aka130" class="mini-combobox"
															emptyText="选择就诊类别..." data="${dic['AKA130']}" />
													</div>
												</div>
											</div></td>
										<td class="textR">知识点名称：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="zsdmc" name="zsdmc" class="mini-textbox" />
													</div>
												</div>
											</div></td>
										<td class="textR">上次操作时间：</td>
										<td>
											<div class="inputL" style="width:130px">
												<div class="inputR">
													<div class="inputC">
														<input id="baz023" name="baz023" class="mini-datepicker"
															format="yyyyMMdd" onvaluechanged="search();" />
													</div>
												</div>
											</div></td>
									</tr>
									<tr>
										<td class="textR">复议状态：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="baz102" name="baz102" class="mini-combobox"
															value="0" data="${dic['BAZ102'] }"
															onvaluechanged="search()" />
													</div>
												</div>
											</div></td>
										<td id="selectyy1" class="textR">机构名称：</td>
										<td id="selectyy2">
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="akb021" name="akb021" class="mini-textbox" />
													</div>
												</div>
											</div></td>
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
											</div></td>
										<td id="selectgz3" class="textR">规则名称：</td>
										<td id="selectgz4">
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="gzflmc" name="ybgzflbm" emptyText="请选择..."
															class="mini-combobox" />
													</div>
												</div>
											</div></td>

										<td style="text-align: center; padding-top: 5px;" colspan="2">
											<input type="button" value="" class="cxsubmit"
											onclick="search();" /> <input type="button" value=""
											class="cxreset" onclick="resetFrom();" /></td>
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
								<div id="datagrid1" class="mini-datagrid"
									style="width: 100%; height: 100%;" idField="id"
									multiSelect="true" allowResize="false" pageSize="20"
									onselectionchanged="queryDetail" onload="afterload"
									showColumnsMenu="true" sortMode="client"
									url="${pageContext.request.contextPath}/k2/f10202004/queryMedDocument.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div type="reportcolumn" width="80" visible="false"
											renderer="onReportRenderer">报告</div>
										<div field="baz031" type="comboboxcolumn" width="100"
											headerAlign="center" visible="false">
											审核状态 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ031']}" />
										</div>
										<div field="baz021" type="comboboxcolumn" width="100"
											headerAlign="center" visible="false">
											智能审核结果 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ021']}" />
										</div>
										<div field="baz001" width="100" headerAlign="center"
											visible="false">违规单据ID</div>
										<div field="aaz370" width="100" headerAlign="center"
											visible="false">就诊编号</div>
										<div field="aaz308" width="100" headerAlign="center"
											visible="false">结算信息ID</div>
										<div field="aac003" width="100" headerAlign="center"
											allowSort="true">参保人姓名</div>
										<div field="aac002" width="100" headerAlign="center"
											allowSort="true">医保号</div>
										<div field="akc264" width="100" headerAlign="center">
											费用总额</div>
										<div field="aka130" type="comboboxcolumn" width="100"
											headerAlign="center" allowSort="true">
											就诊类型 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKA130']}">
										</div>
										<div field="akc190" width="100" headerAlign="center">
											住院号</div>
										<div field="akb021" width="100" headerAlign="center"
											allowSort="true">医院名称</div>
										<div field="akc194" width="100" dateFormat="yyyyMMdd"
											allowSort="true" headerAlign="center">就诊时间</div>
										<div field="aac001" width="100" headerAlign="center"
											visible="false">参保人ID</div>
										<div field="aac004" type="comboboxcolumn" width="100"
											visible="false" headerAlign="center">
											参保人性别 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AAC004']}" />
										</div>
										<div field="aac006" width="100" headerAlign="center"
											visible="false">参保人出生日期</div>
										<div field="aac012" type="comboboxcolumn" width="100"
											visible="false" headerAlign="center">
											个人身份 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AAC012']}" />
										</div>
										<div field="akb020" width="100" headerAlign="center"
											visible="false">机构编号</div>
										<div field="akb022" type="comboboxcolumn" width="100"
											visible="false" headerAlign="center">
											机构类型 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKB022']}" />
										</div>
										<div field="aaz307" width="100" headerAlign="center"
											visible="false">科室编码</div>
										<div field="akf001" type="comboboxcolumn" width="100"
											visible="false" headerAlign="center">
											科室分类 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKF001']}" />
										</div>
										<div field="aae386" width="100" headerAlign="center"
											visible="false">科室名称</div>
										<div field="aaz263" width="100" headerAlign="center"
											visible="false">医师编号</div>
										<div field="aaz264" width="100" headerAlign="center"
											visible="false">医师姓名</div>
										<div field="ake038" width="100" headerAlign="center"
											visible="false">个人账户支出</div>
										<div field="akc254" width="100" headerAlign="center"
											visible="false">个人自付金额</div>
										<div field="akc253" width="100" headerAlign="center"
											visible="false">自费金额</div>
										<div field="akb067" width="100" headerAlign="center"
											visible="false">个人现金支付金额</div>
										<div field="akc050" width="100" headerAlign="center"
											visible="false">入院疾病诊断名称</div>
										<div field="akc193" width="100" headerAlign="center"
											visible="false">入院疾病诊断代码</div>
										<div field="akc185" width="100" headerAlign="center"
											visible="false">出院主要疾病诊断</div>
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
										<div field="aae030" width="100" headerAlign="center"
											visible="false">入院日期</div>
										<div field="aae031" width="100" headerAlign="center"
											visible="false">出院日期</div>
										<div field="baz020" width="100" dateFormat="yyyyMMdd"
											visible="false" headerAlign="center">智能审核时间</div>
										<div field="baz022" width="100" headerAlign="center"
											visible="false">智能审核结果说明</div>
										<div field="aaa027" width="100" headerAlign="center"
											visible="false">统筹区</div>
									</div>
								</div>
							</div>
							<div size="50%" showCollapseButton="false">
								<div id="toolbar1" class="mini-toolbar" style="height: 10%;">
									<table style="width:100%;">
										<tr>
											<td style="width:100%;"></td>
										</tr>
									</table>
								</div>
								<div id="datagrid2" class="mini-datagrid" style="height: 86%;"
									idField="id" multiSelect="true" allowResize="false"
									pageSize="20" onrowdblclick="queryHistory"
									showSummaryRow="true" showColumnsMenu="true" sortMode="client"
									url="${pageContext.request.contextPath}/k2/f10202004/queryMedDocumentDetail.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div field="baz031" type="comboboxcolumn" width="100"
											allowSort="true" headerAlign="center">
											审核状态 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ031']}">
										</div>
										<div field="baz102" type="comboboxcolumn" width="100"
											allowSort="true" headerAlign="center">
											复议状态 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ102']}">
										</div>
										<div field="ake002" width="100" headerAlign="center"
											allowSort="true">明细名称</div>
										<div field="aaa133" width="100" headerAlign="center">疑点说明</div>
										<div field="baz041" width="100" headerAlign="center">拟扣除金额</div>
										<div field="baz024zx" width="100" headerAlign="center"
											allowSort="true">申述过期时间</div>
										<div field="akc050" width="100" headerAlign="center"
											allowSort="true">诊断名称(icd-10)</div>
										<div field="akc193" width="100" headerAlign="center"
											visible="false">诊断编码</div>
										<div field="aac003" width="80" headerAlign="center"
											allowSort="true">姓名</div>
										<div field="aac002" width="100" headerAlign="center"
											allowSort="true">医保号</div>
										<div field="aac004" type="comboboxcolumn" width="50"
											headerAlign="center" allowSort="true">
											性别 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AAC004']}">
										</div>
										<div field="aac006" width="50" headerAlign="center"
											allowSort="true">年龄</div>
										<div field="akb021" width="150" headerAlign="center"
											allowSort="true">医院名称</div>
										<div field="aaz264" width="100" headerAlign="center"
											allowSort="true">医师姓名</div>
										<div field="akc194" width="100" dateFormat="yyyyMMdd"
											allowSort="true" headerAlign="center">就诊时间</div>
										<div field="akc221" width="100" dateFormat="yyyyMMdd"
											allowSort="true" headerAlign="center">明细发生时间</div>
										<div field="akb065" width="100" headerAlign="center">金额
										</div>
										<div field="akc225" width="100" headerAlign="center">单价
										</div>
										<div field="akc226" width="100" headerAlign="center">数量
										</div>
										<div field="akc253" width="100" headerAlign="center">
											自费</div>
										<div field="akc254" width="100" headerAlign="center">
											自付</div>
										<div field="ake010" width="100" headerAlign="center"
											allowSort="true">通用名</div>
										<div field="baz022" width="100" headerAlign="center"
											allowSort="true">操作人</div>
										<div field="baz023" width="100" headerAlign="center"
											dateFormat="yyyyMMdd" allowSort="true">上次操作时间</div>
										<div field="baz020" width="100" dateFormat="yyyyMMdd"
											visible="false" headerAlign="center">智能审核时间</div>
										<div field="baz033" type="comboboxcolumn" width="100"
											visible="false" headerAlign="center">
											违规类型 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ033']}">
										</div>
										<div field="baz003" width="100" headerAlign="center"
											visible="false">违规明细ID</div>
										<div field="baz001" width="100" headerAlign="center"
											visible="false">违规单据ID</div>
										<div field="ake001" width="100" headerAlign="center"
											visible="false">社保三大目录统一编码</div>
										<div field="ake003" type="comboboxcolumn" width="100"
											visible="false" headerAlign="center">
											三大目录类别 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKE003']}">
										</div>
										<div field="aka065" type="comboboxcolumn" width="100"
											visible="false" headerAlign="center">
											收费项目等级 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKA065']}">
										</div>
										<div field="aka081" width="100" headerAlign="center"
											visible="false">用药途径</div>
										<div field="ake106" width="100" headerAlign="center"
											visible="false">常规用量</div>
										<div field="aka072" width="100" headerAlign="center"
											visible="false">用药频次</div>
										<div field="aka071" width="100" headerAlign="center"
											visible="false">单次用量</div>
										<div field="ake131" width="100" headerAlign="center"
											visible="false">用量单位类型</div>
										<div field="akc229" width="100" headerAlign="center"
											visible="false">用药天数</div>
										<div field="akc231" width="100" headerAlign="center"
											visible="false">药量天数</div>
										<div field="aka052" width="100" headerAlign="center"
											visible="false">计价单位</div>
										<div field="aka074" width="100" headerAlign="center"
											visible="false">规格</div>
										<div field="ake004" width="100" headerAlign="center"
											visible="false">材料名称</div>
										<div field="aka098" width="100" headerAlign="center"
											visible="false">生产单位</div>
										<div field="ake005" width="100" headerAlign="center"
											visible="false">生产地类别</div>
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

		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		var grid1 = mini.get("datagrid1");
		var grid2 = mini.get("datagrid2");
		var gzfl = mini.get("gzfl");
		var gzflmc = mini.get("gzflmc");
		var queryForm = new mini.Form("form1");
		var baz102 = mini.get("baz102").getValue();
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
		grid2.on("drawSummaryCell", function(e) {
			var result = e.result;
			var grid = e.sender;
			var rows = e.data;
			if (e.field == "baz041") {
				var total = 0;
				for ( var i = 0, l = rows.length; i < l; i++) {
					var row = rows[i];
					var t = row.baz041;
					if (isNaN(t))
						continue;
					total += t;
				}
				total = Math.round(total * 100) / 100;
				e.cellHtml = "总计: " + total;
			}
		});
		function onDeptChanged(e) {
			var id = gzfl.getValue();
			gzflmc.setValue("");
			var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id="
					+ id;
			gzflmc.setUrl(url);
			gzflmc.select(0);
		}

		function search() {
			var data = queryForm.getData(true);
			grid2.clearRows();
			grid1.load(data);
			baz102 = mini.get("baz102").getValue();
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
			var baz023 = mini.get("baz023").getText();
			for ( var int = 0; int < record.length; int++) {
				if (int + 1 == record.length) {
					ids += record[int].baz001;
				} else {
					ids += record[int].baz001 + ",";
				}
			}
			grid2.load({
				ids : ids,
				baz102 : baz102,
				baz023 : baz023
			});
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
							var data = {
								baz003 : record.baz003
							};
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

		//east 条件查询
		function setandsearch(name, id) {
			if (mini.get("akb021").getValue() != name) {
				mini.get("akb021").setValue(name);
				var data = queryForm.getData(true);
				grid1.load(data);
			}
		}

		function getChartData(url, params, callback) {
			$.ajax(url, {
				type : 'POST',
				data : params,
				cache : false,
				async : true,
				dataType : 'json',
				success : function(data) {
					callback(data);
				},
				error : function() {
					alert("error");
				}
			});
		}
		function findByGz(a, b) {
			if (a != undefined && b != undefined) {
				tabgzfl.setValue(a);
				var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id="
						+ a;
				tabgzflmc.setUrl(url);
				tabgzflmc.setValue(b);
			}
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
