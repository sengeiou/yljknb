<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增被稽核对象</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="aaz077" name="aaz077"  class="mini-hidden" required="true"/>
			<input id="aaz318" name="aaz318"  class="mini-hidden" required="true"/>
			
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">调查记录登记信息</span></h3>
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
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
												       textField="text" valueField="id" required="true" emptyText="请选择..."/>
									       	</div>
									    </div>
									</div>
								</td>
								<td class="textR">被调查人ID：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaz010" name="aaz010" class="mini-buttonedit" 
												       onbuttonclick="onButtonEdit" textName="aaz010"/>
									       	</div>
									   </div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>被调查人姓名：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape128" name="ape128" class="mini-textbox" required="true" 
													vtype="maxLength:100"/>
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
			
			var form = new mini.Form("form1");
		
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
			
			
				//保存
			function saveSurveyInfo(){
				 mini.get("aaz318").setValue("0");
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
	        			//grid.reload();
	        			mini.unmask(document.body);
	        			if(text.success){
	        				mini.showMessageBox({
	        					title: "提示",
	        					message: "保存成功",
	        					buttons: ["确定"],
	        					iconCls: "mini-messagebox-info",
	        					callback: function(action){
	        						//addRecord();
	        						closeWin();
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
		</script>
	</body>
</html>
