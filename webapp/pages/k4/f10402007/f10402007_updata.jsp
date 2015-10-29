
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	 <title></title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
	    var Jklx = [ {id : 'YP',text : '药品'}, {id : 'FWXM',text : '服务项目'}, {id : 'CL',text : '材料'}];
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
				<div id="editForm1">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
						<tr>
							<td class="textR">
								监控对象名称:
							</td>
							<td>
							    <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="dxmc" name="dxmc" readOnly="true" class="mini-textbox"  />
										</div>
									</div>
							  </div>
							</td>
							<td class="textR">
								监控对象ID:
							</td>
								<td >
								   <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="dxid" name="dxid"  class="mini-textbox" readOnly="true" maxLength="100" />
										</div>
									</div>
							</div>
							</td>
								<td class="textR">
								对象类型:
							</td>
								<td>
								    <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="dxlx" name="dxlx" class="mini-combobox" readOnly="true" required="required" data="Jklx"/>
										</div>
									</div>
							</div>
							</td>
							</tr>
							<tr>
							<td class="textR">
								规则名称:
							</td>
							<td >
							      <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="gzdm"  name="gzdm" readOnly="true" class="mini-textbox"  />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								指标名称:
							</td>
							<td >
							    <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="zbmc" name="zbmc"  class="mini-textbox" readOnly="true" style="width: 100%;" />
								            <input id="zbdm" name="zbdm"  class="mini-hidden" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								指标描述:
							</td>
							<td colspan="3">
							     <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input  id="zbms" name="zbms" class="mini-textbox" readOnly="true" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
						</tr>
						<tr>
	                	<td class="textR">
								指标值:
							</td>
							<td>
							    <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="zbz" name="zbz" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</td>
							<td class="textR">
								规则指标来源:
							</td>
							<td>
							      <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="gzly" name="gzly" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								说明:
							</td>
							<td colspan="3">
							      <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="sm" name="sm" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
						</tr>
						<tr>
	                	<td class="textR">
								参数:
							</td>
							<td>
							    <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="cs"name="cs" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								经办时间:
							</td>
							<td>
							      <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="cjsj" name="cjsj" enabled="false" dataFormat="yyyy-MM-dd" readOnly="true" 
											   onvaluechanged="onValueChanged" class="mini-datepicker"/>     
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
											<input id="cjrmc" name="cjrmc" enabled="false" class="mini-textbox" readOnly="true" required="required"/>
										</div>
									</div>
							</div>
							</td>
						</tr>
							<tr>
	                		<td class="textR">
								 参数说明:
							</td>
							<td colspan="5">
							<div style="padding-right:27px;padding-bottom:2px">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="cssm" name="cssm" class="mini-textarea" style="width: 100%;" height="100" span="3" readOnly="true"
					            value= "参数一：就诊类别，如果有多个就诊类别，可用逗号分隔;可为空
参数二：险种类型，支持多个，用逗号分隔，可空。
参数三：疾病分类，支持not in/in1，2，3格式，可为空;
参数四：限使用项目。
参数五：医院等级。
参数六：性别，1男性，2女性，可为空。
参数七：限急救，1限急救。
参数八：次数限制，可含最小和最大值。
参数九：年龄。"/>
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
						
						</tr>	
						<tr>
							<td
								style="text-align: right; padding-top: 5px; padding-right: 25px;"
								colspan="6">
								<span class="btnMini"><em><input type="button" onClick="SaveData();" value="保存"/></em></span>
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
		
    //标准方法接口定义
        function SetData(data){
	     	//跨页面传递的数据对象，克隆后才可以安全使用
	     	data = mini.clone(data);
	     	$.ajax({
	     		url:"${pageContext.request.contextPath}/k4/f10402007/loadRuleDxzbMessage.action ",
	     		type:"post",
	     		data: {id: data.id},
	     		success: function (text){
	     			var data = mini.decode(text);
	     			var text=mini.get("cssm").getValue();
			        form.setData(data);
			        mini.get("cssm").setValue(text);
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
	            url: "${pageContext.request.contextPath}/k4/f10402007/updataDxzbMessage.action ",
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
	 function remove(){
			var rows = grid.getSelecteds();
			if (rows.length > 0){
				if (confirm("确定删除选中记录？")){

		             var ids = [];
					for (var i = 0, l = rows.length; i < l; i++){
						var r = rows[i];
	                    ids.push(r.id);
					}
					var id = ids.join(',');
					$.ajax({
						url: "${pageContext.request.contextPath}/k4/f10402007/deleteRuleMessage.action",
						post:"post",
						data: {idStr: id},
						success: function (text) {
	                    	grid.reload();
	                    },
	                    error: function () {
	                    }
					});
				}
			}else{
				alert("请选中一条记录");
			}
		}

	
	


</script>
	</body>
</html>

