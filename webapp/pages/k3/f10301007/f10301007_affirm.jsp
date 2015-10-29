<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核结论确认</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">结论确认</span></h3>
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR">稽核对象类型：</td>
								<td>
									<div class="inputL" style="width:160px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa709" name="apa709" class="mini-combobox" 
													   data="${dic['APA709']}" emptyText="请选择稽核对象类型..." enabled="false"/>
										   	</div>
										</div>
									</div>
								</td>
								<td class="textR">被稽核对象：</td>
								<td>
									<div class="inputL" style="width:160px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape008" name="ape008" class="mini-textbox" enabled="false"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">稽核问题类型：</td>
								<td>
									<div class="inputL" style="width:160px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa701" name="apa701" class="mini-combobox" 
													   data="${dic['APA701']}" emptyText="请选择稽核问题类型..." enabled="false"/>
										   	</div>
										</div>
									</div>
								</td>
								<td class="textR">稽核结论类型：</td>
								<td>
									<div class="inputL" style="width:160px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa005" name="apa005" class="mini-combobox" 
												       data="${dic['APA005']}" emptyText="请选择稽核结论类型..." enabled="false"/>
									       	</div>
									    </div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">稽核结论：</td>
								<td colspan="4">
									<div style="padding-right:4px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc"></div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="ape726" name="ape726" class="mini-textarea"style="width: 100%;" 
												allowInput="false"/>
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
								<td class="textR">不予处理：</td>
								<td>
									<div class="inputL" style="width:160px">
										<div class="inputR">
											<div class="inputC">
												<div id="apa154" name="apa154" class="mini-radiobuttonlist" repeatLayout="table" 
													 repeatDirection="vertical" textField="text" valueField="id" value="" 
													 data="${dic['APA154']}">
												</div>  
											</div>
										</div>
									</div>
								</td> 
							</tr>
							<tr>
								<td class="textR">处罚方式:</td>
								<td>
							    	<div id="cf0" name="cf0" class="mini-checkbox" text="经办处理处罚" 
							    		 onvaluechanged="onValueChanged0" enabled="false">
							    	</div>
							    	<input id="apa156" name="apa156" class="mini-hidden" required="true"/>
								</td>
								<td>
								    <div id="cf1" name="cf1" class="mini-checkbox" text="行政处理处罚" 
								    	 onvaluechanged="onValueChanged1" enabled="false">
								    </div>
								    <input id="apa155" name="apa155" class="mini-hidden" required="true"/>
								</td>
								<td>
								    <div id="cf2" name="cf2" class="mini-checkbox" text="司法处理" 
								    	 onvaluechanged="onValueChanged2" enabled="false">
								    </div>
								    <input id="apa158" name="apa158" class="mini-hidden" value="0" required="true"/>
								</td>
							</tr>
							<tr>
								<td></td>
								<td>
							    	<div id="cf3" name="cf3" class="mini-checkbox" text="冻结社会保障卡就医标识" 
							    		 onvaluechanged="onValueChanged3" enabled="false">
							    	</div>
							    	<input id="apa162" name="apa162" class="mini-hidden" required="true"/>
								</td>
								<td>
								    <div id="cf4" name="cf4" class="mini-checkbox" text="暂停个人医保待遇标志" 
								    	 onvaluechanged="onValueChanged4" enabled="false">
								    </div>
								    <input id="apa163" name="apa163" class="mini-hidden" required="true"/>
								</td>
								<td>
								    <div id="cf5" name="cf5" class="mini-checkbox" text="停止医疗服务资格标志" 
								         onvaluechanged="onValueChanged5" enabled="false">
								    </div>
								    <input id="apa161" name="apa161" class="mini-hidden" required="true"/>
								</td>
							</tr>
							<!-- <tr>
								<td></td>
								<td>
								    <div id="cf6" name="cf6" class="mini-checkbox" text="纳入重点监控标识" 
								    	 onvaluechanged="onValueChanged6" enabled="false">
								    </div>
								    <input id="apa157" name="apa157" class="mini-hidden" required="true"/>
								</td>
							</tr> -->
							<tr>
								<td class="textR">违规金额：</td>
								<td>
									<div class="inputL" style="width:160px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape752" name="ape752" class="mini-textbox" enabled="false"/>
											</div>
										</div>
									</div>
								</td>
								<!-- <td class="textR">重点监控截止期：</td>
								<td>
									<div class="inputL" style="width:160px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae031s" name="aae031s" class="mini-datepicker" enabled="false"/>
											</div>
										</div>
									</div>
								</td> -->
							</tr>
							<tr>
								<td class="textR">结论批示意见：</td>
								<td colspan="4">
									<div style="padding-right:4px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc"></div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="aae189" name="aae189" class="mini-textarea" 
									       		style="width: 100%;" enabled="true" required="true" vtype="maxLength:200"/>
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
								<td style="text-align: right; padding-top: 5px; padding-right: 0px;"
								    colspan="6" class="mainlistCon">
								    <span class="btnMini">
								    	<!-- <a class="mini-button" plain="true" iconCls="icon-goto" 
								    		onclick="surveyReview()">调查重审</a> -->
								    	<em>
								    		<input type="button" value="调查重审" onclick="surveyReview()"/>
								    	</em>
								    </span>
									<span class="btnMini">
										<!-- <a class="mini-button" plain="true" iconCls="icon-ok" 
											onclick="affirmThrough()">确认通过</a> -->
										<em>
											<input type="button" value="确认通过" onclick="affirmThrough()"/>
										</em>
									</span>    	
								</td>
							</tr>
						</table>
					</div>
				</div>
			</fieldset>
		</form>
		
		<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<h3 class="cxTit pTb8"><span class="iconCx">被稽核对象调查记录</span></h3>
				<div style="margin: 10px;">
					<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true"
						 style="width: 100%; height: 120px;" allowResize="true"
						 url="${pageContext.request.contextPath}/common/querySurveyRecord.action">
						 <div property="columns">
						 	<div type="indexcolumn"></div>
						 	<!-- <div field="optera" width="100" headerAlign="center" renderer="rendererGrid1">操作</div> -->
						 	<div field="aaz148" width="100" headerAlign="center">稽核调查记录事件ID</div>
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
		
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form1");
			var aaz077 ;
			var aaz318 ;
			
			mini.get("apa154").setEnabled(false);
			
			
			//form.setEnabled(false);
			var grid = mini.get("grid1");
			
			//标准方法接口定义
			function setData(data){
				data = mini.clone(data);
				aaz077=data.aaz077;
				aaz318 =data.aaz318;
				grid.load({aaz077:data.aaz077,aaz318:data.aaz318});
				$.ajax({
					url:"${pageContext.request.contextPath}/common/loadBeAuditTargetByAaz077.action?method=loadBeAuditTargetInfoByAaz077",
     				type:"post",
     				data: {aaz077: data.aaz077},
     				success: function (text){
     					var data = mini.decode(text);
				        form.setData(data);
				        
				        var apa156 = data.apa156;
				        var apa155 = data.apa155;
				        var apa158 = data.apa158;
				        var apa162 = data.apa162;
				        var apa161 = data.apa161;
				        var apa163 = data.apa163;
				        var apa157 = data.apa157;
				        
				        //apa156
				        if(apa156 == '1'){
				        	mini.get("cf0").setChecked(true);
				        }else if(apa156 == '0'){
				        	mini.get("cf0").setChecked(false);
				        }else{
				        	mini.get("apa156").setValue("0");
				        }
				        
				        //apa155
				        if(apa155 == '1'){
				        	mini.get("cf1").setChecked(true);
				        }else if(apa155 == '0'){
				        	mini.get("cf1").setChecked(false);
				        }else{
				        	mini.get("apa155").setValue("0");
				        }
				        
				        //apa158
				        if(apa158 == '1'){
				        	mini.get("cf2").setChecked(true);
				        }else if(apa158 == '0'){
				        	mini.get("cf2").setChecked(false);
				        }else{
				        	mini.get("apa158").setValue("0");
				        }
				        
				        //apa162
				        if(apa162 == '1'){
				        	mini.get("cf3").setChecked(true);
				        }else if(apa162 == '0'){
				        	mini.get("cf3").setChecked(false);
				        }else{
				        	mini.get("apa162").setValue("0");
				        }
				        
				        //apa163
				        if(apa163 == '1'){
				        	mini.get("cf4").setChecked(true);
				        }else if(apa163 == '0'){
				        	mini.get("cf4").setChecked(false);
				        }else{
				        	mini.get("apa163").setValue("0");
				        }
				        
				        //apa161
				        if(apa161 == '1'){
				        	mini.get("cf5").setChecked(true);
				        }else if(apa161 == '0'){
				        	mini.get("cf5").setChecked(false);
				        }else{
				        	mini.get("apa161").setValue("0");
				        }
				        
				        //apa157
				        if(apa157 == '1'){
				        	mini.get("cf6").setChecked(true);
				        }else if(apa157 == '0'){
				        	mini.get("cf6").setChecked(false);
				        }else{
				        	mini.get("apa157").setValue("0");
				        }
     				}
				});
			}
			
			
			//调查重审
			function surveyReview(){
				var data = form.getData();
				form.validate();
		     	if (form.isValid() == false){
		     		return;
		     	}
		     	data.aaz077 = aaz077;
		     	data.aaz318=aaz318;
		     	var json = mini.encode(data);
		     	mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/k3/f10301007/surveyReview.action",
		     		type:"post",
		     		data: { submitData: json },
		     		success: function (text){
		     			mini.unmask(document.body);
		     			if(text.success){
		     				mini.showMessageBox({
		     					title: "提示",
			            	  	message: "调查重审，操作成功",
			            	  	buttons: ["确定"],
			            	  	iconCls: "mini-messagebox-info",
			            	  	callback: function(action){
			            	  		closeWin();
			            	  	}
		     				});
		     			}else{
		     				mini.alert(text.msg);
		     			}
		     		}
		     	});
			}
			
			//确认通过
			function affirmThrough(){
				var data = form.getData();
				form.validate();
		     	if (form.isValid() == false){
		     		return;
		     		
		     	}
		     	data.aaz077 = aaz077;
		     	data.aaz318=aaz318;
		     	var json = mini.encode(data);
		     	mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/k3/f10301007/confirmPass.action",
		     		type:"post",
		     		data: { submitData: json },
		     		success: function (text){
		     			mini.unmask(document.body);
		     			if(text.success){
		     				mini.showMessageBox({
		     					title: "提示",
			            	  	message: "确认通过，操作成功",
			            	  	buttons: ["确定"],
			            	  	iconCls: "mini-messagebox-info",
			            	  	callback: function(action){
			            	  		closeWin();
			            	  	}
		     				});
		     			}else{
		     				mini.alert(text.msg);
		     			}
		     		}
		     	});
			}
			
			//关闭
			function CloseWindow(action) {
		         if (window.CloseOwnerWindow){
		            return window.CloseOwnerWindow(action);
		         }else{
		             window.close();
		         }            
     		}
     		
     		function closeWin(){
				CloseWindow();
			}
			
		</script>
	</body>
</html>