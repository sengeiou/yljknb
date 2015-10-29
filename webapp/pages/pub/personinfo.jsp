<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>稽核对象详情--参保人</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<form id="form1" action="" method="post">
			
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">稽核对象详情</span></h3> -->
				<div id="editForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">人员编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac001" name="aac001" class="mini-textbox" allowInput="false"/>
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
							<td class="textR">性别：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac004" name="aac004" class="mini-combobox" data="${dic['AAC004']}"
								       			textField="text" valueField="id" allowInput="false" onvaluechanged="onSex"
								       			emptyText="请选择..."/>
								       	</div>
								    </div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">出生日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac006s" name="aac006s" class="mini-datepicker" allowInput="false"
												ondrawdate="onDrawDate" showClearButton="false" showTodayButton="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">离退休状态：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac084" name="aac084" class="mini-combobox" data="${dic['AAC084']}"
											       textField="text" valueField="id" allowInput="false" onvaluechanged="onRetire"
											       emptyText="请选择..."/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">社会保障卡号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac002" name="aac002" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">监控等级：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa151" name="apa151" class="mini-combobox" data="${dic['APA151']}"
											       textField="text" valueField="id" allowInput="false" onvaluechanged="onMonitor"
											       emptyText="请选择..."/>
										</div>
									</div>
								</div>
							</td>
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
							<td class="textR">稽核对象类型：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa709" name="apa709" class="mini-combobox" data="${dic['APA709']}"
											       textField="text" valueField="id" allowInput="false" onvaluechanged="onType"
											       emptyText="请选择..."/>
										</div>
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
						<td class="textR"><span style="color: red;">*</span>案由：</td>
						<td colspan="5">
							<div class="inputL" style="width:530px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa701_1" name="apa701" class="mini-combobox"
											   data="${dic['APE701']}" emptyText="请选择..."/>
								   	</div>
								</div>
							</div>
						</td>
					</tr>
						<tr>
						<td class="textR">结算方式时间(起始)：</td>
						<td colspan="2.5">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input name = "ape741" id="ape741" class="mini-datepicker"  />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">结算方式时间(终止)：</td>
						<td colspan="2.5">
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
						<td class="textR">是否暂停医疗保险待遇：</td>
						<td colspan="2.5">
							<select name="apa163" class="mini-radiobuttonlist" id="apa163" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">追回医保基金损失：</td>
						<td colspan="2.5">
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
						<td class="textR">是否移交：</td>
						<td colspan="2.5">
							<select name="apa168" class="mini-radiobuttonlist" id="apa168_1" onvaluechanged="apa168Changed_1()" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR">移交行政部门：</td>
						<td colspan="2.5">
							<div class="inputL" style="width:150px;">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ade189_1" name="ade189" class="mini-textbox" style="width:100%;" enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">罚款：</td>
						<td colspan="2.5">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae257_1" name="aae257" class="mini-textbox" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交警方追究刑事责任：</td>
						<td colspan="2.5">
							<select name="apa169" class="mini-radiobuttonlist" id="apa169_1" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						
						<td class="textR">稽核登记日期：</td>
							<td colspan="2.5">
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="baz024" name="baz024" class="mini-datepicker" allowInput="false"
												ondrawdate="onDrawDate" showClearButton="false" showTodayButton="false"/>
										</div>
									</div>
								</div>
							</td>
					</tr>
					<tr>
						<td class="textR" ><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="5" >
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
			
			var aac004s;
			var aac084s;
			var apa151s;
			var apa709s;
			var apa701s;
			var apa005s;
			var apa011s;
			
			function setData(data){
				mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
				var data = mini.clone(data);
				$.ajax({
				    url: "${pageContext.request.contextPath}/k3/f10301004/queryAc01ByAaz077.action?method=queryAc01ByAaz077",
				    type: "post",
				    data: {aaz077: data.aaz077 },
				    success: function (text) {
				    	mini.unmask(document.body);
				        var data = mini.decode(text);
				        form.setData(data);
				        
				        aac004s = data.aac004;
				        aac084s = data.aac084;
				        apa151s = data.apa151;
				        apa709s = data.apa709;
				        apa701s = data.apa701;
				        apa005s = data.apa005;
				        apa011s = data.apa011;
				        
				        var apa154 = data.apa154;
				       	var apa156 = data.apa156;
				       	var apa155 = data.apa155;
				       	var apa158 = data.apa158;
				       	var apa162 = data.apa162;
				       	var apa163 = data.apa163;
				       	var apa157 = data.apa157;
				       	
				       	
				    }
				});
				
				$.ajax({
					url: "${pageContext.request.contextPath}/k3/f10301008/queryAf38ByAaz077.action?method=queryAf38ByAaz077",
				    type: "post",
				    data: {aaz077: data.aaz077 },
				    success: function (text) {
				        var data = mini.decode(text);
				        form2.setData(data);
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
		     
		    /*  function onDrawDate(e){
		     	e.allowSelect = false;
		     } */
		     
		     function onSex(){
		     	var aac004 = mini.get("aac004").getValue();
		     	
		     	if(aac004 != aac004s){
		     		mini.get("aac004").setValue(aac004s);
		     	}
		     }
		     
		     function onRetire(){
		     	var aac084 = mini.get("aac084").getValue();
		     	
		     	if(aac084 != aac084s){
		     		mini.get("aac084").setValue(aac084s);
		     	}
		     }
		     
		     function onMonitor(){
		     	var apa151 = mini.get("apa151").getValue();
		     	
		     	if(apa151 != apa151s){
		     		mini.get("apa151").setValue(apa151s);
		     	}
		     }
		     
		     function onType(){
		     	var apa709 = mini.get("apa709").getValue();
		     	
		     	if(apa709 != apa709s){
		     		mini.get("apa709").setValue(apa709s);
		     	}
		     }
		     
		     function onProblem(){
		     	var apa701 = mini.get("apa701").getValue();
		     	
		     	if(apa701 != apa701s){
		     		mini.get("apa701").setValue(apa701s);
		     	}
		     }
		     
		     function onConclude(){
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
