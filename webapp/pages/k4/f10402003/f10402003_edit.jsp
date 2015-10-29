<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增规则模板</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="../f10402001/checkBtnEdit.js"></script>
	</head>
	<body>
		<form id="form" action="" method="post">
			<input id="doType" name="doType" class="mini-hidden" />
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>分析主题名称:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae417" class="mini-textbox" maxLength="50"
											required="true" />
									</div>
								</div>
							</div>
							<input name="aaz319" class="mini-hidden" />
							<input name="aae100" class="mini-hidden" />
							<input name="aae043" class="mini-hidden" />
						</td>
						<td class="textR">
							<span style="color: red;">*</span>统计周期：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="ape032" class="mini-combobox" emptyText="请选择..."
											data="${dic['APE032']}" textField="text" valueField="id"
											required="true" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							参数列表：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa152" class="mini-textbox" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							方案名称:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input  onvalidation="checkButtonEdit" allowInput="false" class="mini-buttonedit"
											onbuttonclick="openQueryScheme(this);" name="aaz100"
											textName="schemeName" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>统筹区编码:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa027" class="mini-combobox" emptyText="请选择..."
											textField="text" data="${dic['AAA027']}" valueField="id"
											required="true" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							分析描述:
						</td>
						<td>
							<div style="padding-right: 4px; margin-bottom:3px; width:83%;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="aaa133" class="mini-textarea" style="width: 100%;"
										vtype="maxLength:400" />
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
						<td class="textR">
							分析定制人：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input enabled="false" id="aae011" class="mini-textbox"
											readonly="readonly" name="aae011" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							分析定制时间：
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
							style="text-align: right; padding-top: 5px; padding-right: 26px;"
							colspan="6">
							<span class="btnMini"> <em> <input type="button"
										value="提交" onclick="SaveData()" /> </em> </span>
							<span class="btnMini"> <em> <input type="button"
										value="关闭" onclick="closeWin()" /> </em> </span>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</body>
</html>
<script type="text/javascript">
	mini.parse();
	var form = new mini.Form("form");
	
	function SetData(data){
		$.ajax({
     		url:"${pageContext.request.contextPath}/k4/f10402003/loadAnalysisRule.action",
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
            url: "${pageContext.request.contextPath}/k4/f10402003/updateAnalysisRule.action",
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
