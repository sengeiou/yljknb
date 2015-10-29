<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>修改规则</title>
	<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
          mini.parse();
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="id" name="id" class="mini-hidden" />
				<h3 class="cxTit pTb8"><span class="iconCx"> </span></h3>
				<div id="editForm1" >
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
						<tr>
							<td class="textR">
								<span style="color: red;">*</span>规则名称:
							</td>
							<td>
							   <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="mc" name="mc" class="mini-textbox"
									               required="required" maxLength="100" />
									              
										</div>
									</div>
							  </div>
							</td>
							<td class="textR">
								<span style="color: red;">*</span>规则代码:
							</td>
							<td>
							  <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="gzdm" name="gzdm" class="mini-textbox"
								           	required="required" />
								           	<input id="gzdm1" name="gzdm1" class="mini-hidden"/>
										</div>
									</div>
							  </div>
							</td>
							
						</tr>
						<tr>
						<td class="textR">
								经办时间:
							</td>
							<td>
							  <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="cjsj" name="cjsj" format="yyyy-MM-dd" enabled="false"
								                 onvaluechanged="onValueChanged" class="mini-datepicker" />
										</div>
									</div>
							  </div>
							</td>
							<td class="textR">
								创建人:
							</td>
								<td>
								 <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="cjrmc" class="mini-textbox" enabled="false" readonly="readonly"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
						<td class="textR">
								<span style="color: red;">*</span>规则状态:
							</td>
							<td>
							  <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="zt" name="zt" class="mini-combobox" emptyText="请选择"
								                  	data="Yxbz" textField="text" valueField="id" required="required" />
										</div>
									</div>
							  </div>
							</td>
						</tr>
						<tr>
							<td class="textR">
								    规则描述:
							</td>
							<td colspan="5">
							<div style="padding-right:25px;padding-bottom:2px">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="gzms" name="gzms" class="mini-textarea" style="width: 100%;" vtype="maxLength:400" />
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
							<td
								style="text-align: right; padding-top: 5px; padding-right: 22px;"
								colspan="6">
								<span class="btnMini"><em><input type="button" onClick="SaveData();" value="提交"/></em></span>
							<!-- 	<span class="btnMini"><em><input type="button" onClick="clear1();" value="清空"/></em></span>  -->
								<span class="btnMini"><em><input type="button" onClick="closeWin();" value="关闭"/></em></span>
							
							</td>
						</tr>
					</table>
				</div>
		</form>
		<script type="text/javascript">
		
		mini.parse();
		var form = new mini.Form("#form1");
		function closeWin() {
			CloseWindow();
		}
		function CloseWindow(action) {
			if (window.CloseOwnerWindow) {
				return window.CloseOwnerWindow(action);
			} else {
				window.close();
			}
		}
		   var fromData;
        //标准方法接口定义
        function SetData(data){
	     	//跨页面传递的数据对象，克隆后才可以安全使用
	     	data = mini.clone(data);
	     	$.ajax({
	     		url:"${pageContext.request.contextPath}/k4/f10402005/loadRuleMessage.action",
	     		type:"post",
	     		data: {id: data.id},
	     		success: function (text){
	     			var data = mini.decode(text);
	     			fromData=data;
			        form.setData(data);
			        mini.get("gzdm1").setValue(data.gzdm);
			       // alert(data);
	     		}
	     	});
    	}
     
  
        //方案修改后保存
	    function SaveData() {
	    	var form = new mini.Form("form1");
	       var data = form.getData(); 
	        form.validate();
	        if (form.isValid() == false) {
	            return;
	        }
	        var json = mini.encode(data);
	       // alert(json);
	        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
	        $.ajax({
	            url: "${pageContext.request.contextPath}/k4/f10402005/updateRuleMessage.action",
	            type: "post",
	            data: { submitData: json ,gzdm1:mini.get("gzdm1").getValue()},
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
		//清空信息
   	//	function clear1(){
   		//form.setData(fromData);
   	//	}
</script>
	</body>
</html>
