<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>送达回证</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<form id="form1" action="" method="post">
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>送达对象名称：</td>
								<td style="padding-top: 20px;">
									<div class="inputL" style="width:200px">
										<div class="inputR">
										 	<div class="inputC">
												<input id="ape008" name="ape008" class="mini-textbox" required="true" style="width:100%;" enabled="false"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>送达对象编号：</td>
								<td style="padding-top: 20px;">
									<div class="inputL" style="width:200px">
										<div class="inputR">
										 	<div class="inputC">
												<input id="aaz010" name="aaz010" class="mini-textbox" required="true" style="width:100%;" enabled="false"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>送达文书名称和编号：</td>
								<td colspan="3" style="padding-top: 20px;">
									<div style="padding-right:20px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc"></div>
											</div>
										</div>
										<div class="textareaLay">
											<textarea id="bae079" name="bae079" class="mini-textarea" required="true"	emptyText="请输入恢复医保服务费用结算内容..." style="height: 100px;"></textarea>
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
								<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>送达人：</td>
								<td style="padding-top: 10px;">
									<div class="inputL" style="width:200px">
										<div class="inputR">
										 	<div class="inputC">
												<input id="aae011" name="aae011" class="mini-textbox" 
													required="true" style="width:100%;" 
													value="${sessionScope['com.wondersgroup.wssip.operator.name']}" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>送达日期：</td>
								<td style="padding-top: 10px;">
									<div class="inputL" style="width:200px">
										<div class="inputR">
										 	<div class="inputC">
												<input name = "aae036" id="aae036" class="mini-datepicker" value="new Date()" required="true" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>送达地点：</td>
								<td colspan="3" style="padding-top: 10px;">
									<div class="inputL" style="width:550px">
										<div class="inputR">
										 	<div class="inputC">
												<input id="bae068" name="bae068" class="mini-textbox" 
													required="true" style="width:100%;" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>送达方式：</td>
								<td colspan="3" style="padding-top: 10px;">
									<div class="inputL" style="width:550px">
										<div class="inputR">
										 	<div class="inputC">
												<input id="bae069" name="bae069" class="mini-textbox" 
													required="true" style="width:100%;" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>备注：</td>
								<td colspan="3" style="padding-top: 20px;">
									<div style="padding-right:20px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc"></div>
											</div>
										</div>
										<div class="textareaLay">
											<textarea id="bae074" name="bae074" class="mini-textarea" style="height: 50px;"></textarea>
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
								<td style="text-align:center; padding-top: 40px; padding-right: 20px;" colspan="4" class="mainlistCon">
								    <span class="btnMini">
								    	<em>
								    		<input id="saveAf64" type="button" value="保存" onclick="save()"/>
								    	</em>
								    </span>
								    <span class="btnMini">
								    	<em>
								    		<input type="button" value="返回" onclick="revert()"/>
								    	</em>
								    </span>
								    <span class="btnMini">
								    	<em>
								    		<input id="export" type="button" value="导出送达回证单" onclick="export_word()" disabled="disabled"/>
								    	</em>
								    </span>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</form>
		</fieldset>
		
		<script type="text/javascript">
			mini.parse();
			var form1 = new mini.Form("form1");
    		var aaz077;
    		var age001;
    		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
				aaz077 = data.aaz077;     	
				$.ajax({
     				url:"${pageContext.request.contextPath}/k3/f10301008/queryReturnProveInfo.action",
     				type:"post",
     				data: {aaz077: data.aaz077},
     				success: function (text){
     					var data = mini.decode(text);
     					mini.get("aaz010").setValue(data.aaz010);
     					mini.get("ape008").setValue(data.ape008);
     					mini.get("bae079").setValue(data.bae079);
     				}
     			});		
     		}
     		
     		function export_word(){
     			var url = "${pageContext.request.contextPath}/k3/f10301008/exportWord_sdhz.action?age001=" + age001 + "&sid="+Math.random() ;
				window.open(url);
     		}
     		
     		function save(){
     			var data = form1.getData();
     			form1.validate();
		        if (form1.isValid() == false) {
		            return;
		        }
		        data.aaz077=aaz077;
		        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
				$.ajax({
					url: "${pageContext.request.contextPath}/k3/f10301008/saveAf64.action",
		            type: "post",
		            data: data,
		            success: function (text){
		            	mini.unmask(document.body);
		            	if(text.success){
		            		age001 = text.result[0].age001;
		            		mini.showMessageBox({
		            			title: "提示",
		            			message: "送达回证成功",
		            			buttons: ["确定"],
		            			iconCls: "mini-messagebox-info",
		            			callback: function(action){
		            				$("#saveAf64").attr("disabled","disabled");
		            				$("#export").attr("disabled",false);
		            			}
		            		});
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
     		
     		//返回
     		function revert(){
     			closeWin();
     		}
		</script>
	</body>
</html>