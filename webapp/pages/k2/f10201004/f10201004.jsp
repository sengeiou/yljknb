<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>

		<title>审核复议</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	    <script type="text/javascript">
		  var bae041 = [{id:0,text:'0分'},{id:1,text:'1分'},{id:2,text:'2分'},{id:3,text:'3分'}];
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
									<div class="inputR" style="width: 134px;">
										<div class="inputC" style=" width: 134px;">
											<input id="aac003" name="aac003" class="mini-textbox" />
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
						</tr>
						<tr>
						<td class="textR">
								规则类别：
							</td>
							<td>
								<div class="inputL" style="width: 140px">
									<div class="inputR">
										<div class="inputC">
										
											<input id="gzfl" name="ybfgzflbm" onvaluechanged="onDeptChanged"  emptyText="请选择..."
												class="mini-combobox"  url="${pageContext.request.contextPath}/k4/f10402008/getGzfl.action" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
							规则名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="gzflmc" name="ybgzflbm" emptyText="请选择..." class="mini-combobox"  />
											</div>
										</div>
								</div>
							</td>
							<td class="textR">
								知识点：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="zsdmc" name="zsdmc" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">
								结算时间：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR" style=" width: 134px;">
										<div class="inputC" style=" width: 134px;">
											<input id="akc194Start" name="akc194Start" format="yyyyMMdd"
												class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td style="padding-left: 25px;">
								至
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc094End" name="akc094End" format="yyyyMMdd"
												class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td></td>
							<td></td>
							<td style="text-align: center; padding-top: 5px; padding-left: 55px;" colspan="2">
								<input id="ac62Baz031" name="ac62Baz031" class="mini-hidden" value="08" />
								<input type="button" value="" class="cxsubmit"
									onclick="search();" />
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
				<div class="fR pT5R9">
				    <span class="btnMini"><em><input type="button" value="全部完成"/></em></span>
				    <span class="btnMini"><em><input type="button" value="全部正常"/></em></span>
				    <span class="btnMini"><em><input type="button" value="审核日志"/></em></span>
				</div>
			</div>

			<div id="grid1" class="mini-datagrid"
				url="<%=request.getContextPath()%>/k2/f10201004/queryF10201004.action"
				style="width: 100%; height: 200px;" idField="id" pageSize="20"
				multiSelect="true" onshowrowdetail="onShowRowDetail1"
				onrowclick="queryDetail">
				<div property="columns">
					<div type="checkcolumn"></div>
					<div type="expandcolumn">
						~
					</div>
					<div field="baz021" width="100" headerAlign="center" align="center"
						type="comboboxcolumn">
						智能审核结果
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['BAZ021']}">
					</div>
					<div field="baz031" width="100" headerAlign="center" align="center"
						type="comboboxcolumn">
						审核状态
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['BAZ031']}">
					</div>
					<div field="baz001" width="120" headerAlign="center" align="center">
						违规单据ID
					</div>
					<div field="aaz370" width="80" headerAlign="center" align="center">
						就诊编号
					</div>
					<div field="aaz308" width="100" headerAlign="center">
						结算信息ID
					</div>
					<div field="aac003" width="100" headerAlign="center" align="center">
						参保人姓名
					</div>
					<div field="aac002" width="100" headerAlign="center" align="center">
						社会保障号
					</div>
					<div field="aac001" width="100" headerAlign="center" align="center">
						参保人ID
					</div>
					<div field="aac004" width="100" headerAlign="center" align="center"
						type="comboboxcolumn">
						参保人性别
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAC004']}">
					</div>
					<div field="aac006" width="100" headerAlign="center" align="center">
						参保人出生日期
					</div>
					<div field="aac012" width="100" headerAlign="center" align="center">
						个人身份
					</div>
					<div field="akb020" width="100" headerAlign="center" align="center">
						机构编号
					</div>
					<div field="akb021" width="100" headerAlign="center" align="center">
						机构名称
					</div>
					<div field="akb022" width="100" headerAlign="center" align="center"
						type="comboboxcolumn">
						机构类型
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AKB022']}">
					</div>
					<div field="aaz307" width="100" headerAlign="center" align="center">
						科室编码
					</div>
					<div field="akf001" width="100" headerAlign="center" align="center"
						type="comboboxcolumn">
						科室分类
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AKF001']}">
					</div>
					<div field="aae386" width="100" headerAlign="center" align="center">
						科室名称
					</div>
					<div field="aaz263" width="100" headerAlign="center" align="center">
						医护人员编号
					</div>
					<div field="aka130"  width="100" headerAlign="center" align="center"
						type="comboboxcolumn">
						就诊类别
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AKA130']}">
					</div>
					<div field="akc194" width="100" headerAlign="center"
						dateFormat="yyyyMMdd">
						就诊结算时间
					</div>
					<div field="ake038" width="100" headerAlign="center" align="center"
						dataType="currency">
						个人账户支出
					</div>
					<div field="akc254" width="100" headerAlign="center" align="center"
						dataType="currency">
						个人自付金额
					</div>
					<div field="akc253" width="100" headerAlign="center" align="center"
						dataType="currency">
						自费金额
					</div>
					<div field="akb067" width="100" headerAlign="center" align="center"
						dataType="currency">
						个人现金支付金额
					</div>
					<div field="akc264" width="100" headerAlign="center" align="center"
						dataType="currency">
						总费用
					</div>
					<div field="akc050" width="100" headerAlign="center" align="center">
						入院疾病诊断名称
					</div>
					<div field="akc193" width="100" headerAlign="center" align="center">
						入院疾病诊断代码
					</div>
					<div field="akc185" width="100" headerAlign="center" align="center">
						出院主要疾病诊断
					</div>
					<div field="aka120" width="100" headerAlign="center" align="center">
						出院主要诊断编码
					</div>
					<div field="akc186" width="100" headerAlign="center" align="center">
						出院次要疾病诊断
					</div>
					<div field="akc188" width="100" headerAlign="center" align="center">
						出院次要疾病诊断编码
					</div>
					<div field="akc274" width="100" headerAlign="center" align="center">
						出院次要疾病第三诊断
					</div>
					<div field="akc275" width="100" headerAlign="center" align="center">
						出院次要疾病第三诊断编码
					</div>
					<div field="akc276" width="100" headerAlign="center" align="center">
						出院次要疾病第四诊断
					</div>
					<div field="akc277" width="100" headerAlign="center" align="center">
						出院次要疾病第四诊断编码
					</div>
					<div field="aae030" width="100" headerAlign="center" align="center">
						入院日期
					</div>
					<div field="aae031" width="100" headerAlign="center" align="center">
						出院日期
					</div>
					<div field="baz020" width="100" headerAlign="center" align="center"
						dateFormat="yyyyMMdd">
						智能审核时间
					</div>
					
					<div field="baz022" width="100" headerAlign="center" align="center">
						智能审核结果说明
					</div>
					
					<div field="aaa027" width="100" headerAlign="center" align="center">
						统筹区
					</div>
				</div>
			</div>
		</div>
		<div id="detailgrid1_Form" style="display: none;">
			<div id="detailgrid1">
			</div>
		</div>

		<div id="detailgrid2_Form" style="display: none;">
			<div id="detailgrid2" >
			</div>
		</div>

		<div class="mini-splitter nobor" style="width: 100%; height: 200px;">
			<div size="70%" showCollapseButton="false" style="padding: 5px;">
				<div id="detail_tabs" class="mini-tabs" activeIndex="0"
					style="height: 100%; border: 0;" plain="false"
					buttons="#tabsButtons">
					<div title="费用明细">
						<div id="grid2" class="mini-datagrid" style="height: 100%;"
							idField="id" multiSelect="true" allowResize="false" pageSize="20"
							onshowrowdetail="onShowRowDetail2" onrowclick="queryCheckRecord"
							url="${pageContext.request.contextPath}/k2/f10201004/queryF10201004Detail.action">
							<div property="columns">
								<div type="checkcolumn"></div>
								<div type="expandcolumn">
									~
								</div>
								<div field="baz031" width="100" headerAlign="center"
									align="center" type="comboboxcolumn">
									审核状态
									<input property="editor" class="mini-combobox"
										style="width: 100%" data="${dic['BAZ031']}">
								</div>
								<div field="baz033" width="100" headerAlign="center"
									align="center" type="comboboxcolumn">
									违规类型
									<input property="editor" class="mini-combobox"
										style="width: 100%" data="${dic['BAZ033']}">
								</div>
								<div field="baz003" width="120" headerAlign="center"
									align="center">
									违规明细ID
								</div>
								<div field="baz001" width="120" headerAlign="center"
									align="center">
									违规单据ID
								</div>
								<div field="ake001" width="100" headerAlign="center"
									align="center">
									社保三大目录统一编码
								</div>
								<div field="ake002" width="100" headerAlign="center"
									align="center">
									社保三大目录名称
								</div>
								<div field="ake003" width="100" headerAlign="center"
									align="center">
									三大目录类别
								</div>
								<div field="aka065" width="100" headerAlign="center"
									align="center">
									收费项目等级
								</div>
								<div field="aka081" width="100" headerAlign="center"
									align="center">
									用药途径
								</div>
								<div field="ake106" width="100" headerAlign="center"
									align="center">
									常规用量
								</div>
								<div field="aka072" width="100" headerAlign="center"
									align="center">
									用药频次
								</div>
								<div field="aka071" width="100" headerAlign="center"
									align="center">
									单次用量
								</div>
								<div field="ake131" width="100" headerAlign="center"
									align="center">
									用量单位类型
								</div>
								<div field="akc229" width="100" headerAlign="center"
									align="center">
									用药天数
								</div>
								<div field="akc231" width="100" headerAlign="center"
									align="center">
									药量天数
								</div>
								<div field="akc226" width="100" headerAlign="center"
									align="center">
									数量
								</div>
								<div field="akc225" width="100" headerAlign="center"
									align="center">
									单价
								</div>
								<div field="aka052" width="100" headerAlign="center"
									align="center">
									计价单位
								</div>
								<div field="aka074" width="100" headerAlign="center"
									align="center">
									规格
								</div>
								<div field="ake004" width="100" headerAlign="center"
									align="center">
									材料名称
								</div>
								<div field="aka098" width="100" headerAlign="center"
									align="center">
									生产单位
								</div>
								<div field="ake005" width="100" headerAlign="center"
									align="center">
									生产地类别
								</div>
								<div field="akb065" width="100" headerAlign="center"
									align="center">
									合计
								</div>
								<div field="aaz213" width="100" headerAlign="center"
									align="center">
									明细ID
								</div>

								<div field="aaa027" width="100" headerAlign="center"
									align="center">
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
					<div title="审核信息">
						<div style="text-align: center; margin: 10px;">
							<form id="form2" action="#">
								<table cellpadding="0" class="cxTab" cellspacing="0" border="0" width="100%">
									<tr>
									    <td style="padding-bottom:6px;">
											扣款金额:
										</td>
										<td>
										    <div class="inputL" style="width: 40px">
												<div class="inputR">
													<div class="inputC">
											    	<input id="baz041" name="baz041" value="0.00" class="mini-textbox" />
											    	</div>
												</div>
										    </div>
										</td>
										<td align="right">
									       &nbsp; <div id="ck1" name="deductAllFlag" class="mini-checkbox" checked="false" readOnly="false" text="扣除全部" onvaluechanged="onValueChanged"></div>
									    </td>
									    <td>
									                   医师扣分:
									    </td>
									    <td width="60">
									        <div class="inputL" style="width: 50px">
												<div class="inputR">
													<div class="inputC">
											        <input id="bae041" name="bae041" data="bae041" value="0" class="mini-combobox" />
											        </div>
									        	</div>
								            </div>
									    </td>
									</tr>
									<tr>
									    <td>
											复审意见：
										</td>
										<td colspan="4">
										   <div style="padding-right:4px;">
										   <div class="textareaTl"><div class="textareaTr"><div class="textareaTc"></div></div></div>
										   <div class="textareaLay">
										       <textarea id="baz021" name="baz021" class="mini-textarea" emptyText="请输入审核意见"></textarea>
											   <input id="jsonData" name="jsonData" class="mini-hidden" required="true" />
											   <input id="baz031" name="baz031" class="mini-hidden" required="true" />
											   <input id="baz033" name="baz033" class="mini-hidden" required="true" />
										   </div>
										   <div class="textareaBl"><div class="textareaBr"><div class="textareaBc"></div></div></div>
										   </div>
										</td>
									</tr>
									<tr>
										<td nowrap="nowrap" colspan="5"	style="text-align: center; padding-top: 5px;">
											<span class="btnMini"><em><input type="button" value="正常" onclick="preCheck('01')" /></em></span>
											<span class="btnMini"><em><input type="button" value="送稽核" onclick="preCheck('10')" /></em></span>
											<span class="btnMini"><em><input type="button" value="复议扣款" onclick="preCheck('11');"/></em></span>
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
							    <div field="baz031" type="comboboxcolumn" width="100" headerAlign="center">
									状态<input property="editor" class="mini-combobox" data="${dic['BAZ031']}">
								</div>
								<div field="baz021" width="100" headerAlign="center">
									审核结果说明
								</div>
								<div field="baz041Str" width="200" headerAlign="center">
									扣款金额
								</div>
								<div field="baz022" width="100" headerAlign="center">
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
	var grid1 = mini.get("grid1");
	var form = new mini.Form("#form1");
	var checkRecord = mini.get("checkRecord");
	var gzfl = mini.get("gzfl");
    var gzflmc = mini.get("gzflmc");
	//应该加载审核状态BAZ031为08的数据

	grid1.load(form.getData(true));
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
	var grid2 = mini.get("grid2");
	//detailgrid1 对象
	var detailgrid1 = mini.get("detailgrid1");

	//detailgrid1外面的DIV
	var grid1_Form = document.getElementById("detailgrid1_Form");
	//detailgrid2 对象
	var detailgrid2 = mini.get("detailgrid2");

	//detailgrid2外面的DIV
	var grid2_Form = document.getElementById("detailgrid2_Form");

	var form2 = new mini.Form("#form2");

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
	/**
	 * 
	 */
	function search() {

		var data = form.getData(true);
		grid1.load(data);
	}

	/**
	 * 展示grid1的内嵌表格
	 * @param {Object} e 时间对象
	 */
	function onShowRowDetail1(e) {
		var grid = e.sender;
		var row = e.record;
		var td = grid.getRowDetailCellEl(row);
		td.appendChild(grid1_Form);
		grid1_Form.style.display = "block";
		$("#detailgrid1").html("");
        $.ajax({
            url: "${pageContext.request.contextPath}/k2/f10201002/queryMedDocumentIllegal.action",
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

	/**
	 * 展示grid1的内嵌表格
	 * @param {Object} e 时间对象
	 */
	function onShowRowDetail2(e) {
		var grid = e.sender;
		var row = e.record;
		var td = grid.getRowDetailCellEl(row);
		td.appendChild(grid2_Form);
		grid2_Form.style.display = "block";
		$("#detailgrid2").html("");
        $.ajax({
            url: "${pageContext.request.contextPath}/k2/f10201002/queryMedDocumentDetailIllegal.action",
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
	/**
	 * 
	 * @param {Object} e
	 */
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
	/**
	 * 审核操作
	 * @param {Object} baz031
	 * @return {TypeName} 
	 */
	function preCheck(baz031) {
		if (!baz031) {
			mini.alert("审核状态为空");
			return false;
		}
		var grid2Selected = grid2.getSelecteds();
		if (!grid2Selected.length) { //等价grid2Selected.length==0
			mini.alert("请选择左侧要审核的单据明细信息!");
			mini.get("jsonData").setValue('');
			return false;
		}

		var jsonData = mini.encode(grid2Selected);
		mini.get("jsonData").setValue(jsonData);
		mini.get("baz031").setValue(baz031);
		mini.get("baz033").setValue("2");//1表示单据违规;2表示明细违规
		var data = form2.getData();
		form2.validate();
		if (!form2.isValid()) {
			return false;
		}
		var json = mini.encode(data);
		mini.mask( {
			el : document.body,
			cls : 'mini-mask-loading',
			html : '处理中...'
		});
		$.ajax( {
					url : "${pageContext.request.contextPath}/k2/f10201004/saveF10201004.action",
					type : "POST",
					data : {
						data : json
					},
					dataType : "json",
					success : function(text, textStatus) {
						mini.unmask(document.body);
						if (text.success) {
							mini.showMessageBox( {
								title : "提示",
								message : "操作成功",
								buttons : [ "确定" ],
								iconCls : "mini-messagebox-info",
								callback : function(action) {
									grid2.reload();
								}
							});
						} else {
							mini.alert(text.msg);
						}
					},
					error : function() {
						mini.alert("操作失败!");
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
	/**
	 * 重置
	 */
	function resetForm() {
		form.reset();
	}
	
	 function onValueChanged(e){
    	var checked = this.getChecked();
    	if(checked){
    		mini.get("baz041").disable();
        }else{
        	mini.get("baz041").enable();
        }
    }
    function onDeptChanged(e) {
        var id = gzfl.getValue();
        gzflmc.setValue("");
        var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id=" + id;
        gzflmc.setUrl(url);
        positionCombo.select(0);
    }
</script>
	</body>
</html>
