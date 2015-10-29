<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>案件结论</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<input id="aaz148" name="aaz148" value="" class="mini-hidden" />
			
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">稽核结论</span></h3> -->
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR"><span style="color: red;">*</span>稽核对象类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa709" name="apa709" class="mini-combobox" 
													   enabled="false" data="${dic['APA709']}" emptyText="请选择..."/>
										   	</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>稽核问题类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa701" name="apa701" class="mini-combobox" 
													   enabled="false" data="${dic['APA701']}" emptyText="请选择..."/>
										   	</div>
										</div>
									</div>
								</td>
								<td class="textR">稽核结论类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa005" name="apa005" class="mini-combobox" 
													   emptyText="请选择..." data="${dic['APA005']}" enabled="false"/>
										   	</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
							<td class="textR">稽核定论日期：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape727s" name="ape727s" class="mini-datepicker" format="yyyy-MM-dd" 
												        allowInput="false" enabled="false"/>
											</div>
										</div>
									</div>
								</td>
							<td class="textR">违规金额：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape752" name="ape752" class="mini-textbox" vtype="maxLength:16"
													 enabled="false"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">稽核结论：</td>
								<td colspan="6">
									<div style="padding-right:0px;padding-top:2px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="ape726" name="ape726" class="mini-textarea" style="width:100%;" 
												vtype="maxLength:1000" enabled="false"/>
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
								<td class="textR">不予处理：</td>
								<td>
									<div id="apa154" name="apa154" class="mini-radiobuttonlist" repeatLayout="table" 
										 repeatDirection="vertical" textField="text" valueField="id" 
										 data="${dic['APA154']}" enabled="false">
									</div>  
								</td>
							</tr>
							<tr>
								<td class="textR">处罚方式:</td>
								<td style="width:160px">
							    	<div id="cf0" name="cf0" class="mini-checkbox" text="经办处理处罚" 
							    		 enabled="false">
							    	</div>
							    	<input id="apa156" name="apa156" class="mini-hidden" required="true"/>
								</td>
								<td style="width:160px">
								    <div id="cf1" name="cf1" class="mini-checkbox" text="行政处理处罚" 
								    	  enabled="false">
								    </div>
								    <input id="apa155" name="apa155" class="mini-hidden" required="true"/>
								</td>
								<td style="width:160px">
								    <div id="cf2" name="cf2" class="mini-checkbox" text="司法处理" 
								    	  enabled="false"> 
								    </div>
								    <input id="apa158" name="apa158" class="mini-hidden" value="0" required="true"/>
								</td>
							</tr>
							<tr>
								<td></td>
								<td style="width:160px">
							    	<div id="cf3" name="cf3" class="mini-checkbox" text="冻结社会保障卡就医标识" 
							    		  enabled="false" >
							    	</div>
							    	<input id="apa162" name="apa162" class="mini-hidden" required="true"/>
								</td>
								<td style="width:160px">
								    <div id="cf4" name="cf4" class="mini-checkbox" text="暂停个人医保待遇标志" 
								    	  enabled="false">
								    </div>
								    <input id="apa163" name="apa163" class="mini-hidden" required="true"/>
								</td>
								<td style="width:160px">
								    <div id="cf5" name="cf5" class="mini-checkbox" text="停止医疗服务资格标志" 
								          enabled="false">
								    </div>
								    <input id="apa161" name="apa161" class="mini-hidden" required="true"/>
								</td >
							</tr>
							<tr>
								<td></td>
								<td style="width:160px">
								    <div id="cf6" name="cf6" class="mini-checkbox" text="纳入重点监控标识" 
								    	  enabled="false">
								    </div>
								    <input id="apa157" name="apa157" class="mini-hidden" required="true"/>
								</td>
							</tr>
							<tr>
								<td class="textR">重点监控截止日期：</td>
								<td >
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae031s" name="aae031s" class="mini-datepicker" format="yyyy-MM-dd" 
												        allowInput="false" enabled="false"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">结论确认状态：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa011" name="apa011" class="mini-combobox" 
													   emptyText="请选择..." data="${dic['APA011']}" enabled="false"/>
										   	</div>
										</div>
									</div>
								</td>
								<td class="textR">结论确认日期：</td>
								<td >
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae034s" name="aae034s" class="mini-datepicker" format="yyyy-MM-dd" 
												        allowInput="false" enabled="false"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">结论批示意见：</td>
								<td colspan="6">
									<div style="padding-right:0px;padding-top:2px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="aae189" name="aae189" class="mini-textarea" style="width:100%;" 
												vtype="maxLength:1000" enabled="false"/>
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
								<td style="text-align: right; padding-top: 5px; padding-right: 20px;"
								    colspan="6" class="mainlistCon">
								    <span class="btnMini">
								    	<em>
								    		<input type="button" value="返回" onclick="revert()"/>
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
			
    		//标准方法接口定义
     		function SetData(data){
     			data = mini.clone(data);
     			$.ajax({
     				url:"${pageContext.request.contextPath}/k5/f10503001/viewPerson.action?method=viewPerson",
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
				        
				        var ape752 = data.ape752;
				        if(ape752 == 0){
				        	mini.get("ape752").setValue("");
				        }
     				}
     			});
     			
     		}
     		
			function CloseWindow(action) {
         		if (window.CloseOwnerWindow){
              		return window.CloseOwnerWindow(action);
         		}else{
             		window.close();
         		}            
     		}
     		
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
			
			//返回
			function revert(){
				closeWin();
			}
			
		</script>
	</body>
</html>