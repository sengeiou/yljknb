<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>修改统计期别</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>

	</head>
	<body>
		<form id="form" action="" method="post">
			<input id="doType" name="doType" class="mini-hidden" />
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>统计期别:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae043" maxLength="6"
											onvalidation="onAae043Validation" class="mini-textbox" />
									</div>
								</div>
							</div>
							<input id="aaz319" name="aaz319" class="mini-hidden" />
						</td>
					</tr>
					<tr>
						<td
							style="text-align: right; padding-top: 5px; padding-right: 35px;"
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
		mini.get("aaz319").setValue(data.aaz319);
	}
	
	function onAae043Validation(e) {
    if (e.isValid) {
        if (e.value.length!=6 || isNaN(e.value)) {
            e.errorText = "录入应为六位的年月";
            e.isValid = false;
        }
    }
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
            url: "${pageContext.request.contextPath}/k4/f10402003/updateAnalysisRuleAae043.action",
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
</script>
	</body>
</html>
