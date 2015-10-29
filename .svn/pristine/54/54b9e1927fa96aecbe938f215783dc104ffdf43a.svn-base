<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医师申述</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/swfupload.js"></script>
<script type="text/javascript">
	var cp = [ {
		id : 0,
		text : '是'
	}, {
		id : 1,
		text : '否'
	}];
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

.mini-htmlfile .mini-buttonedit-button {
	width: 50px !important;
}
</style>
</head>
<body>
	<div class="mainlistCon">
		<div id="layout1" class="mini-layout nobor" allowResize="false"
			style="width: 100%; height: 490px;">
			<div title="center" region="center" style="padding: 5px;">
				<div id="sp1" class="mini-splitter"
					style="width: 100%; height: 100%;" vertical="true"
					allowResize="false">
					<div size="14%" showCollapseButton="true">
						<div id="editForm1" class="cxTabbox">
							<form id="form1" action="#">
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
									</tr>
									<tr>
										<td id="selectyy1" class="textR" style="display: none">
											机构名称：</td>
										<td id="selectyy2" style="display: none">
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
										<td class="textR">是否放弃：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="cp" name="cp" class="mini-combobox"
															emptyText="请选择..." data="cp" />
													</div>
												</div>
											</div></td>
										<td style="text-align: center; padding-top: 5px;" colspan="2">
											<input type="button" value="" class="cxsubmit"
											onclick="search();" /> <input type="button" value=""
											class="cxreset" onclick="resetFrom();" /> <input
											id="baz003ss" name="baz003ss" class="mini-textbox"
											visible="false" /></td>
									</tr>
								</table>
							</form>
						</div>
					</div>
					<div showCollapseButton="false">
						<div id="sp2" class="mini-splitter"
							style="width: 100%; height: 100%;" vertical="true"
							allowResize="false" handlerSize="0">
							<div size="50%" showCollapseButton="false">
								<div id="detailgrid1_Form" style="display: none;">
									<div id="detailgrid1"></div>
								</div>
								<div id="detailgrid2_Form" style="display: none;">
									<div id="detailgrid2" style="width: 600px">
										<input id="filedataFileName" name="filedataFileName"
											class="mini-textbox" visible="false" /> <input id="fpath"
											name="fpath" class="mini-textbox" visible="false" /> <input
											id="fname" name="fpath" class="mini-textbox" visible="false" />
										<input id="ids" name="ids" class="mini-textbox"
											visible="false" />
										<table cellpadding="0" class="cxTab" cellspacing="0"
											border="0" width="100%">
											<tr>
												<td class="textR">诊断：</td>
												<td id="akc050s"></td>
											</tr>
											<tr>
												<td class="textR">规则描述：</td>
												<td id="aaa167s"></td>
											</tr>
											<tr>
												<td class="textR">医师意见：</td>
												<td colspan="2">
													<div style="padding-right: 4px;">
														<div class="textareaTl">
															<div class="textareaTr">
																<div class="textareaTc"></div>
															</div>
														</div>
														<div class="textareaLay">
															<textarea id="ysyj" name="ysyj" class="mini-textarea"
																emptyText="请输入直接申诉意见"></textarea>
														</div>
														<div class="textareaBl">
															<div class="textareaBr">
																<div class="textareaBc"></div>
															</div>
														</div>
													</div></td>
											</tr>
											<tr>
												<td class="textR">上传附件：</td>
												<td><input id="fileupload1" class="mini-fileupload"
													name="filedata"
													limitType="*.rar;*.zip;*.ppt;*.pptx;*.txt;*.doc;*.docx;*.xls;*.xlsx;*.jpg;*.png"
													limitSize="2MB"
													flashUrl="${pageContext.request.contextPath}/resource/scripts/swfupload.swf"
													uploadUrl="${pageContext.request.contextPath}/k5/f10505001/upload.action"
													onuploadsuccess="onUploadSuccess" width="240"
													onuploaderror="onUploadError" onfileselect="onFileSelect"
													buttonText="选择附件" /></td>
												<td><font style="color: red; font-size: 4px;">附件最大2MB</font>
												</td>
											</tr>
											<tr>
												<td></td>
												<td colspan="2"><span class="btnMini"
													style="margin: 0 10px"><em><input type="button"
															onclick="startUpload();" value="提交审核" /> </em> </span> <span
													class="btnMini" style="margin: 0 10px"><em><input
															type="button" onclick="preCheck( '1','5')" value="放弃申诉" />
													</em> </span></td>
												<td></td>
											</tr>
										</table>

									</div>
								</div>
								<div id="datagrid1" class="mini-datagrid"
									style="width: 100%; height: 100%;" idField="id"
									sortMode="client" multiSelect="true" allowResize="false"
									pageSize="20" onselectionchanged="queryDetail"
									onshowrowdetail="onShowRowDetail1" onload="afterload"
									showColumnsMenu="true"
									url="${pageContext.request.contextPath}/k5/f10505001/queryMedDocument.action">
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
												style="width: 100%" data="${dic['AKA130']}" />
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
									<span class="btnMini"> <em> <input type="button"
											value="申诉" onclick="sends('01');" /> </em> </span> <span class="btnMini"
										style="margin: 0px 20px 2px 20px;"><em><input
											type="button" value="放弃申诉" onclick="preCheck('2','5');" /> </em>
									</span>
								</div>
								<div id="datagrid2" class="mini-datagrid" style="height: 86%;"
									idField="id" multiSelect="true" allowResize="false"
									sortMode="client" pageSize="20"
									onshowrowdetail="onShowRowDetail2" onrowclick=""
									onrowdblclick="queryHistory" showColumnsMenu="true"
									showSummaryRow="true"
									url="${pageContext.request.contextPath}/k5/f10505001/queryMedDocumentDetail.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div field="baz101" type="comboboxcolumn" width="100"
											allowSort="true" headerAlign="center">
											审核状态 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ101']}">
										</div>
										<div field="ake002" width="100" headerAlign="center"
											allowSort="true">明细名称</div>
										<div field="aaa133" width="100" headerAlign="center">疑点说明</div>
										<div field="baz041" width="100" headerAlign="center">拟扣除金额</div>
										<div field="baz024" width="100" headerAlign="center"
											dateFormat="yyyyMMdd" allowSort="true">申述过期时间</div>
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
			<div title="east" region="east" width="400" expanded="false"
				showSplitIcon="true" showHeader="false" style="padding: 5px;">
				<div id="audit_tabs" class="mini-tabs" activeIndex="0"
					style="height: 100%; border: 0;" plain="false"
					buttons="#tabsButtons" onactivechanged="selectTabs">
					<div title="医院汇总">
						<div style="text-align: center; margin: 10px;">
							<form id="form2" action="#">
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
											</div></td>
										<td><input type="button" value="" class="cxsubmit"
											onclick="findHos();" /></td>
									</tr>
								</table>
								<div id="menuList1"></div>
							</form>
						</div>
					</div>
					<div title="规则汇总">
						<div style="text-align: center; margin: 10px;">
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
											</div></td>
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
											</div></td>
										<td><input type="button" value="" class="cxsubmit"
											onclick="findByGz();" /></td>
									</tr>
								</table>
								<div id="menuList2"></div>
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
		findHos();
		showDetailGz();
		grid1.load();
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

		var messageid;
		 
		function onFileSelect(e) {
	    }
	    function onUploadSuccess(e) {
	    	var json = $.parseJSON(e.serverData);
	    	mini.get("fname").setValue(json.result[0].targetFileName);
	    	mini.get("fpath").setValue(json.result[0].realpath);
	    	mini.get("filedataFileName").setValue(json.result[0].filedataFileName);
	    	mini.get("fileupload1").setText("");
	    	mini.hideMessageBox(messageid);
	    	SaveData();
	    }
	    function onUploadError(e) {
			mini.hideMessageBox(messageid); 
	    	if(e.code=="-110"){
	        	mini.get("fileupload1").setText("");
	        	mini.get("fileupload1").setButtonText("重新选择");
	        	mini.alert("文件超过2MB,请重新选择！"); 
	        }else{
	        	if(e.code!="-280"){  
			    	mini.get("fileupload1").setText("");
			        mini.get("fileupload1").setButtonText("重新选择");
			       	mini.alert("文件上传失败,请重新选择！"); 
	        	}
	        }
	    }
	    function startUpload() {
	        var fileupload = mini.get("fileupload1");
	        if(fileupload.getText()==""||fileupload.getText()==null){
	        	mini.confirm("确定不上传附件？", "附件确认",
	                    function (action) {
	                        if (action == "ok") {
	                        	SaveData(); 
	                        } else {
	                          
	                        }
	                    }
	                );            
	        }else{
	        	fileupload.startUpload();
	    		messageid=mini.loading("正在上传文件,请稍等...", "上传文件");
	        }        
	    }
	    function closeWin(){
			CloseWindow();
		}
		
		function CloseWindow(action) {
	 		if (window.CloseOwnerWindow){
	      		return window.CloseOwnerWindow(action);
	 		}else{
	     		window.close();
	 		}            
		}
		function SaveData() {
			var param={
					ids:mini.get("ids").getValue(),
					ysyj:mini.get("ysyj").getValue(),
					fname:mini.get("fname").getValue(),
					fpath:mini.get("fpath").getValue(),
					filedataFileName:mini.get("filedataFileName").getValue()
					};
	        $.ajax({
	          url: "${pageContext.request.contextPath}/k5/f10505001/docSubmit.action",
	          type: "post",
	          data: param,
	          dataType : 'json',
	          success: function (text) {
	            mini.unmask(document.body);
	          	if(text.success){
	          	 	mini.showMessageBox({
	      				title: "提示",
	      				message: "操作成功",
	      				buttons: ["确定"],
	      				iconCls: "mini-messagebox-info",
	      				callback: function(action){
	          	 		grid2.reload();
						grid1.reload();
	       			}});        	  
	          	}else{
	          	  mini.alert(text.msg);
	              }  
	          	
	          }
	      });
	  	}


		
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
			grid2.clearRows();
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
			var cp= mini.get("cp").value;
			for ( var int = 0; int < record.length; int++) {
				if (int + 1 == record.length) {
					ids += record[int].baz001;
				} else {
					ids += record[int].baz001 + ",";
				}
			}
			grid2.load({
				ids : ids,
				cp: cp
			});
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
						url : "${pageContext.request.contextPath}/k2/f10201002/queryMedDocumentIllegal.action",
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

		function onShowRowDetail2(e) {
			var grid = e.sender;
			var row = e.record;
			var td = grid.getRowDetailCellEl(row);
			td.appendChild(detailgrid2_Form);
			detailgrid2_Form.style.display = "block";
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k5/f10504001/indexInfoDetailAction.action",
						type : "post",
						data : {
							baz001 : row.baz001,
							baz003 : row.baz003
						},
						success : function(text) {
							if (text.success) {
								    mini.get("ids").setValue(row.baz003);
                                    document.getElementById("akc050s").innerHTML="'"+text.result[0].akc050+"'";
								for ( var i = 0; i < text.result[0].kc72List.length; i++) {
									document.getElementById("aaa167s").innerHTML="'"+text.result[0].kc72List[i].aaa167+"'：'"+ text.result[0].kc72List[i].aaa133+"'";
								}
							} else {
								mini.alert(text.msg);
							}
						}
					});
		}
		 
		function setandsearch(name, id) {
			if (mini.get("akb021").getValue() != name) {
				mini.get("akb021").setValue(name);
				var data = queryForm.getData(true);
				grid1.load(data);
			}
			var sbtitle = document.getElementById(id);
			if (sbtitle.style.display == '') {
				sbtitle.style.display = 'none';
			} else {
				sbtitle.style.display = '';
			}
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
		
		function sends(baz031){
			if (grid2.getSelecteds().length > 0) {
				var record = grid2.getSelecteds();
				var ids = "";
				for ( var int = 0; int < record.length; int++) {
					if (int + 1 == record.length) {
						ids += record[int].baz003;
					} else {
						ids += record[int].baz003 + ",";
					}
				}
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k5/f10505001/f10505001_batchAdd.jsp",
					title:"提交材料",
					width: 350,
                	height: 200,
                	onload: function () {
		                var iframe = this.getIFrameEl();
		                var data = {ids : ids};
						iframe.contentWindow.setData(data);
		            },
                	ondestroy: function (action){
		            	grid2.reload(function(){
							if(grid2.getTotalCount()==0){
								grid1.reload();
							}
						});
                	}
				});
			} else {
				mini.alert("请选择行数据");
			}
		}
		function preCheck(tag, bazValue) {
			var jsongrid2 = grid2.getSelecteds();
			var baz033 = "2";
			if (jsongrid2.length == 0) {
				mini.alert("请选择左侧要申诉的单据明细信息!");
				return;
			}
			var ids = "";
			var int = 0;
			if ("1" == tag) {
				var getdata = document.getElementById("ysyj").value;
				ids = jsongrid2[int].baz001 + ":" + jsongrid2[int].baz003 + ":"
						+ jsongrid2[int].baz031 + ":" + jsongrid2[int].baz101
						+ ":" + getdata + ":" + baz033 + ":" + bazValue;
			} else if ("2" == tag) {
				for (int; int < jsongrid2.length; int++) {
					if (int + 1 == jsongrid2.length) {
						ids += jsongrid2[int].baz001 + ":"
								+ jsongrid2[int].baz003 + ":"
								+ jsongrid2[int].baz031 + ":"
								+ jsongrid2[int].baz101 + ":" + baz033 + ":"
								+ bazValue;
					} else {
						ids += jsongrid2[int].baz001 + ":"
								+ jsongrid2[int].baz003 + ":"
								+ jsongrid2[int].baz031 + ":"
								+ jsongrid2[int].baz101 + ":" + baz033 + ":"
								+ bazValue + ",";
					}
				}
			}
			if ("2" == tag) {
				mini
						.open({
							url : "${pageContext.request.contextPath}/pages/k5/f10505001/f10505001_info.jsp",
							title : '放弃申诉',
							width : 350,
							height : 200,
							onload : function() {
								var iframe = this.getIFrameEl();
								var data = {
									submitData : ids,
									tag : tag
								};
								iframe.contentWindow.SetData(data);
							},
							ondestroy : function(action) {
								grid2.reload();
								grid1.reload();
							}
						});
			} else {
				mini.mask({
					el : document.body,
					cls : 'mini-mask-loading',
					html : '处理中...'
				});
				$
						.ajax({
							url : "${pageContext.request.contextPath}/k5/f10505001/indexComplaintUpdateAction.action",
							type : "post",
							data : {
								submitData : ids,
								tag : tag
							},
							success : function(text) {
								mini.unmask(document.body);
								if (text.success) {
									mini.showMessageBox({
										title : "提示",
										message : "操作成功",
										buttons : [ "确定" ],
										iconCls : "mini-messagebox-info",
										callback : function(action) {
											grid2.reload();
											grid1.reload();
										}
									});
								} else {
									mini.alert(text.msg);
								}
							}
						});
			}
		}
		 
	function showDetailHos(){
		var data = form2.getData(true);
		 $("#menuList1").html("<font color=\"red\">正在查询医院数据,请稍等...</font>");
		var url = "${pageContext.request.contextPath}/k5/f10505002/queryMedDocumentByHos.action";
		getChartData(url,data,function(data){
			if(data.success){
				$("#menuList1").empty();
				for(var i=0;i<data.result.length;i++){
	
					var htmlStr = "";
					htmlStr+="<div class=\"top_name\">";
					htmlStr+=" <a class=\"top_name_fontsize\" href=\"#\" onclick=\"setandsearch('"+data.result[i].akb021+"','"+data.result[i].akb020.replace(/[ ]/g,"")+"');\">"+data.result[i].akb021+"</a>";
					htmlStr+=" </div>";
					htmlStr+="<table cellpadding=\"0\" class=\"cxTab\" cellspacing=\"0\" border=\"0\" width=\"100%\">";
					htmlStr+="<tr> <td style=\"padding-bottom:6px;\">待申述数：</td> </tr>";
					htmlStr+="<tr>  <td style=\"padding-bottom:6px;\"><div class=\"td_number\">"+data.result[i].dshs+"</div> </td> </tr>";
			
	
					htmlStr+="</table>";
					$("#menuList1").append(htmlStr);
				}
			}else{
				
				$("#menuList1").html("<font color=\"red\">没有找到相关医院<br/>请输入医疗机构名称关键字或完整的医疗机构代码</font>");
			}
			});
	}
	function getChartData(url, params, callback) {
		$.ajax(url, {
			type : 'POST',
			data :  params,
			cache : false,
			async : true,
			dataType : 'json',
			success : function(data) {
				callback(data);
			},
			error:function(){
				alert("error");
			}
		});
	}
	function findHos(){
		showDetailHos();
	}
	function showDetailGz(){
		var url="${pageContext.request.contextPath}/common/queryGzSummary.action";
		$("#menuList2").html("<font color=\"red\">正在查询规则汇总数据,请稍等...</font>");
		var data={
				baz031:'04',
				baz021:'',
				baz101:'2',
				baz102:''
			}
		getChartData(url,data,function(data){
			if(data.success){
				$("#menuList2").empty();
				for(var i=0;i<data.result.length;i++){
					var htmlStr ="";
					htmlStr +="<div class=\"top_name\"><a class=\"top_name_fontsize\" href=\"#\" onclick=\"findByGz('"+data.result[i].gzflbm+"','"+data.result[i].gzbm+"')\">"+data.result[i].gzmc+"</a></div>";
					htmlStr +="<table cellpadding=\"0\" class=\"cxTab\" cellspacing=\"0\" border=\"0\" width=\"100%\">";
					htmlStr +="<tr><td style=\"padding-bottom:6px;\">待申述数：</td></tr>";
					htmlStr +="<tr><td style=\"padding-bottom:6px;\" rowspan=\"3\"><div class=\"td_number \">"+data.result[i].dsss+"</div></td></tr>";
					htmlStr +="</table>";
					$("#menuList2").append(htmlStr);
				}
			}else{
				$("#menuList2").html("<font color=\"red\">没有找到相关规则数据<br/>请重新选择</font>");
			}
		});
	}
	function findByGz(a,b){
		if(a!=undefined&&b!=undefined){
			tabgzfl.setValue(a);
			var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id="
				+ a;
			tabgzflmc.setUrl(url);
			tabgzflmc.setValue(b);
		}
		var fl=tabgzfl.getValue();
		var mc=tabgzflmc.getValue();
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
