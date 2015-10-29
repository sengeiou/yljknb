<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>调查记录</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<h3 class="cxTit pTb8"><span class="iconCx">调查记录列表</span></h3>
			<div style="margin: 0px;">
				<div class="mainlistCon">
					<div class="listTit">
						<div class="fL pT5R9">
							<span class="btnMini">
								<em>
									<input type="button" value="记录新增" onclick="addRecord()" id="add" name="add"/>
								</em>
							</span> 
							<span class="btnMini">
								<em>
									<input type="button" value="记录修改" onclick="editRecord()" id="edit" name="edit"/>
								</em>
							</span>
<!-- 							<span class="btnMini">
								<em>
									<input type="button" value="发单" onclick="billing()" id="billing" name="billing"/>
								</em>
							</span> -->
						</div>
					</div>
					<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true" style="width: 100%; height: 140px;" 
						allowResize="true" onrowclick="onRowSelectClick"
						url="${pageContext.request.contextPath}/common/querySurveyRecord.action">
						 <div property="columns">
							 	<div type="indexcolumn"></div>
							 	<div field="optera" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
							 	<div field="aaz148" width="100" headerAlign="center" visible="false">稽核调查记录事件ID</div>
							 	<div field="aaz010" width="100" headerAlign="center">被调查人ID</div>
							 	<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
							 		被调查人类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
							 	</div>
							 	<div field="ape128" width="100" headerAlign="center">被调查人姓名</div>
							 	<div field="apa706" width="100" headerAlign="center" type="comboboxcolumn">
							 		调查取证方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA706']}">
							 	</div>
							 	<div field="ape718" width="100" headerAlign="center">调查人</div>
							 	<div field="ape722s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">调查日期</div>
							 	<div field="ape721" width="100" headerAlign="center">调查结果</div>
							 	<%-- <div field="apa702" width="100" headerAlign="center" type="comboboxcolumn">
							 		是否发单通知<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA702']}">
							 	</div> --%>
							 	<div field="ape715" width="100" headerAlign="center">要求准备材料</div>
							 	<div field="ape023" width="100" headerAlign="center">材料说明</div>
						 </div>
					</div>
				</div>
			</div>
		</fieldset>
		
		<input id="aaz077s" name="aaz077s" class="mini-hidden" required="true"/>
		<input id="aaz318s" name="aaz318s" class="mini-hidden" required="true"/>
		<input id="aaz010s" name="aaz010s" class="mini-hidden" required="true"/>
		<input id="ape008s" name="ape008s" class="mini-hidden" required="true"/>
		<input id="apa709s" name="apa709s" class="mini-hidden" required="true"/>
		<form id="form1" action="" method="post">
			<input id="aaz077" name="aaz077"  class="mini-hidden" required="true"/>
			<input id="aaz318" name="aaz318"  class="mini-hidden" required="true"/>
			<input id="aaz148" name="aaz148"  class="mini-hidden" />
			<input id="aaz010" name="aaz010" class="mini-hidden" required="true"/>
			<input id="ape008" name="ape008" class="mini-hidden" required="true"/>
			<input id="apa709" name="apa709" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">调查记录登记信息</span></h3>
				<div style="margin: 1px;">
					<div id="editForm1" style="margin: 1px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR"><span style="color: red;">*</span>调查取证方式：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa706" name="apa706" class="mini-combobox" 
												       emptyText="请选择..." required="true" data="${dic['APA706']}"/>
										     </div>
										 </div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>调查人：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape718" name="ape718" class="mini-textbox" required="true" 
													vtype="maxLength:50"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>调查日期：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape722s" name="ape722s" class="mini-datepicker" format="yyyy-MM-dd" 
												       onvaluechanged="onValueChanged" required="true" allowInput="false"/>
												<input id="ape722" name="ape722" class="mini-hidden"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">被调查人类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa709" name="apa709" class="mini-combobox" data="${dic['APA709']}"
												       onloadClear="false" textField="text" valueField="id" required="true" />
									       	</div>
									    </div>
									</div>
								</td>
								<td class="textR">被调查人ID：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<!-- <input id="aaz010" name="aaz010" class="mini-buttonedit" 
												       onbuttonclick="onButtonEdit" textName="aaz010"/> -->
												       <input id="aaz010" name="aaz010" class="mini-textbox" required="true" allowInput="false"
													vtype="maxLength:50"/>
									       	</div>
									   </div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>被调查人姓名：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape128" name="ape128" class="mini-textbox" required="true"  vtype="maxLength:100" allowInput="false"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">调查结果：</td>
								<td colspan="6">
									<div style="padding-right:0px;width:99%">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="ape721" name="ape721" class="mini-textarea" 
												style="width: 100%;" vtype="maxLength:1000"/>
										</div>
										<div class="textareaBl">
											<div class="textareaBr">
												<div class="textareaBc">
												</div>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR"><span style="color: red;">*</span>要求准备材料：</td>
								<td colspan="6">
									<div style="padding-right:0px;padding-top:2px;width:99%">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="ape715" name="ape715" class="mini-textarea" style="width: 100%;" 
										       required="true" vtype="maxLength:1000"/>
										</div>
										<div class="textareaBl">
											<div class="textareaBr">
												<div class="textareaBc">
												</div>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">材料说明：</td>
								<td colspan="6">
									<div style="padding-right:0px;padding-top:2px;width:99%">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="ape023" name="ape023" class="mini-textarea" 
												style="width: 100%;" vtype="maxLength:1000"/>
										</div>
										<div class="textareaBl">
											<div class="textareaBr">
												<div class="textareaBc">
												</div>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td style="text-align: right; padding-top: 5px; padding-right:4px;"
								    colspan="6" class="mainlistCon">
									<span class="btnMini">
										<em>
											<input type="button" value="保存" onclick="saveSurveyInfo()"/>
										</em>
									</span>
									<span class="btnMini">
										<em>
											<input type="button" value="返回" onclick="closeWin()"/>
										</em>
									</span>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</fieldset>
		</form>
		<script type="text/javascript">
			mini.parse();
			
			var grid = mini.get("grid1");
			var form = new mini.Form("form1");
			form.setEnabled(true);

			//绑定表单
			var db = new mini.DataBinding();
    		db.bindForm("form1", grid1);
    		
    		//var edit = mini.get("edit");
    		//var edit = new mini.getbyName("edit");
    		
    		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			grid.load({aaz077:data.aaz077,aaz318:data.aaz318,aaz010:data.aaz010,ape128:data.ape008,apa709:data.apa709});
     			mini.get("aaz077").setValue(data.aaz077);
     			mini.get("aaz077s").setValue(data.aaz077);
     			mini.get("aaz318").setValue(data.aaz318);
     			mini.get("aaz318s").setValue(data.aaz318);
     			
     			mini.get("aaz010").setValue(data.aaz010);
     			mini.get("ape128").setValue(data.ape008);
     			mini.get("apa709").setValue(data.apa709);
     			
     			
     			//edit.setEnabled(false);
     			//edit.enabled=false;billing
     			$("#edit").attr("disabled",true);
     			//$("#billing").attr("disabled",true);
     		}
     		
			//操作
			function rendererGrid1(e){
				var grid1 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s = "<a href='###' onclick = searchSurveyRecordInfo('" + record.aaz148 + "') >记录详情</a> ";
            	return s;
			}
			
			//行点击时触发
			function onRowSelectClick(){
				var row = grid.getSelected();
				if(row != null){
					//edit.setEnabled(true);
					$("#edit").attr("disabled",false);
					//$("#billing").attr("disabled",false);
				}
			}
			
			function searchSurveyRecordInfo(aaz148){
				 mini.open({
                	url: "${pageContext.request.contextPath}/pages/k3/f10301004/f10301004_surveyRecordInfo.jsp",
                	title: "调查记录详情", 
                	width: 800, 
                	height: 400,
                	onload: function () {
                    	var iframe = this.getIFrameEl();
                    	var data = {aaz148 : aaz148};
                    	iframe.contentWindow.setData(data);
                	},
                	ondestroy: function (action) {
                	}
            	});
			}
			
			//根据类型跳转
			function onButtonEdit(e){
				var apa709 = mini.get("apa709").getValue();
				var url = "";
				if(apa709 == '1'){
        	 		url = "${pageContext.request.contextPath}/pages/pub/selectperson.jsp"; 
         		}else if(apa709 == '2'){
             		url = "${pageContext.request.contextPath}/pages/pub/selectdoctor.jsp";
         		}else if(apa709 == '3'){
             		url = "${pageContext.request.contextPath}/pages/pub/selectmedinstitution.jsp";
         		}else{
        	 		mini.alert("对象类型未知!");
        	 		return;
         		}
         		var btnEdit = this;
         		var ape128 = mini.get("ape128");
         		mini.open({
         			url: url,
             		title: "对象选择",
             		width: 800,
             		height: 480,
             		ondestroy: function (action){
             			if (action == "ok"){
             				var iframe = this.getIFrameEl();
                     		var data = iframe.contentWindow.GetData();
                     		data = mini.clone(data); 
                     		if (data){
                     			switch(apa709){
                     				case "1":
                     					btnEdit.setValue(data.aac001);
                             			btnEdit.setText(data.aac001);
                             			ape128.setValue(data.aac003);
                     					break;
                     				case "2":
                        	 			btnEdit.setValue(data.aaz263);
                            	 		btnEdit.setText(data.aaz263);
                             			ape128.setValue(data.aac003);
                     					break;
                     				case "3":
                     					btnEdit.setValue(data.aaz107);
                             			btnEdit.setText(data.aaz107);
                             			ape128.setValue(data.akb021);
                     					break;
                     				default:
                     					mini.alert("获取失败!");
                     					break;
                     			}
                     		}
             			}
             		}
         		});
			}
			
			//发单
			function billing(){
				/* form.setEnabled(true);
				var data = form.getData();
				form.validate();
				if (form.isValid() == false) {
					mini.alert("请选择一条数据发单！");
					form.setEnabled(true);
            		return;
        		} */
        		var row2 = grid.getSelected();
        		
        		var aaz148 = row2.aaz148;
        		
        		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
				$.ajax({
        			url:"${pageContext.request.contextPath}/k3/f10301004/updateSurveyRecord.action",
        			type: "post",
        			data: { aaz148 : aaz148 },
        			success: function (text){
        				mini.unmask(document.body);
        				if(text.success){
        					grid.reload();
        					mini.showMessageBox({
        						title: "提示",
        						message: "发单成功",
        						buttons: ["确定"],
        						iconCls: "mini-messagebox-info",
        						callback: function(action){
        							addRecord();
        						} 
        					});
        				}else{
        					mini.alert(text.msg);
        				}
        			}
        		});
        		form.setEnabled(true);
			}
			
			//新增记录
			function addRecord(){
				//form.clear();
				/* var aaz077 = mini.get("aaz077s").getValue();
				mini.get("aaz077").setValue(aaz077);
				var aaz318 = mini.get("aaz318s").getValue(); 
				mini.get("aaz318").setValue(aaz318); */
				mini.get("apa706").setValue("");
				mini.get("ape718").setValue("");
				mini.get("ape722s").setValue("");
				mini.get("ape721").setValue("");
				mini.get("ape715").setValue("");
				mini.get("ape023").setValue("");
				form.setEnabled(true);
			}
			
			//记录修改
			function editRecord(){
				var row1 = grid.getSelected();
				if(row1 != null){
					form.setData(row1);
				}else{
					mini.alert("没有可以修改的记录，请选中一条记录");
				}
				/* var apa706 = mini.get("apa706").getValue();
				if(apa706 == ""){
					mini.alert("没有可以修改的记录，请选中一条记录");
				}else{
					form.setEnabled(true);
				} */
			}
			
			//保存
			function saveSurveyInfo(){
				var data = form.getData();
				form.validate();
				if (form.isValid() == false) {
            		return;
        		}
        		var json = mini.encode(data);
        		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        		$.ajax({
        			url:"${pageContext.request.contextPath}/k3/f10301004/saveSurveyRecord.action",
	        		type: "post",
	        		data: { submitData: json },
	        		success: function (text){
	        			grid.reload();
	        			mini.unmask(document.body);
	        			if(text.success){
	        				mini.showMessageBox({
	        					title: "提示",
	        					message: "保存成功",
	        					buttons: ["确定"],
	        					iconCls: "mini-messagebox-info",
	        					callback: function(action){
	        						addRecord();
	        					}
	        				});
	        			}else{
	        				mini.alert(text.msg);
	        			}
	        		}
        		});	
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
			
			function onValueChanged(){
				var ape722Date = mini.get("ape722s").getValue();
				mini.get("ape722").setValue(getDateYmd(ape722Date));
			}
			var date;
			
			function getDateYmd(date) {
				var year = date.getFullYear();
				var month = date.getMonth() + 1;
				var day = date.getDate();
				
				var time  = year + "" +  month + "" + day;
				
				return time;
			}
			
		</script>
	</body>
</html>