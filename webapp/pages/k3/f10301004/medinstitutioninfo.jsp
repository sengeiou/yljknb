<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>稽核对象详情--医疗机构</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<form id="form1" action="" method="post">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">稽核对象详情</span></h3> -->
				<div id="editForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">医疗机构编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020" name="akb020" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">医疗机构名称：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021" name="akb021" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">医疗机构类型：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb022" name="akb022" class="mini-combobox" data="${dic['AKB022']}"
											    textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											    onvaluechanged="onMedint"/>
										</div>
									</div>
								</div>	       
							</td>
						</tr>
						<tr>
							<td class="textR">医院等级：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aka101" name="aka101" class="mini-combobox" data="${dic['AKA101']}"
											    textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											    onvaluechanged="onRank"/>
										</div>
									</div>
								</div>	 	       
							</td>
							<td class="textR">联网结算标识：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb011" name="akb011" class="mini-combobox" data="${dic['AKB011']}"
											   textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											   onvaluechanged="onNet"/>
										</div>
									</div>
								</div>		       
							</td>
							<td class="textR">医疗机构分类：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb023" name="akb023" class="mini-combobox" data="${dic['AKB023']}"
											   textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											   onvaluechanged="onTreat"/>
										</div>
									</div>
								</div>		       
							</td>
						</tr>
						<tr>
							<td class="textR">医疗机构许可证：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb026" name="akb026" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">分院标志：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb100" name="akb100" class="mini-combobox" data="${dic['AKB100']}"
											   textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											   onvaluechanged="onCourt"/>
										</div>
									</div>
								</div>	       
							</td>
							<td class="textR">上级医疗机构：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb101mc" name="akb101mc" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">医保联系人：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae004" name="aae004" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">电话：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae005" name="aae005" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">邮编：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae007" name="aae007" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
						    <td class="textR">地址：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae006" name="aae006" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
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
								<div class="inputL" style="width:530px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa701" name="apa701" class="mini-textbox" allowInput="false"/>
											<%--<input id="apa701_3" name="apa701" class="mini-combobox"
												    data="${dic['APA701']}" emptyText="请选择..."/>
									   	--%></div>
									</div>
								</div>
							</td>
						</tr>
						<%--<tr>
						    <td class="textR">稽核结论类型：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa005" name="apa005"  class="mini-combobox" data="${dic['APA005']}"
											    textField="text" valueField="id" allowInput="false" emptyText="请选择..."
											    onvaluechanged="onColun"/>
										</div>
									</div>
								</div>	      
							</td>
							<td class="textR">稽核定论日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape727s" name="ape727s" class="mini-datepicker" allowInput="false"
												ondrawdate="onDrawDate"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						--%>
					</table>
				</div>
			</form>
			<form id="form2" action="" method="post">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">稽核对象详情</span></h3> -->
				<div id="editForm2" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						
						<tr>
						<td class="textR">核减人次：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae619" name="aae619" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">核减人头：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae618" name="aae618" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否停止医疗保险服务费用结算方式：</td>
						<td>
							<select name="apa163" class="mini-radiobuttonlist" id="apa163" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">追回医保基金损失：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape752" name="ape752" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">结算方式时间(起始)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input name = "ape741" id="ape741" class="mini-datepicker"  />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">结算方式时间(终止)：</td>
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
							<select name="apa168" class="mini-radiobuttonlist" id="apa168_3" enabled="false" >
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
						<td class="textR">移交行政部门：</td>
						<td>
							<div class="inputL" style="width:150px;">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ade189_3" name="ade189" class="mini-textbox" style="width:100%;" enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">罚款：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae257_3" name="aae257" class="mini-textbox" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交警方追究刑事责任：</td>
						<td>
							<select name="apa169" class="mini-radiobuttonlist" id="apa169_3" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">是否取消定点资格：</td>
						<td>
							<select name="apa457" class="mini-radiobuttonlist" id="apa457" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
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
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	 style="height: 60px;"></textarea>
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
			
			var akb022s;
			var akb011s;
			var akb023s;
			var akb100s;
			var apa709s;
			var apa701s;
			var apa005s;
			var apa011s;
			var aka101s;
			
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
				    url: "${pageContext.request.contextPath}/k3/f10301004/queryKb01ByAaz077.action?method=queryKb01ByAaz077",
				    type: "post",
				    data: {aaz077: data.aaz077 },
				    success: function (text) {
				        var data = mini.decode(text);
				        form.setData(data);
				        
				        var apa154 = data.apa154;
				       	var apa156 = data.apa156;
				       	var apa155 = data.apa155;
				       	var apa158 = data.apa158;
				       	var apa157 = data.apa157;
				       	var apa161 = data.apa161;
				       	
				       	var ape752 = data.ape752;
				       	if(ape752 == 0){
				       		mini.get("ape752").setValue("");
				       	}
				       	
				       	akb022s = data.akb022;
				       	akb011s = data.akb011;
				       	akb023s = data.akb023;
				       	akb100s = data.akb100;
				       	apa709s = data.apa709;
				       	apa701s = data.apa701;
				       	apa005s = data.apa005;
				       	apa011s = data.apa011;
				       	aka101s = data.aka101;
				    }
				});
			}
		
		     function onMedint(){
		     	var akb022 = mini.get("akb022").getValue();
		     	if(akb022 != akb022s){
		     		mini.get("akb022").setValue(akb022s);
		     	}
		     }
		     
		     function onNet(){
		     	var akb011 = mini.get("akb011").getValue();
		     	if(akb011 != akb011s){
		     		mini.get("akb011").setValue(akb011s);
		     	}
		     }
		     
		     function onTreat(){
		     	var akb023 = mini.get("akb023").getValue();
		     	if(akb023 != akb023s){
		     		mini.get("akb023").setValue(akb023s);
		     	}
		     }
		     
		     function onCourt(){
		     	var akb100 = mini.get("akb100").getValue();
		     	if(akb100 != akb100s){
		     		mini.get("akb100").setValue(akb100s);
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
		     
		     function onColun(){
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
		     
		     function onRank(){
		     	var aka101 = mini.get("aka101").getValue();
		     	if(aka101 != aka101s){
		     		mini.get("aka101").setValue(aka101s);
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
