<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>添加调度计划</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>

</head>
<body>
	<form id="form1" action="" method="post">
		<input id="doType" name="doType" class="mini-hidden" />
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td  class="textR"><span style="color: red;">*</span>计划名称：</td>
						<td>
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa201" name="aaa201" class="mini-textbox" vtype="maxLength:100" required="true" />
										</div>
									</div>
								</div>
								<input name="aaz325" class="mini-hidden"/>
							</td>
							<td  class="textR">经办时间：</td>
						
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aae036" format="yyyy-MM-dd"
												onvaluechanged="onValueChanged" class="mini-datepicker"
												readonly="readonly" />
										</div>
									</div>
							</div>
						</td>
							
					</tr>

					<tr  style="padding-top: 10px;">
						<td  class="textR"><span style="color: red;">*</span>执行表达式：</td>
						<td line-height:2em;>
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa170" name="aaa170" class="mini-textbox" vtype="maxLength:20" required="true" />
										</div>
									</div>
							</div>
						</td>
						<td  class="textR">经办人:</td>
						
						<td> 
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aae011" class="mini-textbox" enable="false"  readonly="readonly" />
										</div>
									</div>
							</div>			
						</td>
						
						
					</tr>
					 
						<tr style="padding-top: 10px;">
							<!-- <td class="textR"><span style="color: red;">*</span>参数列表：</td>
							<td colspan="5">
								<input id="aaa152" name="aaa152" class="mini-textarea" 
									 style="width:100%;" required="true" vtype="maxLength:1000"/>
							</td> -->
							<td class="textR"><span style="color: red;">*</span>参数列表：</td>
							<td colspan="6">
								<div style="padding-right:4px; width:390px">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc">
											</div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="aaa152" name="aaa152" class="mini-textarea" 
											 style="width:100%;" required="true" vtype="maxLength:1000"/>
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
							<!-- <td
								style="text-align: right; padding-top: 5px; padding-right: 20px;"
								colspan="6">
								<a class="mini-button" onclick="SaveData();">提交</a>
								<a class="mini-button" onclick="closeWin();">关闭</a>
							</td> -->
							<td style="text-align: right; padding-top: 10px; padding-right: 37px;"
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
		var form = new mini.Form("form1");
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
      function SetData(data){
      	//alert(data.aaz325);
   		data = mini.clone(data);
     	$.ajax({
     		url:"${pageContext.request.contextPath}/k4/f10401002/loadDispatchManage.action",
     		type:"post",
     		data: data,
     		success: function (text){
     			
     			var data = mini.decode(text);
		        form.setData(data);
     		}
     	});
   }
     
        //调度计划添加
    function SaveData() {
    	
        var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10401002/updateDispatchManage.action",
            type: "post",
            data: { submitData: json },
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
         			}});        	  
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
    }
    
		
		 
</script>