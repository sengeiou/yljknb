<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增医疗服务机构科室信息</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
		   var ac62Baz031 = [{id:'05',text:'送核查'},{id:'06',text:'医院送复审'},{id:'08',text:'申诉待复议'},{id:'09',text:'扣款'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	<body>
	  <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">修改医疗服务机构科室信息</span>
					</h3>
					<td style="width: 100%;">
					   <div class="fR pT5R9">
					    	<span class="btnMini"><em><input type="button" onClick="SaveData();" value="提交"/></em></span>
							<span class="btnMini"><em><input type="button" onClick="closeWin();" value="关闭"/></em></span>
					  </div>
					</td>
					</div>
			<div id="editForm" >
					<table class="cxTab" >
						<tr>
							<td class="textR">
								医疗服务机构编号：<input id="aaz107"  name="aaz107" class="mini-hidden" />
								<input id="aaz307"  name="aaz307" class="mini-hidden" />
								<input id="baz047" name="baz047" class="mini-hidden" />
								<input id="aaz307" name="aaz307" class="mini-hidden" />
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020"  name="akb020"   class="mini-textbox" readonly="true"/>
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								医疗服务机构名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021"  name="akb021"  class="mini-textbox" readonly="true"/>
										</div>
									</div>
								</div>
							</td>
							</tr>
							<tr>
							<td class="textR">
								统筹区编号：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa027"  name="aaa027"  class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								医疗服务机构类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb022"  name="akb022"  class="mini-combobox" data="${dic['AKB022']}" 
											readonly="true"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
                <div class="listTit">
			 		<h3 class="cxTit fL">
						<span class="iconCx">科室信息</span>
					</h3>
			     </div>
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
						   <td class="textR">
								科室名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae386" name="aae386" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								科室类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akf001" name="akf001" emptyText="请选择..." 
											valueField="id"  textField="text" class="mini-combobox"  data="${dic['AKF001']}" />
										</div>
									</div>
								</div>
							</td>
							</tr>
							<tr>
							 <td class="textR">
								床位数：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akf015" name="akf015" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
			</div>
<script type="text/javascript">

		mini.parse();
		var form = new mini.Form("editForm");
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
	     		url:"${pageContext.request.contextPath}/k5/f10502002/loadUpdatekf66Message.action",
	     		type:"post",
	     		data: {aaz307: data.aaz307},
	     		success: function (text){
	     			var data = mini.decode(text);
	     			fromData=data;
			        form.setData(data);
			        mini.get("aae386a").setValue(data.aae386);
	     		}
	     	});
    	}
     
  
        //方案修改后保存
	    function SaveData() {
	    	var form = new mini.Form("editForm");
	       var data = form.getData(); 
	        form.validate();
	        if (form.isValid() == false) {
	            return;
	        }
	        var json = mini.encode(data);
	       // alert(json);
	        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
	        $.ajax({
	            url: "${pageContext.request.contextPath}/k5/f10502002/updateKf66Message.action",
	            type: "post",
	            data: { submitData: json },
	            success: function (text) {
	            	mini.unmask(document.body);
	            	if(text.success){
	            	 	mini.showMessageBox({
	        				title: "提示",
	        				message: "维护信息提交操作成功",
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
	</body>
</html>
