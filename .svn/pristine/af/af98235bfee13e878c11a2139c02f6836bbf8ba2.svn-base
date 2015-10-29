<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>复议申请审核批量处理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body style="background-color:#F3F3F3 ;">
	<div class="mainlistCon">
		<div style="text-align:center; margin:10px;">
			<form id="form" action="#">
				<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
					width="100%">
					<tr>
						<td colspan="4"></td>
					</tr>
					<tr>
						<td>复议内容：</td>
						<td colspan="4">
							<div style="padding-right:4px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="baz" name="baz" class="mini-textarea"	emptyText="请输入审核意见"></textarea>
									<input id="tag" name="tag" class="mini-hidden"   required="true"/>
									<input id="submitData" 	name="submitData" class="mini-hidden" required="true" /> 
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
						<td nowrap="nowrap" colspan="5"
							style="text-align: center; padding-top: 5px;"><span
							class="btnMini"><em><input type="button"
									onclick="saveData()" value="确定" /> </em> </span> <span class="btnMini"><em><input
									type="button" onclick="closeWin()" value="取消" /> </em> </span>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		var form = new mini.Form("form");
		 function SetData(data){
   				mini.get("tag").setValue(data.tag);
   				mini.get("submitData").setValue(data.submitData);
   		}
   		function saveData(){
   			var baz021 = form.getData().baz; 
   			var tag=document.getElementById("tag").value;
   			var submitData=document.getElementById("submitData").value;
   		 
	        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
	        $.ajax({
						url : "${pageContext.request.contextPath}/k5/f10506002/indexComplaintUpdateAction.action",
						type : "post",
						data : {
							submitData : submitData,
							tag:tag,
							baz021:baz021
						},
					success: function (text) {
	            	mini.unmask(document.body);
	                if(text.success){
	            	 	mini.showMessageBox({
	        				title: "提示",
	        				message: "批量操作明细成功！",
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
