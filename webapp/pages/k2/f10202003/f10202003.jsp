<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>综合查询</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
</style>
<script type="text/javascript">
	var BAZ021str = [ {
		id : '2',
		text : '扣除'
	}, {
		id : '3',
		text : '申诉'
	}, {
		id : '4',
		text : '嫌疑'
	} ];
	mini.parse();
</script>
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
										<td class="textR">参保人：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="aac003" name="aac003" class="mini-textbox"
															emptyText="输入姓名/医保号" />
													</div>
												</div>
											</div></td>
										<%--<td class="textR">医师姓名：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="bac003" name="bac003" class="mini-textbox" />
													</div>
												</div>
											</div>
										</td>
										--%>
										<td class="textR">机构名称：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="akb020" name="akb020" class="mini-buttonedit"
															oncloseclick="onHospitalClose"
															onbuttonclick="onHospitalSelect" allowInput="false"
															showClose="true" />
													</div>
												</div>
											</div></td>
										<td class="textR">知识点：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="zsdmc" name="zsdmc" class="mini-buttonedit"
															oncloseclick="onZSDClose" onbuttonclick="onZSDSelect"
															allowInput="false" showClose="true" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">就诊开始时间：</td>
										<td>
											<div class="inputL" style="width:100px">
												<div class="inputR">
													<div class="inputC">
														<input id="akc194Start" name="akc194Start"
															class="mini-datepicker" allowInput="false"
															format="yyyyMMdd" required="true" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">就诊结束时间：</td>
										<td>
											<div class="inputL" style="width:100px">
												<div class="inputR">
													<div class="inputC">
														<input id="akc194End" name="akc194End"
															class="mini-datepicker" allowInput="false"
															format="yyyyMMdd" required="true" />
													</div>
												</div>
											</div>
										</td>
									</tr>
									<tr>
										<td class="textR">机审类别：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="baz021" name="baz021" class="mini-combobox"
															emptyText="请选择..." showNullItem="true"
															nullItemText="请选择..." data="BAZ021str" />
													</div>
												</div>
											</div></td>
										<td class="textR">数据状态：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="treeselect" class="mini-treeselect"
															name="baz031" multiSelect="true" textField="text"
															showTreeIcon="false" valueField="id" parentField="pid"
															checkRecursive="true" showFolderCheckBox="true"
															expandOnLoad="false" showClose="true"
															oncloseclick="onCloseClick" popupWidth="200" />
													</div>
												</div>
											</div></td>
										<td class="textR">就诊类型：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="aka130" name="aka130" class="mini-combobox"
															emptyText="请选择..." showNullItem="true" popupWidth="150"
															nullItemText="请选择..." data="${dic['AKA130']}" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">操作开始时间：</td>
										<td>
											<div class="inputL" style="width:100px">
												<div class="inputR">
													<div class="inputC">
														<input id="baz023Start" name="baz023Start"
															class="mini-datepicker" format="yyyyMMdd" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">操作结束时间：</td>
										<td>
											<div class="inputL" style="width:100px">
												<div class="inputR">
													<div class="inputC">
														<input id="baz023End" name="baz023End"
															class="mini-datepicker" format="yyyyMMdd" />
													</div>
												</div>
											</div>
										</td>
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
							<div size="38%" showCollapseButton="false">
								<div id="datagrid1" class="mini-datagrid"
									style="width: 100%; height: 100%;" idField="id"
									multiSelect="true" allowResize="false" pageSize="50"
									onselectionchanged="queryDetail" onload="afterload"
									showColumnsMenu="true" sortMode="client"
									url="${pageContext.request.contextPath}/k2/f10202003/queryMedDocument.action">
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
										<div field="aac001" width="100" headerAlign="center"
											allowSort="true">医保号</div>
										<div field="aac002" width="100" headerAlign="center"
											visible="false">身份证号</div>
										<div field="akc264" width="100" headerAlign="center">
											费用总额</div>
										<div field="aka130" type="comboboxcolumn" width="100"
											headerAlign="center" allowSort="true">
											就诊类型 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKA130']}" />
										</div>
										<div field="akc190" width="100" headerAlign="center">
											住院号</div>
										<div field="akb021" width="100" headerAlign="center"
											allowSort="true">医院名称</div>
										<div field="akc194" width="100" dateFormat="yyyyMMdd"
											allowSort="true" headerAlign="center">就诊时间</div>
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
									</div>
								</div>
							</div>
							<div size="62%" showCollapseButton="false">
								<div id="toolbar1" class="mini-toolbar" style="height: 10%;">
									<table style="width:100%;">
										<tr>
											<td style="width:100%;"></td>
										</tr>
									</table>
								</div>
								<div id="datagrid2" class="mini-datagrid" style="height: 86%;"
									idField="id" multiSelect="true" allowResize="false"
									pageSize="100" onrowdblclick="queryHistory"
									showSummaryRow="true" showColumnsMenu="true" sortMode="client"
									url="${pageContext.request.contextPath}/k2/f10202003/queryMedDocumentDetail.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div field="baz021" type="comboboxcolumn" width="60"
											allowSort="true" headerAlign="center">
											机审类别 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ021']}">
										</div>
										<div field="baz031str" width="70" headerAlign="center">数据状态</div>
										<div field="ake002" width="100" headerAlign="center"
											allowSort="true">明细名称</div>
										<div field="aaa133" width="150" headerAlign="center">疑点说明</div>
										<div field="baz041" width="90" headerAlign="center">拟扣除金额</div>
										<div field="baz042" width="90" headerAlign="center">已扣除金额</div>
										<div field="akc050" width="130" headerAlign="center"
											allowSort="true">诊断名称(icd-10)</div>
										<div field="akc193" width="100" headerAlign="center"
											visible="false">诊断编码</div>
										<div field="aac003" width="60" headerAlign="center"
											allowSort="true">姓名</div>
										<div field="aac001" width="70" headerAlign="center"
											allowSort="true">医保号</div>
										<div field="aac002" width="100" headerAlign="center"
											visible="false">身份证号</div>
										<div field="aac004" type="comboboxcolumn" width="45"
											headerAlign="center" allowSort="true">
											性别 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AAC004']}">
										</div>
										<div field="aac006" width="45" headerAlign="center"
											allowSort="true">年龄</div>
										<div field="aka130" type="comboboxcolumn" width="80"
											headerAlign="center" allowSort="true">
											就诊类型 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKA130']}" />
										</div>
										<div field="akb021" width="150" headerAlign="center"
											allowSort="true">医院名称</div>
										<div field="aaz264" width="60" headerAlign="center"
											allowSort="true">医师姓名</div>
										<div field="akc194" width="70" dateFormat="yyyyMMdd"
											allowSort="true" headerAlign="center">就诊时间</div>
										<div field="akc221" width="80" dateFormat="yyyyMMdd"
											allowSort="true" headerAlign="center">明细发生时间</div>
										<div field="akb065" width="50" headerAlign="center">金额
										</div>
										<div field="akc225" width="50" headerAlign="center">单价
										</div>
										<div field="akc226" width="50" headerAlign="center">数量
										</div>
										<div field="akc254" width="50" headerAlign="center">自付</div>
										<div field="ake010" width="130" headerAlign="center"
											allowSort="true">通用名</div>
										<div field="akc021" type="comboboxcolumn" width="80"
											headerAlign="center" allowSort="true">
											人员类别<input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['AKC021']}" />
										</div>
										<div field="akc190" width="100" headerAlign="center">
											住院号</div>
										<div field="baz022" width="60" headerAlign="center"
											allowSort="true">操作人</div>
										<div field="baz023" width="70" headerAlign="center"
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
		var akc194Start = mini.get("akc194Start");
		var akc194End = mini.get("akc194End");
		var date = new Date();
		akc194End.setValue(date);
		date.setDate(1);
		akc194Start.setValue(date);
		var grid1 = mini.get("datagrid1");
		var grid2 = mini.get("datagrid2");
		var queryForm = new mini.Form("form1");
		var baz021 = mini.get("baz021").getValue();
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
			if (e.field == "baz042") {
				var total = 0;
				for ( var i = 0, l = rows.length; i < l; i++) {
					var row = rows[i];
					var t = row.baz042;
					if (isNaN(t))
						continue;
					total += t;
				}
				total = Math.round(total * 100) / 100;
				e.cellHtml = "总计: " + total;
			}
		});
		function onHospitalSelect(e) {
			var btnEdit = this;
			mini
					.open({
						url : "${pageContext.request.contextPath}/pages/pub/selectHospitalALL.jsp",
						title : "医院选择",
						width : 750,
						height : 420,
						onload : function() {
							var iframe = this.getIFrameEl();
							var data = {
								baz031 : '',
								baz101 : '',
								baz102 : ''
							};
							iframe.contentWindow.SetData(data);
						},
						ondestroy : function(action) {
							if (action == "ok") {
								var iframe = this.getIFrameEl();
								var data = iframe.contentWindow.GetData();
								data = mini.clone(data); //必须
								if (data) {
									var akb021str = "";
									var akb020str = "";
									for ( var i = 0; i < data.length; i++) {
										if ((i + 1) == data.length) {
											akb021str = akb021str + ""
													+ data[i].akb021 + "";
											akb020str = akb020str + "'"
													+ data[i].akb020 + "'";
										} else {
											akb021str = akb021str + ""
													+ data[i].akb021 + ",";
											akb020str = akb020str + "'"
													+ data[i].akb020 + "',";
										}
									}
									btnEdit.setValue(akb020str);
									btnEdit.setText(akb021str);
								}
							}

						}
					});

		}
		function onZSDSelect(e) {
			var btnEdit = this;
			mini
					.open({
						url : "${pageContext.request.contextPath}/pages/pub/selectZSDALL.jsp",
						title : "知识点选择",
						width : 750,
						height : 420,
						onload : function() {
							var iframe = this.getIFrameEl();
							var data = {
								baz031 : '',
								baz101 : '',
								baz102 : ''
							};
							iframe.contentWindow.SetData(data);
						},
						ondestroy : function(action) {
							if (action == "ok") {
								var iframe = this.getIFrameEl();
								var data = iframe.contentWindow.GetData();
								data = mini.clone(data); //必须
								if (data) {
									var ake008str = "";
									var zsdbmstr = "";
									for ( var i = 0; i < data.length; i++) {
										if ((i + 1) == data.length) {
											ake008str = ake008str + ""
													+ data[i].ake008.trim()
													+ "";
											zsdbmstr = zsdbmstr + "'"
													+ data[i].zsdbm + "'";
										} else {
											ake008str = ake008str + ""
													+ data[i].ake008.trim()
													+ ",";
											zsdbmstr = zsdbmstr + "'"
													+ data[i].zsdbm + "',";
										}
									}
									btnEdit.setValue(zsdbmstr);
									btnEdit.setText(ake008str);
								}
							}

						}
					});

		}
		var treeList = [ {
			id : "1",
			text : "正常"
		}, {
			id : "11",
			text : "正常",
			pid : "1"
		}, {
			id : "2",
			text : "嫌疑"
		}, {
			id : "21",
			text : "嫌疑",
			pid : "2"
		}, {
			id : "22",
			text : "申诉转嫌疑",
			pid : "2"
		}, {
			id : "3",
			text : "申诉"
		}, {
			id : "31",
			text : "申诉",
			pid : "3"
		}, {
			id : "32",
			text : "嫌疑转申诉",
			pid : "3"
		}, {
			id : "4",
			text : "扣除"
		}, {
			id : "41",
			text : "过期扣除",
			pid : "4"
		}, {
			id : "42",
			text : "手动扣除",
			pid : "4"
		}, {
			id : "43",
			text : "自动扣除",
			pid : "4"
		}, {
			id : "5",
			text : "复议"
		}, {
			id : "51",
			text : "复议",
			pid : "5"
		}, {
			id : "6",
			text : "复议扣除"
		}, {
			id : "61",
			text : "复议驳回",
			pid : "6"
		}, {
			id : "62",
			text : "放弃复议",
			pid : "6"
		}, {
			id : "63",
			text : "复议过期",
			pid : "6"
		}, {
			id : "7",
			text : "复议不违规"
		}, {
			id : "71",
			text : "复议不违规",
			pid : "7"
		}, {
			id : "8",
			text : "撤销疑点"
		}, {
			id : "81",
			text : "撤销疑点",
			pid : "8"
		} ];
		var treeSelect = mini.get("treeselect");
		treeSelect.loadList(treeList, "id", "pid");
		function search() {
			if (queryForm.isValid()) {
				var data = queryForm.getData(true);
				grid2.clearRows();
				grid1.load(data);
				baz021 = mini.get("baz021").getValue();
			}
		}
		function afterload(e) {
			var grid = e.sender;
			if (e.data.length == 0) {
				grid2.clearRows();
			}
		}
		function onCloseClick(e) {
			var obj = e.sender;
			obj.setText("");
			obj.setValue("");
		}
		function onHospitalClose(e) {
			var obj = e.sender;
			obj.setText("");
			obj.setValue("");
		}
		function onZSDClose(e) {
			var obj = e.sender;
			obj.setText("");
			obj.setValue("");
		}
		function queryDetail(e) {
			var grid = e.sender;
			var record = grid.getSelecteds();
			var zsdmc = mini.get("zsdmc").getValue();
			var baz031 = mini.get("treeselect").getValue();
			var ids = "";
			var baz023Start = mini.get("baz023Start").getText();
			var baz023End = mini.get("baz023End").getText();
			var akc194Start = mini.get("akc194Start").getText();
			var akc194End = mini.get("akc194End").getText();
			baz021 = mini.get("baz021").getValue();
			for ( var int = 0; int < record.length; int++) {
				if (int + 1 == record.length) {
					ids += record[int].baz001;
				} else {
					ids += record[int].baz001 + ",";
				}
			}
			grid2.load({
				ids : ids,
				baz021 : baz021,
				baz023Start : baz023Start,
				baz023End : baz023End,
				akc194Start : akc194Start,
				akc194End : akc194End,
				ake007 : zsdmc,
				baz031 : baz031
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
								baz003 : record.baz003,
								flag : 1
							};
							iframe.contentWindow.SetData(data);
						},
						ondestroy : function(action) {

						}
					});
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
	</script>
</body>
</html>
