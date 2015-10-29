<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>立案确认</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">立案确认</span></h3> -->
				<div style="margin: 10px;">
					<div id="editForm1" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR">立案确认日期：</td>
								<td>
									<div class="inputL" style="width:100px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae034s" name="aae034s" class="mini-datepicker" format="yyyy-MM-dd"
													onvaluechanged="onValueChanged" allowInput="false"  required="true"/>
												<input id="aae034" name="aae034" value="" class="mini-hidden" required="true" />
									 		</div>
									 	</div>
									 </div>
								</td>
								<td class="textR">督办期限（起始时间）：</td>
								<td>
									<div class="inputL" style="width:100px">
										<div class="inputR">
											<div class="inputC">
												<!-- <input id="apa047" name="apa047" class="mini-textbox" required="true" 
													vtype="maxLength:3" onvalidation="onAllotted"/> -->
													<input id="apa047s" name="apa047s" class="mini-datepicker" format="yyyy-MM-dd"
                        								  onvaluechanged="onValueChanged2" allowInput="false"  required="true"/>
                        							<input id="apa047" name="apa047" value="" class="mini-hidden" required="true" />
									 		</div>
									 	</div>
									 </div>
								</td>
								<td class="textR">督办期限（终止时间）：</td>
								<td>
									<div class="inputL" style="width:100px">
										<div class="inputR">
											<div class="inputC">
												<input id="apa048s" name="apa048s" class="mini-datepicker" format="yyyy-MM-dd"
													onvaluechanged="onValueChanged3" allowInput="false"  required="true"/>
												<input id="apa048" name="apa048" value="" class="mini-hidden" required="true" />
									 		</div>
									 	</div>
									 </div>
								</td>
							</tr>
							<tr>
								<td class="textR">办案人：</td>
								<td>
									<div class="inputL" style="width:100px">
										<div class="inputR">
											<div class="inputC">
												<input id="acc789" name="acc789" class="mini-textbox"
													   emptyText="" data="${dic['ACC789']}" required="true" vtype="maxLength:50"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">调查人：</td>
								<td>
									<div class="inputL" style="width:100px">
										<div class="inputR">
											<div class="inputC">
												<input id="ape718" name="ape718" class="mini-textbox"
													   emptyText="" data="${dic['APE718']}" required="true" vtype="maxLength:50"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">立案批示意见：</td>
								<td colspan="6">
									<div style="padding-right:20px;">
										<div class="textareaTl">
											<div class="textareaTr">
												<div class="textareaTc">
												</div>
											</div>
										</div>
										<div class="textareaLay">
											<input id="aae189" name="aae189" class="mini-textarea" required="true"
									       		style="width: 100%;height:100px;" vtype="maxLength:200"/>
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
								<td style="text-align: right; padding-top: 5px; padding-right:20px;"
								    colspan="4" class="mainlistCon">
								    <span class="btnMini">
								    	<em>
								    		<input type="button" value="保存" onclick="saveAgreeInfo()"/>
								    	</em>
								    </span>
									<!-- <span class="btnMini">
										<em>
											<input type="button" value="清空" onclick="clearForm()"/>
										</em>
									</span> -->
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
			function CloseWindow(action) {            
		        if (window.CloseOwnerWindow){
		             return window.CloseOwnerWindow(action);
		        }else{
		            window.close();
		        }            
     		}
     		
     		//返回
     		function revert(){
     			CloseWindow();
     		}
     		
     		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			$.ajax({
     				url:"${pageContext.request.contextPath}/k3/f10301003/loadAuditCase.action?method=loadAuditCaseDetails",
     				type:"post",
     				data: {aaz318: data.aaz318},
     				success: function (text){
     					var data = mini.decode(text);
		        		form.setData(data);
		        		mini.get("apa047").setValue("");
     				}
     			});
     		}
     		
     		//保存信息
     		function saveAgreeInfo(){
     			var data = form.getData();
     			if (form.isValid() == false) {
            		return;
        		}
        		var json = mini.encode(data);
        		//alert(json);  return;
        		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        		$.ajax({
        			url:"${pageContext.request.contextPath}/k3/f10301003/registerConfirm.action",
        			type:"post",
        			data:{ submitData: json },
        			success: function (text){
        				mini.unmask(document.body);
        				if(text.success){
        					mini.showMessageBox({
        						title: "提示",
        						message: "立案确认成功",
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
     		
     		//清空信息
     		function clearForm(){
     			var editForm = new mini.Form("editForm1");
     			form.clear();
     			editForm.clear();
     		}
     		
     		//验证期限
     		/* function onAllotted(e){
     			if(e.isValid){
     				if(isAllotted(e.value) == false){
     					e.errorText = "督办期限1~3位数字";
     					e.isValid = false;
     					mini.alert(e.errorText);
     				}
     			}
     		} */
     		
     		function isAllotted(v){
     			var allott = /^\d{1,3}$/;
     			if(allott.test(v)){
     				return true;
     			}
     			return false;
     		}
     		//立案确认日期
     		 function onValueChanged(){
		        var aae034Date = mini.get("aae034s").getValue();
		        if(aae034Date==""){
		        	 mini.get("aae034").setValue("");
		        }else{
		        	 mini.get("aae034").setValue(getDateYmd(aae034Date));
		        }
		      }
		       //督办起始日期
		        function onValueChanged2(){
			        var apa047Date = mini.get("apa047s").getValue();
			        if(apa047Date==""){
			        	 mini.get("apa047").setValue("");
			        }else{
			        	 mini.get("apa047").setValue(getDateYmd(apa047Date));
			        }
			      }
		       //督办终止日期
		        function onValueChanged3(){
			        var apa048Date = mini.get("apa048s").getValue();
			        if(apa048Date==""){
			        	 mini.get("apa048").setValue("");
			        }else{
			        	 mini.get("apa048").setValue(getDateYmd(apa048Date));
			        }
		        }
		       
		        function getDateYmd(date) {
			    	var year = date.getFullYear();
			    	var month = (date.getMonth() + 1).toString();
			    	var day = (date.getDate()).toString();
			    	if(month.length == 1) {
			    		month = "0" + month;
			    	}
			    	if(day.length == 1) {
			    		day = "0" + day;
			    	}
			    	return year + month + day;
			    }
		</script>
	</body>
</html>
