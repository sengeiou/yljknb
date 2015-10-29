<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>传达信息维护</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<h3 class="cxTit pTb8"><span class="iconCx">稽核结论传达记录</span></h3>
			<div class="mainlistCon">
				<div class="listTit">
					<div class="fL pT5R9">
						<span class="btnMini">
							<!-- <a class="mini-button" plain="true" iconCls="icon-add" 
								onclick="entry()">告知录入</a> -->
							<em>
								<input type="button" value="传达录入" onclick="entry()"/>
							</em>
						</span>
						<span class="btnMini">
							<!-- <a class="mini-button" plain="true" iconCls="icon-edit" 
								onclick="editNotify()" id="edit" name="edit">告知修改</a> -->
							<em>
								<input type="button" value="传达修改" onclick="editNotify()" id="edit" name="edit"/>
							</em>
						</span>
						<span class="btnMini">
							<!-- <a class="mini-button" plain="true" iconCls="icon-remove" 
								onclick="removeNotify()" id="remove" name="remove">告知删除</a> -->
							<em>
								<input type="button" value="传达删除" onclick="removeNotify()" id="remove" name="remove"/>
							</em>
						</span>
						<span class="btnMini">
							<!-- <a class="mini-button" plain="true" iconCls="icon-no" 
								onclick="finish()">告知终结</a> -->
							<em>
								<input type="button" value="传达终结" onclick="finish()"/>
							</em>
						</span>
					</div>
				</div>
				
				<div id="datagrid1" class="mini-datagrid" idField="id" multiSelect="true"
					 style="width: 100%; height: 150px;" allowResize="true" onrowclick="onRowSelectClick"
					 url="${pageContext.request.contextPath}/k3/f10301008/queryConveyRecord.action">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="aaz147" width="100" headerAlign="center">稽核结论传达情况ID</div>
						<div field="aaz077" width="100" headerAlign="center">被稽核对象ID
						</div>
						<div field="ape008" width="100" headerAlign="center">被稽核对象</div>
						<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
							被告知方式类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
						</div>
						<div field="ape724" width="100" headerAlign="center">被告知方式名称</div>
						<div field="apa708" width="100" headerAlign="center" type="comboboxcolumn">
							告知方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA708']}">
						</div>
						<div field="ape741s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">告知日期</div>
						<div field="ape728" width="100" headerAlign="center">处理决定</div>
					</div>
				</div>
			</div>
		</fieldset>
		
		<input id="aaz077s" name="aaz077s" value="" class="mini-hidden" required="true"/>
		<input id="aaz318s" name="aaz318s" value="" class="mini-hidden" required="true"/>
		<form id="form1" action="" method="post">
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<input id="aaz147" name="aaz147" value="" class="mini-hidden" />
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">稽核结论信息传达登记</span></h3>
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR"><span style="color: red;">*</span>被告知方名称：</td>
								<td colspan="6">
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape724" name="ape724" class="mini-textbox" required="true"
													   style="width: 100%;" vtype="maxLength:100"/>
										   	</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR"><span style="color: red;">*</span>被告知方类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa709" name="apa709" class="mini-combobox" required="true"
													   emptyText="请选择..."  data="${dic['APA709']}"/>
										   	</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>告知方式：</td>
								<td>
								<div class="inputL" style="width:130px"><div class="inputR"><div class="inputC">
									<input id="apa708" name="apa708" class="mini-combobox" required="true"
										   emptyText="请选择..." data="${dic['APA708']}"/>
										   </div></div></div>
								</td>
								<td class="textR"><span style="color: red;">*</span>告知日期：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape741s" name="ape741s" class="mini-datepicker" format="yyyy-MM-dd" 
												       onvaluechanged="onValueChanged" required="true" allowInput="false"/>
												<input id="ape741" name="ape741" class="mini-hidden"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR"><span style="color: red;">*</span>处理决定：</td>
								<td colspan="6">
									<div style="padding-right:16px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="ape728" name="ape728" class="mini-textarea" required="true" 
										   		style="width: 100%;" vtype="maxLength:100"/>
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
								<td style="text-align: right; padding-top: 5px; padding-right: 20px;"
								    colspan="6" class="mainlistCon">
								    <span class="btnMini">
								    	<!-- <a class="mini-button" plain="true" iconCls="icon-save" 
								    		onclick="save()">保存</a> -->
								    	<em>
								    		<input type="button" value="保存" onclick="save()"/>
								    	</em>
								    </span>
								    <span class="btnMini">
								   		<!-- <a class="mini-button" plain="true" iconCls="icon-close" 
								   			onclick="revert()">关闭</a> -->
								   		<em>
								   			<input type="button" value="返回" onclick="closeWin()"/>
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
			
			var grid = mini.get("datagrid1");
			
			var form = new mini.Form("form1");
			
			form.setEnabled(true);
			
			//grid.load();
			
			//绑定表单
			var db = new mini.DataBinding();
    		db.bindForm("form1", datagrid1);
    		
    		
    		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			mini.get("aaz077").setValue(data.aaz077);
     			mini.get("aaz077s").setValue(data.aaz077);
     			mini.get("aaz318").setValue(data.aaz318);
     			mini.get("aaz318s").setValue(data.aaz318);
     			grid.load({aaz077:data.aaz077,aaz318:data.aaz318});
     			//alert(data.aaz077);
     			
     			
     			//edit.setEnabled(false);
     			$("#edit").attr("disabled",true);
     			//remove.setEnabled(false);
     			$("#remove").attr("disabled",true);
     		}
     		
     		//选中触发事件
     		function onRowSelectClick(){
     			var row = grid.getSelected();
     			//alert(row.z)
     			if(row != null){
     				$("#edit").attr("disabled",false);
     				$("#remove").attr("disabled",false);
     			}
     		}
     		
     		//告知录入
     		function entry(){
     			form.clear();
     			var aaz077 = mini.get("aaz077s").getValue();
     			var aaz318 = mini.get("aaz318s").getValue();
     			mini.get("aaz077").setValue(aaz077);
     			mini.get("aaz318").setValue(aaz318);
     			form.setEnabled(true);
     		}
     		
     		//告知修改
     		function editNotify(){     			
     			var row1 = grid.getSelected();
     			if(row1 != null){
     				form.setData(row1);
     			}else{
					mini.alert("没有可以修改的记录，请选中一条记录");
				}
				
     		}
     		
     		//保存
     		function save(){
     			var data = form.getData(); 
     			form.validate();
		        if (form.isValid() == false) {
		            return;
		        }
		        var json = mini.encode(data);
        		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        		$.ajax({
        			url: "${pageContext.request.contextPath}/k3/f10301008/saveConveyRecord.action",
            		type: "post",
            		data: { submitData: json },
            		success: function (text){
            			mini.unmask(document.body);
            			if(text.success){
            				mini.showMessageBox({
	            					title: "提示",
			        				message: "保存成功",
			        				buttons: ["确定"],
			        				iconCls: "mini-messagebox-info",
			        				callback: function(action){
			        					grid.reload();
			        					entry();
										cancel();
			        				}
            					});
            			}else{
            				mini.alert(text.msg);
            			}
            		}
        		});
     		}
     		
     		//告知删除
     		function removeNotify(){
     			var rows = grid.getSelecteds();
     			if (rows.length > 0){
     				mini.confirm("确定删除这条告知信息","确认",
     					function(action){
     						if (action == "ok"){
     							//alert("--s---");
     							var ids = [];
     							for (var i = 0, l = rows.length; i < l; i++){
									var r = rows[i];
	                    			ids.push(r.aaz147);
								}
								var id = ids.join(',');
								$.ajax({
									url: "${pageContext.request.contextPath}/k3/f10301008/deleteConveyRecord.action",
									post:"post",
									data: {submitIds: id},
									success: function (text){
										grid.reload();
										form.clear();
									},
									error: function (){
										mini.alert("删除操作失败");
									}
								});
     						}else{
     							//alert("--f--");
     						}
     					}
     				);
     				/* if (confirm("确定删除这条告知信息")){
     					var ids = [];
     					for (var i = 0, l = rows.length; i < l; i++){
							var r = rows[i];
	                    	ids.push(r.aaz147);
						}
						var id = ids.join(',');
						$.ajax({
							url: "${pageContext.request.contextPath}/k3/f10301008/deleteConveyRecord.action",
							post:"post",
							data: {submitIds: id},
							success: function (text){
								grid.reload();
								form.clear();
							},
							error: function (){
								mini.alert("删除操作失败");
							}
						});
     				} */
     			}else{
					mini.alert("请选中一条记录");
				}
     		}
     		
     		//告知终结
     		function finish(){
     			var aaz077 = mini.get("aaz077s").getValue();
     			var aaz318 = mini.get("aaz318s").getValue();
     			mini.confirm("告知终结以后,该稽核对象的结论将不能再传达,是否终结告知?","确认",
     				function(action){
     					if (action == "ok"){
     						//alert("--s--");
     						$.ajax({
								url: "${pageContext.request.contextPath}/k3/f10301008/notifyFinish.action",
								post:"post",
								data: {aaz077 : aaz077},
								success: function (text){
									mini.showMessageBox({
		            					title: "提示",
				        				message: "告知终结成功",
				        				buttons: ["确定"],
				        				iconCls: "mini-messagebox-info",
				        				callback: function(action){
				        					revert();
				        				}
	            					});
								},
								error: function (){
									mini.alert("告知终结失败");
								}
							});
     					}else{
     						//alert("--f---");
     					}
     				}
     			);
     			/* if (confirm("告知终结以后,该稽核对象的结论将不能再传达,是否终结告知?")){
     				$.ajax({
							url: "${pageContext.request.contextPath}/k3/f10301008/notifyFinish.action",
							post:"post",
							data: {aaz077 : aaz077},
							success: function (text){
								mini.showMessageBox({
	            					title: "提示",
			        				message: "告知终结成功",
			        				buttons: ["确定"],
			        				iconCls: "mini-messagebox-info",
			        				callback: function(action){
			        					revert();
			        				}
            					});
							},
							error: function (){
								mini.alert("告知终结失败");
							}
						});
     			} */
     		}
     		
     		//取消
     		function cancel(){
     			form.setEnabled(true);
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
     		
     		//获取时间
     		function onValueChanged(){
				var ape741Date = mini.get("ape741s").getValue();
				var currDate = new Date();
				if(ape741Date < currDate){
					mini.get("ape741").setValue(getDateYmd(ape741Date));
				}else{
					mini.alert("告知日期不能超过当前日期");
					mini.get("ape741s").setValue("");
				}
				
			}
		</script>
	</body>
</html>