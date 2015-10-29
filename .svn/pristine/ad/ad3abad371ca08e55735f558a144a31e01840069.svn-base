<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>单据申诉处理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/swfupload.js"></script>

<style type="text/css">
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
											</div></td>
										--%>
										<td class="textR">知识点：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="zsdmc" name="zsdmc" class="mini-buttonedit"
															onbuttonclick="onZSDSelect" allowInput="false" />
													</div>
												</div>
											</div></td>
										<td class="textR">就诊类型：</td>
										<td>
											<div class="inputL" style="width: 100px">
												<div class="inputR">
													<div class="inputC">
														<input id="aka130" name="aka130" class="mini-combobox"
															popupWidth="150" emptyText="选择就诊类别..."
															data="${dic['AKA130']}" />
													</div>
												</div>
											</div></td>
									</tr>
									<tr>
										<td class="textR">就诊开始时间：</td>
										<td>
											<div class="inputL" style="width:100px">
												<div class="inputR">
													<div class="inputC">
														<input id="akc194Start" name="akc194Start"
															class="mini-datepicker" allowInput="false"
															format="yyyyMMdd" />
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
															format="yyyyMMdd" />
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
							style="width: 100%; height: 100%;" vertical="true"
							allowResize="true" handlerSize="0">
							<div size="38%" showCollapseButton="false">
								<div id="detailgrid1_Form" style="display: none;">
									<div id="detailgrid1"></div>
								</div>
								<div id="detailgrid2_Form" style="display: none;">
									<div id="detailgrid2" style="width: 600px">
										<input id="filedataFileName" name="filedataFileName"
											class="mini-textbox" visible="false" /> <input id="fpath"
											name="fpath" class="mini-textbox" visible="false" /> <input
											id="fname" name="fpath" class="mini-textbox" visible="false" />
										<input id="baz031" name="baz031" class="mini-textbox"
											visible="false" /> <input id="ids" name="ids"
											class="mini-textbox" visible="false" />
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
												<td class="textR">审核意见：</td>
												<td colspan="2">
													<div style="padding-right: 4px;">
														<div class="textareaTl">
															<div class="textareaTr">
																<div class="textareaTc"></div>
															</div>
														</div>
														<div class="textareaLay">
															<textarea id="baz021" name="baz021" class="mini-textarea"
																emptyText="请输入直接申诉意见"></textarea>
														</div>
														<div class="textareaBl">
															<div class="textareaBr">
																<div class="textareaBc"></div>
															</div>
														</div>
													</div>
												</td>
											</tr>
											<tr>
												<td class="textR">上传附件：</td>
												<td><input id="fileupload1" class="mini-fileupload"
													name="filedata"
													limitType="*.rar;*.zip;*.ppt;*.pptx;*.txt;*.doc;*.docx;*.xls;*.xlsx;*.jpg;*.png"
													limitSize="2MB"
													flashUrl="${pageContext.request.contextPath}/resource/scripts/swfupload.swf"
													uploadUrl="${pageContext.request.contextPath}/k2/f10204002/uploadFile.action"
													onuploadsuccess="onUploadSuccess" width="240"
													onuploaderror="onUploadError" onfileselect="onFileSelect"
													buttonText="选择附件" />
												</td>
												<td><font style="color: red; font-size: 4px;">附件最大2MB</font>
												</td>
											</tr>
											<tr>
												<td></td>
												<td colspan="2"><span class="btnMini"
													style="margin: 0 10px"><em><input type="button"
															onclick="startUpload();" value="申诉" /> </em> </span> <span
													class="btnMini" style="margin: 0 10px"><em><input
															type="button" onclick="preCheck( '1','2');" value="下发医师" />
													</em> </span> <span class="btnMini" style="margin: 0 10px"><em><input
															type="button" onclick="sure( '1','4')" value="放弃申诉" /> </em>
												</span>
												</td>
												<td></td>
											</tr>
										</table>
									</div>
								</div>
								<div id="datagrid1" class="mini-datagrid"
									style="width: 100%; height: 100%;" idField="id"
									multiSelect="true" allowResize="false" pageSize="50"
									onselectionchanged="queryDetail"
									onshowrowdetail="onShowRowDetail1" onload="afterload"
									showColumnsMenu="true" sortMode="client"
									url="${pageContext.request.contextPath}/k5/f10504001/indexAction.action">
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
									<span class="btnMini" style="margin: 0px 0px 2px 8px;"><em><input
											type="button" value="提出申诉" onclick="preCheckZJSS('03');" />
									</em> </span>
									<%--<span class="btnMini" style="margin: 0px 20px 2px 20px;"><em><input
											type="button" value="下发医师" onclick="preCheck('2','2');" /> </em>
									</span>--%>
									<span class="btnMini" style="margin: 0px 20px 2px 20px;"><em><input
											type="button" value="放弃申诉" onclick="sure('2','4');" /> </em> </span>
									<span class="btnMini" style="margin: 0px 20px 2px 20px;"><em><input
											type="button" value="导出EXCEL" onclick="ExportExcel();" /> </em> </span>
								</div>
								<!--menu-->
								<div id="datagrid2" class="mini-datagrid" style="height: 86%;"
									idField="id" multiSelect="true" allowResize="false"
									sortMode="client" pageSize="50"
									onshowrowdetail="onShowRowDetail2" onrowclick=""
									onrowdblclick="queryHistory" showColumnsMenu="true"
									showSummaryRow="true"
									url="${pageContext.request.contextPath}/k5/f10504001/indexInfoAction.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div field="baz031" type="comboboxcolumn" width="70"
											allowSort="true" headerAlign="center">
											审核状态 <input property="editor" class="mini-combobox"
												style="width: 100%" data="${dic['BAZ031']}">
										</div>
										<div field="ake002" width="100" headerAlign="center"
											allowSort="true">明细名称</div>
										<div field="aaa133" width="150" headerAlign="center">疑点说明</div>
										<div field="baz041" width="90" headerAlign="center">拟扣除金额</div>
										<div field="baz024" width="80" headerAlign="center"
											dateFormat="yyyyMMdd" allowSort="true">申述过期时间</div>
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
	<iframe id="exportIFrame" style="display:none;"></iframe>

	<!--导出Excel相关HTML-->
	<form id="excelForm"
		action="${pageContext.request.contextPath}/k5/f10504001/f04exportExcel.action"
		method="post" target="excelIFrame">
		<input type="hidden" name="columns" id="columns" /> 
		<input type="hidden" name="bazids" id="bazids" />
	</form>
	<iframe id="excelIFrame" name="excelIFrame" style="display:none;"></iframe>
	<script type="text/javascript">
		mini.parse();
		var grid1 = mini.get("datagrid1");
		var grid2 = mini.get("datagrid2");
		var detailgrid1_Form = document.getElementById("detailgrid1_Form");
		var detailgrid2_Form = document.getElementById("detailgrid2_Form");
		var queryForm = new mini.Form("form1");
		var layout = mini.get("layout1");
		search();
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
		function ExportExcel() {
			var columns = grid2.getBottomColumns();
            var record = grid2.getSelecteds();
            if(record.length==0){
            	mini.alert("请选择要导出到excel的明细！");
            	return;
            }
            
            function getColumns(columns) {
                columns = columns.clone();
                for (var i = columns.length - 1; i >= 0; i--) {
                    var column = columns[i];
                    if (!column.field||!column.visible) {
                        columns.removeAt(i);
                    } else {
                        var c = { header: column.header, field: column.field };
                        columns[i] = c;
                    }
                }
                return columns;
            }
            var ids = "";
			for ( var int = 0; int < record.length; int++) {
				if (int + 1 == record.length) {
					ids += record[int].baz003;
				} else {
					ids += record[int].baz003 + ",";
				}
			}
            var columns = getColumns(columns);
            var json = mini.encode(columns);  
            document.getElementById("bazids").value = ids;
            document.getElementById("columns").value = json;
            var excelForm = document.getElementById("excelForm");
            excelForm.submit();    
		}
		function onZSDSelect(e) {
			var btnEdit = this;
			mini
					.open({
						url : "${pageContext.request.contextPath}/pages/pub/selectZSD.jsp",
						title : "知识点选择",
						width : 750,
						height : 420,
						onload : function() {
							var iframe = this.getIFrameEl();
							var data = {
								baz031 : '04,02',
								baz101 : '1,2',
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
													+ data[i].ake008.trim() + "";
											zsdbmstr = zsdbmstr + "'"
													+ data[i].zsdbm + "'";
										} else {
											ake008str = ake008str + ""
													+ data[i].ake008.trim() + ",";
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
					baz021:mini.get("baz021").getValue(),
					baz031:mini.get("baz031").getValue(),
					fname:mini.get("fname").getValue(),
					fpath:mini.get("fpath").getValue(),
					filedataFileName:mini.get("filedataFileName").getValue()
					};
	        $.ajax({
	          url: "${pageContext.request.contextPath}/k5/f10504001/preCheckZjss.action",
	          type: "post",
	          data: param,
	          dataType : 'json',
	          success: function (text) {
	            mini.unmask(document.body);
	          	if(text.success){
	          	 	mini.showMessageBox({
	      				title: "提示",
	      				message: "提交成功",
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
			var zsdmc = mini.get("zsdmc").getValue();
			var ids = "";
			for ( var int = 0; int < record.length; int++) {
				if (int + 1 == record.length) {
					ids += record[int].baz001;
				} else {
					ids += record[int].baz001 + ",";
				}
			}
			grid2.load({
				ids : ids,
				ake007 : zsdmc
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
								    mini.get("baz031").setValue("03");
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
		//直接申诉
		function preCheckZJSS(baz031) {
			var jsongrid2 = grid2.getSelecteds();
			if (jsongrid2.length == 0) {
				mini.alert("请选择明细信息!");
				//alert(jsongrid2.length);
				return;
			}
			var ids = "";
			for ( var int = 0; int < jsongrid2.length; int++) {
				if (int + 1 == jsongrid2.length) {
					ids += jsongrid2[int].baz003;
					//alert(ids);
				} else {
					ids += jsongrid2[int].baz003 + ",";
				}
			}
			if (baz031 = '03') {
				mini
						.open({
							url : "${pageContext.request.contextPath}/pages/k5/f10504001/f10504001_batchAdd.jsp",
							title : '提出申诉',
							width : 350,
							height : 220,
							onload : function() {
								var iframe = this.getIFrameEl();
								var data = {
									ids : ids,
									baz031 : baz031
								};
								iframe.contentWindow.setData(data);
							},
							ondestroy : function(action) {
								grid2.reload();
								grid1.reload();
							}
						});
			}
		}

		function preCheck(tag, bazValue) {
			var jsongrid2 = grid2.getSelecteds();
			var baz033 = "2";
			if (jsongrid2.length == 0) {
				mini.alert("请选择明细信息!");
				return;
			}
			var ids = "";
			var int = 0;
			if ("1" == tag) {
				var getdata = document.getElementById("baz021").value;
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
				var stitle='';
				if("4"==bazValue){
					stitle='放弃申诉';	
					$.ajax({
						url : "${pageContext.request.contextPath}/k5/f10504001/indexComplaintUpdateAction.action",
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
									message : "操做成功",
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
				}else{
					stitle='下发医师';				
					mini.open({
								url : "${pageContext.request.contextPath}/pages/k5/f10504001/f10504001_info.jsp",
								title : stitle,
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
				}
			} else {
				mini.mask({
					el : document.body,
					cls : 'mini-mask-loading',
					html : '处理中...'
				});
				$
						.ajax({
							url : "${pageContext.request.contextPath}/k5/f10504001/indexComplaintUpdateAction.action",
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
										message : "操做成功",
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
								mini.get("checkRecord").setData(text.result);
								mini.get("audit_tabs").activeTab(1);
							} else {
								mini.alert(text.msg);
							}
						}
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
		function plcl(type) {
			if (grid1.getSelecteds().length > 0) {
				mini
						.open({
							url : "${pageContext.request.contextPath}/pages/k2/f10201006/f10201006_plcl.jsp",
							title : type,
							width : 350,
							height : 200,
							onload : function() {
							},
							ondestroy : function(action) {

							}
						});
			} else {
				mini.alert("请选择明细信息!");
			}

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
	function sure(tag, bazValue) {
		var jsongrid2 = grid2.getSelecteds();
		if (jsongrid2.length == 0) {
			mini.alert("请选择明细信息!");
			return;
		}
		mini.confirm("放弃申诉的数据将不能复议，是否确认放弃申诉？","放弃申诉确认",
	   			function(action){
	   				if(action=="ok"){
	   				preCheck(tag, bazValue);
	   				}else{
		   				return;
	   				}
	   			});
	}
	function onCloseClick(e) {
        var obj = e.sender;
        obj.setText("");
        obj.setValue("");
    }

	</script>
</body>
</html>
