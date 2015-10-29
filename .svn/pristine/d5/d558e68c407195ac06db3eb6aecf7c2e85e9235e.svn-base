<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核结论传达</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		
		<form id="form_info" action="" method="post">
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<input id="apa168" name="apa168" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">移交信息维护</span></h3>
				<div id="editForm1" style="margin: 10px; position: relative;">
					<table style="width: 100%;" class="cxTab">
						<tr>
							<td class="textR"><span style="color: red;">*</span>移交单位联系人：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae004" name="aae004" class="mini-textbox" required="true" vtype="maxLength:50"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR"><span style="color: red;">*</span>移交日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="abb087s" name="abb087s" format="yyyy-MM-dd" onvaluechanged="onValueChanged" 
												   class="mini-datepicker"  required="true" allowInput="false"/>
											<input id="abb087" name="abb087" value="" class="mini-hidden" required="true"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR"><span style="color: red;">*</span>移交单位名称：</td>
							<td colspan="4">
								<div class="inputL" style="width:130px;">
									<div class="inputR">
										<div class="inputC">
											<input id="aab004" name="aab004" class="mini-textbox" required="true" 
												style="width:100%;" vtype="maxLength:100"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR"><span style="color: red;">*</span>移交材料说明：</td>
							<td colspan="4">
								<div style="padding-right:4px;width:94%;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc">
											</div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="ape023" name="ape023" class="mini-textarea" required="true" 
											vtype="maxLength:1000" style="width:100%;height:100px;"/>
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
							<td style="text-align: right; padding-top: 5px; padding-right:28px;"
								colspan="6" class="mainlistCon">
								<span class="btnMini">
									<!-- <a id="entry" name="entry" class="mini-button" plain="true" iconCls="icon-add" 
										onclick="entry()">移交信息录入</a> -->
									<!-- <em>
										<input type="button" value="移交信息录入" onclick="entry()" id="entry" name="entry"/>
									</em> -->
								</span>
								<span class="btnMini">
									<!-- <a id="revise" name="revise" class="mini-button" plain="true" iconCls="icon-edit" 
										onclick="revise()">移交信息修改</a> -->
									<!-- <em>
										<input type="button" value="移交信息修改" onclick="revise()" id="revise" name="revise"/>
									</em> -->
								</span>
								<span class="btnMini">
									<!-- <a class="mini-button" plain="true" iconCls="icon-save" 
										onclick="saveData()">提交</a> -->
									<em>
										<input type="button" value="保存" onclick="saveData()"/>
									</em>
								</span>
								<span class="btnMini">
									<!-- <a class="mini-button" plain="true" iconCls="icon-cancel" 
										onclick="closeWin()">关闭</a> -->
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
			
			var form = new mini.Form("form_info");
			
			form.setEnabled(true);
			
			//标准方法接口定义
     		function setData(data){
     			//跨页面传递的数据对象，克隆后才可以安全使用
		     	data = mini.clone(data);
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/common/loadBeAuditTargetByAaz077.action?method=loadBeAuditTargetInfoByAaz077",
		     		type:"post",
		     		data: {aaz077: data.aaz077},
		     		success: function (text){
		     			var data = mini.decode(text);
				        form.setData(data);
				        
				        var apa168 = data.apa168;
				        //var entry = mini.get("entry");
				        //var revise = mini.get("revise");
				        /* if(apa168 == '0'){
				        	$("#revise").attr("disabled",true);
				        }else if(apa168 == '1'){
				        	$("#entry").attr("disabled",true);
				        }else{
				        	$("#revise").attr("disabled",true);
				        	$("#entry").attr("disabled",true);
				        } */
		     		}
		     	});
     		}
			
			//移交信息录入
			function entry(){
				//form.setEnabled(true);
			}
			
			//移交信息修改
			function revise(){
				//form.setEnabled(true);
			}
			
			//申报信息录入
			function saveData(){
				var data = form.getData();
				var apa168 = mini.get("apa168").getValue();
		     	form.validate();
		     	if (form.isValid() == false){
		     		return;
		     	}
		     	var json = mini.encode(data);
		     	mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/k3/f10301009/saveTurnMessage.action",
		     		type:"post",
		     		data: { submitData: json },
		     		success: function (text) {
		     			mini.unmask(document.body);
		     			if(text.success){
		     				if(apa168 == '0'){
		     					mini.showMessageBox({
		     						title: "提示",
				            	  	message: "成功移交一条移交记录",
				            	  	buttons: ["确定"],
				            	  	iconCls: "mini-messagebox-info",
				            	  	callback: function(action){
				            	  		closeWin();
				            	  	}
		     					});
		     				}else if(apa168 == '1'){
		     					mini.showMessageBox({
		     						title: "提示",
				            	  	message: "成功修改一条移交记录",
				            	  	buttons: ["确定"],
				            	  	iconCls: "mini-messagebox-info",
				            	  	callback: function(action){
				            	  		closeWin();
				            	  	}
		     					});
		     				}
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
		    
		    function onValueChanged(){
		    	var ape711Date = mini.get("abb087s").getValue();
		    	var currDate = new Date();
		    	if(ape711Date < currDate){
		    		mini.get("abb087").setValue(getDateYmd(ape711Date));
		    	}else{
		    		mini.alert("移交日期不能大于当前日期");
		    		mini.get("abb087s").setValue("");
		    	}
		    	
    		}
		</script>
	</body>
</html>