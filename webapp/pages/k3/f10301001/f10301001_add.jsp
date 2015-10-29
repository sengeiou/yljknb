<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增疑点问题</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<style>
			.textR{
				padding-top:3px;
			}
		</style>
	</head>
	<body>
		<!-- <div id="editForm1" class="cxTabbox"> -->
		<form id="form1" action="" method="post">
			<input id="doType" name="doType" class="mini-hidden" />
			<fieldset style="width: 100%; border: solid 0px #aaa;">
			<!-- <h3 class="cxTit pTb8"><span class="iconCx">疑点信息录入</span></h3> -->
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
					<tr>
						<td class="textR"><span style="color: red;">*</span>受理方式：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa703" name="apa703" class="mini-combobox" emptyText="请选择受理方式"
								   			   data="${dic['APA703']}" textField="text" valueField="id" required="true"
								   			   onvaluechanged="accept"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>受理日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711s" name="ape711s" format="yyyy-MM-dd" class="mini-datepicker" 
								   			   onvaluechanged="onValueChanged"  allowInput="false"/>
										<input id="ape711" name="ape711" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>统筹区：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择统筹区"
								   				data="${dic['AAA027']}" textField="text" valueField="id" required="true"/>
									</div>
								</div>
							</div>
						</td>	
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>举报人类型：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa704" name="apa704" class="mini-combobox" emptyText="请选择来源方类型"
											data="${dic['APA704']}" textField="text" valueField="id" required="true"
											onvaluechanged="infoSource"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>举报人单位：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape028" name="ape028" class="mini-textbox" required="true" vtype="maxLength:50"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>举报人姓名：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape713" name="ape713" class="mini-textbox" required="true" vtype="maxLength:50"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>举报(投诉)方式：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa705" name="apa705" class="mini-combobox" emptyText="请选择举报(投诉)方式"
									   		data="${dic['APA705']}" textField="text" valueField="id" required="true"
									   		onvaluechanged="sourceWay"/>
									  </div>
								</div>
							</div> 	
						</td>
						<td class="textR"><span style="color: red;">*</span>邮政编码：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae007" name="aae007" class="mini-textbox" onvalidation="onPostbox" required="false"/>
									 </div>
								</div>
							</div> 	
						</td>
						<td class="textR"><span style="color: red;">*</span>举报人地址：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae006" name="aae006" class="mini-textbox" required="false" vtype="maxLength:150"/>
									 </div>
								</div>
							</div> 	
						</td>
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>举报人电话：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae005" name="aae005" class="mini-textbox" onvalidation="onPhone"/>
									 </div>
								</div>
							</div> 	
						</td>
						<td class="textR">电子邮箱：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae159" name="aae159" class="mini-textbox" vtype="email" vtype="maxLength:50"/>
									</div>
								</div>
							</div> 		
						</td>
						<td class="textR">被举报人对象编号：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aac302" name="aac302" class="mini-textbox" required="true" vtype="maxLength:50"/>
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
										<input id="ape714" name="ape714" class="mini-textbox" required="true" vtype="maxLength:50"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">被举报对象地址：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae306" name="aae306" class="mini-textbox" required="true" vtype="maxLength:50"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">被举报人电话：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae305" name="aae305" class="mini-textbox"  required="false" />
									</div>
								</div>
							</div>
						</td>	
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>举报人性别：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aac004" name="aac004" class="mini-combobox" emptyText="请选择性别"
								   				data="${dic['AAC004']}" textField="text" valueField="id" required="true"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<%-- <tr>
						<td class="textR">举报人性别:</td>
						<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择统性别"
							   				data="${dic['AAC004']}" textField="text" valueField="id" required="true"/>
								</div>
							</div>
						</div>
						</td>
					</tr> --%>
					<tr>
						<td class="textR">主要证据或线索：</td>
						<td colspan="6">
							<div style="padding-right:10px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="ape313" name="ape313" class="mini-textarea" 
										 style="width:100%;height:70px;" required="false" vtype="maxLength:200"/>
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
						<td class="textR"><span style="color: red;">*</span>举报投诉内容：</td>
						<td colspan="6">
							<div style="padding-right:10px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="ape712" name="ape712" class="mini-textarea" 
										 style="width:100%;height:100px;" required="true" vtype="maxLength:4000"/>
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
										<input type="button" value="保存" onclick="SaveData()"/>
									</em>
								</span>
								<span class="btnMini">
									<em>
										<input type="button" value="清空" onclick="clearProblem()"/>
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
			</fieldset>
		</form>
		<!-- </div> -->
		<script type="text/javascript">
			mini.parse();
			
			//受理方式apa703 6(主动稽核)
			function accept(){
				var apa703 = mini.get("apa703").getValue();
				//alert(apa703);
				if(apa703 == "1"){
					alert("系统监控应当有系统自动，不能选择");
					mini.get("apa703").setValue("");
				}
				if(apa703 == "6"){
					mini.get("apa704").setValue("21");
					mini.get("apa705").setValue("6");
				}else if(apa703 != "6"){
					mini.get("apa704").setValue("");
					mini.get("apa705").setValue("");
				}
			}
			
			//信息来源方类型apa704 21(稽核部门)
			function infoSource(){
				var apa703 = mini.get("apa703").getValue();
				var apa704 = mini.get("apa704").getValue();
				if(apa704 != "21" && apa703 == "6"){
					mini.alert("该选项与受理方式不匹配！");
					mini.get("apa704").setValue("21");
				}
			}
			
			//信息来源方式apa705 6(主动稽核)
			function sourceWay(){
				var apa703 = mini.get("apa703").getValue();
				var apa704 = mini.get("apa704").getValue();
				var apa705 = mini.get("apa705").getValue();
				if(apa705 != "6" && apa703 == "6"){
					mini.alert("该选项与受理方式不匹配！");
					mini.get("apa705").setValue("6");
				}
				if(apa704 == "21" && apa705 == "6"){
					mini.alert("该选项与受理方式冲突！");
					mini.get("apa705").setValue("");
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

			var form = new mini.Form("form1");
		    //申报信息录入
		    function SaveData() {
		        var data = form.getData(); 
		        form.validate();
		        if (form.isValid() == false) {
		            return;
		        }
		        var json = mini.encode(data);
		        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
		        $.ajax({
		            url: "${pageContext.request.contextPath}/k3/f10301001/saveAuditProblem.action",
		            type: "post",
		            data: { submitData: json },
		            success: function (text) {
		            	mini.unmask(document.body);
		            	if(text.success){
		            	 	mini.showMessageBox({
		        				title: "提示",
		        				message: "成功添加一条记录",
		        				buttons: ["确定"],
		        				iconCls: "mini-messagebox-info",
		        				callback: function(action){
		            				closeWin();
		         			}});        	  
		            	}else{
		            	  mini.alert(text.msg);
		                }  
		            }
		        });
		    }
		    
		    //清空
		    function clearProblem(){
		    	form.clear();
		    }
		    
		    function onValueChanged(){
		    	var ape711Date = mini.get("ape711s").getValue();
		    	var currDate = new Date();
		    	if(ape711Date < currDate){
		    		mini.get("ape711").setValue(getDateYmd(ape711Date));
		    	}else{
		    		mini.alert("受理日期不能大于当前日期");
		    		mini.get("ape711s").setValue(currDate);
		    		mini.get("ape711").setValue(getDateYmd(currDate));
		    	}
		    	
		    }
		    
		    //验证邮编
		    function onPostbox(e){
		    	if(e.isValid){
		    		if(isPostbox(e.value) == false){
		    			e.errorText = "邮编必须是6位数字";
                    	e.isValid = false;
                    	//mini.alert(e.errorText);
		    		}
		    	}
		    }
		    
		    function isPostbox(v){
		    	var post = /^\d{6}$/;
		    	if(post.test(v)){
		    		return true;
		    	}
		    	return false;
		    }
		    
		    //验证手机号
		    function onPhone(e){
		    	if(e.isValid){
		    		if(isPhone(e.value) == false){
		    			e.errorText = "联系方式必须是 7 - 12 位数字";
                    	e.isValid = false;
                    	//mini.alert(e.errorText);
		    		}
		    	}
		    }
		    
		    function isPhone(v){
		    	var tel = /^\d{7,12}$/;
		    	if(tel.test(v)){
		    		return true;
		    	}
		    	return false;
		    }
		    
		    function getDateYmd(date) {
		    	var year = date.getFullYear();
		    	var month = (date.getMonth() + 1).toString();
		    	var day = (date.getDate()).toString();
		    	if(month.length == 1) {
		    		month = "0" + month;
		    	}
		    	if(day.length == 1) {
		    		day = "0" + day;
		    	}
		    	return year + month + day;
		    }
		</script>
	</body>
</html>
