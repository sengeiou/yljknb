<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<head>
<title>稽核案件移交</title>
<%@ include file="/pages/pub/pubsource.jsp"%>
</head>
	<body>
		<div>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<form id="form1" action="" method="post"  >
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>案件名称：</td>
						<td  style="padding-top: 20px;">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="abf079" name="abf079" class="mini-textbox" required="true" style="width:100%;" emptyText="请输入案件名称..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>接收部门：</td>
						<td colspan="3" style="padding-top: 20px;">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="baz077" name="baz077" class="mini-textbox" required="true" style="width:100%;" emptyText="请输入移交部门..." />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>材料清单：</td>
						<td colspan="3" style="padding-top: 10px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="adf077" name="adf077" class="mini-textarea" required="true"	emptyText="请输入材料清单..." style="height: 180px;"></textarea>
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
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>移交人：</td>
						<td style="padding-top: 10px;">
							<div class="inputL" style="width:300px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae011" name="aae011" class="mini-textbox" 
											required="true" style="width:100%;" 
											value="${sessionScope['com.wondersgroup.wssip.operator.name']}" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>移交日期：</td>
						<td style="padding-top: 10px;">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input name = "aae036" id="aae036" class="mini-datepicker" value="new Date()" required="true" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>接收人：</td>
						<td style="padding-top: 10px;">
							<div class="inputL" style="width:300px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="baz079" name="baz079" class="mini-textbox" required="true" style="width:100%;" emptyText="请输入接收人..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR" style="padding-top: 10px;"><span style="color: red;">*</span>接收日期：</td>
						<td style="padding-top: 10px;">
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input name = "baz097" id="baz097" class="mini-datepicker" required="true" emptyText="请选择接收日期..." />
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
						    		<input id="export1_1" type="button" value="导出移交单" onclick="export_word()" disabled="disabled"/>
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
			var aaz318;
			var abz418;
			var form1 = new mini.Form("form1");
    		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			aaz318 = data.aaz318;
     		}
     		
     		function save01(){
     			var data = form1.getData(true);
     			form1.validate();
		        if (form1.isValid() == false) {
		            return;
		        }
		        data.aaz318=aaz318;
		         mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
				$.ajax({
					url: "${pageContext.request.contextPath}/k3/f10301008/caseMove.action",
		            type: "post",
		            data: data,
		            success: function (text){
		            	mini.unmask(document.body);
		            	if(text.success){
		            		abz418 = text.result[0].abz418;
		            		mini.showMessageBox({
		            			title: "提示",
		            			message: "稽核案件移交成功",
		            			buttons: ["确定"],
		            			iconCls: "mini-messagebox-info",
		            			callback: function(action){
	            					$("#saveButton_01").attr("disabled","disabled");
	            					$("#export1_1").attr("disabled",false);
		            			}
		            		});
		            	}else{
		            		mini.alert(text.msg);
		            	}
		            }
				});
     		}
     		
     		function export_word(){
     			var url = "${pageContext.request.contextPath}/k3/f10301008/exportWord_yj.action?abz418=" + abz418 + "&sid="+Math.random() ;
				window.open(url);
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