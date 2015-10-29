<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>稽核对象详情--医师</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
	<fieldset style="width: 100%; border: solid 0px #aaa;">
		<form id="form1" action="" method="post">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">稽核对象详情</span></h3> -->
				<div id="editForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">医护人员编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz263" name="aaz263" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">姓名：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac003" name="aac003" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">身份证号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab014" name="aab014" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">联系电话：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae005" name="aae005" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">医疗机构：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021" name="akb021" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">科室：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae386" name="aae386" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">行政职务名称代码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc049" name="akc049" class="mini-combobox" data="${dic['AKC049']}"
									       		textField="text" valueField="id" allowInput="false" onvaluechanged="onAdm"/>
									    </div>
									</div>
								</div>   	
							</td>
							<td class="textR">卫生技术人员职务：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaf009" name="aaf009" class="mini-combobox" data="${dic['AAF009']}"
											    textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											    onvaluechanged="onSanita"/>
										 </div>
									</div>
								</div>  	      
							</td>
							<td class="textR">医师资格证编码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc054" name="akc054" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">医师执业证编码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc056" name="akc056" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">药师类别：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc278" name="akc278" class="mini-combobox" data="${dic['AKC278']}"
											    textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											    onvaluechanged="onSenior"/>
										</div>
									</div>
								</div>	       
							</td>
							<td class="textR">药师执业类别：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc279" name="akc279" class="mini-combobox" data="${dic['AKC279']}"
											   textField="text" valueField="id"  allowInput="false" emptyText="请选择..."
											   onvaluechanged="onAssis"/>
										</div>
									</div>
								</div>	 	      
							</td>
						</tr>
						<tr>
							<td class="textR">药师执业范围：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc281" name="akc281" class="mini-combobox" data="${dic['AKC281']}"
											    textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											    onvaluechanged="onScope"/>
										</div>
									</div>
								</div>	       
							</td>
							<td class="textR">药师资格证编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc282" name="akc282" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">药师注册证编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc283" name="akc283" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
						    <td class="textR">稽核对象类型：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa709" name="apa709" class="mini-combobox" data="${dic['APA709']}"
											    textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											    onvaluechanged="onType"/>
										</div>
									</div>
								</div>	      
							</td>
						</tr>
						<tr>
						<td class="textR"><span style="color: red;">*</span>案由：</td>
						<td colspan="5">
							<div class="inputL" style="width:550px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa701" name="apa701" class="mini-textbox" allowInput="false"/>
										<%--<input id="apa701_2" name="apa701" class="mini-combobox"
											   data="${dic['APE702']}" emptyText="请选择..."/>
								   	--%></div>
								</div>
							</div>
						</td>
					</tr>
					</table>
				</div>
		</form>
		<form id="form2" action="" method="post">
			<!-- <h3 class="cxTit pTb8"><span class="iconCx">稽核对象详情</span></h3> -->
			<div id="editForm2" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
					
					<tr>
						<td class="textR">扣分：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae258" name="aae258" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否停止医疗保险服务费用结算方式:</td>
						<td>
							<select name="apa163" class="mini-radiobuttonlist" id="apa163"  enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR">停止医保费用结算时间(起始)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input name = "ape741" id="ape741" class="mini-datepicker"  />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">停止医保费用结算时间(终止)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input name = "ape742" id="ape742" class="mini-datepicker"  />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交：</td>
						<td>
							<select name="apa168" class="mini-radiobuttonlist" id="apa168_2" onvaluechanged="apa168Changed_2()"  enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">移交行政部门：</td>
						<td>
							<div class="inputL" style="width:150px;">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ade189_2" name="ade189" class="mini-textbox" style="width:100%;" enabled="false"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交警方追究刑事责任：</td>
						<td>
							<select name="apa169" class="mini-radiobuttonlist" id="apa169_2" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">稽核登记日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="baz024" name="baz024" class="mini-datepicker" allowInput="false"
												ondrawdate="onDrawDate"/>
										</div>
									</div>
								</div>
							</td>
					</tr>
					<tr>
						<td class="textR" ><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="3" >
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	emptyText="请输入查实违规行为..." style="height: 60px;"></textarea>
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
						<td style="text-align: right; padding-top: 5px; padding-right:10px;"
							colspan="6" class="mainlistCon">
							<span class="btnMini">
								<em>
									<input type="button" value="返回" onclick="closeWin()"/>
								</em>
							</span>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</fieldset>
		<script type="text/javascript">
			mini.parse();
		
			var form = new mini.Form("form1"); 
			var form2 = new mini.Form("form2"); 
			form.setEnabled(true);
			
			var akc049s;
			var aaf009s;
			var akc278s;
			var akc279s;
			var akc281s;
			var apa709s;
			var apa701s;
			var apa005s;
			var apa011s;
			
			function setData(data){
				var data = mini.clone(data);
				
				$.ajax({
					url: "${pageContext.request.contextPath}/k3/f10301008/queryAf38ByAaz077.action?method=queryAf38ByAaz077",
				    type: "post",
				    data: {aaz077: data.aaz077 },
				    success: function (text) {
				        var data = mini.decode(text);
				        form2.setData(data);
				    }
						
				});
				
				$.ajax({
				    url: "${pageContext.request.contextPath}/k3/f10301004/querKf05ByAaz077.action?method=queryKf05ByAaz077",
				    type: "post",
				    data: {aaz077: data.aaz077 },
				    success: function (text) {
				        var data = mini.decode(text);
				        form.setData(data);
				        
				        var apa154 = data.apa154;
				       	var apa156 = data.apa156;
				       	var apa155 = data.apa155;
				       	var apa158 = data.apa158;
				       	var apa161 = data.apa161;
				       	var apa162 = data.apa162;
				       	var apa163 = data.apa163;
				       	var apa157 = data.apa157;
				       	
				       	var ape752 = data.ape752;
				       	if(ape752 == 0){
				       		mini.get("ape752").setValue("");
				       	}
				       	
				       	
				       	akc049s = data.akc049;
				       	aaf009s = data.aaf009;
				       	akc278s = data.akc278;
				       	akc279s = data.akc279;
				       	akc281s = data.akc281;
				       	apa709s = data.apa709;
				       	apa701s = data.apa701;
				       	apa005s = data.apa005;
				       	apa011s = data.apa011;
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
		     
		   
		   function onAdm(){
		   		var akc049 = mini.get("akc049").getValue();
		   		if(akc049 != akc049s){
		   			mini.get("akc049").setValue(akc049s);
		   		}
		   }
		     
		     function onSanita(){
		     	var aaf009 = mini.get("aaf009").getValue();
		   		if(aaf009 != aaf009s){
		   			mini.get("aaf009").setValue(aaf009s);
		   		}
		     }
		     
		     function onSenior(){
		     	var akc278 = mini.get("akc278").getValue();
		   		if(akc278 != akc278s){
		   			mini.get("akc278").setValue(akc278s);
		   		}
		     }
		     
		     function onAssis(){
		     	var akc279 = mini.get("akc279").getValue();
		   		if(akc279 != akc279s){
		   			mini.get("akc279").setValue(akc279s);
		   		}
		     }
		     
		     function onScope(){
		     	var akc281 = mini.get("akc281").getValue();
		   		if(akc281 != akc281s){
		   			mini.get("akc281").setValue(akc281s);
		   		}
		     }
		     
		     function onType(){
		     	var apa709 = mini.get("apa709").getValue();
		   		if(apa709 != apa709s){
		   			mini.get("apa709").setValue(apa709s);
		   		}
		     }
		     
		     function onProb(){
		     	var apa701 = mini.get("apa701").getValue();
		   		if(apa701 != apa701s){
		   			mini.get("apa701").setValue(apa701s);
		   		}
		     }
		     
		     function onEpilog(){
		     	var apa005 = mini.get("apa005").getValue();
		   		if(apa005 != apa005s){
		   			mini.get("apa005").setValue(apa005s);
		   		}
		     }
		     
		     function onState(){
		     	var apa011 = mini.get("apa011").getValue();
		   		if(apa011 != apa011s){
		   			mini.get("apa011").setValue(apa011s);
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
		</script>
	</body>
</html>
