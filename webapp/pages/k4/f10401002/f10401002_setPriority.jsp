<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>添加调度计划</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>

</head>
<body>
	<input id="doType" name="doType" class="mini-hidden" />
	<form id="form1" action="#" method="post">
		 
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table  class="cxTab" cellpadding="0" cellspacing="0" border="0" >
			
					
					<tr>
						<td>优先级:</td>
						<td>
							<div class="inputL" style="width: 100px">
									<div class="inputR">
										<div class="inputC">
											<input id="ake070" name="ake070" class="mini-combobox"
												emptyText="选择优先级..." data="${dic['AKE070']}" />
										</div>
									</div>
								</div>
							<input name="aaz333" class="mini-hidden"  />
						</td>
					</tr>
					
					<tr>
						<td>备注：</td>
						<td>优先级为一级的任务先于其他级别任务执行</td>

					</tr>
					<tr>
							<!-- <td
								style="text-align: right; padding-top: 5px; padding-right: 20px;"
								colspan="6">
								<a class="mini-button" onclick="SaveData();">保存</a>
								<a class="mini-button" onclick="closeWin();">关闭</a>
							</td> -->
							<td style="text-align: right; padding-top: 5px; padding-right: 20px;"
								colspan="6" class="mainlistCon">
								<span class="btnMini">
									<em>
										<input type="button" value="保存" onclick="SaveData()"/>
									</em>
								</span>
								<!-- <span class="btnMini">
									<em>
										<a class="mini-button" iconCls="icon-cut" plain="true" onclick="clearProblem()">清空</a>
									</em>
								</span> -->
								<span class="btnMini">
									<em>
										<input type="button" value="关闭" onclick="closeWin()"/>
									</em>
								</span>
							</td>
					</tr>
				</table>
			</div>
	 

		
	</form>
</body>
</html>
<script type="text/javascript">
		mini.parse();
		var form = new mini.Form("#form1");
		function closeWin(){
		CloseWindow();
	}
	
	function clear() {
		form.clear();
	}
	
	function CloseWindow(action) {            
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }            
     }
     
     function setData(text){
   		var data = mini.decode(text);
		form.setData(data);
   }
        //保存设置优先级
    function SaveData() {
    	 var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10401002/setPriority.action",
            type: "post",
            data: data,
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: "成功设置优先级",
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