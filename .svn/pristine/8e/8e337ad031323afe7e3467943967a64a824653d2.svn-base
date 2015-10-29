<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>修改阈值</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<form id="form" action="" method="post">
			<input id="doType" name="doType" class="mini-hidden" />
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>阈值级别:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">

										<input enabled="false" id="aaa155" name="id.aaa155"
											class="mini-combobox" readonly="readonly"
											data="${dic['AAA155']}" />
									</div>
								</div>
							</div>
							<input class="mini-hidden" name="id.aaz319" />
						</td>
					</tr>
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>阈值权重:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">

										<input vtype="int" class="mini-textbox" name="ape735"
											required="true" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							阈值:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">

										<input vtype="float" class="mini-textbox" name="aaa005" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td
							style="text-align: right; padding-top: 5px; padding-right: 40px;"
							colspan="2">
							<span class="btnMini"> <em> <input type="button"
										value="提交" onclick="SaveData()" /> </em> </span>
							<span class="btnMini"> <em> <input type="button"
										value="关闭" onclick="closeWin()" /> </em> </span>
						</td>
					</tr>
				</table>
			</div>
		</form>
		<script type="text/javascript">
	mini.parse();
	var form = new mini.Form("form");
	
	function SetData(data){
		$.ajax({
	     		url:"${pageContext.request.contextPath}/k4/f10402004/loadThreshold.action",
	     		type:"post",
	     		data:data,
	     		success: function (text){
	     			var data = mini.decode(text);
			        form.setData(data);
	     		}
	     	});
	}
	
	function SaveData(){
		var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402004/updateThreshold.action",
            type: "post",
            data: { submitData: json},
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
    
    function openQueryScheme(btn){
    	mini.open({
	            url: "../pages/k4/f10402001/f10402001_queryScheme.jsp",
	            title: "请选择方案", width: 800, height: 450,
	            width:1000,
				height:450,
				onload:function(){
					var data={aaa143:'3'};
					var iframe = this.getIFrameEl();
				    iframe.contentWindow.SetData(data);
				},
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			var iframe = this.getIFrameEl();
				            var data = iframe.contentWindow.GetData();
				            data = mini.clone(data);    
				            if(data){
				           		btn.setValue(data.id);
				           		btn.setText(data.name);
				           }
						}
					 }
	      		  });
		
		
   	}
</script>
	</body>
</html>
