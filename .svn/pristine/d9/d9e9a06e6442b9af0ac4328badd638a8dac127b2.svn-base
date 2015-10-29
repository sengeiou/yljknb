<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>二次处理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR">处理原因：</td>
								<td colspan="4">
									<div style="padding-right:4px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="aae187" name="aae187" class="mini-textarea" style="width:460px;height:100px;" 
												required="true" vtype="maxLength:200"/>
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
										<input type="button" value="保存" onclick="saveRejectInfo()"/>
									</em>
								</span>
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
			
			var form = new mini.Form("form1");
			
			function CloseWindow(action){
				if (window.CloseOwnerWindow){
		             return window.CloseOwnerWindow(action);
		        }else{
		            window.close();
		        }
			}
			
			
			//标准方法接口定义
	         function setData(data){
	           data = mini.clone(data);
	           $.ajax({
	             url:"${pageContext.request.contextPath}/k3/f10301014/loadAuditCaseDetailsByAaz318.action?method=loadAuditCaseDetailsByAaz318",
	             type:"post",
	             data: {aaz318: data.aaz318},
	             success: function (text){
	               var data = mini.decode(text);
	                form.setData(data);
	             }
	           });
	         }
			
			
			//返回
     		function revert(){
     			CloseWindow();
     		}
     		
     		
     		//保存二次处理信息
     		function saveRejectInfo(){
     			var data = form.getData();
     			if (form.isValid() == false) {
            		return;
        		}
        		var json = mini.encode(data);
        		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        		$.ajax({
        			url:"${pageContext.request.contextPath}/k3/f10301014/secondProcessOperate.action?method=secondProcessOperate",
        			type:"post",
        			data:{ submitData: json },
        			success: function (text){
        				mini.unmask(document.body);
        				if(text.success){
        					mini.showMessageBox({
        						title: "提示",
        						message: "二次处理成功",
        						buttons: ["确定"],
        						iconCls: "mini-messagebox-info",
        						callback: function(action){
        							CloseWindow(action);
        						}
        					});
        				}else{
        					mini.alert(text.msg);
        				}
        			}
        		});
     		}
     		
     		//清空
     		function clearForm(){
     			var editForm = new mini.Form("editForm1");
     			form.clear();
     			editForm.clear();
     		}
		</script>
	</body>
</html>