<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>申诉信息</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<style>
.cxTab1{border-collapse:collapse;width:100%;font-size:12px;}
.cxTab1 td{text-align:left;line-height:16px;height:20px;padding-bottom:0;}
.cxTab1 td.textR{padding-right:16px;text-align:right;font-size:12px;}
.cxTab1 .mini-buttonedit-button{}
.cxTab1 .mini-buttonedit-border,
.cxTab1 .mini-textbox-border,
.cxTab1 .mini-buttonedit-button-hover
{border:0;background:none;}
.cxTab1 .mini-buttonedit-input{font-size:12px;color:#333;font-family:'Simsun';width:98%;}
.cxTab1 .mini-buttonedit-button-hover{padding:1px;}
.cxTab1 .mini-buttonedit-icon {width:17px;height:17px;}
.cxTab1 .mini-datepicker .mini-buttonedit-icon{background:url(images/custom/icon_08.gif) no-repeat left center;}
.cxTab1 .mini-buttonedit-popup .mini-buttonedit-button{border:0;background:none;padding:1px;}
.cxTab1 .mini-buttonedit-popup .cxTab .mini-buttonedit-popup{padding:1px;border:0;}
</style>
<body>
	<form id="form1" action="" method="post" enctype="multipart/form-data">
	<input id="aaz281" name="aaz281" value="" class="mini-hidden" required="true"/>
	<input id="aaz529" name="aaz529" value="" class="mini-hidden" required="true"/>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<legend></legend>
			<h3 class="cxTit pTb8"><span class="iconCx">申诉信息</span></h3>
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab1">
					
					<tr>
						<td class="textR">申诉材料：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="fileupload" name="Fdata" class="mini-htmlfile" limitType="*.txt" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">申诉时间：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711" name="ape711" class="mini-datepicker"  enabled="false"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR"><span style="color:red;">*</span>申诉理由：</td>
						<td colspan="3">
							<div style="padding-right: 8%">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="ape138" class="mini-textarea" required="true" style="height:100px; width:100%;" 
										vtype="maxLength:150" required="true" />
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
				</table>
			</div>
		</fieldset>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<legend></legend>
			<h3 class="cxTit pTb8"><span class="iconCx">申诉对象信息</span></h3>
			<div id="editForm2" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR">申诉对象名称：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape008" name="ape008" class="mini-textbox"  enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">统筹区：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa027" name="aaa027" class="mini-combobox" enabled="false"
											data="${dic['AAA027']}" textField="text" valueField="id"
											 />
									</div>
								</div>
							</div>
						</td>
					</tr>
				</table>
			</div>
		</fieldset>
		<div style="margin:10px;text-align:center;" class="mainlistCon">
				<span class="btnMini">
					<em>
						<input type="button" value="保存" onclick="SaveData()" id="s_btn" name="s_btn"/>
					</em>
				</span>
				<span class="btnMini">
					<em>
						<input type="button" value="返回" onclick="closeWin()" id="b_btn" name="b_btn"/>
					</em>
				</span>
		    </div>
	</form>
	
	<script type="text/javascript">
		mini.parse();
			
		function resetForm(){
			var queryForm = new mini.Form("form1");
			queryForm.reset();
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
			
		
		function SetData(data){
		     	//跨页面传递的数据对象，克隆后才可以安全使用
		     	var data = mini.clone(data);
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/k5/f10503001/toOrgVioCompReg.action?method=toOrgVioCompReg",
		     		type:"post",
		     		data: {aaz281: data.aaz281,aaa027 : data.aaa027,aaz529 : data.aaz529},
		     		success: function (text){
		     			var data = mini.decode(text);
		     			var form = new mini.Form("form1");
				        form.setData(data);
		     		}
		     	});
     		}
			
		function SaveData() {
			var form = new mini.Form("form1");
			var data = form.getData();
			form.validate();
			if (form.isValid() == false) {
				return;
			}
			var json = mini.encode(data);
			mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
			$.ajax({
				url: "${pageContext.request.contextPath}/k5/f10503001/saveOrgVioCompReg.action?method=saveOrgVioCompReg",
				type: "post",
				data: { submitData: json },
				success: function (text) {
					mini.unmask(document.body);
					if(text.success){
						mini.showMessageBox({
				        	title: "提示",
				        	message: "保存成功",
				        	buttons: ["确定"],
				        	iconCls: "mini-messagebox-info",
				        	callback: function(action){
				            	closeWin();
				         	}
			         	});
					}else{
						mini.showMessageBox({
				        	title: "提示",
				        	message: "保存失败",
				        	buttons: ["确定"],
				        	iconCls: "mini-messagebox-info",
				        	callback: function(action){
				            		closeWin();
				         	}
			         	});
					}  
				}	
			});
		}
		</script>
	</body>
</html>
