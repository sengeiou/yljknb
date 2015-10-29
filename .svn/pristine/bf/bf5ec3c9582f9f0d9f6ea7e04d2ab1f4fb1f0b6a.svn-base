<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>关闭疑点问题</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body>
	<form id="form1" action="" method="post">
	<input id="aaz281str" name="aaz281str" value="" class="mini-hidden" required="true"/>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<legend></legend>
			<!-- <h3 class="cxTit pTb8"><span class="iconCx">关闭疑点问题</span></h3> -->
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR"><span style="color:red;">*</span>关闭原因</td>
						<td>
							<div style="padding-right:4px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="aae013" class="mini-textarea" required="true" style="height:120px; width:580px" 
										vtype="maxLength:150"/>
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
									<input type="button" value="保存" onclick="SaveData()"/>
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
			
		function setData(data) {
			var data = mini.clone(data);
			mini.get("aaz281str").setValue(data.aaz281str);
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
				url: "${pageContext.request.contextPath}/k3/f10301002/closeQuestion.action?method=closeQuestion",
				type: "post",
				data: { submitData: json },
				success: function (text) {
					mini.unmask(document.body);
					if(text.success){
						mini.showMessageBox({
				        	title: "提示",
				        	message: text.messsage,
				        	buttons: ["确定"],
				        	iconCls: "mini-messagebox-info",
				        	callback: function(action){
				            	closeWin();
				         	}
			         	});
					}else{
						mini.showMessageBox({
				        	title: "提示",
				        	message: text.messsage,
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
