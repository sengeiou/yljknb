<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核结论确认</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">结论确认</span></h3>
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							
							<tr>
								<td style="text-align: center; padding-top: 5px; padding-right: 0px;"
								    colspan="6" class="mainlistCon">
								    <span class="btnMini">
								    	<!-- <a class="mini-button" plain="true" iconCls="icon-goto" 
								    		onclick="surveyReview()">调查重审</a> -->
								    	<em>
								    		<input type="button" value="调查重审" onclick="surveyReview()"/>
								    	</em>
								    </span>
									<span class="btnMini">
										<!-- <a class="mini-button" plain="true" iconCls="icon-ok" 
											onclick="affirmThrough()">确认通过</a> -->
										<em>
											<input type="button" value="确认通过" onclick="affirmThrough()"/>
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
			
			//var form = new mini.Form("form1");
			var aaz318 ;
			
			//mini.get("apa154").setEnabled(false);
			
			
			//form.setEnabled(false);
			//var grid = mini.get("grid1");
			
			//标准方法接口定义
			function setData(data){
				data = mini.clone(data);
				aaz318 =data.aaz318;
			}	
			
			
			//调查重审
			function surveyReview(){
				if(aaz318 == null) {
					alert("请选择一个案件。。。");
					return;
				}
		     	mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/k3/f10301007/surveyReview.action",
		     		type:"post",
		     		data: { aaz318: aaz318 },
		     		success: function (text){
		     			mini.unmask(document.body);
		     			if(text.success){
		     				mini.showMessageBox({
		     					title: "提示",
			            	  	message: "调查重审，操作成功",
			            	  	buttons: ["确定"],
			            	  	iconCls: "mini-messagebox-info",
			            	  	callback: function(action){
			            	  		closeWin();
			            	  	}
		     				});
		     			}else{
		     				mini.alert(text.msg);
		     			}
		     		}
		     	});
			}
			
			//确认通过
			function affirmThrough(){
				if(aaz318 == null) {
					alert("请选择一个案件。。。");
					return;
				}
		     	mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        		$.ajax({
        			url:"${pageContext.request.contextPath}/k3/f10301007/confirmToSurvey.action",
	        		type: "post",
	        		data: { aaz318: aaz318 },
	        		success: function (text){
	        			//grid1.reload();
	        			mini.unmask(document.body);
	        			if(text.success){
	        				mini.showMessageBox({
	        					title: "提示",
	        					message: "确认完成",
	        					buttons: ["确定"],
	        					iconCls: "mini-messagebox-info",
	        					callback: function(action){
	        						//grid1.reload();
	        						closeWin();
	        					}
	        				});
	        			}else{
	        				mini.alert(text.msg);
	        			}
	        		}
        		});
			}
			
			//关闭
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
			
		</script>
	</body>
</html>