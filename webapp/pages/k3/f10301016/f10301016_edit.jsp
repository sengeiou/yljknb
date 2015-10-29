<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>修改疑点问题</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/scripts/swfupload.js"></script>
	</head>

	<body>
		<form id="form1" action="" method="post">
			<input id="aaz381" name="aaz381" value="" class="mini-hidden" required="true"/>
			<input id="filedataFileName" name="filedataFileName" class="mini-textbox" visible="false" />
			<input id="fpath" name="fpath" class="mini-textbox" visible="false" />
			<input id="fname" name="fpath" class="mini-textbox" visible="false" />
			<input id="abe177" name="abe177" value="" class="mini-hidden" required="false"/>
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="false"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">疑点信息修改</span></h3> -->
				<div id="editForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
						<td class="textR"><span style="color: red;">*</span>性别：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aac004" name="aac004" class="mini-combobox" emptyText="请选择性别"
								   			   data="${dic['AAC004']}" textField="text" valueField="id" required="true"
								   			   onvaluechanged="accept"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>询问时间：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape712s" name="ape712s" format="yyyy-MM-dd" class="mini-datepicker" 
								   			   onvaluechanged="onValueChanged" vtype="date:yyyyMMdd" allowInput="false"/>
										<input id="ape712" name="ape712" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>统筹区：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择统筹区"
								   				data="${dic['AAA027']}" textField="text" valueField="id" required="true"/>
									</div>
								</div>
							</div>
						</td>	
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>询问地点：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae007" name="aae007" class="mini-textbox" required="true" vtype="maxLength:150"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>询问人：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape134" name="ape134" class="mini-textbox" required="true" vtype="maxLength:20"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>记录人：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape135" name="ape135" class="mini-textbox" required="true" vtype="maxLength:20"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>被询问人ID：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaz010" name="aaz010" class="mini-textbox" required="true" vtype="maxLength:20"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>被询问人姓名：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aac003" name="aac003" class="mini-textbox" required="true" vtype="maxLength:50"/>
									 </div>
								</div>
							</div> 	
						</td>
						<td class="textR"><span style="color: red;">*</span>年龄：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aac005" name="aac005" class="mini-textbox" required="true" vtype="range:0,9999"/>
									 </div>
								</div>
							</div> 	
						</td>
						
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>身份证号：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aac002" name="aac002" class="mini-textbox" required="true" vtype="maxLength:18"/>
									  </div>
								</div>
							</div> 	
						</td>
						<td class="textR"><span style="color: red;">*</span>人员类别：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa065" name="apa065" class="mini-combobox" emptyText="请选择类别"
									   		data="${dic['APA065']}" textField="text" valueField="id" required="true"/>
									  </div>
								</div>
							</div> 	
						</td>
						<td class="textR"><span style="color: red;">*</span>家庭地址：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae006" name="aae006" class="mini-textbox" required="true" vtype="maxLength:150"/>
									 </div>
								</div>
							</div> 	
						</td>
					</tr>
					<tr>
					<td class="textR"><span style="color: red;">*</span>联系电话：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae005" name="aae005" class="mini-textbox" onvalidation="onPhone"/>
									 </div>
								</div>
							</div> 	
						</td>
						<td class="textR"><span style="color: red;">*</span>工作单位：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape029" name="ape029" class="mini-textbox" required="true" vtype="maxLength:50"/>
									 </div>
								</div>
							</div> 	
						</td>
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>备注：</td>
						<td colspan="6">
							<div style="padding-right:10px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="aae013" name="aae013" class="mini-textarea" 
										 style="width:100%;height:100px;" required="true" vtype="maxLength:200"/>
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
					
					<!-- <tr>
						
						<td style="text-align: right; padding-top: 5px; padding-right:10px;"
							colspan="6" class="mainlistCon">
							<span class="btnMini">
								<em>
									<input type="button" value="保存" onclick="saveData()"/>
								</em>
							</span>
							<span class="btnMini">
								<em>
									<input type="button" value="返回" onclick="closeWin()"/>
								</em>
							</span>
						</td>
					</tr> -->
					</table>
					<table cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
						<td colspan="4">上传附件：</td>
					</tr>

					<tr>
						<td colspan="3"><input id="fileupload1"
							class="mini-fileupload" name="filedata"
							limitType="*.rar;*.zip;*.ppt;*.pptx;*.txt;*.doc;*.docx;*.xls;*.xlsx;*.jpg;*.png"
							limitSize="10MB"
							flashUrl="${pageContext.request.contextPath}/resource/scripts/swfupload.swf"
							uploadUrl="${pageContext.request.contextPath}/k2/f10204002/uploadFile.action"
							onuploadsuccess="onUploadSuccess" width="240"
							onuploaderror="onUploadError" onfileselect="onFileSelect"
							buttonText="选择附件" /></td>
						<td>
							<font style="color: red;font-size: 4px;">附件最大10MB</font>
						</td>
					</tr>
					</table>
					
					<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
					width="100%">
					<tr style="height: 10px">
					</tr>
					<tr>
						<td nowrap="nowrap" colspan="5" style="text-align: right; padding-top: 5px;" class="mainlistCon">
						<span class="btnMini">
							<em>
								<input type="button" onClick="startupload();" value="提交" /> 
							</em> 
						</span> 
						<span class="btnMini">
							<em>
								<input type="button" onClick="closeWin();" value="返回" /> 
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
     		function SetData(data){
		     	//跨页面传递的数据对象，克隆后才可以安全使用
		     	data = mini.clone(data);
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/k3/f10301016/loadInquiryProblem.action?method=loadInquiryProblemInfo",
		     		type:"post",
		     		data: {aaz381: data.aaz381},
		     		success: function (text){
		     			var data = mini.decode(text);
				        form.setData(data);
		     		}
		     	});
     		}
     
     		//受理方式apa703 6(主动稽核)
			function accept(){
				var apa703 = mini.get("apa703").getValue();
				if(apa703 == "6"){
					mini.get("apa704").setValue("21");
					mini.get("apa705").setValue("6");
				}else if(apa703 != "6"){
					mini.get("apa704").setValue("");
					mini.get("apa705").setValue("");
				}
			}
			
			//信息来源方类型apa704 21(稽核部门)
			function infoSource(){
				var apa703 = mini.get("apa703").getValue();
				var apa704 = mini.get("apa704").getValue();
				if(apa703 != "21" && apa703 == "6"){
					mini.alert("该选项与受理方式不匹配！");
					mini.get("apa704").setValue("21");
				}
			}
			
			//信息来源方式apa705 6(主动稽核)
			function sourceWay(){
				var apa703 = mini.get("apa703").getValue();
				var apa705 = mini.get("apa705").getValue();
				if(apa705 != "6" && apa703 == "6"){
					mini.alert("该选项与受理方式不匹配！");
					mini.get("apa705").setValue("6");
				}
			}
     
		     //修改保存疑点信息
		     function saveData(){
		     	var data = form.getData();
		     	var fname = mini.get("fname").getValue();
		     	var fpath = mini.get("fpath").getValue();
		     	var filedataFileName = mini.get("filedataFileName").getValue();
		     	form.validate();
		     	if (form.isValid() == false){
		     		return;
		     	}
		     	var json = mini.encode(data);
		     	mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
		     	$.ajax({
		     		url:"${pageContext.request.contextPath}/k3/f10301016/updateInquiryProblem.action",
		     		type:"post",
		     		data: { submitData: json,
		     				fname: fname,
		     				fpath: fpath,
		     				filedataFileName: filedataFileName },
		     		success: function (text) {
		     			mini.unmask(document.body);
		     			if(text.success){
		            	  mini.showMessageBox({
		            	  	title: "提示",
		            	  	message: "成功修改一条记录",
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
		     
		      //验证邮编
		    function onPostbox(e){
		    	if(e.isValid){
		    		if(isPostbox(e.value) == false){
		    			e.errorText = "邮编必须是6位数字";
                    	e.isValid = false;
                    	//mini.alert(e.errorText);
		    		}
		    	}
		    }
		    
		    function isPostbox(v){
		    	var post = /^\d{6}$/;
		    	if(post.test(v)){
		    		return true;
		    	}
		    	return false;
		    }
		    
		    //验证手机号
		    function onPhone(e){
		    	if(e.isValid){
		    		if(isPhone(e.value) == false){
		    			e.errorText = "联系方式必须是 7 - 12 位数字";
                    	e.isValid = false;
                    	//mini.alert(e.errorText);
		    		}
		    	}
		    }
		    
		    function isPhone(v){
		    	var tel = /^\d{7,12}$/;
		    	if(tel.test(v)){
		    		return true;
		    	}
		    	return false;
		    }
		    
		    function startupload() {
		    	var fileUpload = mini.get("fileupload1");
		    	if (fileUpload.getText() == null || fileUpload.getText() == "") {
					mini.confirm("确认不上传附件？", "确认",
						function(action) {
							if (action == "ok") {
								saveData();
							}else{
							}
						}
					);
				} else {
					fileUpload.startUpload();
					messageid = mini.loading("正在上传文件，请稍后...", "上传文件");
				}
		    }
		    
		    function onUploadError(e) {
		    	mini.hideMessageBox(messageid); 
		    	if(e.code=="-110"){
		        	mini.get("fileupload1").setText("");
		        	mini.get("fileupload1").setButtonText("重新选择");
		        	mini.alert("文件超过10MB,请重新选择！"); 
		        }else{
		        	if(e.code!="-280"){  
				    	mini.get("fileupload1").setText("");
				        mini.get("fileupload1").setButtonText("重新选择");
				       	mini.alert("文件上传失败,请重新选择！"); 
		        	}
		        }      
		    }
		    
		    function onFileSelect(e) {
   			}
		    
		    function onUploadSuccess(e) {
		    	var json = $.parseJSON(e.serverData);
		    	mini.get("fname").setValue(json.result[0].targetFileName);
		    	mini.get("fpath").setValue(json.result[0].realpath);
		    	mini.get("filedataFileName").setValue(json.result[0].filedataFileName);
		    	mini.get("fileupload1").setText("");
		    	mini.hideMessageBox(messageid);
				saveData();
		    }
		</script>
	</body>
</html>