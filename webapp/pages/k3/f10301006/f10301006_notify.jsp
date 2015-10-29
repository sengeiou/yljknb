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
			<form id="form1" action="" method="post"  >
				<input id="aab077" name="aab077" class="mini-hidden" />
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>告知对象名称：</td>
						<td style="padding-top: 20px;">
							<div class="inputL" style="width:350px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aaz069" name="aaz069" class="mini-textbox" enabled="false" required="true" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>案由：</td>
						<td style="padding-top: 20px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="apa701" name="apa701" class="mini-textarea" enabled="false" required="true" style="height: 50px;"></textarea>
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
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>承办人意见：</td>
						<td style="padding-top: 20px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true" enabled="false" style="height: 50px;"></textarea>
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
						<td class="textR" style="padding-top: 20px;"><span style="color: red;">*</span>查实违规行为：</td>
						<td style="padding-top: 20px;">
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="aaz079" name="aaz079" class="mini-textarea" required="true"	emptyText="请输入查实违规行为..." style="height: 50px;"></textarea>
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
						<td style="text-align:center; padding-top: 20px; padding-right: 20px;" colspan="2" class="mainlistCon">
						    <span class="btnMini">
						    	<em>
						    		<input id="saveNotify" type="button" value="保存" onclick="save()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input type="button" value="返回" onclick="revert()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input id="export" type="button" value="导出" onclick="export_word()" disabled="disabled"/>
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
			var form1 = new mini.Form("form1");
    		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			aaa027 = data.aaa027;
     			aaz077= data.aaz077;
     			aaz318 = data.aaz318;
     			apa709 = data.apa709;
     			$.ajax({
     				url:"${pageContext.request.contextPath}/k3/f10301006/loadBeAuditTargetByAaz077.action?method=loadBeAuditTargetInfoByAaz077",
     				type:"post",
     				data: {aaz077: data.aaz077 ,apa709 : data.apa709},
     				success: function (text){
     					var data = mini.decode(text);
     					mini.get("aaz069").setValue(data.ape008);
     					mini.get("apa701").setValue(data.apa701);
     					mini.get("ape726").setValue(data.ape726);
     					
     				}
     			});
     		}
     		
     		function export_word(){
     			var aab077 = mini.get("aab077").getValue();
     			var url = "${pageContext.request.contextPath}/k3/f10301006/exportWord_gz.action?aab077=" + aab077 + "&sid="+Math.random() ;
				window.open(url);
     		}
     		
     		function save(){
     			var data = form1.getData();
     			form1.validate();
		        if (form1.isValid() == false) {
		            return;
		        }
		        data.aaa027 = aaa027;
		        data.aaz077=aaz077;
		        data.aaz318=aaz318;
		        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
				$.ajax({
					url: "${pageContext.request.contextPath}/k3/f10301006/saveNotify.action",
		            type: "post",
		            data: data,
		            success: function (text){
		            	mini.unmask(document.body);
		            	if(text.success){
		            		mini.get("aab077").setValue(text.result[0].aab077);
		            		mini.showMessageBox({
		            			title: "提示",
		            			message: "稽核结论告知成功",
		            			buttons: ["确定"],
		            			iconCls: "mini-messagebox-info",
		            			callback: function(action){
		            				$("#saveNotify").attr("disabled","disabled");
		            				$("#export").attr("disabled",false);
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