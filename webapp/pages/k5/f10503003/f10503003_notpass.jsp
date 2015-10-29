<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>审批不通过</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body>
	<form id="form1" action="" method="post" >
	<input id="aaz281" name="aaz281" value="" class="mini-hidden" required="true"/>
	<input id="aaz529" name="aaz529" value="" class="mini-hidden" required="true"/>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<legend></legend>
			<h3 class="cxTit pTb8"><span class="iconCx">审批信息</span></h3>
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR" style="width:80px"><span style="color:red;">*</span>审批意见：</td>
						<td colspan="3">
							<div style="padding-right: 8%">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="aaz008" class="mini-textarea" required="true" style="height:100px; width:100%;" 
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
			<h3 class="cxTit pTb8"><span class="iconCx">个人基本信息</span></h3>
			<div id="editForm2" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR">审批人：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae011" name="aae011" class="mini-textbox"  enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">审批时间：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae036" name="aae036" class="mini-datepicker" format="yyyy-MM-dd" 
										        allowInput="false" enabled="false"/>
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
		     		url:"${pageContext.request.contextPath}/k5/f10503003/toBreAuditNotPass.action?method=toBreAuditNotPass",
		     		type:"post",
		     		data: {aaz529 : data.aaz529},
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
				url: "${pageContext.request.contextPath}/k5/f10503003/breAuditNotPass.action?method=breAuditNotPass",
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
