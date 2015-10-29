
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增规则维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
          mini.parse();
		</script>
	</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="id" name="id" class="mini-hidden" />
				<h3 class="cxTit pTb8"><span class="iconCx"></span></h3>
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
											<input id="mc" name="mc" class="mini-textbox" required="required" maxLength="100"/>
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
												<input id="gzdm" name="gzdm" class="mini-textbox" required="required"/>
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
											<input  name="cjsj" format="yyyy-MM-dd" onvaluechanged="onValueChanged" class="mini-datepicker"
											enabled="false" />
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
											<input name="cjrmc" class="mini-textbox" enabled="false" />
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
								<div class="inputL" style="width: 130px;">
									<div class="inputR">
										<div class="inputC">
											<input id="zt" name="zt" class="mini-combobox" emptyText="请选择"
									          data="Yxbz" textField="text" valueField="id" required="required"/>
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
							<div style="padding-bottom:2px;padding-right:25px;">
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
							<td style="text-align: right; padding-top: 5px;  padding-right: 22px;"
								colspan="6" class="mainlistCon">
								<span class="btnMini"><em><input type="button" onClick="SaveData();" value="保存"/></em></span>
							<!-- 	<span class="btnMini"><em><input type="button" onClick="clear1();" value="清空"/></em></span> -->
								<span class="btnMini"><em><input type="button" onClick="closeWin();" value="关闭"/></em></span>
								
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
     
     
     function SetData() {
			$.ajax( {
					url : "${pageContext.request.contextPath}/k4/f10402005/ruleMessageData.action",
					type : "post",
					success : function(text) {
						var data = mini.decode(text);
						form.setData(data);
					}
				});
	}
	
	
        //方案添加
    function SaveData() {
    	var form = new mini.Form("#form1");
        var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402005/addRule.action",
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

     
		//清空信息
 //    		function clear1(){
     		//	  var editForm = new mini.Form("editForm1");
     		//	editForm.clear(); 
 //    			mini.get("#mc").setValue("");
  //   			mini.get("#gzdm").setValue("");
  //   			mini.get("#zt").setValue("");
  //   			mini.get("#gzms").setValue("");
     			
</script>
	</body>
</html>
