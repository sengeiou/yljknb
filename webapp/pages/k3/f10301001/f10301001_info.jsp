<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>疑点问题详情</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz281" name="aaz281" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
			<!-- <h3 class="cxTit pTb8"><span class="iconCx">疑点信息详情</span></h3> -->
			<div id="infoForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
					<tr>
						<td class="textR">受理方式：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa703" name="apa703" class="mini-combobox" emptyText="请选择受理方式..." 
											data="${dic['APA703']}" allowInput="false" onvaluechanged="accept" enabled="false"/>
								   	</div>
								</div>
							</div>
						</td>
						<td class="textR">受理日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711s" name="ape711s" class="mini-datepicker" allowInput="false"
											ondrawdate="onDrawDate" enabled="false" showClearButton="false" showTodayButton="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">统筹区：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择统筹区..."
								   			data="${dic['AAA027']}" textField="text" valueField="id" required="true"
								   			allowInput="false" onvaluechanged="onPlan" enabled="false"/>
								   	</div> 
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">举报人类型：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa704" name="apa704" class="mini-combobox"emptyText="请选择举报人类型..." 
											data="${dic['APA704']}" allowInput="false" onvaluechanged="infoSource"
											enabled="false"/>
							       	</div>
								</div>
							</div>
						</td>
						<td class="textR">举报人单位：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape028" name="ape028" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">举报人姓名：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape713" name="ape713" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">举报(投诉)方式：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa705" name="apa705" class="mini-combobox" emptyText="请选择举报(投诉)方式"
								   			data="${dic['APA705']}" textField="text" valueField="id" required="true"
								   			allowInput="false" onvaluechanged="sourceWay" enabled="false"/>
								   	</div>
								</div>
							</div>
						</td>
						<td class="textR">邮政编码：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae007" name="aae007" class="mini-textbox" required="true" maxlength="6"
											allowInput="false" enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">举报人地址：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae006" name="aae006" class="mini-textbox" required="true" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">举报人电话：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae005" name="aae005" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">电子邮箱：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae159" name="aae159" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">备注：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae013" name="aae013" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<!-- <td class="textR">案件编号：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="abz001" name="abz001" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td> -->
					</tr>
					<tr>
						<td class="textR">问题处理状态：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa165" name="apa165" class="mini-combobox" emptyText="请选择问题状态..." 
											data="${dic['APA165']}" allowInput="false" onvaluechanged="onProcess"
											enabled="false"/>
								   	</div>
								</div>
							</div>
						</td>
						<td class="textR">问题关闭人：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape133" name="ape133" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">问题关闭日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape027s" name="ape027s" class="mini-datepicker" allowInput="false"
											ondrawdate="onDrawDate" enabled="false" showClearButton="false" showTodayButton="false"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">经办人：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae011" name="aae011" class="mini-textbox" allowInput="false"
											enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">经办时间：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae036" name="aae036" format="yyyy-MM-dd" class="mini-datepicker" 
											allowInput="false" ondrawdate="onDrawDate" enabled="false" 
											showClearButton="false" showTodayButton="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">被举报人对象编号：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aac302" name="aac302" class="mini-textbox" allowInput="false"  enabled="false"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
					<td class="textR"><span style="color: red;">*</span>被举报对象名称：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape714" name="ape714" class="mini-textbox" allowInput="false"  enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">被举报对象地址：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae306" name="aae306" class="mini-textbox"  allowInput="false"  enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">被举报人电话：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae305" name="aae305" class="mini-textbox" allowInput="false"  enabled="false"/>
									</div>
								</div>
							</div>
						</td>	
					</tr>
					<tr>
						<td class="textR">主要证据或线索:</td>
						<td colspan="6">
							<div style="padding-right:11px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="ape313" name="ape313" class="mini-textarea" style="width:100%;height:60px;" 
										allowInput="false"/>
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
						<td class="textR">举报投诉内容:</td>
						<td colspan="6">
							<div style="padding-right:11px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="ape712" name="ape712" class="mini-textarea" style="width:100%;height:80px;" 
										allowInput="false"/>
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
						<td class="textR">简单处理的处理意见:</td>
						<td colspan="6">
							<div style="padding-right:11px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="aae200" name="aae200" class="mini-textarea" style="width:100%;height:80px;" 
										allowInput="false"/>
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
		</fieldset>
		</form>
		
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form_info");
			form.setEnabled(true);
			
			var apa703s;
			var aaa027s;
			var apa704s;
			var apa705s;
			var apa165s;
			
			//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			$.ajax({
     				url:"${pageContext.request.contextPath}/k3/f10301001/loadAuditProblem.action?method=loadAuditProblemInfo",
     				type: "post",
	     			data:{aaz281: data.aaz281},
	     			success: function (text){
	     				var data = mini.decode(text);
	     				form.setData(data);
	     				
	     				apa703s = data.apa703;
	     				aaa027s = data.aaa027;
	     				apa704s = data.apa704;
	     				apa705s = data.apa705;
	     				apa165s = data.apa165;
	     				
	     				/* var ape027 = data.ape027;
	     				if(ape027 == 0){
	     					mini.get("ape027").setValue("");
	     				} */
	     			}
     			});
     		}	
     		
     		/* function onDrawDate(e){
     			e.allowSelect = false;
     		 var date = e.date;
	            var d = new Date();
	            
     			if(date.getTime() != d.getTime()){
     				e.allowSelect = false;
     			}
     		} */
     		
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
     		
     		function accept(){
     			var apa703 = mini.get("apa703").getValue();
     			
     			if(apa703 != apa703s){
     				mini.get("apa703").setValue(apa703s);
     			}
     		}
     		
     		function onPlan(){
     			var aaa027 = mini.get("aaa027").getValue();
     			
     			if(aaa027 != aaa027s){
     				mini.get("aaa027").setValue(aaa027s);
     			}
     		}
     		
     		function infoSource(){
     			var apa704 = mini.get("apa704").getValue();
     			
     			if(apa704 != apa704s){
     				mini.get("apa704").setValue(apa704s);
     			}
     		}
     		
     		function sourceWay(){
     			var apa705 = mini.get("apa705").getValue();
     			
     			if(apa705 != apa705s){
     				mini.get("apa705").setValue(apa705s);
     			}
     		}
     		
     		function onProcess(){
     			var apa165 = mini.get("apa165").getValue();
     			
     			if(apa165 != apa165s){
     				mini.get("apa165").setValue(apa165s);
     			}
     		}
		</script>
	</body>
</html>