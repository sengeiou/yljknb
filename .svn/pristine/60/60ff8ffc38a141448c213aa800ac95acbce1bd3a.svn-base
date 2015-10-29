<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>案件撤销</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">案件撤销</span></h3> -->
				<div id="editForm1" style="margin: 10px; position: relative;">
					<table style="width: 100%;" class="cxTab">
						<tr>
							<td class="textR">结论批示意见：</td>
							<td>
								<div style="padding-right:4px;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc"></div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="aae189" name="aae189" class="mini-textarea" style="width:450px; height:100px;" 
											required="true" vtype="maxLength:200"/>
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
							<td style="text-align: right; padding-top: 5px; padding-right:4px;"
							    colspan="2" class="mainlistCon">
								<span class="btnMini">
									<em>
										<input type="button" value="撤销" onclick="revoke()"/>
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
			</fieldset>
		</form>
		
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form1");
			
			//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			var aaz318 = data.aaz318;
     			mini.get("aaz318").setValue(aaz318);
     		}
     		
     		//撤销 更改状态 保存数据
     		function revoke(){
     			var data = form.getData(); 
        		form.validate();
        		if (form.isValid() == false) {
            		return;
        		}
        		var json = mini.encode(data);
        		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        		$.ajax({
        			url: "${pageContext.request.contextPath}/k3/f10301005/desRegister.action",
        			type: "post",
        			data: { submitData: json },
        			success: function (text){
        				mini.unmask(document.body);
        				if(text.success){
        					mini.showMessageBox({
        						title: "提示",
        						message: "撤销案件成功",
        						buttons: ["确定"],
        						iconCls: "mini-messagebox-info",
        						callback: function(action){
        							CloseWindow();
        						}
        					});
        				}else{
        					mini.alert(text.msg);
        				}
        			}
        		});
     		}
			
			//关闭窗口
			function CloseWindow(action){
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