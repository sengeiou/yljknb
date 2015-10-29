<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>附件上传</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/jquery.widget.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/jquery.mCustomScrollbar.min.js"></script>
<link href="${pageContext.request.contextPath}/resource/css/jquery.mCustomScrollbar.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resource/css/ui.icon.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resource/css/ui.widget.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/swfupload.js"></script>
</head>
<style>
.aaa{width:61px;height:24px;border:0;padding:0;margin:0 5px;cursor:pointer;}
</style>
<body style="background-color:#F3F3F3 ;">
	<table >
	    <tr>
	        <td style="padding-top: 10px;padding-bottom: 10px;">  
	            <span style="float:left;margin-left:10px;padding-top: 5px">选择文件：</span>
			    <input id="fileupload1" class="mini-fileupload" name="filedata"
					flashUrl="${pageContext.request.contextPath}/resource/scripts/swfupload.swf"
					uploadUrl="${pageContext.request.contextPath}/k5/f10506001/saveUploadFile.action" 
					onuploadsuccess="onUploadSuccess" width="300" 
					onuploaderror="onUploadError" onfileselect="onFileSelect" />
			</td>
			<td style="padding-top: 10px;padding-bottom: 10px;">  	
				<span class="btnMini"><em><input type="button" onClick="startUpload();" value="上传"/></em></span>
		        <span class="btnMini"><em><input type="button" title="提交" style="width:61px;height:24px;" value="提交" onclick="updateKc62();"/></em></span>
		        <span class="btnMini"><em><input type="button" title="返回" style="width:61px;height:24px;" value="返回" onclick="javascript:window.CloseOwnerWindow();"/></em></span>
		    </td>
		</tr>
       </table>
		<form action="#" method="post">
			<table id="fileList" style="width: 100%;font-family:Verdana, Arial, Helvetica, sans-serif;
				font-size:15px;border-collapse:collapse;padding: 5px;">
				<thead style="border:1px solid #ccc;width: 100%;height:26px; line-height:15px; margin:0; padding:0; font:12px/1.5 Simsun, Arial, Georgia; text-align:left;">附件列表</thead>
				<tr style="padding-top: 5px;border:1px solid #ccc;">
					<td style="height:26px; line-height:15px; padding:0 2px; border:1px solid #d2e3f1;border:1px solid #ccc;width: 30%;text-align: center">上传附件名称</td>
					<td style="height:26px; line-height:15px; padding:0 2px; border:1px solid #d2e3f1;border:1px solid #ccc;width: 45%;text-align: center" name="filePath">上传附件路径</td>
					<td style="height:26px; line-height:15px; padding:0 2px; border:1px solid #d2e3f1;border:1px solid #ccc;width: 15%;text-align: center">上传附件格式</td>
					<td style="height:26px; line-height:15px; padding:0 2px; border:1px solid #d2e3f1;border:1px solid #ccc;width: 10%;text-align: center">操作</td>
				</tr>
			</table>
		</form>
	<script type="text/javascript">
		mini.parse();
		var kc62Ids = "";
		var id = 0;
		var tempFileNames = "";
		var tempFilePath = "";
		
		function queryColumn(e){
			
		}
		//取得选中的kc62的ID
		function SetData(data){
			kc62Ids = data;
		}
		
		function onFileSelect(e) {
			//alert(e.file.name);
		}
		
		function onUploadSuccess(e) {
			mini.unmask(document.body);
			var json = $.parseJSON(e.serverData);
			var filePath = json.result[0].bsz005_succ;
			var fileName = filePath.toString().substring(filePath.toString().lastIndexOf("/")+1,filePath.toString().length);
			var fileRule = fileName.toString().substring(fileName.toString().lastIndexOf(".")+1,fileName.toString().length);
			tempFileNames += fileName + ";";
			tempFilePath += filePath + ";";
			var htmlStr = "<tr id='tempTr_"+id+"'>" +
				"<td style='height:26px; line-height:15px; padding:0 2px;border:1px solid #ccc;text-align: center;' id='fileName_"+id+"'>"+fileName+"</td>" +
				"<td style='height:26px; line-height:15px; padding:0 2px;border:1px solid #ccc;text-align: center;' id='filePath_"+id+"'>"+filePath+"</td>" +
				"<td style='height:26px; line-height:15px; padding:0 2px;border:1px solid #ccc;text-align: center;'>"+fileRule+"</td>" +
				"<td style='height:26px; line-height:15px; padding:0 2px;border:1px solid #ccc;text-align: center;'><a href='#' onclick='delUploadFile("+id+");'>删除</a></td></tr>";
			$("#fileList").append(htmlStr);
			id++;
		}
		
		//删除增加的行
		function delUploadFile(id){
			var fileName = $("#fileName_"+id)[0].innerHTML;
			var filePath = $("#filePath_"+id)[0].innerHTML;
			if(tempFileNames.indexOf(fileName,tempFileNames)!=-1){
				if(tempFileNames.indexOf(fileName,tempFileNames) == 0){
					tempFileNames = tempFileNames.substring(fileName.length+1,tempFileNames.length);
				}else if(tempFileNames.indexOf(fileName,tempFileNames) == (tempFileNames.length - fileName.length-1)){
					tempFileNames = tempFileNames.substring(0,tempFileNames.indexOf(fileName,tempFileNames));
				}else{
					tempFileNames = tempFileNames.substring(0,tempFileNames.indexOf(fileName,tempFileNames))+ tempFileNames.substring(tempFileNames.indexOf(fileName,tempFileNames)+fileName.length+1,tempFileNames.length);
				}
			}
			if(tempFilePath.indexOf(filePath,tempFilePath)!=-1){
				if(tempFilePath.indexOf(filePath,tempFilePath) == 0){
					tempFilePath = tempFilePath.substring(filePath.length+1,tempFilePath.length);
				}else if(tempFilePath.indexOf(filePath,tempFilePath) == (tempFilePath.length - filePath.length-1)){
					tempFilePath = tempFilePath.substring(0,tempFilePath.indexOf(filePath,tempFilePath));
				}else{
					tempFilePath = tempFilePath.substring(0,tempFilePath.indexOf(filePath,tempFilePath))+ tempFilePath.substring(tempFilePath.indexOf(filePath,tempFilePath)+filePath.length+1,tempFilePath.length);
				}
			}
			$("#tempTr_"+id).remove();
		}
		
		function onUploadError(e) {
			//mini.alert("上传失败！");
		}
		
		//上传文件
		function startUpload() { 
		    var fileupload = mini.get("fileupload1");
		    if(fileupload.text == ""){
		    	alert("请先选择文件再上传！");
		    	return;
		    }
		    if(tempFileNames.indexOf(fileupload.text,tempFileNames) != -1){
		    	mini.alert("您已经上传了该文件，请重新选择上传文件！");
		    	return;
		    }
	     //	mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
            fileupload.startUpload();
		}
		
		function updateKc62(){
			var filePath = "";
			var fileName = "";
			if(tempFilePath != ""){
				filePath = tempFilePath.toString().substring(0,tempFilePath.toString().length-1);
				fileName = tempFileNames.toString().substring(0,tempFileNames.toString().length-1);
			}
				
			mini.confirm("确定提交？","确认",
				function(action){
					if (action == "ok"){
						$.ajax({
							url : "${pageContext.request.contextPath}/k5/f10506001/updateKc62.action",
							type : "post",
							data : {
								kc62Ids : kc62Ids,
								filePath : filePath,
								fileName : fileName
							},
							success : function(text) {
								if (text.success) {
									mini.alert("保存成功！");
									//关闭窗口
									window.CloseOwnerWindow();
									//从新加载父页面的grid2
									window.Owner.grid2.reload();
								} else {
									mini.alert("提交失败！");
								}
							}
						});
					}
				}
			);
		}
	</script>
</body>
</html>
