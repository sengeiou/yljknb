<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医疗机构查询申诉</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
		   var ac62Baz031 = [{id:'08',text:'申诉待复议'},{id:'09',text:'扣款'},{id:'12',text:'复议扣款'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	<body>
		<div>
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR">
								参保人姓名：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac003" name="aac003" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								机构编码：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020" name="akb020" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						    <td class="textR">
								机构名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021" name="akb021" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								医师编码：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz263" name="aaz263" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								医师姓名：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="bac003" name="bac003" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
						    <td class="textR">
								就诊类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aka130" name="aka130" class="mini-combobox"
												emptyText="选择就诊类别..." data="${dic['AKA130']}" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								审核状态：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="ac62Baz031" name="ac62Baz031" class="mini-combobox"
												emptyText="选择审核状态..." data="ac62Baz031" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								结算时间：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc194Start" name="akc194Start" format="yyyyMMdd" class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td>至</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc094End" name="akc094End" format="yyyyMMdd" class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td style="text-align: center; padding-top: 5px;" colspan="2">
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resetForm();" />
							</td>
						</tr>
					</table>
				</form>

			</div>
		</div>

		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">单据</span>
				</h3>
			</div>

			<div id="datagrid1" class="mini-datagrid"
				style="width: 100%; height: 200px;" idField="id" multiSelect="true"
				allowResize="false" pageSize="20" onrowclick="queryDetail" 
				onshowrowdetail="onShowRowDetail1"
				url="${pageContext.request.contextPath}/k5/f10501002/queryAppealMedDocument.action">
				<div property="columns">
					<div type="checkcolumn"></div>
					<div type="expandcolumn">~</div>
					<div field="baz021" type="comboboxcolumn" width="100" headerAlign="center">
						智能审核结果<input property="editor" class="mini-combobox" style="width:100%" data="${dic['BAZ021']}">
					</div>
					<div field="baz001" width="100" headerAlign="center">
						违规单据ID
					</div>
					<div field="aaz370" width="100" headerAlign="center">
						就诊编号
					</div>
					<div field="aaz308" width="100" headerAlign="center">
						结算信息ID
					</div>
					<div field="aac003" width="100" headerAlign="center">
						参保人姓名
					</div>
					<div field="aac002" width="100" headerAlign="center">
						社会保障号
					</div>
					<div field="aac001" width="100" headerAlign="center">
						参保人ID
					</div>
					<div field="aac004" type="comboboxcolumn" width="100" headerAlign="center">
						参保人性别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
					</div>
					<div field="aac006" width="100" headerAlign="center">
						参保人出生日期
					</div>
					<div field="aac012" type="comboboxcolumn" width="100" headerAlign="center">
						个人身份<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC012']}">
					</div>
					<div field="akb020" width="100" headerAlign="center">
						医疗服务机构编号
					</div>
					<div field="akb021" width="100" headerAlign="center">
						医疗服务机构名称
					</div>
					<div field="akb022" type="comboboxcolumn" width="100" headerAlign="center">
						医疗服务机构类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKB022']}">
					</div>
					<div field="aaz307" width="100" headerAlign="center">
						科室编码
					</div>
					<div field="akf001" type="comboboxcolumn" width="100" headerAlign="center">
						科室分类<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKF001']}">
					</div>
					<div field="aae386" width="100" headerAlign="center">
						科室名称
					</div>
					<div field="aaz263" width="100" headerAlign="center">
						医护人员编号
					</div>
					<div field="aka130" type="comboboxcolumn" width="100" headerAlign="center">
						就诊类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKA130']}">
					</div>
					<div field="akc194" dateFormat="yyyyMMdd" width="100" headerAlign="center">
						就诊结算时间
					</div>
					<div field="ake038" width="100" headerAlign="center">
						个人账户支出
					</div>
					<div field="akc254" width="100" headerAlign="center">
						个人自付金额
					</div>
					<div field="akc253" width="100" headerAlign="center">
						自费金额
					</div>
					<div field="akb067" width="100" headerAlign="center">
						个人现金支付金额
					</div>
					<div field="akc264" width="100" headerAlign="center">
						总费用
					</div>
					<div field="akc050" width="100" headerAlign="center">
						入院疾病诊断名称
					</div>
					<div field="akc193" width="100" headerAlign="center">
						入院疾病诊断代码
					</div>
					<div field="akc185" width="100" headerAlign="center">
						出院主要疾病诊断
					</div>
					<div field="aka120" width="100" headerAlign="center">
						出院主要诊断编码
					</div>
					<div field="akc186" width="100" headerAlign="center">
						出院次要疾病诊断
					</div>
					<div field="akc188" width="100" headerAlign="center">
						出院次要疾病诊断编码
					</div>
					<div field="akc274" width="100" headerAlign="center">
						出院次要疾病第三诊断
					</div>
					<div field="akc275" width="100" headerAlign="center">
						出院次要疾病第三诊断编码
					</div>
					<div field="akc276" width="100" headerAlign="center">
						出院次要疾病第四诊断
					</div>
					<div field="akc277" width="100" headerAlign="center">
						出院次要疾病第四诊断编码
					</div>
					<div field="aae030" width="100" headerAlign="center">
						入院日期
					</div>
					<div field="aae031" width="100" headerAlign="center">
						出院日期
					</div>
					<div field="baz020" width="100" dateFormat="yyyyMMdd" headerAlign="center">
						智能审核时间
					</div>
					<div field="baz022" width="100" headerAlign="center">
						智能审核结果说明
					</div>
					<div field="baz031" type="comboboxcolumn" width="100" headerAlign="center">
						审核状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['BAZ031']}">
					</div>
					<div field="aaa027" width="100" headerAlign="center">
						统筹区
					</div>
				</div>
			</div>

			<div id="detailgrid1_Form" style="display: none;">
				<div id="detailgrid1">
				</div>
			</div>
			
			<div id="detailgrid2_Form" style="display: none;">
				<div id="detailgrid2">
				</div>
			</div>

			<div class="mini-splitter nobor" style="width: 100%; height: 200px;">
				<div size="70%" showCollapseButton="false" style="padding: 5px;">
					<div id="detail_tabs" class="mini-tabs" activeIndex="0"
						style="height: 100%; border: 0;" plain="false"
						buttons="#tabsButtons">

						<div title="费用明细">
							<div id="datagrid2" class="mini-datagrid" style="height: 100%;"
								idField="id" multiSelect="true" allowResize="false"
								pageSize="20" onshowrowdetail="onShowRowDetail2"
								onrowclick="queryCheckRecord"
								url="${pageContext.request.contextPath}/k5/f10501002/queryAppealMedDocumentDetail.action">
								<div property="columns">
									<div type="checkcolumn"></div>
									<div type="expandcolumn">
										~
									</div>
									<div type="talkcolumn" width="40" renderer="onZtGenderRenderer">
										~
									</div>
									<div field="baz031" type="comboboxcolumn" width="100"
										headerAlign="center">
										审核状态
										<input property="editor" class="mini-combobox"
											style="width: 100%" data="${dic['BAZ031']}">
									</div>
									<div field="baz033" type="comboboxcolumn" width="100"
										headerAlign="center">
										违规类型
										<input property="editor" class="mini-combobox"
											style="width: 100%" data="${dic['BAZ033']}">
									</div>
									<div field="baz003" width="100" headerAlign="center">
										违规明细ID
									</div>
									<div field="baz001" width="100" headerAlign="center">
										违规单据ID
									</div>
									<div field="ake001" width="100" headerAlign="center">
										社保三大目录统一编码
									</div>
									<div field="ake002" width="100" headerAlign="center">
										社保三大目录名称
									</div>
									<div field="ake003" type="comboboxcolumn" width="100"
										headerAlign="center">
										三大目录类别
										<input property="editor" class="mini-combobox"
											style="width: 100%" data="${dic['AKE003']}">
									</div>
									<div field="aka065" type="comboboxcolumn" width="100"
										headerAlign="center">
										收费项目等级
										<input property="editor" class="mini-combobox"
											style="width: 100%" data="${dic['AKA065']}">
									</div>
									<div field="aka081" width="100" headerAlign="center">
										用药途径
									</div>
									<div field="ake106" width="100" headerAlign="center">
										常规用量
									</div>
									<div field="aka072" width="100" headerAlign="center">
										用药频次
									</div>
									<div field="aka071" width="100" headerAlign="center">
										单次用量
									</div>
									<div field="ake131" width="100" headerAlign="center">
										用量单位类型
									</div>
									<div field="akc229" width="100" headerAlign="center">
										用药天数
									</div>
									<div field="akc231" width="100" headerAlign="center">
										药量天数
									</div>
									<div field="akc226" width="100" headerAlign="center">
										数量
									</div>
									<div field="akc225" width="100" headerAlign="center">
										单价
									</div>
									<div field="aka052" width="100" headerAlign="center">
										计价单位
									</div>
									<div field="aka074" width="100" headerAlign="center">
										规格
									</div>
									<div field="ake004" width="100" headerAlign="center">
										材料名称
									</div>
									<div field="aka098" width="100" headerAlign="center">
										生产单位
									</div>
									<div field="ake005" width="100" headerAlign="center">
										生产地类别
									</div>
									<div field="akb065" width="100" headerAlign="center">
										合计
									</div>
									<div field="aaz213" width="100" headerAlign="center">
										明细ID
									</div>
									<div field="aaa027" width="100" headerAlign="center">
										统筹区
									</div>
								</div>
							</div>
						</div>

						<div title="明细统计">

						</div>

						<div title="就诊信息">
							<div class="infoTab">
								就诊信息
								<br />
								<br />
								<hr />
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<th width="10%">
											机构编号：
										</th>
										<td>
											<span id="akb020_jz"></span>
										</td>
										<th width="10%">
											个人编号：
										</th>
										<td>
											<span id="aac001_jz"></span>
										</td>
										<th width="10%">
											社会保障号：
										</th>
										<td>
											<span id="aac002_jz"></span>
										</td>
									</tr>
									<tr>
										<th width="10%">
											参保人：
										</th>
										<td>
											<span id="aac003_jz"></span>
										</td>
										<th width="10%">
											险种类型：
										</th>
										<td>
											<span id="aae140_jz"></span>
										</td>
										<th width="10%">
											就诊类型：
										</th>
										<td>
											<span id="aka130_jz"></span>
										</td>
									</tr>
									<tr>
										<th width="10%">
											入院日期：
										</th>
										<td>
											<span id="aae030_jz"></span>
										</td>
										<th width="10%">
											出院日期：
										</th>
										<td>
											<span id="aae031_jz"></span>
										</td>
										<th width="10%">
											结算日期：
										</th>
										<td>
											<span id="akc194_jz"></span>
										</td>
									</tr>
									<tr>
										<th width="10%">
											医疗费总额：
										</th>
										<td colapan="5">
											<span id="akc264_jz"></span>
										</td>
									</tr>
								</table>
								<br />
								诊断信息
								<br />
								<br />
								<hr />
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<th width="15%">
											主要疾病诊断：
										</th>
										<td colspan="5">
											<span id="akc185_jz"></span>
										</td>
									</tr>
									<tr>
										<th width="15%">
											次要疾病诊断：
										</th>
										<td colspan="5">
											<span id="akc186_jz"></span>
										</td>
									</tr>
									<tr>
										<th width="15%">
											疾病第三诊断：
										</th>
										<td colspan="5">
											<span id="akc274_jz"></span>
										</td>
									</tr>
									<tr>
										<th width="15%">
											疾病第四诊断：
										</th>
										<td colspan="5">
											<span id="akc276_jz"></span>
										</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
				<div showCollapseButton="false" style="padding: 5px;">
					<div id="audit_tabs" class="mini-tabs" activeIndex="0"
						style="height: 100%; border: 0;" plain="false"
						buttons="#tabsButtons">

						<div title="反馈信息">
						    <div style="text-align:center; margin:15px;">
							    <form id="form2" action="#">
									<table cellpadding="0" class="cxTab" cellspacing="0" border="0"	width="100%">
										<tr>
											<td>
												反馈意见：
											</td>
											<td colspan="2" width="80%">
											   <div style="padding-right:4px;">
											   <div class="textareaTl"><div class="textareaTr"><div class="textareaTc"></div></div></div>
											   <div class="textareaLay">
											       <textarea id="baz021" name="baz021" class="mini-textarea" emptyText="请输入反馈意见"></textarea>
												   <input id="medDetailListStr" name="medDetailListStr" class="mini-hidden" required="true"/>
												   <input id="baz031" name="baz031" class="mini-hidden" required="true"/>
												   <input id="baz033" name="baz033" class="mini-hidden" required="true"/>
											   </div>
											   <div class="textareaBl"><div class="textareaBr"><div class="textareaBc"></div></div></div>
											   </div>
											</td>
										</tr>
										<tr>
											<td nowrap="nowrap" colspan="3" style="text-align: center; padding-top: 5px;">
												<span class="btnMini"><em><input type="button" onclick="preCheck('08')" value="申诉复议"/></em></span>
											</td>
										</tr>
									</table> 
								</form> 
						    </div>
						</div>
						<div title="审核日志">
						    <div id="checkRecord" class="auditBox mini-datagrid" style="height: 100%;" showColumns="false" showPager="false" 
						        showHGridLines="false" showVGridLines="false" 
						        url="${pageContext.request.contextPath}/k2/f10201002/queryMedDocumentDetailIllegal.action">
								<div property="columns">
								    <div type="indexcolumn"></div>
								    <div field="baz031" type="comboboxcolumn" width="80" headerAlign="center">
										状态<input property="editor" class="mini-combobox" data="${dic['BAZ031']}">
									</div>
									<div field="baz021" width="200" headerAlign="center">
										审核结果说明
									</div>
									<div field="baz041Str" width="100" headerAlign="center">
										扣款金额
									</div>
									<div field="bae041Str" width="100" headerAlign="center">
										医师扣分
									</div>
									<div field="baz022" width="50" headerAlign="center">
										审核人
									</div>
									<div field="baz023Str" dataType="date" dateFormat="yyyy-MM-dd" width="100" headerAlign="center">
										审核时间
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
	var checkRecord = mini.get("checkRecord");
	var detailgrid1_Form = document.getElementById("detailgrid1_Form");
	var detailgrid2_Form = document.getElementById("detailgrid2_Form");
	
	var queryForm = new mini.Form("form1");
	var form2 = new mini.Form("form2");
	
	grid1.load();
	checkRecord.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;

        if (e.rowIndex%2 == 0) {
        	e.rowCls = "rowtype1";
        }else{
       	    e.rowCls = "rowtype2";
        }
        if (field == "baz021") {
            e.cellStyle = "color:red";
        }

    });
	grid2.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;

        //违规明细,红色标识
        if (field == "baz032" && value == '1') {
            e.rowStyle = "color:red";
        }

    });

	function search() {
		var data = queryForm.getData(true);
		grid1.load(data);
	}

	function queryDetail(e) {
		var grid = e.sender;
		var record = grid.getSelected();
		grid2.load( {
			baz001 : record.baz001
		}/* , function(){
			queryMedVisitInfo(record.aaz308,record.aaz370);
		} */);
	}
	function queryMedVisitInfo(aaz308,aaz370){
		$.ajax({
            url: "${pageContext.request.contextPath}/k2/f10201002/queryMedVisitInfo.action",
            type: "post",
            data: {aaz308:aaz308,aaz370:aaz370},
            success: function (text) {
            	if(text.success){
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
            	}else{
                	mini.alert(text.msg);
                }  
            }
        });
	}
	function onShowRowDetail1(e) {
        var grid = e.sender;
        var row = e.record;
        var td = grid.getRowDetailCellEl(row);
        td.appendChild(detailgrid1_Form);
        detailgrid1_Form.style.display = "block";
        $("#detailgrid1").html("");
        $.ajax({
            url: "${pageContext.request.contextPath}/k5/f10501002/queryAppealMedDocumentIllegal.action",
            type: "post",
            data: { baz001: row.baz001 },
            success: function (text) {
            	if(text.success){
                	var htmlStr = "";
                	for(var i=0;i<text.result[0].kc73List.length;i++){
                		htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
                		htmlStr += "<span>";
                		htmlStr += text.result[0].kc73List[i].aaa167 + "："; 
                		htmlStr += "</span>";
                		htmlStr += text.result[0].kc73List[i].aaa133;
                		htmlStr += "</div>";
                    }
            		$("#detailgrid1").append(htmlStr);
            	}else{
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
        $("#detailgrid2").html("");
        $.ajax({
            url: "${pageContext.request.contextPath}/k5/f10501002/queryAppealMedDocumentDetailIllegal.action",
            type: "post",
            data: { baz001: row.baz001,baz003: row.baz003 },
            success: function (text) {
            	if(text.success){
            		var htmlStr = "<div style='padding:6px 10px 6px 62px;'>";
                	htmlStr += "<span>";
            		htmlStr += "诊断："; 
            		htmlStr += "</span>";
            		htmlStr += text.result[0].akc050;
            		htmlStr += "</div>";
                	for(var i=0;i<text.result[0].kc72List.length;i++){
                		htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
                		htmlStr += "<span>";
                		htmlStr += text.result[0].kc72List[i].aaa167 + "："; 
                		htmlStr += "</span>";
                		htmlStr += text.result[0].kc72List[i].aaa133;
                		htmlStr += "</div>";
                    }
            		$("#detailgrid2").append(htmlStr);
            	}else{
                	mini.alert(text.msg);
                }  
            }
        });
    }

    function preCheck(baz031){

        if(baz031 == null || baz031 == '' ){
        	mini.alert("审核状态为空!");
        	return;
        }

    	var jsongrid2 = grid2.getSelecteds();
    	if(jsongrid2.length == 0){
        	mini.alert("请选择左侧要申诉的单据明细信息!");
        	mini.get("medDetailListStr").setValue('');
        	return;
        }
        var jsonStr = mini.encode(jsongrid2);
    	mini.get("medDetailListStr").setValue(jsonStr);
    	mini.get("baz031").setValue(baz031);
    	mini.get("baz033").setValue("2");//违规类型:明细违规

    	var data = form2.getData(); 
        form2.validate();
        if (form2.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k5/f10501002/medDocumentDetailAppealOperate.action",
            type: "post",
            data: { submitData: json },
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: "操纵成功",
        				buttons: ["确定"],
        				iconCls: "mini-messagebox-info",
        				callback: function(action){
            	 		grid2.reload();
         			}});        	  
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
    }
    function queryCheckRecord(e) {
		var grid = e.sender;
		var record = grid.getSelected();
		$.ajax({
            url: "${pageContext.request.contextPath}/k2/f10201002/queryCheckRecord.action",
            type: "post",
            data: { baz003: record.baz003 },
            success: function (text) {
            	if(text.success){
            		mini.get("checkRecord").setData(text.result);
            		mini.get("audit_tabs").activeTab(1);
            	}else{
                	mini.alert(text.msg);
                }  
            }
        });
	}
    function onZtGenderRenderer(e){
    	var record = e.row;
        return "<a href='javascript:void(0)' onclick = showMess('" + record.baz003 + "')><img src='../../../images/ssxx.png' /></a> ";
    }
    function showMess(baz003){
    	mini.open({
			url:"${pageContext.request.contextPath}/pages/k2/f10201003/f10201003_talk.jsp",
			title:"信息交互",
			width:800,
			height:450,
			onload:function(){
				var iframe = this.getIFrameEl();
				var data = {baz003 : baz003};
				iframe.contentWindow.setData(data);
			},
			ondestroy:function(action){
				
			}
		});
    }
	function resetForm() {
		queryForm.reset();
	}
</script>
	</body>
</html>
