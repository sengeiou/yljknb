<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>修改规则模板</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="checkBtnEdit.js"></script>
	</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="doType" name="doType" class="mini-hidden" />
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>模板名称：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa169" maxLength="100" class="mini-textbox"
											required="true" />

									</div>
								</div>
							</div>
							<input name="aaz320" class="mini-hidden" />
						</td>
						<td class="textR">
							<span style="color: red;">*</span>监控类型：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa153" class="mini-combobox" emptyText="请选择..."
											data="${dic['AAA153']}" textField="text" valueField="id"
											required="true" />

									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>增量数据分析方案：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input onvalidation="checkButtonEdit" name="aaz321" allowInput="false" textName="zlfamc"
											class="mini-buttonedit" onvalidation="checkButtonEdit"
											onbuttonclick="openQueryScheme(1,this);" required="true" />

									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							经办人：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input enabled="false" name="aae011" class="mini-textbox"
											required="false" readonly="readonly" />

									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>实现方案：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input textName="sxfamc" allowInput="false"
											class="mini-buttonedit" onvalidation="checkButtonEdit"
											onbuttonclick="openQueryScheme(2,this);" name="aaz100"
											required="true" />

									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							受理日期：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input enabled="false" name="aae036" format="yyyy-MM-dd"
											onvaluechanged="onValueChanged" class="mini-datepicker"
											readonly="readonly" />

									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td
							style="text-align: right; padding-top: 5px; padding-right:25px;"
							colspan="4">
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
	var form = new mini.Form("form1");
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

	 function SetData(data){
   		data = mini.clone(data);
     	$.ajax({
     		url:"${pageContext.request.contextPath}/k4/f10402001/loadModel.action",
     		type:"post",
     		data: {aaz320: data.aaz320},
     		success: function (text){
     			var data = mini.decode(text);
		        form.setData(data);
     		}
     	});
   }
	
    //规则模板录入
    function SaveData() {
    	 var data = form.getData(); 
         form.validate();
         if (form.isValid() == false) {
             return;
         }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402001/updateModelManage.action",
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
    
   	function openQueryScheme(type,btn){
    	mini.open({
	            url: "../pages/k4/f10402001/f10402001_queryScheme.jsp",
	            title: "请选择方案", width: 800, height: 450,
	            width:1000,
				height:450,
				onload:function(){
					var data={aaa143:type};
					var iframe = this.getIFrameEl();
				    iframe.contentWindow.SetData(data);
				},
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			 var iframe = this.getIFrameEl();
				            //获取选中、编辑的结果
				            var data = iframe.contentWindow.GetData();
				            data = mini.clone(data);    //必须。克隆数据
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
