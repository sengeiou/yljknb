<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<title>批量添加监控对象</title>
	<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/scripts/swfupload.js"></script>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
	    var Jklx = [ {id : 'YP',text : '药品'}, {id : 'FWXM',text : '服务项目'}, {id : 'CL',text : '材料'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	
<body>
<table >
  <tr>

   <div style=" padding: 5px;">
    <td> <span class="btnMini"><em><input type="button" onClick="download();" value="模板下载"/></em></span></td>
       <td>  <span style="float:left;margin-left:10px;padding-top: 5px">选择文件（模板格式）：</span>
		<input id="fileupload1" class="mini-fileupload" name="filedata" 
			limitType="*.xls" flashUrl="${pageContext.request.contextPath}/resource/scripts/swfupload.swf"
			uploadUrl="${pageContext.request.contextPath}/k4/f10402007/uploadDxzb.action" 
			onuploadsuccess="onUploadSuccess" width="300" 
			onuploaderror="onUploadError" onfileselect="onFileSelect" /> </td>
		<td>	<span class="btnMini"><em><input type="button" onClick="startUpload();" value="上传"/></em></span></td>
    <td style="padding-left: 120px">
     <span class="btnMini"><em><input type="button" onClick="SaveData();" value="提交"/></em></span>
       <span class="btnMini"><em><input type="button" onClick="closeWin();" value="返回"/></em></span>
    </td>
</tr>
	
        </table>
   <div id="detail_tabs" class="mini-tabs" activeIndex="0"
			style="height: 100%; border: 0;" plain="false" buttons="#tabsButtons">
			<div title="成功列表">
			   <form id="form1" action="" method="post">
                  <div id="success" class="mini-datagrid"
					style="width: 100%; height: 300px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20" required="required"
					url="${pageContext.request.contextPath}/k4/f10402007/querySuccDxzbInfo.action">
					<div property="columns">
						<div type="indexcolumn" ></div>
						<div field="dxid" headerAlign="center" width="100">
							监控对象
						</div>
						<div field="dxmc" headerAlign="center" width="100">
							监控对象名称
						</div>
						<div field="dxlx" headerAlign="center" width="100">
							对象类型
						</div>
							<div field="gzdm" width="100" headerAlign="center">
							规则代码
						</div>
						<div field="mc" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="zbdm" width="100" headerAlign="center">
							指标代码
						</div>
						<div field="zbmc" width="100" headerAlign="center">
							指标名称
						</div>
						<div field="zbz" width="100" headerAlign="center">
							指标值
						</div>
						<div field="gzly" width="100" headerAlign="center">
							规则来源
						</div>
						<div field="sm" width="100" headerAlign="center">
							说明
						</div>
					</div>
				</div>
				
				</form>
			</div>
			<div title="失败列表">
                <div id="fail" class="mini-datagrid"
						style="width: 100%; height: 300px;" idField="id"
						multiSelect="true" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k4/f10402007/queryFailDxzbInfo.action">
						<div property="columns">
							<div type="indexcolumn" ></div>
                            <div field="msg" width="100" headerAlign="center">
								失败原因
							</div>
							<div field="dxid" headerAlign="center" width="100">
								监控对象
							</div>
							<div field="dxmc" headerAlign="center" width="100">
								监控对象名称
							</div>
							<div field="dxlx" headerAlign="center" width="100">
								对象类型
							</div>
							<div field="gzdm" width="100" headerAlign="center">
							          规则代码
						   </div>
							<div field="mc" width="100" headerAlign="center">
								规则名称
							</div>
							<div field="zbdm" width="100" headerAlign="center">
							           指标代码
						   </div>
							<div field="zbmc" width="100" headerAlign="center">
								指标名称
							</div>
							<div field="zbz" width="100" headerAlign="center">
								指标值
							</div>
							<div field="gzly" width="100" headerAlign="center">
								规则来源
							</div>
							<div field="sm" width="100" headerAlign="center">
								说明
							</div>
						</div>
					</div>
			</div>
		</div>
</body>
<script type="text/javascript">
		mini.parse();
		var grid = mini.get("datagrid1");
		var gridS = mini.get("success");
		var gridF = mini.get("fail");	
		var form = new mini.Form("form1");
		var lsh;
		
		function download() {
			var url = "${pageContext.request.contextPath}/k4/f10402007/downLoad.action";
			window.location=url;
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
          $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402007/batchAddDxzbMessage.action",
            type: "post",
            data: lsh,
            success: function (text) {
              mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: "成功添加一条记录",
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
			
	
		function onFileSelect(e) {
			//alert("选择文件");
		}
		function onUploadSuccess(e) {
			 mini.unmask(document.body);
			var json = $.parseJSON(e.serverData);
			mini.showMessageBox({
        				title: "提示",
        				message: "上传完成    成功："+json.result[0].succCount+",失败："+json.result[0].failCount,
        				buttons: ["确定"],
        				iconCls: "mini-messagebox-info",
        				callback: function(action){
            				
         			}});        	  
			
			
		//	alert(e.serverData);
			//if(json.result[0].bsz005_suc != ''){
				gridS.load({bsz005_succ : json.result[0].bsz005_suc});
				lsh={bsz005 : json.result[0].bsz005_suc};
			//}
			//if(json.result[0].bsz005_fail != ''){
				gridF.load({bsz005_fail : json.result[0].bsz005_fail});
			//}
			
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
		//if(fileupload.uploadUrl.length==0){
		//	alert('');
		//}
	     mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
 
          fileupload.startUpload();
		
}
</script>
</html>
