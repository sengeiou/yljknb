<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<head>
<title>稽核结论登记_告知</title>
<%@ include file="/pages/pub/pubsource.jsp"%>
</head>
	<body>
		<div>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<form id="form1" action="" method="post" style="display: none;" >
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>姓名：</td>
						<td style="padding-top: 20px;">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape724" name="ape724" class="mini-textbox" required="true" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>性别：</td>
						<td style="padding-top: 20px;">
							<select name="aac004" class="mini-radiobuttonlist" id="aac004" enabled="false">
								<option value="1">男</option>
								<option value="2">女</option>
								<option value="9">未知</option>
							</select>
						</td>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>年龄：</td>
						<td style="padding-top: 20px;">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aac005" name="aac005" class="mini-textbox" required="true" style="width:100%;" emptyText="请输入年龄..." />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>单位：</td>
						<td colspan="2" style="padding-top: 10px;">
							<div class="inputL" style="width:300px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape029" name="ape029" class="mini-textbox" required="true" style="width:100%;" emptyText="请输入单位..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>人员类别：</td>
						<td colspan="2"  style="padding-top: 10px;">
							<div class="inputL" style="width:220px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa065" name="apa065" class="mini-combobox" emptyText="请选择..." 
											emptyText="请选择人员类别..." showNullItem="true" data="${dic['APA065']}" />
								   	</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>住址：</td>
						<td colspan="2" style="padding-top: 10px;">
							<div class="inputL" style="width:300px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae006" name="aae006" class="mini-textbox" required="true" style="width:100%;" emptyText="请输入地址..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>联系电话：</td>
						<td colspan="2"  style="padding-top: 10px;">
							<div class="inputL" style="width:220px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae005" name="aae005" class="mini-textbox" required="true" style="width:100%;" emptyText="请输入电话..." />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>身份证号：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div class="inputL" style="width:500px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aac002" name="aac002" class="mini-textbox" required="true" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>案由：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="apa701" name="apa701" class="mini-textarea" required="true"	emptyText="请输入处理具体内容..." style="height: 40px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>案情简介：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="apf094s_01" name="apf094s" class="mini-textarea" required="true"	emptyText="请输入处理具体内容..." style="height: 40px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	emptyText="请输入承办人意见..." style="height: 80px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>处理意见书内容：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="apf094_01" name="apf094" class="mini-textarea" required="true"	emptyText="请输入处理具体内容..." style="height: 80px;"></textarea>
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
						<td style="text-align:center; padding-top: 20px; padding-right: 20px;" colspan="6" class="mainlistCon">
						    <span class="btnMini">
						    	<em>
						    		<input id="saveButton_01" type="button" value="保存" onclick="save01()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input type="button" value="返回" onclick="revert()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input id="export1_1" type="button" value="导出处理意见单" onclick="export_word('1_1')" disabled="disabled"/>
						    	</em>
						    </span>
						     <span class="btnMini">
						    	<em>
						    		<input id="export1_2" type="button" value="导出处理意见书" onclick="export_word('1_2')" disabled="disabled"/>
						    	</em>
						    </span>
						</td>
					</tr>
				</table>
			</form>
			<form id="form2" action="" method="post" style="display: none;" >
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>医师姓名：</td>
						<td style="padding-top: 20px;">
							<div class="inputL" style="width:200px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape724" name="ape724" class="mini-textbox" required="true" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>医师编号：</td>
						<td style="padding-top: 20px;">
							<div class="inputL" style="width:200px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aaz010" name="aaz010" class="mini-textbox" required="true" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>案由：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="apa701" name="apa701" class="mini-textarea" required="true"	emptyText="请输入案由..." style="height: 60px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	emptyText="请输入承办人意见..." style="height: 60px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>处理意见书内容：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="apf094" name="apf094" class="mini-textarea" required="true"	emptyText="请输入处理具体内容..." style="height: 60px;"></textarea>
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc"></div>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr id="showOrNot_02_1" style="display: none;">
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>停止医疗费用结算内容：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ade064" name="ade064" class="mini-textarea" required="true"	emptyText="请输入停止医疗费用结算内容..." style="height: 60px;"></textarea>
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
						<td style="text-align:center; padding-top: 20px; padding-right: 20px;" colspan="6" class="mainlistCon">
						    <span class="btnMini">
						    	<em>
						    		<input id="saveButton_02" type="button" value="保存" onclick="save02()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input type="button" value="返回" onclick="revert()"/>
						    	</em>
						    </span>
						    <span class="btnMini" >
						    	<em>
						    		<input id="export2_1" type="button" value="导出停止医疗保险服务费用结算书" onclick="export_word('2_1')" disabled="disabled"/>
						    	</em>
						    </span>
						</td>
					</tr>
				</table>
			</form>
			<form id="form3" action="" method="post" style="display: none;" >
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>医疗结构名称：</td>
						<td style="padding-top: 20px;">
							<div class="inputL" style="width:200px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape724" name="ape724" class="mini-textbox" required="true" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>医疗结构编号：</td>
						<td style="padding-top: 20px;">
							<div class="inputL" style="width:200px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aaz010" name="aaz010" class="mini-textbox" required="true" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>案由：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="" name="apa701" class="mini-textarea" required="true"	emptyText="请输入案由..." style="height: 60px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	emptyText="请输入承办人意见..." style="height: 60px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>处理意见书内容：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="apf094" name="apf094" class="mini-textarea" required="true"	emptyText="请输入处理具体内容..." style="height: 60px;"></textarea>
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc"></div>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr id="showOrNot_03_1" style="display: none;">
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>停止医疗费用结算内容：</td>
						<td colspan="5" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ade064" name="ade064" class="mini-textarea" required="true"	emptyText="请输入停止医疗费用结算内容..." style="height: 60px;"></textarea>
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
						<td style="text-align:center; padding-top: 20px; padding-right: 20px;" colspan="6" class="mainlistCon">
						    <span class="btnMini">
						    	<em>
						    		<input id="saveButton_03" type="button" value="保存" onclick="save03()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input type="button" value="返回" onclick="revert()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input id="export3_1" type="button" value="导出处理意见单" onclick="export_word('3_1')" disabled="disabled"/>
						    	</em>
						    </span>
						     <span class="btnMini">
						    	<em>
						    		<input id="export3_2" type="button" value="导出处理意见书" onclick="export_word('3_2')" disabled="disabled"/>
						    	</em>
						    </span>
						    <span class="btnMini" >
						    	<em>
						    		<input id="export3_3" type="button" value="导出停止医疗保险服务费用结算书" onclick="export_word('3_3')" disabled="disabled"/>
						    	</em>
						    </span>
						</td>
					</tr>
				</table>
			</form>
		</fieldset>
		</div>
		<script type="text/javascript">
			mini.parse();
			var aaa027;
			var aaz077;
			var aaz318;
			var apa709;
			var aaz048;
			var apa163;
			var form1 = new mini.Form("form1");
			var form2 = new mini.Form("form2");
			var form3 = new mini.Form("form3");
    		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			aaa027 = data.aaa027;
     			aaz077= data.aaz077;
     			aaz318 = data.aaz318;
     			apa709 = data.apa709;
     			apa163 = data.apa163;
     			if(apa709 == "1"){
     				$("#form1")[0].style.display="block";
     				loadFormData(data);
     			}
     			if(apa709 == "2"){
     				$("#form2")[0].style.display="block";
     				if(apa163 == "1"){
     					$("#showOrNot_02_1")[0].style.display="block";
     				}
     				loadFormData(data);
     			}
     			if(apa709 == "3"){
     				$("#form3")[0].style.display="block";
     				if(apa163 == "1"){
     					$("#showOrNot_03_1")[0].style.display="block";
     				}
     				loadFormData(data);
     			}
     		}
     		function loadFormData(data){
     			 mini.mask({el: document.body,cls: 'mini-mask-loading',html: '加载中...'});
     			$.ajax({
     				url:"${pageContext.request.contextPath}/k3/f10301008/queryAf54Info.action",
     				type:"post",
     				data: data,
     				success: function (text){
     					mini.unmask(document.body);
     					var data = mini.decode(text);
     					if(apa709 == "1"){
		     				form1.setData(data);
		     				mini.get("apf094s_01").setValue(data.apf094);
		     				mini.get("apf094_01").setValue("");
		     				mini.get("apa701").setValue(data.apa701);
		     			}
		     			if(apa709 == "2"){
		     				form2.setData(data);
		     			}
		     			if(apa709 == "3"){
		     				form3.setData(data);
		     			}
     				}
     			});
     		}
     		
     		function export_word(type){
     			var url = "${pageContext.request.contextPath}/k3/f10301008/exportWord_cd.action?aaz048=" + aaz048 + "&aaz077=" + aaz077 + "&type=" + type + "&sid="+Math.random() ;
				window.open(url);
     		}
     		
     		function save01(){
     			var data = form1.getData();
     			form1.validate();
		        if (form1.isValid() == false) {
		            return;
		        }
		        data.aaa027 = aaa027;
		        data.aaz077=aaz077;
		        data.aaz318=aaz318;
		      	allSave(data);
     		}
     		
     		function save02(){
     			var data = form2.getData();
     			form2.validate();
		        if (form2.isValid() == false) {
		            return;
		        }
		        data.aaa027 = aaa027;
		        data.aaz077=aaz077;
		        data.aaz318=aaz318;
		      	allSave(data);
     		}
     		
     		function save03(){
     			var data = form3.getData();
     			form3.validate();
		        if (form3.isValid() == false) {
		            return;
		        }
		        data.aaa027 = aaa027;
		        data.aaz077=aaz077;
		        data.aaz318=aaz318;
		        allSave(data);
     		}
     		
     		function allSave(data){
     			 mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
				$.ajax({
					url: "${pageContext.request.contextPath}/k3/f10301008/saveConver.action",
		            type: "post",
		            data: data,
		            success: function (text){
		            	mini.unmask(document.body);
		            	if(text.success){
		            		aaz048 = text.result[0].aaz048;
		            		mini.showMessageBox({
		            			title: "提示",
		            			message: "稽核结论传达成功",
		            			buttons: ["确定"],
		            			iconCls: "mini-messagebox-info",
		            			callback: function(action){
		            				if(apa709 == "1"){
		            					$("#saveButton_01").attr("disabled","disabled");
		            					$("#export1_1").attr("disabled",false);
		            					$("#export1_2").attr("disabled",false);
		            				}
		            				if(apa709 == "2" ){
		            					$("#saveButton_02").attr("disabled","disabled");
		            					if (apa163 == "1") {
											$("#export2_1").attr("disabled",false);
										}
		            				}
		            				if(apa709 == "3"){
		            					$("#saveButton_03").attr("disabled","disabled");
		            					$("#export3_1").attr("disabled",false);
		            					$("#export3_2").attr("disabled",false);
		            					if (apa163 == "1") {
											$("#export3_3").attr("disabled",false);
										}
		            				}
		            			}
		            		});
		            	}else{
		            		mini.alert(text.msg);
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