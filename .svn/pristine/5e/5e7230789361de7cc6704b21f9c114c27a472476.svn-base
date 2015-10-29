<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>方案管理</title>
	<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body>
	<form id="form1" action="#" method="post">
		<input id="doType" name="doType" class="mini-hidden" />
		<div>
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table  class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR"><span style="color: red;">*</span>方案名称：</td>

						<td>
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa201" name="aaa201" class="mini-textbox" vtype="maxLength:100"  required="true" />
										</div>
									</div>
								</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>实现类型：</td>
						
						<td>
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa026" name="aaa026" class="mini-combobox"
												emptyText="选择实现类型..." data="${dic['AAA026'] }" required="true" />
										</div>
									</div>
								</div>
						</td>
					</tr>

					<tr>
						<td class="textR"><span style="color: red;">*</span>方案分类：</td>
						
						<td>
						 		<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa143" name="aaa143" class="mini-combobox"
												emptyText="选择方案分类..." data="${dic['AAA143'] }" vtype="maxLength:100" required="true" />
										</div>
									</div>
								</div>
						</td>
						<td class="textR">经办人：</td>
						
						<td> 
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae011" name="aae011" enabled="false"  class="mini-textbox"  required="false"
												 readonly="readonly" />
										</div>
									</div>
							</div>
						</td>
						
					 
						
					</tr>
					<tr>
						 
						<td class="textR"><span style="color: red;">*</span>方案描述：</td>
						<td colspan="6">
							<div style="padding-right:4px; width:400px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="aaa133" name="aaa133" class="mini-textarea" 
										 style="width:100%;" required="true" vtype="maxLength:500"    />
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
						<td class="textR">经办时间：</td>
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
							<td style="text-align: right; padding-top: 10px; padding-right: 40px;"
								colspan="6" class="mainlistCon">
								<span class="btnMini">
									<em>
										<input type="button" value="保存" onclick="SaveData()"/>
									</em>
								</span>
								<!-- <span class="btnMini">
									<em>
										<input type="button" value="清空" onclick="clearProblem()"/>
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
	function clearProblem() {
		form.clear();
	}
	function CloseWindow(action) {            
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }            
     }
     
     function SetData() {
			$.ajax( {
					url : "${pageContext.request.contextPath}/k4/f10401001/initPlanData.action",
					type : "post",
					success : function(text) {
						var data = mini.decode(text);
						form.setData(data);
					}
				});
	}
        //方案添加
    function SaveData() {
    	
        var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        //alert(json);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10401001/addPlanManage.action",
            type: "post",
            data: { submitData: json },
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
    
		
		 
</script>