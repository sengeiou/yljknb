<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<title>上传附件</title>
	<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/scripts/swfupload.js"></script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	
<body>
		<input id="filedataFileName" name="filedataFileName" class="mini-textbox" visible="false" />
		<input id="ids" name="ids" class="mini-textbox" visible="false" />
		<input id="fpath" name="fpath" class="mini-textbox" visible="false"  />
		<input id="fname" name="fpath" class="mini-textbox" visible="false"  />
		<div class="mainlistCon">
		<div style="text-align:center; margin:10px;">
			<form id="form2" action="#">
					<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td colspan="4">
								申诉内容：
							</td>
						</tr>
						<tr>
							
							<td colspan="4">
								<div style="padding-right: 4px;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc"></div>
										</div>
									</div>
									<div class="textareaLay">
										<textarea id="ysyj" name="ysyj" class="mini-textarea"
											emptyText="请输入审核意见">
										</textarea>
									</div>
									<div class="textareaBl">
										<div class="textareaBr">
											<div class="textareaBc"></div>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr style="height: 10px">
						</tr>
						</table>
						<table cellpadding="0" cellspacing="0" border="0"
						width="100%">
						
						<tr>
							<td colspan="3">
								<input id="fileupload1" class="mini-fileupload" name="filedata"
									limitType="*.rar;*.zip;*.ppt;*.pptx;*.txt;*.doc;*.docx;*.xls;*.xlsx;*.jpg;*.png" limitSize="2MB"
									flashUrl="${pageContext.request.contextPath}/resource/scripts/swfupload.swf"
									uploadUrl="${pageContext.request.contextPath}/k5/f10505001/upload.action"
									onuploadsuccess="onUploadSuccess" width="240"
									onuploaderror="onUploadError" onfileselect="onFileSelect" 
									buttonText="选择附件"/>
									
							</td>
							<td><font style="color: red;font-size: 4px;">附件最大2MB</font></td>
						</tr>
						</table>
						<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
						width="100%">
						<tr style="height: 10px">
						</tr>
						<tr>
							<td nowrap="nowrap" colspan="5"
								style="text-align: center; padding-top: 5px;">
								<span class="btnMini"><em><input
												type="button" onClick="startUpload();" value="提交" />
									</em>
								</span> 
								<span class="btnMini"><em><input type="button"
												onClick="closeWin();" value="返回" />
									</em>
								</span>
							</td>
						</tr>
					</table>
				</form>
		</div>
	</div>
        
</body>
<script type="text/javascript">
    mini.parse();
	var messageid;
    function setData(data){
			data = mini.clone(data);
			mini.get("ids").setValue(data.ids);
			mini.get("ysyj").setValue("");
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
    	SaveData();
    }
    function onUploadError(e) {
    	mini.hideMessageBox(messageid); 
    	if(e.code=="-110"){
        	mini.get("fileupload1").setText("");
        	mini.get("fileupload1").setButtonText("重新选择");
        	mini.alert("文件超过2MB,请重新选择！"); 
        }else{
        	if(e.code!="-280"){  
		    	mini.get("fileupload1").setText("");
		        mini.get("fileupload1").setButtonText("重新选择");
		       	mini.alert("文件上传失败,请重新选择！"); 
        	}
        }
    }
    function startUpload() {
        var fileupload = mini.get("fileupload1");
        if(fileupload.getText()==""||fileupload.getText()==null){
        	mini.confirm("确定不上传附件？", "附件确认",
                    function (action) {
                        if (action == "ok") {
                        	SaveData(); 
                        } else {
                          
                        }
                    }
                );            
        }else{
        	fileupload.startUpload();
    		messageid=mini.loading("正在上传文件,请稍等...", "上传文件");
        }        
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
	function SaveData() {		
		var param={
				ids:mini.get("ids").getValue(),
				ysyj:mini.get("ysyj").getValue(),
				fname:mini.get("fname").getValue(),
				fpath:mini.get("fpath").getValue(),
				filedataFileName:mini.get("filedataFileName").getValue()
				};
        $.ajax({
          url: "${pageContext.request.contextPath}/k5/f10505001/docSubmit.action",
          type: "post",
          data: param,
          dataType : 'json',
          success: function (text) {
            mini.unmask(document.body);
          	if(text.success){
          	 	mini.showMessageBox({
      				title: "提示",
      				message: "提交成功",
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
</script>
</html>
